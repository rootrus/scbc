package com.kofax.mobile.sdk.extract.p018id.bundle;

import android.content.Context;
import com.kofax.mobile.sdk.extract.p018id.ProjectProviderException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.FalseFileFilter;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.SetupQuickTopUpReviewActivity;

/* renamed from: com.kofax.mobile.sdk.extract.id.bundle.BundleCacheProvider */
public class BundleCacheProvider implements IBundleCacheProvider {
    public static final String ODE_CACHE = "_COM_KOFAX_MOBILE_SDK_EXTRACT_ID_ODE_CACHE_";
    private static final String afG = "BuildInfo.txt";
    private File afH;

    public BundleCacheProvider(Context context) {
        this.afH = new File(context.getFilesDir(), ODE_CACHE);
    }

    @HmlPinActivity
    public BundleCacheProvider(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_COM_KOFAX_MOBILE_SDK_EXTRACT_ID_ODE_CACHE_") File file) {
        this.afH = new File(file, ODE_CACHE);
    }

    public String getLatestModelDataBuildInfo(String str) {
        String latestVersionForProject = getLatestVersionForProject(str);
        if (latestVersionForProject == null) {
            return null;
        }
        try {
            Scanner scanner = new Scanner(new File(getProject(str, latestVersionForProject), afG));
            if (scanner.hasNextLine()) {
                return scanner.nextLine();
            }
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File getProject(String str, String str2) {
        File T = m2278T(str, str2);
        if (!m2282i(T)) {
            return null;
        }
        return T;
    }

    public File cacheProject(String str, IBundle iBundle, String str2) {
        File T = m2278T(str, str2);
        try {
            Enumeration<? extends IBundleFile> list = iBundle.list();
            while (list.hasMoreElements()) {
                IBundleFile iBundleFile = (IBundleFile) list.nextElement();
                if (!iBundleFile.isDirectory()) {
                    m2279a(iBundleFile, T);
                }
            }
            return T;
        } catch (IOException e) {
            throw new ProjectProviderException((Exception) e);
        }
    }

    public File getVariant(String str, String str2, String str3) {
        File file = new File(getProject(str, str3), str2);
        if (!m2282i(file)) {
            return null;
        }
        return file;
    }

    public File cacheVariant(String str, String str2, IBundle iBundle, String str3) {
        try {
            File file = new File(m2278T(str, str3), str2);
            Enumeration<? extends IBundleFile> list = iBundle.list();
            while (list.hasMoreElements()) {
                IBundleFile iBundleFile = (IBundleFile) list.nextElement();
                if (!iBundleFile.isDirectory()) {
                    m2279a(iBundleFile, file);
                }
            }
            return file;
        } catch (Exception e) {
            throw new ProjectProviderException(e);
        }
    }

    public String getLatestVersionForProject(String str) {
        File file = this.afH;
        String str2 = null;
        if (file != null && file.exists()) {
            for (File file2 : FileUtils.listFilesAndDirs(this.afH, FalseFileFilter.FALSE, DirectoryFileFilter.DIRECTORY)) {
                if (file2.getName().equalsIgnoreCase(str)) {
                    if (str2 == null) {
                        str2 = file2.getParentFile().getName();
                    } else {
                        throw new ProjectProviderException("More than one cache directory exists!");
                    }
                }
            }
        }
        return str2;
    }

    /* access modifiers changed from: protected */
    public void clearCache() {
        File file = this.afH;
        if (file != null && file.exists()) {
            m2280g(this.afH);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Could not clean cache of file/directory: ");
        r0.append(r2.afH.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        throw new com.kofax.mobile.sdk.extract.p018id.ProjectProviderException(r0.toString());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0008 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2280g(java.io.File r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.m2281h(r3)     // Catch:{ SecurityException -> 0x0008 }
            monitor-exit(r2)
            return
        L_0x0006:
            r3 = move-exception
            goto L_0x0025
        L_0x0008:
            com.kofax.mobile.sdk.extract.id.ProjectProviderException r3 = new com.kofax.mobile.sdk.extract.id.ProjectProviderException     // Catch:{ all -> 0x0006 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0006 }
            r0.<init>()     // Catch:{ all -> 0x0006 }
            java.lang.String r1 = "Could not clean cache of file/directory: "
            r0.append(r1)     // Catch:{ all -> 0x0006 }
            java.io.File r1 = r2.afH     // Catch:{ all -> 0x0006 }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x0006 }
            r0.append(r1)     // Catch:{ all -> 0x0006 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0006 }
            r3.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0006 }
            throw r3     // Catch:{ all -> 0x0006 }
        L_0x0025:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk.extract.p018id.bundle.BundleCacheProvider.m2280g(java.io.File):void");
    }

    /* renamed from: h */
    private void m2281h(File file) {
        if (file.isDirectory()) {
            for (File h : file.listFiles()) {
                m2281h(h);
            }
        }
        if (!file.delete()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not clean cache of file/directory: ");
            sb.append(file.getAbsolutePath());
            throw new ProjectProviderException(sb.toString());
        }
    }

    /* renamed from: T */
    private File m2278T(String str, String str2) {
        if (this.afH.exists() && this.afH.list().length > 0) {
            for (File file : this.afH.listFiles()) {
                if (!file.getName().equals(str2) && SetupQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver(file.list(), str)) {
                    m2280g(new File(file, str));
                    if (file.list().length <= 0) {
                        file.delete();
                    }
                }
            }
        }
        return new File(new File(this.afH, str2), str);
    }

    /* renamed from: a */
    private void m2279a(IBundleFile iBundleFile, File file) throws IOException {
        File file2 = new File(file, new File(iBundleFile.getName()).getName());
        if (!file2.exists()) {
            File parentFile = file2.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                iBundleFile.getFile(file2);
                return;
            }
            throw new ProjectProviderException("Unable to save file to cache");
        }
    }

    /* renamed from: i */
    private boolean m2282i(File file) {
        if (file != null && file.exists() && file.list() != null && file.list().length > 0) {
            for (File isDirectory : file.listFiles()) {
                if (!isDirectory.isDirectory()) {
                    return true;
                }
            }
        }
        return false;
    }
}
