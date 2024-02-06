// Kofax Custom UI Control Classes
// Copyright (c) 2017. All rights reserved.
// Kofax Confidential.
// Unauthorized use, duplication, or distribution, or disclosure is strictly prohibited.
//

package com.kofax.mobile.sdk.extract.id;

import android.content.Context;
import android.content.res.AssetManager;

import com.google.gson.Gson;
import com.kofax.R;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.mobile.sdk._internal.KeepProguard;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.extract.id.bundle.IBundle;
import com.kofax.mobile.sdk.extract.id.bundle.IBundleCacheProvider;
import com.kofax.mobile.sdk.extract.id.bundle.IBundleFile;
import com.kofax.mobile.sdk.extract.id.bundle.ZipFileBundle;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.Enumeration;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.zip.ZipFile;

import javax.inject.Inject;

import bolts.Continuation;
import bolts.Task;

/**
 * A reference implementation of {@link IProjectProvider} that uses a project zip input stream, or
 * reads the project zip from assets.
 */
@KeepProguard
public class LocalProjectProvider
        implements IProjectProvider {
    private static final Executor EXECUTOR = Executors.newSingleThreadExecutor();
    private static final String PROJECT_ZIP = "Project.zip";
    private static final String VERSION_TABLE = "VersionTable.json";
    private static final String VARIANT_ZIP = "Variant.zip";
    private final WeakReference<Context> _contextWeakReference;
    private final WeakReference<AssetManager> _assetManager;
    @Inject
    IBundleCacheProvider _cacheProvider;
    private InputStream _inputStream;
    private String _bundleVersion;
    private File _tmpFile;

    /**
     * This constructor will create an instance using the default
     * {@link com.kofax.mobile.sdk.extract.id.bundle.IBundleCacheProvider IBundleCacheProvider}.
     * This implementation will assume a project zip exists in the root
     * of the project's assets, named according to the project name.  E.g.
     * {@link IdRegion#getRegionName()}.zip ("USIDs.zip").
     *
     * @param ctx This context
     */
    @Inject
    public LocalProjectProvider(Context ctx) {
        _contextWeakReference = new WeakReference<>(ctx);
        _assetManager = new WeakReference<>(ctx.getAssets());
        _inputStream = null;
        Injector.getInjector(ctx).inject(this);
    }

    /**
     * This constructor allows specification of the project input stream
     * and a {@link com.kofax.mobile.sdk.extract.id.bundle.IBundleCacheProvider IBundleCacheProvider}.
     * It's possible when using this constructor to place the project bundle anywhere on, or off the device,
     * by providing its stream here.
     * @note It is the callers responsibility to close the input stream object.
     *
     * @param ctx              This context
     * @param projectZipStream An input stream to the project zip file
     * @param cacheProvider    The cache provider used to store files
     */
    @SuppressWarnings("unused")
    public LocalProjectProvider(
            Context ctx,
            InputStream projectZipStream,
            IBundleCacheProvider cacheProvider) {
        _contextWeakReference = new WeakReference<>(ctx);
        _assetManager = null;
        _inputStream = projectZipStream;
        _cacheProvider = cacheProvider;
    }

    @Override
    public void getHighestVersion(
            final String projectName,
            final String sdkVersion,
            final ICompletionListener<String> listener) {
        if (listener != null) {
            getHighestVersionAsync(projectName)
                    .continueWith(
                            new ListenerCallbackContinuation<>(listener),
                            Task.UI_THREAD_EXECUTOR);
        }
    }

    @Override
    public void getProject(
            final String projectName,
            final String version,
            final ICompletionListener<File> listener) {
        if (listener != null) {
            getProjectAsync(projectName, version)
                    .continueWith(
                            new ListenerCallbackContinuation<>(listener),
                            Task.UI_THREAD_EXECUTOR);
        }
    }

    @Override
    public void getVariant(
            final String projectName,
            final String variantName,
            final String version,
            final ICompletionListener<File> listener) {
        if (listener != null) {
            getVariantAsync(projectName, variantName, version)
                    .continueWith(
                            new ListenerCallbackContinuation<>(listener),
                            Task.UI_THREAD_EXECUTOR);
        }
    }

    @Override
    public String getLatestCachedModelDataBuildInfo(String projectName) {
        if (_cacheProvider != null)
            return _cacheProvider.getLatestModelDataBuildInfo(projectName);
        else
            return null;
    }

    private Task<String> getHighestVersionAsync(final String projectName) {
        return Task.call(new Callable<String>() {
            @Override
            public String call()
                    throws Exception {
                return getBundleVersion(projectName);
            }
        }, EXECUTOR);
    }

    /**
     * Retrieves the project bundle's version string.
     *
     * @param projectName The name of the project to get the version for
     * @return The version string
     */
    protected String getBundleVersion(String projectName) {
        if (_bundleVersion == null) {
            getRegionBundle(projectName, new IBundleRunnable() {
                @Override
                public Void run(IBundle bundle) {
                    File versionTable = null;

                    try {
                        versionTable = find(VERSION_TABLE, bundle);

                        if (versionTable == null) {
                            throw new ProjectProviderException(
                                    _contextWeakReference
                                            .get()
                                            .getString(R.string.ProjectProvider_CouldNotReadVersionTable));
                        }

                        _bundleVersion = readVersion(versionTable);

                        if (StringUtils.isEmpty(_bundleVersion)) {
                            throw new ProjectProviderException(
                                    _contextWeakReference.get().getString(
                                            R.string.ProjectProvider_CouldNotGetProjectZip));
                        }
                    } finally {
                        if (versionTable != null) {
                            //noinspection ResultOfMethodCallIgnored
                            versionTable.delete();
                        }
                    }

                    return null;
                }
            });
        }

        return _bundleVersion;
    }

    /**
     * Given the file of the version table, parses the table, and retrieves the version compatible
     * with this SDK version.
     * <p/>
     * Normally, a project bundle will only include a single version.  This implementation simply
     * ensures the bundle is formatted properly.
     *
     * @param versionTable The version table
     * @return The compatible version.
     */
    protected String readVersion(File versionTable) {
        try {
            String jsonContent = IOUtils.toString(new FileInputStream(versionTable));
            return readVersion(jsonContent);
        } catch (IOException e) {
            throw new ProjectProviderException(e);
        }
    }

    protected String readVersion(String jsonContent) {
        VersionTable table = new Gson().fromJson(jsonContent, VersionTable.class);
        if (table == null ||
                table.VersionList == null ||
                table.VersionList.length <= 0) {
            throw new ProjectProviderException(
                    _contextWeakReference.get().getString(
                            R.string.ProjectProvider_CouldNotReadVersionTable));
        }

        String sdkVersion = sdkVersion();
        String[] versionParts = sdkVersion.split("\\.");
        String thisMajor = versionParts[0];
        String thisMinor = versionParts[1];

        String dataVersion = null;

        for (VersionTable.VersionList version : table.VersionList) {
            String bundleVersionMajor = version.sdkMajor;
            String bundleVersionMinor = version.sdkMinor;

            if (bundleVersionMajor.equals(thisMajor) &&
                    bundleVersionMinor.equals(thisMinor)) {
                dataVersion = version.dataVersion;
            }
        }

        if (dataVersion == null) {
            throw new ProjectProviderException(
                    _contextWeakReference.get().getString(
                            R.string.ProjectProvider_IncorrectBundleVersion));
        }

        return dataVersion;
    }

    protected String sdkVersion() {
        return SdkVersion.getSdkVersion();
    }

    /**
     * An implementation of find that uses the filename to locate a file within a bundle.  It is
     * considered a match if the {@link IBundleFile#getAbsolutePath()} ends with the file name.
     * <p/>
     * One should ensure filenames being searched for are unique within the bundle to guarantee
     * an accurate match.  Otherwise, it's possible to send the end of a partial path to match; e.g.
     * AK3_1/variant.zip
     *
     * @param pathEndsWith The path end part to search for
     * @param bundle       The bundle to search within
     * @return A temporary file from the bundle, or null if none was found.  <b>Note:</b> the file
     * returned should be deleted to keep the system clean
     */
    private File find(String pathEndsWith, IBundle bundle) {
        Enumeration<? extends IBundleFile> bundleEnumeration = bundle.list();
        while (bundleEnumeration.hasMoreElements()) {
            IBundleFile file = bundleEnumeration.nextElement();
            if (StringUtils.endsWithIgnoreCase(file.getAbsolutePath(), pathEndsWith)) {
                return file.getFile();
            }
        }

        return null;
    }

    protected Task<File> getProjectAsync(final String projectName, final String version) {
        return Task.call(new Callable<File>() {
            @Override
            public File call()
                    throws Exception {
                String bundleVersion = getBundleVersion(projectName);
                if (!version.equals(bundleVersion)) {
                    throw new ProjectProviderException(
                            _contextWeakReference.get().getString(
                                    R.string.ProjectProvider_IncorrectBundleVersion));
                }
                File project = _cacheProvider.getProject(projectName, version);

                if (project == null) {
                    project = cacheProject(projectName, version);
                }

                return project;
            }
        }, EXECUTOR);
    }

    private File cacheProject(final String projectName, final String versionName) {
        return getRegionBundle(projectName, new IBundleRunnable<File>() {
            @Override
            public File run(IBundle bundle)
                    throws IOException {
                File projectZip = null;

                try {
                    projectZip = find(PROJECT_ZIP, bundle);


                    if (projectZip == null) {
                        throw new ProjectProviderException(
                                _contextWeakReference.get().getString(
                                        R.string.ProjectProvider_CouldNotGetProjectZip));
                    }

                    IBundle projectBundle = new ZipFileBundle(new ZipFile(projectZip));

                    return _cacheProvider.cacheProject(
                            projectName,
                            projectBundle,
                            versionName);
                } finally {
                    if (projectZip != null) {
                        //noinspection ResultOfMethodCallIgnored
                        projectZip.delete();
                    }
                }
            }
        });
    }

    protected Task<File> getVariantAsync(
            final String projectName,
            final String variantName,
            final String version) {
        return Task.call(new Callable<File>() {
            @Override
            public File call()
                    throws Exception {
                String bundleVersion = getBundleVersion(projectName);
                if (!version.equals(bundleVersion)) {
                    throw new ProjectProviderException(
                            _contextWeakReference.get().getString(
                                    R.string.ProjectProvider_IncorrectBundleVersion));
                }
                File variant = _cacheProvider.getVariant(projectName, variantName, version);

                if (variant == null) {
                    variant = cacheVariant(projectName, variantName, version);
                }

                return variant;
            }
        }, EXECUTOR);
    }

    private File cacheVariant(
            final String projectName,
            final String variantName,
            final String versionName) {
        return getRegionBundle(projectName, new IBundleRunnable<File>() {
            @Override
            public File run(IBundle bundle) {
                File variantZip = null;

                try {
                    variantZip = find("/" + variantName + "/" + VARIANT_ZIP, bundle);
                    if (variantZip == null) {
                        throw new ProjectProviderException(
                                _contextWeakReference.get().getString(
                                        R.string.ProjectProvider_CouldNotLocateVariantZip));
                    }

                    IBundle variantBundle = new ZipFileBundle(new ZipFile(variantZip));
                    return _cacheProvider.cacheVariant(
                            projectName,
                            variantName,
                            variantBundle,
                            versionName);
                } catch (IOException e) {
                    throw new ProjectProviderException(e);
                } finally {
                    if (variantZip != null) {
                        //noinspection ResultOfMethodCallIgnored
                        variantZip.delete();
                    }
                }
            }
        });
    }

    /**
     * Responsible for retrieving the bundle from either the input stream passed to the constructor
     * or from the assets.  In either case, a temporary file is created once, and the bundle is
     * copied to that temporary file.  The finalizer deletes the file.
     * <p/>
     * Because bundles need to be closed, an {@link IBundleRunnable} is passed, so that after the
     * runnable returns, the bundle is closed.
     *
     * @param projectName The project name to retrieve the bundle
     * @param runnable    The code block that will do work with the bundle
     * @param <T>         The type the block returns
     * @return Returns the value returned from the runnable
     */
    private <T> T getRegionBundle(String projectName, IBundleRunnable<T> runnable) {
        boolean closeInputStream = false;
        IBundle bundle = null;
        OutputStream outputStream = null;

        try {
            if (_tmpFile == null) {
                if (_inputStream == null) {
                    _inputStream = _assetManager.get().open(projectName + ".zip");
                    closeInputStream = true;
                }

                _tmpFile = File.createTempFile("ODE", ".zip");
                outputStream = new FileOutputStream(_tmpFile);
                IOUtils.copy(_inputStream, outputStream);
                _inputStream = null;
            }

            bundle = new ZipFileBundle(new ZipFile(_tmpFile));

            return runnable.run(bundle);
        } catch (IOException e) {
            if (_tmpFile != null) {
                //noinspection ResultOfMethodCallIgnored
                _tmpFile.delete();
            }
            throw new ProjectProviderException(e);
        } finally {
            if (closeInputStream) {
                IOUtils.closeQuietly(_inputStream);
            }

            IOUtils.closeQuietly(bundle);
            IOUtils.closeQuietly(outputStream);
        }
    }

    /**
     * Deletes the temporary working file if one exists.
     *
     * @throws Throwable
     */
    @Override
    protected void finalize()
            throws Throwable {
        super.finalize();

        if (_tmpFile != null) {
            //noinspection ResultOfMethodCallIgnored
            _tmpFile.delete();
        }
    }

    /**
     * Interface used when retrieving the project bundle
     *
     * @param <T>
     */
    private interface IBundleRunnable<T> {
        T run(IBundle inputStream)
                throws IOException;
    }

    /**
     * Generic callback handler.  This class is an adapter from {@link Task} to the callback-style
     * used by the SDK.
     *
     * @param <T>
     */
    private static class ListenerCallbackContinuation<T>
            implements Continuation<T, Void> {
        private final ICompletionListener<T> _completionListener;

        private ListenerCallbackContinuation(ICompletionListener<T> completionListener) {
            _completionListener = completionListener;
        }

        @Override
        public Void then(Task<T> task)
                throws Exception {
            _completionListener.onComplete(task.getResult(), task.getError());
            return null;
        }
    }

    /**
     * Represents the JSON layout of the version table for parsing with GSON.
     */
    public static class VersionTable {
        public VersionList[] VersionList;

        public static class VersionList {
            public String sdkMajor;
            public String sdkMinor;
            public String dataVersion;
        }
    }
}
