package com.kofax.mobile.sdk.extract.p018id;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import bolts.Capture;
import bolts.Continuation;
import bolts.Task;
import com.google.gson.Gson;
import com.kofax.C7861R;
import com.kofax.kmc.kut.utilities.CertificateValidatorListener;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.extract.p018id.bundle.IBundleCacheProvider;
import com.kofax.mobile.sdk.extract.p018id.bundle.ZipInputStreamBundle;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.apache.commons.io.IOUtils;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider */
public class ServerProjectProvider implements IProjectProvider {
    private static final String aeW = "GetHighestVersion";
    private static final String aeX = "getProject";
    private static final String aeY = "getVariant";
    private static final String aeZ = "sdkVersion";
    private static final String afa = "version";
    private static final String afb = "project";
    private static final String afc = "variant";
    private static final Object afd = new Object();

    /* renamed from: yX */
    private static final String f4893yX = "VariantsList.json";
    @HmlPinActivity
    IBundleCacheProvider aec;
    /* access modifiers changed from: private */
    public final List<C8371a> afe;
    /* access modifiers changed from: private */
    public final Map<String, Map<String, String>> aff;
    private final String afg;
    /* access modifiers changed from: private */
    public final String afh;
    /* access modifiers changed from: private */
    public final String afi;
    @HmlPinActivity
    ConnectivityManager afj;

    /* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider$Error */
    public static class Error {
        public String Message;
        public String message;
    }

    public ServerProjectProvider(Context context, String str) throws MalformedURLException {
        this(context, (IBundleCacheProvider) null, str, (ConnectivityManager) null);
        Injector.getInjector(context).inject(this);
    }

    public ServerProjectProvider(Context context, IBundleCacheProvider iBundleCacheProvider, String str, ConnectivityManager connectivityManager) throws MalformedURLException {
        this.afe = new CopyOnWriteArrayList();
        this.aff = new HashMap();
        if (context != null) {
            if (!str.endsWith("/")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("/");
                str = sb.toString();
            }
            this.afg = str;
            if (HttpUrl.parse(str) != null) {
                this.afh = context.getString(C7861R.string.ProjectProvider_NoNetworkConnection);
                this.afi = context.getString(C7861R.string.ProjectProvider_UnparsableError);
                this.aec = iBundleCacheProvider;
                this.afj = connectivityManager;
                return;
            }
            throw new MalformedURLException();
        }
        throw new KmcRuntimeException(ErrorInfo.KMC_GN_ILLEGAL_ARGUMENT_EXCEPTION);
    }

    public void setCertificateValidatorListener(CertificateValidatorListener certificateValidatorListener) {
        synchronized (afd) {
            HttpClientHolder.m4847uc().mo55230b(this.afg, certificateValidatorListener);
        }
    }

    public void setRequestTimeout(long j, TimeUnit timeUnit) {
        synchronized (afd) {
            HttpClientHolder.m4847uc().mo55229a(j, timeUnit);
        }
    }

    public void getHighestVersion(String str, String str2, final ICompletionListener<String> iCompletionListener) {
        if (iCompletionListener != null) {
            getHighestVersionAsync(str, str2, false).continueWith(new Continuation<String, Void>() {
                public Void then(Task<String> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
        }
    }

    public String getLatestCachedModelDataBuildInfo(String str) {
        IBundleCacheProvider iBundleCacheProvider = this.aec;
        if (iBundleCacheProvider != null) {
            return iBundleCacheProvider.getLatestModelDataBuildInfo(str);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Task<String> getHighestVersionAsync(final String str, final String str2, final boolean z) {
        return m4812P(str, str2).continueWithTask(new Continuation<String, Task<String>>() {
            public Task<String> then(Task<String> task) throws Exception {
                return task.isFaulted() ? ServerProjectProvider.this.m4821a(str, str2, z) : task;
            }
        }).continueWithTask(new Continuation<String, Task<String>>() {
            public Task<String> then(Task<String> task) throws Exception {
                return task.isFaulted() ? ServerProjectProvider.this.m4819a(str, str2, task) : task;
            }
        }).onSuccess(new Continuation<String, String>() {
            /* renamed from: b */
            public String then(Task<String> task) throws Exception {
                String str = (String) task.getResult();
                ServerProjectProvider.this.m4841g(str, str2, str);
                return str;
            }
        });
    }

    /* renamed from: P */
    private Task<String> m4812P(final String str, final String str2) {
        return Task.callInBackground(new Callable<String>() {
            /* renamed from: mB */
            public String call() throws Exception {
                Map map = (Map) ServerProjectProvider.this.aff.get(str);
                String str = map != null ? (String) map.get(str2) : null;
                if (str != null) {
                    return str;
                }
                throw new Exception();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Task<String> m4821a(final String str, final String str2, final boolean z) {
        return Task.callInBackground(new C8374c()).onSuccessTask(new Continuation<String, Task<String>>() {
            public Task<String> then(Task<String> task) throws Exception {
                return new C8380f(str, str2).mo55233x(z);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Task<String> m4819a(String str, String str2, Task<String> task) {
        String latestVersionForProject = this.aec.getLatestVersionForProject(str);
        return latestVersionForProject == null || latestVersionForProject.length() == 0 ? task : Task.forResult(latestVersionForProject);
    }

    public void getProject(String str, String str2, final ICompletionListener<File> iCompletionListener) {
        if (iCompletionListener != null) {
            m4831b(str, str2, false).continueWith(new Continuation<File, Void>() {
                public Void then(Task<File> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Task<File> m4831b(final String str, final String str2, final boolean z) {
        return m4813Q(str, str2).continueWithTask(new Continuation<File, Task<File>>() {
            public Task<File> then(Task<File> task) throws Exception {
                return task.isFaulted() ? ServerProjectProvider.this.m4836c(str, str2, z) : task;
            }
        });
    }

    /* renamed from: Q */
    private Task<File> m4813Q(String str, String str2) {
        File project = this.aec.getProject(str, str2);
        if (project == null) {
            return Task.forError(new Exception());
        }
        return Task.forResult(project);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public Task<File> m4836c(final String str, final String str2, final boolean z) {
        return Task.callInBackground(new C8374c()).onSuccessTask(new Continuation<File, Task<File>>() {
            public Task<File> then(Task<File> task) throws Exception {
                return new C8373b(str, str2).mo55233x(z);
            }
        });
    }

    public void getVariant(String str, String str2, String str3, final ICompletionListener<File> iCompletionListener) {
        if (iCompletionListener != null) {
            m4820a(str, str2, str3, false).continueWith(new Continuation<File, Void>() {
                public Void then(Task<File> task) throws Exception {
                    iCompletionListener.onComplete(task.getResult(), task.getError());
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Task<File> m4820a(String str, String str2, String str3, boolean z) {
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final boolean z2 = z;
        return m4842h(str, str2, str3).continueWithTask(new Continuation<File, Task<File>>() {
            public Task<File> then(Task<File> task) throws Exception {
                return task.isFaulted() ? ServerProjectProvider.this.m4830b(str4, str5, str6, z2) : task;
            }
        });
    }

    /* renamed from: h */
    private Task<File> m4842h(String str, String str2, String str3) {
        File variant = this.aec.getVariant(str, str2, str3);
        if (variant == null) {
            return Task.forError(new Exception());
        }
        return Task.forResult(variant);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Task<File> m4830b(String str, String str2, String str3, boolean z) {
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final boolean z2 = z;
        return Task.callInBackground(new C8374c()).onSuccessTask(new Continuation<File, Task<File>>() {
            public Task<File> then(Task<File> task) throws Exception {
                return new C8379e(str4, str5, str6).mo55233x(z2);
            }
        });
    }

    public void loadAllVariantsForProject(final String str, final ICompletionListener<Void> iCompletionListener) {
        if (iCompletionListener != null) {
            String sdkVersion = sdkVersion();
            final Capture capture = new Capture();
            getHighestVersionAsync(str, sdkVersion, true).onSuccessTask(new Continuation<String, Task<File>>() {
                public Task<File> then(Task<String> task) throws Exception {
                    capture.set(task.getResult());
                    return ServerProjectProvider.this.m4831b(str, (String) task.getResult(), true);
                }
            }).onSuccessTask(new Continuation<File, Task<Void>>() {
                public Task<Void> then(Task<File> task) throws Exception {
                    String str = (String) capture.get();
                    String[] a = ServerProjectProvider.this.m4840f((File) task.getResult());
                    ArrayList arrayList = new ArrayList();
                    for (String b : a) {
                        arrayList.add(ServerProjectProvider.this.m4820a(str, b, str, true));
                    }
                    return Task.whenAll(arrayList);
                }
            }).continueWithTask(new C8375d()).continueWith(new Continuation<Void, Void>() {
                public Void then(Task<Void> task) throws Exception {
                    if (task.isCancelled()) {
                        iCompletionListener.onComplete(null, new KmcRuntimeException(ErrorInfo.KMC_EV_CANCEL_OPERATION_SUCCESS));
                    } else {
                        iCompletionListener.onComplete(null, task.getError());
                    }
                    return null;
                }
            }, Task.UI_THREAD_EXECUTOR);
        }
    }

    public void cancelLoadAllVariants() {
        for (C8371a cancel : this.afe) {
            cancel.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public HttpUrl m4814R(String str, String str2) {
        return m4827aN(aeW).addQueryParameter(afb, str).addQueryParameter(aeZ, str2).build();
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public HttpUrl m4815S(String str, String str2) {
        return m4827aN(aeX).addQueryParameter(afb, str).addQueryParameter(afa, str2).build();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public HttpUrl m4843i(String str, String str2, String str3) {
        return m4827aN(aeY).addQueryParameter(afb, str).addQueryParameter(afc, str2).addQueryParameter(afa, str3).build();
    }

    /* renamed from: aN */
    private HttpUrl.Builder m4827aN(String str) {
        return HttpUrl.parse(this.afg).newBuilder().addPathSegment(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Request m4824a(HttpUrl httpUrl) {
        return new Request.Builder().url(httpUrl).addHeader("Accept", "application/json").addHeader("Accept-Encoding", "identity").build();
    }

    /* access modifiers changed from: protected */
    public String sdkVersion() {
        return SdkVersion.getSdkVersion();
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public String[] m4840f(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(file, f4893yX));
        String iOUtils = IOUtils.toString(fileInputStream);
        IOUtils.closeQuietly(fileInputStream);
        return new Gson().getAdapter(String[].class).fromJson(iOUtils);
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider$HttpClientHolder */
    static class HttpClientHolder {
        private static final long aft = 10;
        private static final TimeUnit afu = TimeUnit.SECONDS;
        private static HttpClientHolder afz;
        long afv;
        TimeUnit afw;
        String afx;
        CertificateValidatorListener afy;
        OkHttpClient client;

        /* renamed from: uc */
        static HttpClientHolder m4847uc() {
            if (afz == null) {
                afz = new HttpClientHolder(aft, afu, (String) null, (CertificateValidatorListener) null);
            }
            return afz;
        }

        private HttpClientHolder(long j, TimeUnit timeUnit, String str, CertificateValidatorListener certificateValidatorListener) {
            m4846b(j, timeUnit, str, certificateValidatorListener);
        }

        /* renamed from: b */
        private void m4846b(long j, TimeUnit timeUnit, String str, CertificateValidatorListener certificateValidatorListener) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.connectTimeout(j, timeUnit);
            builder.writeTimeout(j, timeUnit);
            builder.readTimeout(j, timeUnit);
            if (!(certificateValidatorListener == null || str == null)) {
                try {
                    URL url = new URL(str);
                    if (url.getProtocol().equalsIgnoreCase("https")) {
                        builder.sslSocketFactory(certificateValidatorListener.getSSLSocketFactory(url.getHost()));
                    }
                } catch (Exception e) {
                    throw new ProjectProviderException(e);
                }
            }
            this.client = builder.build();
            this.afv = j;
            this.afw = timeUnit;
            this.afx = str;
            this.afy = certificateValidatorListener;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo55229a(long j, TimeUnit timeUnit) {
            m4846b(j, timeUnit, this.afx, this.afy);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo55230b(String str, CertificateValidatorListener certificateValidatorListener) {
            m4846b(this.afv, this.afw, str, certificateValidatorListener);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider$d */
    class C8375d<T> implements Continuation<T, Task<T>> {
        private C8375d() {
        }

        public Task<T> then(Task<T> task) throws Exception {
            if (!task.isFaulted()) {
                return task;
            }
            final Exception error = task.getError();
            return Task.callInBackground(new C8374c()).onSuccessTask(new Continuation<T, Task<Void>>() {
                public Task<Void> then(Task<T> task) throws Exception {
                    return Task.delay(20);
                }
            }).onSuccessTask(new Continuation<Void, Task<Void>>() {
                public Task<Void> then(Task<Void> task) throws Exception {
                    return Task.callInBackground(new C8374c());
                }
            }).onSuccessTask(new Continuation<Void, Task<T>>() {
                public Task<T> then(Task<Void> task) throws Exception {
                    return Task.forError(error);
                }
            });
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider$c */
    class C8374c<T> implements Callable<T> {
        private C8374c() {
        }

        public T call() throws Exception {
            NetworkInfo activeNetworkInfo = ServerProjectProvider.this.afj.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                return null;
            }
            throw new ProjectProviderException(ServerProjectProvider.this.afh);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider$a */
    abstract class C8371a<T> implements Callback {
        private final Request afp;
        private final Task<T>.TaskCompletionSource afq = Task.create();
        private Call afr;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract T mo55231b(InputStream inputStream) throws Exception;

        public C8371a(Request request) {
            this.afp = request;
        }

        /* renamed from: x */
        public Task<T> mo55233x(boolean z) {
            Call newCall = HttpClientHolder.m4847uc().client.newCall(this.afp);
            this.afr = newCall;
            newCall.enqueue(this);
            if (z) {
                ServerProjectProvider.this.afe.add(this);
            }
            return this.afq.getTask().continueWithTask(new Continuation<T, Task<T>>() {
                public Task<T> then(Task<T> task) throws Exception {
                    ServerProjectProvider.this.afe.remove(C8371a.this);
                    return task;
                }
            }).continueWithTask(new C8375d());
        }

        public void cancel() {
            this.afq.trySetCancelled();
            this.afr.cancel();
        }

        public void onFailure(Call call, IOException iOException) {
            m4850a(new ProjectProviderException((Exception) iOException));
        }

        /* renamed from: a */
        private void m4850a(ProjectProviderException projectProviderException) {
            this.afq.trySetError(projectProviderException);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.os.MemoryFile} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.os.MemoryFile} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.os.MemoryFile} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.os.MemoryFile} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: android.os.MemoryFile} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: android.os.MemoryFile} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: java.io.OutputStream} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.os.MemoryFile} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: android.os.MemoryFile} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.lang.Object} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onResponse(okhttp3.Call r6, okhttp3.Response r7) throws java.io.IOException {
            /*
                r5 = this;
                r6 = 0
                okhttp3.ResponseBody r0 = r7.body()     // Catch:{ Exception -> 0x009d, all -> 0x0099 }
                int r7 = r7.code()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r1 = 200(0xc8, float:2.8E-43)
                if (r7 != r1) goto L_0x0043
                java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                android.os.MemoryFile r1 = new android.os.MemoryFile     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                long r2 = r0.contentLength()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                int r2 = (int) r2     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r1.<init>(r7, r2)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.io.OutputStream r6 = r1.getOutputStream()     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
                java.io.InputStream r7 = r0.byteStream()     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
                org.apache.commons.io.IOUtils.copy(r7, r6)     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
                java.io.InputStream r7 = r1.getInputStream()     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
                java.lang.Object r7 = r5.mo55231b(r7)     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
                bolts.Task<T>$TaskCompletionSource r2 = r5.afq     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
                r2.trySetResult(r7)     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
                goto L_0x008c
            L_0x0038:
                r7 = move-exception
                goto L_0x00bd
            L_0x003b:
                r7 = move-exception
                r4 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r4
                goto L_0x00a2
            L_0x0043:
                com.google.gson.Gson r7 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r7.<init>()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.Class<com.kofax.mobile.sdk.extract.id.ServerProjectProvider$Error> r1 = com.kofax.mobile.sdk.extract.p018id.ServerProjectProvider.Error.class
                com.google.gson.TypeAdapter r7 = r7.getAdapter(r1)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.String r1 = r0.string()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.Object r7 = r7.fromJson((java.lang.String) r1)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                com.kofax.mobile.sdk.extract.id.ServerProjectProvider$Error r7 = (com.kofax.mobile.sdk.extract.p018id.ServerProjectProvider.Error) r7     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.String r1 = r7.message     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0066
                int r1 = r1.length()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                if (r1 == 0) goto L_0x0066
                r1 = r2
                goto L_0x0067
            L_0x0066:
                r1 = r3
            L_0x0067:
                if (r1 != 0) goto L_0x006c
                java.lang.String r7 = r7.message     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                goto L_0x0083
            L_0x006c:
                java.lang.String r1 = r7.Message     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                if (r1 == 0) goto L_0x0077
                int r1 = r1.length()     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                if (r1 == 0) goto L_0x0077
                goto L_0x0078
            L_0x0077:
                r2 = r3
            L_0x0078:
                if (r2 != 0) goto L_0x007d
                java.lang.String r7 = r7.Message     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                goto L_0x0083
            L_0x007d:
                com.kofax.mobile.sdk.extract.id.ServerProjectProvider r7 = com.kofax.mobile.sdk.extract.p018id.ServerProjectProvider.this     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                java.lang.String r7 = r7.afi     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
            L_0x0083:
                com.kofax.mobile.sdk.extract.id.ProjectProviderException r1 = new com.kofax.mobile.sdk.extract.id.ProjectProviderException     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r1.<init>((java.lang.String) r7)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r5.m4850a(r1)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
                r1 = r6
            L_0x008c:
                org.apache.commons.io.IOUtils.closeQuietly(r0)
                org.apache.commons.io.IOUtils.closeQuietly(r6)
                if (r1 == 0) goto L_0x00b6
                goto L_0x00b3
            L_0x0095:
                r7 = move-exception
                goto L_0x009b
            L_0x0097:
                r7 = move-exception
                goto L_0x009f
            L_0x0099:
                r7 = move-exception
                r0 = r6
            L_0x009b:
                r1 = r6
                goto L_0x00bd
            L_0x009d:
                r7 = move-exception
                r0 = r6
            L_0x009f:
                r1 = r0
                r0 = r7
                r7 = r6
            L_0x00a2:
                com.kofax.mobile.sdk.extract.id.ProjectProviderException r2 = new com.kofax.mobile.sdk.extract.id.ProjectProviderException     // Catch:{ all -> 0x00b7 }
                r2.<init>((java.lang.Exception) r0)     // Catch:{ all -> 0x00b7 }
                r5.m4850a(r2)     // Catch:{ all -> 0x00b7 }
                org.apache.commons.io.IOUtils.closeQuietly(r1)
                org.apache.commons.io.IOUtils.closeQuietly(r7)
                if (r6 == 0) goto L_0x00b6
                r1 = r6
            L_0x00b3:
                r1.close()
            L_0x00b6:
                return
            L_0x00b7:
                r0 = move-exception
                r4 = r1
                r1 = r6
                r6 = r7
                r7 = r0
                r0 = r4
            L_0x00bd:
                org.apache.commons.io.IOUtils.closeQuietly(r0)
                org.apache.commons.io.IOUtils.closeQuietly(r6)
                if (r1 == 0) goto L_0x00c8
                r1.close()
            L_0x00c8:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.extract.p018id.ServerProjectProvider.C8371a.onResponse(okhttp3.Call, okhttp3.Response):void");
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider$f */
    class C8380f extends C8371a<String> {
        public C8380f(String str, String str2) {
            super(ServerProjectProvider.this.m4824a(ServerProjectProvider.this.m4814R(str, str2)));
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo55231b(InputStream inputStream) throws Exception {
            return IOUtils.toString(inputStream).replace("\"", "");
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider$b */
    class C8373b extends C8371a<File> {
        private final String afA;
        private final String afB;

        public C8373b(String str, String str2) {
            super(ServerProjectProvider.this.m4824a(ServerProjectProvider.this.m4815S(str, str2)));
            this.afA = str;
            this.afB = str2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public File mo55231b(InputStream inputStream) throws Exception {
            return ServerProjectProvider.this.aec.cacheProject(this.afA, new ZipInputStreamBundle(inputStream), this.afB);
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider$e */
    class C8379e extends C8371a<File> {
        private final String afA;
        private final String afB;
        private final String afE;

        public C8379e(String str, String str2, String str3) {
            super(ServerProjectProvider.this.m4824a(ServerProjectProvider.this.m4843i(str, str2, str3)));
            this.afA = str;
            this.afE = str2;
            this.afB = str3;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public File mo55231b(InputStream inputStream) throws Exception {
            return ServerProjectProvider.this.aec.cacheVariant(this.afA, this.afE, new ZipInputStreamBundle(inputStream), this.afB);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m4841g(String str, String str2, String str3) {
        if (!(str3 == null || str3.length() == 0) && !this.aff.containsKey(str)) {
            HashMap hashMap = new HashMap(1);
            hashMap.put(str2, str3);
            this.aff.put(str, hashMap);
        }
    }
}
