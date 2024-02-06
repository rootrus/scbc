package com.kofax.mobile.sdk.extract.p018id;

import android.content.Context;
import android.content.res.AssetManager;
import bolts.Continuation;
import bolts.Task;
import com.google.gson.Gson;
import com.kofax.C7861R;
import com.kofax.kmc.kut.utilities.SdkVersion;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.extract.p018id.bundle.IBundle;
import com.kofax.mobile.sdk.extract.p018id.bundle.IBundleCacheProvider;
import com.kofax.mobile.sdk.extract.p018id.bundle.IBundleFile;
import com.kofax.mobile.sdk.extract.p018id.bundle.ZipFileBundle;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.Enumeration;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.zip.ZipFile;
import org.apache.commons.io.IOUtils;
import p040o.HmlPinActivity;
import p040o.ModifyQuickTopUpReviewActivity;

/* renamed from: com.kofax.mobile.sdk.extract.id.LocalProjectProvider */
public class LocalProjectProvider implements IProjectProvider {
    private static final Executor adX = Executors.newSingleThreadExecutor();
    private static final String adY = "Project.zip";
    private static final String adZ = "VersionTable.json";
    private static final String aea = "Variant.zip";
    /* access modifiers changed from: private */

    /* renamed from: KX */
    public final WeakReference<Context> f2083KX;
    private final WeakReference<AssetManager> aeb;
    @HmlPinActivity
    IBundleCacheProvider aec;
    private InputStream aed;
    /* access modifiers changed from: private */
    public String aee;
    private File aef;

    /* renamed from: com.kofax.mobile.sdk.extract.id.LocalProjectProvider$VersionTable */
    public static class VersionTable {
        public VersionList[] VersionList;

        /* renamed from: com.kofax.mobile.sdk.extract.id.LocalProjectProvider$VersionTable$VersionList */
        public static class VersionList {
            public String dataVersion;
            public String sdkMajor;
            public String sdkMinor;
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.LocalProjectProvider$a */
    interface C0882a<T> {
        /* renamed from: b */
        T mo12231b(IBundle iBundle) throws IOException;
    }

    @HmlPinActivity
    public LocalProjectProvider(Context context) {
        this.f2083KX = new WeakReference<>(context);
        this.aeb = new WeakReference<>(context.getAssets());
        this.aed = null;
        Injector.getInjector(context).inject(this);
    }

    public LocalProjectProvider(Context context, InputStream inputStream, IBundleCacheProvider iBundleCacheProvider) {
        this.f2083KX = new WeakReference<>(context);
        this.aeb = null;
        this.aed = inputStream;
        this.aec = iBundleCacheProvider;
    }

    public void getHighestVersion(String str, String str2, ICompletionListener<String> iCompletionListener) {
        if (iCompletionListener != null) {
            m2264aM(str).continueWith(new C0883b(iCompletionListener), Task.UI_THREAD_EXECUTOR);
        }
    }

    public void getProject(String str, String str2, ICompletionListener<File> iCompletionListener) {
        if (iCompletionListener != null) {
            getProjectAsync(str, str2).continueWith(new C0883b(iCompletionListener), Task.UI_THREAD_EXECUTOR);
        }
    }

    public void getVariant(String str, String str2, String str3, ICompletionListener<File> iCompletionListener) {
        if (iCompletionListener != null) {
            getVariantAsync(str, str2, str3).continueWith(new C0883b(iCompletionListener), Task.UI_THREAD_EXECUTOR);
        }
    }

    public String getLatestCachedModelDataBuildInfo(String str) {
        IBundleCacheProvider iBundleCacheProvider = this.aec;
        if (iBundleCacheProvider != null) {
            return iBundleCacheProvider.getLatestModelDataBuildInfo(str);
        }
        return null;
    }

    /* renamed from: aM */
    private Task<String> m2264aM(final String str) {
        return Task.call(new Callable<String>() {
            /* renamed from: mB */
            public String call() throws Exception {
                return LocalProjectProvider.this.getBundleVersion(str);
            }
        }, adX);
    }

    /* access modifiers changed from: protected */
    public String getBundleVersion(String str) {
        if (this.aee == null) {
            m2262a(str, new C0882a() {
                /* JADX WARNING: Removed duplicated region for block: B:24:0x0067  */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public java.lang.Void mo12231b(com.kofax.mobile.sdk.extract.p018id.bundle.IBundle r5) {
                    /*
                        r4 = this;
                        r0 = 0
                        com.kofax.mobile.sdk.extract.id.LocalProjectProvider r1 = com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.this     // Catch:{ all -> 0x0064 }
                        java.lang.String r2 = "VersionTable.json"
                        java.io.File r5 = r1.m2261a((java.lang.String) r2, (com.kofax.mobile.sdk.extract.p018id.bundle.IBundle) r5)     // Catch:{ all -> 0x0064 }
                        if (r5 == 0) goto L_0x0047
                        com.kofax.mobile.sdk.extract.id.LocalProjectProvider r1 = com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.this     // Catch:{ all -> 0x005f }
                        com.kofax.mobile.sdk.extract.id.LocalProjectProvider r2 = com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.this     // Catch:{ all -> 0x005f }
                        java.lang.String r2 = r2.readVersion((java.io.File) r5)     // Catch:{ all -> 0x005f }
                        java.lang.String unused = r1.aee = r2     // Catch:{ all -> 0x005f }
                        com.kofax.mobile.sdk.extract.id.LocalProjectProvider r1 = com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.this     // Catch:{ all -> 0x005f }
                        java.lang.String r1 = r1.aee     // Catch:{ all -> 0x005f }
                        if (r1 == 0) goto L_0x0026
                        int r1 = r1.length()     // Catch:{ all -> 0x005f }
                        if (r1 == 0) goto L_0x0026
                        r1 = 0
                        goto L_0x0027
                    L_0x0026:
                        r1 = 1
                    L_0x0027:
                        if (r1 != 0) goto L_0x002f
                        if (r5 == 0) goto L_0x002e
                        r5.delete()
                    L_0x002e:
                        return r0
                    L_0x002f:
                        com.kofax.mobile.sdk.extract.id.ProjectProviderException r0 = new com.kofax.mobile.sdk.extract.id.ProjectProviderException     // Catch:{ all -> 0x005f }
                        com.kofax.mobile.sdk.extract.id.LocalProjectProvider r1 = com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.this     // Catch:{ all -> 0x005f }
                        java.lang.ref.WeakReference r1 = r1.f2083KX     // Catch:{ all -> 0x005f }
                        java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x005f }
                        android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x005f }
                        int r2 = com.kofax.C7861R.string.ProjectProvider_CouldNotGetProjectZip     // Catch:{ all -> 0x005f }
                        java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x005f }
                        r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x005f }
                        throw r0     // Catch:{ all -> 0x005f }
                    L_0x0047:
                        com.kofax.mobile.sdk.extract.id.ProjectProviderException r0 = new com.kofax.mobile.sdk.extract.id.ProjectProviderException     // Catch:{ all -> 0x005f }
                        com.kofax.mobile.sdk.extract.id.LocalProjectProvider r1 = com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.this     // Catch:{ all -> 0x005f }
                        java.lang.ref.WeakReference r1 = r1.f2083KX     // Catch:{ all -> 0x005f }
                        java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x005f }
                        android.content.Context r1 = (android.content.Context) r1     // Catch:{ all -> 0x005f }
                        int r2 = com.kofax.C7861R.string.ProjectProvider_CouldNotReadVersionTable     // Catch:{ all -> 0x005f }
                        java.lang.String r1 = r1.getString(r2)     // Catch:{ all -> 0x005f }
                        r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x005f }
                        throw r0     // Catch:{ all -> 0x005f }
                    L_0x005f:
                        r0 = move-exception
                        r3 = r0
                        r0 = r5
                        r5 = r3
                        goto L_0x0065
                    L_0x0064:
                        r5 = move-exception
                    L_0x0065:
                        if (r0 == 0) goto L_0x006a
                        r0.delete()
                    L_0x006a:
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.C08772.mo12231b(com.kofax.mobile.sdk.extract.id.bundle.IBundle):java.lang.Void");
                }
            });
        }
        return this.aee;
    }

    /* access modifiers changed from: protected */
    public String readVersion(File file) {
        try {
            return readVersion(IOUtils.toString(new FileInputStream(file)));
        } catch (IOException e) {
            throw new ProjectProviderException((Exception) e);
        }
    }

    /* access modifiers changed from: protected */
    public String readVersion(String str) {
        VersionTable versionTable = (VersionTable) new Gson().fromJson(str, VersionTable.class);
        if (versionTable == null || versionTable.VersionList == null || versionTable.VersionList.length <= 0) {
            throw new ProjectProviderException(this.f2083KX.get().getString(C7861R.string.ProjectProvider_CouldNotReadVersionTable));
        }
        String[] split = sdkVersion().split("\\.");
        String str2 = split[0];
        String str3 = split[1];
        String str4 = null;
        for (VersionTable.VersionList versionList : versionTable.VersionList) {
            String str5 = versionList.sdkMajor;
            String str6 = versionList.sdkMinor;
            if (str5.equals(str2) && str6.equals(str3)) {
                str4 = versionList.dataVersion;
            }
        }
        if (str4 != null) {
            return str4;
        }
        throw new ProjectProviderException(this.f2083KX.get().getString(C7861R.string.ProjectProvider_IncorrectBundleVersion));
    }

    /* access modifiers changed from: protected */
    public String sdkVersion() {
        return SdkVersion.getSdkVersion();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public File m2261a(String str, IBundle iBundle) {
        Enumeration<? extends IBundleFile> list = iBundle.list();
        while (list.hasMoreElements()) {
            IBundleFile iBundleFile = (IBundleFile) list.nextElement();
            if (ModifyQuickTopUpReviewActivity.read((CharSequence) iBundleFile.getAbsolutePath(), (CharSequence) str)) {
                return iBundleFile.getFile();
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Task<File> getProjectAsync(final String str, final String str2) {
        return Task.call(new Callable<File>() {
            /* renamed from: tX */
            public File call() throws Exception {
                if (str2.equals(LocalProjectProvider.this.getBundleVersion(str))) {
                    File project = LocalProjectProvider.this.aec.getProject(str, str2);
                    return project == null ? LocalProjectProvider.this.m2257O(str, str2) : project;
                }
                throw new ProjectProviderException(((Context) LocalProjectProvider.this.f2083KX.get()).getString(C7861R.string.ProjectProvider_IncorrectBundleVersion));
            }
        }, adX);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public File m2257O(final String str, final String str2) {
        return (File) m2262a(str, new C0882a<File>() {
            /* renamed from: c */
            public File mo12231b(IBundle iBundle) throws IOException {
                File file = null;
                try {
                    file = LocalProjectProvider.this.m2261a(LocalProjectProvider.adY, iBundle);
                    if (file != null) {
                        return LocalProjectProvider.this.aec.cacheProject(str, new ZipFileBundle(new ZipFile(file)), str2);
                    }
                    throw new ProjectProviderException(((Context) LocalProjectProvider.this.f2083KX.get()).getString(C7861R.string.ProjectProvider_CouldNotGetProjectZip));
                } finally {
                    if (file != null) {
                        file.delete();
                    }
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public Task<File> getVariantAsync(final String str, final String str2, final String str3) {
        return Task.call(new Callable<File>() {
            /* renamed from: tX */
            public File call() throws Exception {
                if (str3.equals(LocalProjectProvider.this.getBundleVersion(str))) {
                    File variant = LocalProjectProvider.this.aec.getVariant(str, str2, str3);
                    return variant == null ? LocalProjectProvider.this.m2267f(str, str2, str3) : variant;
                }
                throw new ProjectProviderException(((Context) LocalProjectProvider.this.f2083KX.get()).getString(C7861R.string.ProjectProvider_IncorrectBundleVersion));
            }
        }, adX);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public File m2267f(final String str, final String str2, final String str3) {
        return (File) m2262a(str, new C0882a<File>() {
            /* renamed from: c */
            public File mo12231b(IBundle iBundle) {
                File file = null;
                try {
                    LocalProjectProvider localProjectProvider = LocalProjectProvider.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("/");
                    sb.append(str2);
                    sb.append("/");
                    sb.append(LocalProjectProvider.aea);
                    file = localProjectProvider.m2261a(sb.toString(), iBundle);
                    if (file != null) {
                        File cacheVariant = LocalProjectProvider.this.aec.cacheVariant(str, str2, new ZipFileBundle(new ZipFile(file)), str3);
                        if (file != null) {
                            file.delete();
                        }
                        return cacheVariant;
                    }
                    throw new ProjectProviderException(((Context) LocalProjectProvider.this.f2083KX.get()).getString(C7861R.string.ProjectProvider_CouldNotLocateVariantZip));
                } catch (IOException e) {
                    throw new ProjectProviderException((Exception) e);
                } catch (Throwable th) {
                    if (file != null) {
                        file.delete();
                    }
                    throw th;
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075 A[Catch:{ all -> 0x0066 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private <T> T m2262a(java.lang.String r6, com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.C0882a<T> r7) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            java.io.File r2 = r5.aef     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            if (r2 != 0) goto L_0x0041
            java.io.InputStream r2 = r5.aed     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.lang.String r3 = ".zip"
            if (r2 != 0) goto L_0x002a
            java.lang.ref.WeakReference<android.content.res.AssetManager> r2 = r5.aeb     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            android.content.res.AssetManager r2 = (android.content.res.AssetManager) r2     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r4.<init>()     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r4.append(r6)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r4.append(r3)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.lang.String r6 = r4.toString()     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.io.InputStream r6 = r2.open(r6)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r5.aed = r6     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r1 = 1
        L_0x002a:
            java.lang.String r6 = "ODE"
            java.io.File r6 = java.io.File.createTempFile(r6, r3)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r5.aef = r6     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.io.File r2 = r5.aef     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            r6.<init>(r2)     // Catch:{ IOException -> 0x006e, all -> 0x006a }
            java.io.InputStream r2 = r5.aed     // Catch:{ IOException -> 0x0068 }
            org.apache.commons.io.IOUtils.copy(r2, r6)     // Catch:{ IOException -> 0x0068 }
            r5.aed = r0     // Catch:{ IOException -> 0x0068 }
            goto L_0x0042
        L_0x0041:
            r6 = r0
        L_0x0042:
            com.kofax.mobile.sdk.extract.id.bundle.ZipFileBundle r2 = new com.kofax.mobile.sdk.extract.id.bundle.ZipFileBundle     // Catch:{ IOException -> 0x0068 }
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0068 }
            java.io.File r4 = r5.aef     // Catch:{ IOException -> 0x0068 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0068 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x0068 }
            java.lang.Object r7 = r7.mo12231b(r2)     // Catch:{ IOException -> 0x0063, all -> 0x0060 }
            if (r1 == 0) goto L_0x0059
            java.io.InputStream r0 = r5.aed
            org.apache.commons.io.IOUtils.closeQuietly(r0)
        L_0x0059:
            org.apache.commons.io.IOUtils.closeQuietly(r2)
            org.apache.commons.io.IOUtils.closeQuietly(r6)
            return r7
        L_0x0060:
            r7 = move-exception
            r0 = r2
            goto L_0x0080
        L_0x0063:
            r7 = move-exception
            r0 = r2
            goto L_0x0071
        L_0x0066:
            r7 = move-exception
            goto L_0x0080
        L_0x0068:
            r7 = move-exception
            goto L_0x0071
        L_0x006a:
            r6 = move-exception
            r7 = r6
            r6 = r0
            goto L_0x0080
        L_0x006e:
            r6 = move-exception
            r7 = r6
            r6 = r0
        L_0x0071:
            java.io.File r2 = r5.aef     // Catch:{ all -> 0x0066 }
            if (r2 == 0) goto L_0x007a
            java.io.File r2 = r5.aef     // Catch:{ all -> 0x0066 }
            r2.delete()     // Catch:{ all -> 0x0066 }
        L_0x007a:
            com.kofax.mobile.sdk.extract.id.ProjectProviderException r2 = new com.kofax.mobile.sdk.extract.id.ProjectProviderException     // Catch:{ all -> 0x0066 }
            r2.<init>((java.lang.Exception) r7)     // Catch:{ all -> 0x0066 }
            throw r2     // Catch:{ all -> 0x0066 }
        L_0x0080:
            if (r1 == 0) goto L_0x0087
            java.io.InputStream r1 = r5.aed
            org.apache.commons.io.IOUtils.closeQuietly(r1)
        L_0x0087:
            org.apache.commons.io.IOUtils.closeQuietly(r0)
            org.apache.commons.io.IOUtils.closeQuietly(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider.m2262a(java.lang.String, com.kofax.mobile.sdk.extract.id.LocalProjectProvider$a):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        super.finalize();
        File file = this.aef;
        if (file != null) {
            file.delete();
        }
    }

    /* renamed from: com.kofax.mobile.sdk.extract.id.LocalProjectProvider$b */
    static class C0883b<T> implements Continuation<T, Void> {
        private final ICompletionListener<T> ael;

        private C0883b(ICompletionListener<T> iCompletionListener) {
            this.ael = iCompletionListener;
        }

        public Void then(Task<T> task) throws Exception {
            this.ael.onComplete(task.getResult(), task.getError());
            return null;
        }
    }
}
