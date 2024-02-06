package com.google.android.gms.analytics;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzcz;
import com.google.android.gms.internal.gtm.zzq;
import com.google.android.gms.internal.gtm.zzv;
import java.lang.Thread;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzk {
    private static volatile zzk zzsq;
    private final Context zzrm;
    /* access modifiers changed from: private */
    public final List<zzn> zzsr = new CopyOnWriteArrayList();
    private final zze zzss = new zze();
    private final zza zzst = new zza();
    private volatile zzq zzsu;
    /* access modifiers changed from: private */
    public Thread.UncaughtExceptionHandler zzsv;

    static final class zzb implements ThreadFactory {
        private static final AtomicInteger zzsz = new AtomicInteger();

        private zzb() {
        }

        public final Thread newThread(Runnable runnable) {
            int incrementAndGet = zzsz.incrementAndGet();
            StringBuilder sb = new StringBuilder(23);
            sb.append("measurement-");
            sb.append(incrementAndGet);
            return new zzc(runnable, sb.toString());
        }

        /* synthetic */ zzb(zzl zzl) {
            this();
        }
    }

    private zzk(Context context) {
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zzrm = applicationContext;
    }

    static final class zzc extends Thread {
        zzc(Runnable runnable, String str) {
            super(runnable, str);
        }

        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    final class zza extends ThreadPoolExecutor {
        public zza() {
            super(1, 1, 1, TimeUnit.MINUTES, new LinkedBlockingQueue());
            setThreadFactory(new zzb((zzl) null));
            allowCoreThreadTimeOut(true);
        }

        /* access modifiers changed from: protected */
        public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return new zzm(this, runnable, t);
        }
    }

    public static zzk zzb(Context context) {
        Preconditions.checkNotNull(context);
        if (zzsq == null) {
            synchronized (zzk.class) {
                if (zzsq == null) {
                    zzsq = new zzk(context);
                }
            }
        }
        return zzsq;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|(1:18)(1:19)|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r1 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        if (r1.length() != 0) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        r1 = "Error retrieving package info: appName set to ".concat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r1 = new java.lang.String("Error retrieving package info: appName set to ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        android.util.Log.e("GAv4", r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.gtm.zzq zzat() {
        /*
            r6 = this;
            com.google.android.gms.internal.gtm.zzq r0 = r6.zzsu
            if (r0 != 0) goto L_0x0070
            monitor-enter(r6)
            com.google.android.gms.internal.gtm.zzq r0 = r6.zzsu     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x006b
            com.google.android.gms.internal.gtm.zzq r0 = new com.google.android.gms.internal.gtm.zzq     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            android.content.Context r1 = r6.zzrm     // Catch:{ all -> 0x006d }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ all -> 0x006d }
            android.content.Context r2 = r6.zzrm     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ all -> 0x006d }
            r0.setAppId(r2)     // Catch:{ all -> 0x006d }
            java.lang.String r3 = r1.getInstallerPackageName(r2)     // Catch:{ all -> 0x006d }
            r0.setAppInstallerId(r3)     // Catch:{ all -> 0x006d }
            r3 = 0
            android.content.Context r4 = r6.zzrm     // Catch:{ NameNotFoundException -> 0x0046 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0046 }
            r5 = 0
            android.content.pm.PackageInfo r4 = r1.getPackageInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0046 }
            if (r4 == 0) goto L_0x0063
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo     // Catch:{ NameNotFoundException -> 0x0046 }
            java.lang.CharSequence r1 = r1.getApplicationLabel(r5)     // Catch:{ NameNotFoundException -> 0x0046 }
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x0046 }
            if (r5 != 0) goto L_0x0043
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0046 }
            r2 = r1
        L_0x0043:
            java.lang.String r3 = r4.versionName     // Catch:{ NameNotFoundException -> 0x0046 }
            goto L_0x0063
        L_0x0046:
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x006d }
            int r4 = r1.length()     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0057
            java.lang.String r4 = "Error retrieving package info: appName set to "
            java.lang.String r1 = r4.concat(r1)     // Catch:{ all -> 0x006d }
            goto L_0x005e
        L_0x0057:
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "Error retrieving package info: appName set to "
            r1.<init>(r4)     // Catch:{ all -> 0x006d }
        L_0x005e:
            java.lang.String r4 = "GAv4"
            android.util.Log.e(r4, r1)     // Catch:{ all -> 0x006d }
        L_0x0063:
            r0.setAppName(r2)     // Catch:{ all -> 0x006d }
            r0.setAppVersion(r3)     // Catch:{ all -> 0x006d }
            r6.zzsu = r0     // Catch:{ all -> 0x006d }
        L_0x006b:
            monitor-exit(r6)     // Catch:{ all -> 0x006d }
            goto L_0x0070
        L_0x006d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006d }
            throw r0
        L_0x0070:
            com.google.android.gms.internal.gtm.zzq r0 = r6.zzsu
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.zzk.zzat():com.google.android.gms.internal.gtm.zzq");
    }

    public final zzv zzau() {
        DisplayMetrics displayMetrics = this.zzrm.getResources().getDisplayMetrics();
        zzv zzv = new zzv();
        zzv.setLanguage(zzcz.zza(Locale.getDefault()));
        zzv.zzul = displayMetrics.widthPixels;
        zzv.zzum = displayMetrics.heightPixels;
        return zzv;
    }

    /* access modifiers changed from: package-private */
    public final void zze(zzg zzg) {
        if (zzg.zzaq()) {
            throw new IllegalStateException("Measurement prototype can't be submitted");
        } else if (!zzg.zzan()) {
            zzg zzai = zzg.zzai();
            zzai.zzao();
            this.zzst.execute(new zzl(this, zzai));
        } else {
            throw new IllegalStateException("Measurement can only be submitted once");
        }
    }

    public final Context getContext() {
        return this.zzrm;
    }

    public static void zzav() {
        if (!(Thread.currentThread() instanceof zzc)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void zza(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zzsv = uncaughtExceptionHandler;
    }

    public final <V> Future<V> zza(Callable<V> callable) {
        Preconditions.checkNotNull(callable);
        if (!(Thread.currentThread() instanceof zzc)) {
            return this.zzst.submit(callable);
        }
        FutureTask futureTask = new FutureTask(callable);
        futureTask.run();
        return futureTask;
    }

    public final void zza(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        this.zzst.submit(runnable);
    }

    /* access modifiers changed from: private */
    public static void zzb(zzg zzg) {
        Preconditions.checkNotMainThread("deliver should be called from worker thread");
        Preconditions.checkArgument(zzg.zzan(), "Measurement must be submitted");
        List<zzo> zzak = zzg.zzak();
        if (!zzak.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (zzo next : zzak) {
                Uri zzae = next.zzae();
                if (!hashSet.contains(zzae)) {
                    hashSet.add(zzae);
                    next.zzb(zzg);
                }
            }
        }
    }
}
