// Kofax Custom UI Control Classes
// Copyright (c) 2017. All rights reserved.
// Kofax Confidential.
// Unauthorized use, duplication, or distribution, or disclosure is strictly prohibited.
//

package com.kofax.mobile.sdk.extract.id;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.MemoryFile;

import com.google.gson.Gson;
import com.kofax.R;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.KeepProguard;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.extract.id.bundle.IBundleCacheProvider;
import com.kofax.mobile.sdk.extract.id.bundle.ZipInputStreamBundle;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import bolts.Capture;
import bolts.Continuation;
import bolts.Task;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * A reference implementation of {@link IProjectProvider} that downloads assets from a
 * Kofax Quick Updater service instance
 * <p/>
 * <b>Note: it is required for the app or user to have
 * <code>android.permission.ACCESS_NETWORK_STATE</code> permission before calling any method
 * in this class</b>
 */
@SuppressWarnings({"TryFinallyCanBeTryWithResources", "unused"})
@KeepProguard
public class ServerProjectProvider
        implements IProjectProvider {
    private static final String VARIANTS_LIST = "VariantsList.json";
    private static final String HIGHEST_VERSION_SEGMENT = "GetHighestVersion";
    private static final String PROJECT_SEGMENT = "getProject";
    private static final String VARIANT_SEGMENT = "getVariant";
    private static final String SDK_VERSION_PARAMETER = "sdkVersion";
    private static final String VERSION_PARAMETER = "version";
    private static final String PROJECT_PARAMETER = "project";
    private static final String VARIANT_PARAMETER = "variant";

    private static final Object CLIENT_LOCK = new Object();

    private final List<Download> _bulkDownloads = new CopyOnWriteArrayList<>();
    private final Map<String, Map<String, String>> _projectHighestVersionMap = new HashMap<>();
    private final String _baseUrl;
    private final String _noNetworkException;
    private final String _cannotParseException;

    @Inject
    ConnectivityManager _connectivityManager;

    @Inject
    IBundleCacheProvider _cacheProvider;

    /**
     * Create a new ServerProjectProvider using the Kofax Quick Updater server instance at the given
     * base URL.
     *
     * @param ctx     This context
     * @param baseUrl The Kofax Quick Updater instance URL
     */
    @SuppressWarnings("unused")
    public ServerProjectProvider(
            Context ctx,
            String baseUrl)
            throws MalformedURLException {
        /**
         * Unfortunately, because of this constructor, we cannot check the validity of the
         * cache provider and connectivity parameters.
         */
        this(ctx, null, baseUrl, null);
        Injector.getInjector(ctx).inject(this);
    }

    /**
     * Create a new ServerProjectProvider using a custom cache provider, using the Kofax Quick Updater
     * server instance at the given base URL.
     *
     * @param ctx                 This context
     * @param cacheProvider       The cache provider
     * @param baseUrl             The Kofax Quick Updater instance URL
     * @param connectivityManager A connectivity manager for checking network status
     */
    @SuppressWarnings("unused")
    public ServerProjectProvider(
            Context ctx,
            IBundleCacheProvider cacheProvider,
            String baseUrl,
            ConnectivityManager connectivityManager)
            throws MalformedURLException {
        if (ctx == null) {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION);
        }

        if (!baseUrl.endsWith("/")) {
            baseUrl += "/";
        }

        _baseUrl = baseUrl;
        if (HttpUrl.parse(_baseUrl) == null) {
            throw new MalformedURLException();
        }

        _noNetworkException = ctx.getString(R.string.ProjectProvider_NoNetworkConnection);
        _cannotParseException = ctx.getString(R.string.ProjectProvider_UnparsableError);
        _cacheProvider = cacheProvider;
        _connectivityManager = connectivityManager;
    }

    /**
     * Sets the SSL certificate validator listener.
     * <p>
     * The listener receives certificate validation challenges in response to
     * an authentication request from the Kofax Quick Updater instance.
     *
     * @param certificateValidatorListener
     * @see CertificateValidatorListener
     */
    public void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener) {
        synchronized (CLIENT_LOCK) {
            HttpClientHolder.get().setCertificateValidatorListener(_baseUrl, certificateValidatorListener);
        }
    }

    /**
     * Change the connection timeout.
     * <p/>
     * This parameter corresponds to all connection timeouts: connect, read and write.  If any
     * operation exceeds the timeout, the process is cancelled, and an exception will be raised.
     * <p/>
     * <b>Note:</b> This sets the timeout for new connections.  A value of 0 means no timeout,
     * otherwise values must be between 1 and Integer#MAX_VALUE when converted to
     * milliseconds.
     *
     * @param duration The amount of the timeout
     * @param timeUnit The time unit associated with the duration
     * @throws IllegalArgumentException
     */
    public void setRequestTimeout(long duration, TimeUnit timeUnit) {
        synchronized (CLIENT_LOCK) {
            HttpClientHolder.get().setTimeOut(duration, timeUnit);
        }
    }

    /**
     * This implementation keeps a map of project names to a map of sdk versions to model versions.
     * If the map contains an entry for the key pair <code>{projectName, sdkVersion}</code>, that
     * value is returned, and no work is done.
     * <p/>
     * If no entry exists, the network connection is checked.  If a network connection exists, a
     * server call is attempted.  If that value is returned, it is stored in the map and returned.
     * <p/>
     * If a server response is not acquired, local cached is checked.  If a local version exists,
     * that version is stored in the map and returned.
     * <p/>
     * If no map entry exists, no network connection exists or a server call fails, and finally no
     * cache exists, a {@link ProjectProviderException} is thrown with a message indicating work
     * cannot continue.
     *
     * @param projectName The name of the project
     * @param sdkVersion  The version of the SDK that must be compatible
     * @param listener    A completion listener.  If this is null, no work will be done.
     */
    @Override
    public void getHighestVersion(
            final String projectName,
            final String sdkVersion,
            final ICompletionListener<String> listener) {
        if (listener != null) {
            getHighestVersionAsync(projectName, sdkVersion, false)
                    .continueWith(new Continuation<String, Void>() {
                        @Override
                        public Void then(Task<String> task)
                                throws Exception {
                            listener.onComplete(
                                    task.getResult(),
                                    task.getError());
                            return null;
                        }
                    }, Task.UI_THREAD_EXECUTOR);
        }
    }

    @Override
    public String getLatestCachedModelDataBuildInfo(String projectName) {
        if (_cacheProvider != null) {
            return _cacheProvider.getLatestModelDataBuildInfo(projectName);
        } else {
            return null;
        }
    }


    protected Task<String> getHighestVersionAsync(
            final String projectName,
            final String sdkVersion,
            final boolean bulk) {
        return getHighestVersionFromMap(projectName, sdkVersion)
                .continueWithTask(new Continuation<String, Task<String>>() {
                    @Override
                    public Task<String> then(Task<String> task)
                            throws Exception {
                        if (task.isFaulted()) {
                            return getHighestVersionFromServer(projectName, sdkVersion, bulk);
                        } else {
                            return task;
                        }
                    }
                })
                .continueWithTask(new Continuation<String, Task<String>>() {
                    @Override
                    public Task<String> then(Task<String> task)
                            throws Exception {
                        if (task.isFaulted()) {
                            return getHighestVersionFromCache(projectName, sdkVersion, task);
                        } else {
                            return task;
                        }
                    }
                })
                .onSuccess(new Continuation<String, String>() {
                    @Override
                    public String then(Task<String> task)
                            throws Exception {
                        String version = task.getResult();
                        putHighestVersionIntoMap(projectName, sdkVersion, version);
                        return version;
                    }
                });
    }

    private Task<String> getHighestVersionFromMap(
            final String projectName,
            final String sdkVersion) {
        return Task.callInBackground(new Callable<String>() {
            @Override
            public String call()
                    throws Exception {
                String version = null;
                Map<String, String> versionMap = _projectHighestVersionMap.get(projectName);
                if (versionMap != null) {
                    version = versionMap.get(sdkVersion);
                }

                if (version == null) {
                    throw new Exception();
                } else {
                    return version;
                }
            }
        });
    }

    private Task<String> getHighestVersionFromServer(
            final String projectName,
            final String sdkVersion,
            final boolean bulk) {
        return Task
                .callInBackground(new ThrowNoNetworkCallable<String>())
                .onSuccessTask(new Continuation<String, Task<String>>() {
                    @Override
                    public Task<String> then(Task<String> task)
                            throws Exception {
                        return new VersionDownload(projectName, sdkVersion).execute(bulk);
                    }
                });
    }

    private Task<String> getHighestVersionFromCache(
            final String projectName,
            final String sdkVersion,
            final Task<String> continuation) {
        String version = _cacheProvider.getLatestVersionForProject(projectName);

        if (StringUtils.isEmpty(version)) {
            return continuation;
        }

        return Task.forResult(version);
    }

    private void putHighestVersionIntoMap(
            final String projectName,
            final String sdkVersion,
            final String version) {
        if (!StringUtils.isEmpty(version) &&
                !_projectHighestVersionMap.containsKey(projectName)) {
            HashMap<String, String> projectVersion = new HashMap<>(1);
            projectVersion.put(sdkVersion, version);
            _projectHighestVersionMap.put(projectName, projectVersion);
        }
    }

    /**
     * Returns the directory containing the project files.  If the project files already exist in
     * the provided {@link com.kofax.mobile.sdk.extract.id.bundle.IBundleCacheProvider IBundleCacheProvider},
     * those will be used.
     * <p/>
     * If no cache version exists, the network connection is checked.  If a network connection
     * exists, a server call is attempted.  If the files are acquired from the server, they are
     * cached and returned.
     * <p/>
     * If no cache exists, and either there's no network connection or a server error, an
     * exception is thrown with a message indicating work cannot continue.
     *
     * @param projectName The name of the project
     * @param version     The version of the project
     * @param listener    A completion listener.  If this is null, no work will be done.
     */
    @Override
    public void getProject(
            final String projectName,
            final String version,
            final ICompletionListener<File> listener) {
        if (listener != null) {
            getProjectAsync(projectName, version, false)
                    .continueWith(new Continuation<File, Void>() {
                        @Override
                        public Void then(Task<File> task)
                                throws Exception {
                            listener.onComplete(task.getResult(), task.getError());
                            return null;
                        }
                    }, Task.UI_THREAD_EXECUTOR);
        }
    }

    private Task<File> getProjectAsync(
            final String projectName,
            final String version,
            final boolean bulk) {
        return getProjectFromCache(projectName, version)
                .continueWithTask(new Continuation<File, Task<File>>() {
                    @Override
                    public Task<File> then(Task<File> task)
                            throws Exception {
                        if (task.isFaulted()) {
                            return getProjectFromServer(projectName, version, bulk);
                        } else {
                            return task;
                        }
                    }
                });
    }

    private Task<File> getProjectFromCache(final String projectName, final String version) {
        File cachedProject = _cacheProvider.getProject(projectName, version);
        if (cachedProject == null) {
            return Task.forError(new Exception());
        } else {
            return Task.forResult(cachedProject);
        }
    }

    private Task<File> getProjectFromServer(
            final String projectName,
            final String version,
            final boolean bulk) {
        return Task
                .callInBackground(new ThrowNoNetworkCallable<File>())
                .onSuccessTask(new Continuation<File, Task<File>>() {
                    @Override
                    public Task<File> then(Task<File> task)
                            throws Exception {
                        return new ProjectDownload(projectName, version).execute(bulk);
                    }
                });
    }

    /**
     * Returns the directory containing the variant files.  If the variant files already exist in
     * the provided {@link com.kofax.mobile.sdk.extract.id.bundle.IBundleCacheProvider IBundleCacheProvider},
     * those will be used.
     * <p/>
     * If no cache version exists, the network connection is checked.  If a network connection
     * exists, a server call is attempted.  If the files are acquired from the server, they are
     * cached and returned.
     * <p/>
     * If no cache exists, and either there's no network connection or a server error, an
     * exception is thrown with a message indicating work cannot continue.
     *
     * @param projectName The name of the project
     * @param variantName The name of the variant
     * @param version     The version of the variant (this should match the same version string
     *                    retrieved from {@link #getHighestVersion(String, String, ICompletionListener<String>) getHighestVersion(String, String, ICompletionListener)}
     * @param listener    A completion listener.  If this is null, no work will be done.
     */
    @SuppressWarnings("JavadocReference")
    @Override
    public void getVariant(
            final String projectName,
            final String variantName,
            final String version,
            final ICompletionListener<File> listener) {
        if (listener != null) {
            getVariantAsync(projectName, variantName, version, false)
                    .continueWith(new Continuation<File, Void>() {
                        @Override
                        public Void then(Task<File> task)
                                throws Exception {
                            listener.onComplete(task.getResult(), task.getError());
                            return null;
                        }
                    }, Task.UI_THREAD_EXECUTOR);
        }
    }

    private Task<File> getVariantAsync(
            final String projectName,
            final String variantName,
            final String version,
            final boolean bulk) {

        return getVariantFromCache(projectName, variantName, version)
                .continueWithTask(new Continuation<File, Task<File>>() {
                    @Override
                    public Task<File> then(Task<File> task)
                            throws Exception {
                        if (task.isFaulted()) {
                            return getVariantFromServer(projectName, variantName, version, bulk);
                        } else {
                            return task;
                        }
                    }
                });
    }

    private Task<File> getVariantFromCache(
            final String projectName,
            final String variantName,
            final String version) {
        File cachedVariant = _cacheProvider.getVariant(projectName, variantName, version);
        if (cachedVariant == null) {
            return Task.forError(new Exception());
        } else {
            return Task.forResult(cachedVariant);
        }
    }

    private Task<File> getVariantFromServer(
            final String projectName,
            final String variantName,
            final String version,
            final boolean bulk) {
        return Task
                .callInBackground(new ThrowNoNetworkCallable<File>())
                .onSuccessTask(new Continuation<File, Task<File>>() {
                    @Override
                    public Task<File> then(Task<File> task)
                            throws Exception {
                        return new VariantDownload(
                                projectName,
                                variantName,
                                version).execute(bulk);
                    }
                });
    }

    /**
     * Loads all the variants for a given project.  This method uses the {@link SdkVersion#getSdkVersion()}
     * when calling {@link #getHighestVersion(String, String, ICompletionListener<String>) getHighestVersion(String, String, ICompletionListener)}.
     * Subsequently, it retrieves the project files, and uses the contained variants list
     * to download each variant.
     * <p/>
     * If a variant already exists in the provided
     * {@link com.kofax.mobile.sdk.extract.id.bundle.IBundleCacheProvider IBundleCacheProvider},
     * it will not be re-downloaded.
     *
     * @param projectName The name of the project to load
     * @param listener    A listener to call when loading is complete.
     *                    The type argument is <code>Void</code> because no object is returned.
     */
    @SuppressWarnings({"unused", "JavadocReference"})
    public void loadAllVariantsForProject(
            final String projectName,
            final ICompletionListener<Void> listener) {
        if (listener != null) {
            String sdkVersion = sdkVersion();
            final Capture<String> projectVersionCapture = new Capture<>();
            getHighestVersionAsync(projectName, sdkVersion, true)
                    .onSuccessTask(new Continuation<String, Task<File>>() {
                        @Override
                        public Task<File> then(Task<String> task)
                                throws Exception {
                            projectVersionCapture.set(task.getResult());
                            return getProjectAsync(projectName, task.getResult(), true);
                        }
                    })
                    .onSuccessTask(new Continuation<File, Task<Void>>() {
                        @Override
                        public Task<Void> then(Task<File> task)
                                throws Exception {
                            String projectVersion = projectVersionCapture.get();
                            String[] variants = getVariants(task.getResult());
                            List<Task<File>> tasks = new ArrayList<>();
                            for (String variantName : variants) {
                                tasks.add(getVariantAsync(
                                        projectName,
                                        variantName,
                                        projectVersion,
                                        true));
                            }

                            return Task.whenAll(tasks);
                        }
                    })
                    .continueWithTask(new ThrowNoNetworkContinuation<Void>())
                    .continueWith(new Continuation<Void, Void>() {
                        @Override
                        public Void then(Task<Void> task)
                                throws Exception {
                            if (task.isCancelled()) {
                                listener.onComplete(
                                        null,
                                        new KmcRuntimeException(ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS));
                            } else {
                                listener.onComplete(null, task.getError());
                            }
                            return null;
                        }
                    }, Task.UI_THREAD_EXECUTOR);
        }
    }

    /**
     * Cancels any outstanding tasks related to
     * {@link #loadAllVariantsForProject(String, ICompletionListener<Void>) loadAllVariantsForProject(String, ICompletionListener)}
     * <p/>
     * This function will do nothing if no tasks are outstanding.
     * <p/>
     * If there are outstanding tasks, the {@link ICompletionListener} passed to
     * {@link #loadAllVariantsForProject(String, ICompletionListener<Void>) loadAllVariantsForProject(String, ICompletionListener)}
     * will be called with a cancel success message
     */
    @SuppressWarnings("JavadocReference")
    public void cancelLoadAllVariants() {
        for (Download download : _bulkDownloads) {
            download.cancel();
        }
    }

    private HttpUrl getHighestVersionUrl(String projectName, String sdkVersion) {
        return getBuilderForSegment(HIGHEST_VERSION_SEGMENT)
                .addQueryParameter(PROJECT_PARAMETER, projectName)
                .addQueryParameter(SDK_VERSION_PARAMETER, sdkVersion)
                .build();
    }

    private HttpUrl getProjectUrl(String projectName, String version) {
        return getBuilderForSegment(PROJECT_SEGMENT)
                .addQueryParameter(PROJECT_PARAMETER, projectName)
                .addQueryParameter(VERSION_PARAMETER, version)
                .build();
    }

    private HttpUrl getVariantUrl(String projectName, String variantName, String version) {
        return getBuilderForSegment(VARIANT_SEGMENT)
                .addQueryParameter(PROJECT_PARAMETER, projectName)
                .addQueryParameter(VARIANT_PARAMETER, variantName)
                .addQueryParameter(VERSION_PARAMETER, version)
                .build();
    }

    private HttpUrl.Builder getBuilderForSegment(String segment) {
        return HttpUrl
                .parse(_baseUrl)
                .newBuilder()
                .addPathSegment(segment);
    }

    private Request getRequest(HttpUrl url) {
        return new Request.Builder()
                .url(url)
                .addHeader("Accept", "application/json")
                .addHeader("Accept-Encoding", "identity")
                .build();
    }

    protected String sdkVersion() {
        return SdkVersion.getSdkVersion();
    }

    private String[] getVariants(File projectFile)
            throws IOException {
        File variantsList = new File(projectFile, VARIANTS_LIST);
        InputStream variantStream = new FileInputStream(variantsList);
        String json = IOUtils.toString(variantStream);
        IOUtils.closeQuietly(variantStream);

        return new Gson().getAdapter(String[].class).fromJson(json);
    }

    @KeepProguard
    static class HttpClientHolder {
        private static final long DEFAULT_TIMEOUT_DURATION = 10;
        private static final TimeUnit DEFAULT_TIMEOUT_UNIT = TimeUnit.SECONDS;

        OkHttpClient client;
        long timeOutDuration;
        TimeUnit timeOutUnit;
        String baseUrl;
        CertificateValidatorListener validatorListener;

        private static HttpClientHolder instance;

        static HttpClientHolder get() {
            if (instance == null) {
                instance = new HttpClientHolder(DEFAULT_TIMEOUT_DURATION, DEFAULT_TIMEOUT_UNIT, null, null);
            }
            return instance;
        }

        private HttpClientHolder(long duration, TimeUnit timeUnit, String baseUrl, CertificateValidatorListener validatorListener) {
            setNewClient(duration, timeUnit, baseUrl, validatorListener);
        }

        private void setNewClient(long timeOutDuration, TimeUnit timeOutUnit, String baseUrl, CertificateValidatorListener validatorListener) {
            OkHttpClient.Builder okHttpBuilder = new OkHttpClient.Builder();
            okHttpBuilder.connectTimeout(timeOutDuration, timeOutUnit);
            okHttpBuilder.writeTimeout(timeOutDuration, timeOutUnit);
            okHttpBuilder.readTimeout(timeOutDuration, timeOutUnit);
            if (validatorListener != null && baseUrl != null) {
                try {
                    URL url = new URL(baseUrl);
                    if (url.getProtocol().equalsIgnoreCase("https")) {
                        okHttpBuilder.sslSocketFactory(validatorListener.getSSLSocketFactory(url.getHost()));
                    }
                } catch (Exception e) {
                    throw new ProjectProviderException(e);
                }
            }

            this.client = okHttpBuilder.build();
            this.timeOutDuration = timeOutDuration;
            this.timeOutUnit = timeOutUnit;
            this.baseUrl = baseUrl;
            this.validatorListener = validatorListener;
        }

        void setTimeOut(long timeOutDuration, TimeUnit timeOutUnit) {
            setNewClient(timeOutDuration, timeOutUnit, baseUrl, validatorListener);
        }

        void setCertificateValidatorListener(String baseUrl, CertificateValidatorListener validatorListener) {
            setNewClient(timeOutDuration, timeOutUnit, baseUrl, validatorListener);
        }
    }

    @KeepProguard
    public static class Error {
        public String message;
        public String Message;
    }

    private class ThrowNoNetworkContinuation<T> implements Continuation<T, Task<T>> {
        @Override
        public Task<T> then(Task<T> task) throws Exception {
            if (task.isFaulted()) {
                final Exception error = task.getError();
                return Task.callInBackground(new ThrowNoNetworkCallable<T>())
                        .onSuccessTask(new Continuation<T, Task<Void>>() {
                            @Override
                            public Task<Void> then(Task<T> task) throws Exception {
                                return Task.delay(20);
                            }
                        })
                        .onSuccessTask(new Continuation<Void, Task<Void>>() {
                            @Override
                            public Task<Void> then(Task<Void> task) throws Exception {
                                return Task.callInBackground(new ThrowNoNetworkCallable<Void>());
                            }
                        })
                        .onSuccessTask(new Continuation<Void, Task<T>>() {
                            @Override
                            public Task<T> then(Task<Void> task) throws Exception {
                                return Task.forError(error);
                            }
                        });
            } else {
                return task;
            }
        }
    }

    private class ThrowNoNetworkCallable<T>
            implements Callable<T> {
        @Override
        public T call()
                throws Exception {
            NetworkInfo info = _connectivityManager.getActiveNetworkInfo();
            if (info == null || !info.isConnectedOrConnecting()) {
                throw new ProjectProviderException(_noNetworkException);
            }

            return null;
        }
    }

    private abstract class Download<T>
            implements Callback {
        private final Request _request;
        private final Task<T>.TaskCompletionSource _completionSource = Task.create();

        private Call _call;

        public Download(Request request) {
            _request = request;
        }

        public Task<T> execute(boolean addToList) {
            _call = HttpClientHolder.get().client.newCall(_request);
            _call.enqueue(this);

            if (addToList) {
                _bulkDownloads.add(this);
            }

            return _completionSource
                    .getTask()
                    .continueWithTask(new Continuation<T, Task<T>>() {
                        @Override
                        public Task<T> then(Task<T> task)
                                throws Exception {
                            _bulkDownloads.remove(Download.this);
                            return task;
                        }
                    })
                    .continueWithTask(new ThrowNoNetworkContinuation<T>());
        }

        public void cancel() {
            _completionSource.trySetCancelled();
            _call.cancel();
        }

        @Override
        public void onFailure(Call call, IOException e) {
            onFailure(new ProjectProviderException(e));
        }

        private void onFailure(ProjectProviderException e) {
            _completionSource.trySetError(e);
        }

        @Override
        public void onResponse(Call call, Response response)
                throws IOException {
            ResponseBody body = null;
            OutputStream outputStream = null;
            MemoryFile memoryFile = null;

            try {
                body = response.body();
                if (response.code() == 200) {
                    String uuid = UUID.randomUUID().toString();
                    memoryFile = new MemoryFile(uuid, (int) body.contentLength());
                    outputStream = memoryFile.getOutputStream();
                    IOUtils.copy(body.byteStream(), outputStream);

                    T returnBody = convertBody(memoryFile.getInputStream());
                    _completionSource.trySetResult(returnBody);
                } else {
                    Error exception = new Gson()
                            .getAdapter(Error.class)
                            .fromJson(body.string());

                    String message;
                    if (!StringUtils.isEmpty(exception.message)) {
                        message = exception.message;
                    } else if (!StringUtils.isEmpty(exception.Message)) {
                        message = exception.Message;
                    } else {
                        message = _cannotParseException;
                    }

                    onFailure(new ProjectProviderException(message));
                }
            } catch (Exception e) {
                onFailure(new ProjectProviderException(e));
            } finally {
                IOUtils.closeQuietly(body);
                IOUtils.closeQuietly(outputStream);
                if (memoryFile != null) {
                    memoryFile.close();
                }
            }
        }

        protected abstract T convertBody(InputStream body)
                throws Exception;
    }

    private class VersionDownload
            extends Download<String> {
        public VersionDownload(
                String projectName,
                String sdkVersion) {
            super(getRequest(getHighestVersionUrl(projectName, sdkVersion)));
        }

        @Override
        protected String convertBody(InputStream body)
                throws Exception {
            String versionString = IOUtils.toString(body);
            return versionString.replace("\"", "");
        }
    }

    private class ProjectDownload
            extends Download<File> {
        private final String _projectName;
        private final String _version;

        public ProjectDownload(
                String projectName,
                String version) {
            super(getRequest(getProjectUrl(projectName, version)));

            _projectName = projectName;
            _version = version;
        }

        @Override
        protected File convertBody(InputStream body)
                throws Exception {
            return _cacheProvider.cacheProject(
                    _projectName,
                    new ZipInputStreamBundle(body),
                    _version);
        }
    }

    private class VariantDownload
            extends Download<File> {
        private final String _projectName;
        private final String _variantName;
        private final String _version;

        public VariantDownload(
                String projectName,
                String variantName,
                String version) {
            super(getRequest(getVariantUrl(projectName, variantName, version)));
            _projectName = projectName;
            _variantName = variantName;
            _version = version;
        }

        @Override
        protected File convertBody(InputStream body)
                throws Exception {
            return _cacheProvider.cacheVariant(
                    _projectName,
                    _variantName,
                    new ZipInputStreamBundle(body),
                    _version);
        }
    }
}
