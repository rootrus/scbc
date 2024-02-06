package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public class FirebaseInstanceId {
    private static final long zza = TimeUnit.HOURS.toSeconds(8);
    private static zzaz zzb;
    private static final Pattern zzc = Pattern.compile("\\AA[\\w-]{38}\\z");
    private static ScheduledExecutorService zzd;
    private final Executor zze;
    /* access modifiers changed from: private */
    public final FirebaseApp zzf;
    private final zzao zzg;
    private final zzt zzh;
    private final zzat zzi;
    private final FirebaseInstallationsApi zzj;
    private boolean zzk;
    private final zza zzl;

    public static FirebaseInstanceId getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        zza(firebaseApp);
        return (FirebaseInstanceId) firebaseApp.get(FirebaseInstanceId.class);
    }

    final class zza {
        private boolean zzb;
        private final Subscriber zzc;
        private boolean zzd;
        private EventHandler<DataCollectionDefaultChange> zze;
        private Boolean zzf;

        zza(Subscriber subscriber) {
            this.zzc = subscriber;
        }

        private final void zzb() {
            synchronized (this) {
                if (!this.zzd) {
                    this.zzb = zzd();
                    Boolean zzc2 = zzc();
                    this.zzf = zzc2;
                    if (zzc2 == null && this.zzb) {
                        zzq zzq = new zzq(this);
                        this.zze = zzq;
                        this.zzc.subscribe(DataCollectionDefaultChange.class, zzq);
                    }
                    this.zzd = true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            return false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean zza() {
            /*
                r1 = this;
                monitor-enter(r1)
                r1.zzb()     // Catch:{ all -> 0x0026 }
                java.lang.Boolean r0 = r1.zzf     // Catch:{ all -> 0x0026 }
                if (r0 == 0) goto L_0x0010
                java.lang.Boolean r0 = r1.zzf     // Catch:{ all -> 0x0026 }
                boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0026 }
                monitor-exit(r1)
                return r0
            L_0x0010:
                boolean r0 = r1.zzb     // Catch:{ all -> 0x0026 }
                if (r0 == 0) goto L_0x0023
                com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.this     // Catch:{ all -> 0x0026 }
                com.google.firebase.FirebaseApp r0 = r0.zzf     // Catch:{ all -> 0x0026 }
                boolean r0 = r0.isDataCollectionDefaultEnabled()     // Catch:{ all -> 0x0026 }
                if (r0 == 0) goto L_0x0023
                monitor-exit(r1)
                r0 = 1
                return r0
            L_0x0023:
                monitor-exit(r1)
                r0 = 0
                return r0
            L_0x0026:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.zza.zza():boolean");
        }

        private final Boolean zzc() {
            ApplicationInfo applicationInfo;
            Context applicationContext = FirebaseInstanceId.this.zzf.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = applicationContext.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean zzd() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            } catch (ClassNotFoundException unused) {
                Context applicationContext = FirebaseInstanceId.this.zzf.getApplicationContext();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(applicationContext.getPackageName());
                ResolveInfo resolveService = applicationContext.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }
    }

    FirebaseInstanceId(FirebaseApp firebaseApp, Subscriber subscriber, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo, FirebaseInstallationsApi firebaseInstallationsApi) {
        this(firebaseApp, new zzao(firebaseApp.getApplicationContext()), zzh.zzb(), zzh.zzb(), subscriber, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi);
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, zzao zzao, Executor executor, Executor executor2, Subscriber subscriber, UserAgentPublisher userAgentPublisher, HeartBeatInfo heartBeatInfo, FirebaseInstallationsApi firebaseInstallationsApi) {
        Executor executor3 = executor2;
        this.zzk = false;
        if (zzao.zza(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (zzb == null) {
                    zzb = new zzaz(firebaseApp.getApplicationContext());
                }
            }
            this.zzf = firebaseApp;
            this.zzg = zzao;
            this.zzh = new zzt(firebaseApp, zzao, executor, userAgentPublisher, heartBeatInfo, firebaseInstallationsApi);
            this.zze = executor3;
            this.zzl = new zza(subscriber);
            Executor executor4 = executor;
            this.zzi = new zzat(executor);
            this.zzj = firebaseInstallationsApi;
            executor3.execute(new zzl(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    /* access modifiers changed from: private */
    public final void zzj() {
        if (zza(zzb())) {
            zzk();
        }
    }

    /* access modifiers changed from: package-private */
    public final FirebaseApp zza() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final void zza(boolean z) {
        synchronized (this) {
            this.zzk = z;
        }
    }

    private final void zzk() {
        synchronized (this) {
            if (!this.zzk) {
                zza(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(long j) {
        synchronized (this) {
            zza((Runnable) new zzbb(this, Math.min(Math.max(30, j << 1), zza)), j);
            this.zzk = true;
        }
    }

    static void zza(Runnable runnable, long j) {
        synchronized (FirebaseInstanceId.class) {
            if (zzd == null) {
                zzd = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            zzd.schedule(runnable, j, TimeUnit.SECONDS);
        }
    }

    public String getId() {
        zza(this.zzf);
        zzj();
        return zzl();
    }

    private static void zza(FirebaseApp firebaseApp) {
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getProjectId(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.checkNotEmpty(firebaseApp.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.checkArgument(firebaseApp.getOptions().getApplicationId().contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(zzc.matcher(firebaseApp.getOptions().getApiKey()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private final String zzl() {
        try {
            zzb.zzb(this.zzf.getPersistenceKey());
            Task<String> id = this.zzj.getId();
            Preconditions.checkNotNull(id, "Task must not be null");
            CountDownLatch countDownLatch = new CountDownLatch(1);
            id.addOnCompleteListener(zzn.zza, (OnCompleteListener<String>) new zzm(countDownLatch));
            countDownLatch.await(30000, TimeUnit.MILLISECONDS);
            if (id.isSuccessful()) {
                return id.getResult();
            }
            if (id.isCanceled()) {
                throw new CancellationException("Task is already canceled");
            } else if (id.isComplete()) {
                throw new IllegalStateException(id.getException());
            } else {
                throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
            }
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }

    public Task<InstanceIdResult> getInstanceId() {
        zza(this.zzf);
        return zza(zzao.zza(this.zzf), "*");
    }

    private final Task<InstanceIdResult> zza(String str, String str2) {
        return Tasks.forResult(null).continueWithTask(this.zze, new zzk(this, str, zza(str2)));
    }

    public String getToken(String str, String str2) throws IOException {
        zza(this.zzf);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((InstanceIdResult) zza(zza(str, str2))).getToken();
        }
        throw new IOException("MAIN_THREAD");
    }

    /* access modifiers changed from: package-private */
    public final zzay zzb() {
        return zzb(zzao.zza(this.zzf), "*");
    }

    private final zzay zzb(String str, String str2) {
        return zzb.zza(zzm(), str, str2);
    }

    /* access modifiers changed from: package-private */
    public final String zzc() throws IOException {
        return getToken(zzao.zza(this.zzf), "*");
    }

    private final <T> T zza(Task<T> task) throws IOException {
        try {
            return Tasks.await(task, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    zze();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    static boolean zzd() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void zze() {
        synchronized (this) {
            zzb.zza();
            if (this.zzl.zza()) {
                zzk();
            }
        }
    }

    public final boolean zzf() {
        return this.zzg.zza();
    }

    /* access modifiers changed from: package-private */
    public final void zzg() {
        zzb.zzc(zzm());
        zzk();
    }

    public final boolean zzh() {
        return this.zzl.zza();
    }

    private static String zza(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    private final String zzm() {
        if ("[DEFAULT]".equals(this.zzf.getName())) {
            return "";
        }
        return this.zzf.getPersistenceKey();
    }

    /* access modifiers changed from: package-private */
    public final boolean zza(zzay zzay) {
        return zzay == null || zzay.zzb(this.zzg.zzc());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task zza(String str, String str2, Task task) throws Exception {
        String zzl2 = zzl();
        zzay zzb2 = zzb(str, str2);
        if (!zza(zzb2)) {
            return Tasks.forResult(new zzaa(zzl2, zzb2.zza));
        }
        return this.zzi.zza(str, str2, new zzp(this, zzl2, str, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task zza(String str, String str2, String str3) {
        return this.zzh.zza(str, str2, str3).onSuccessTask(this.zze, new zzo(this, str2, str3, str));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task zza(String str, String str2, String str3, String str4) throws Exception {
        zzb.zza(zzm(), str, str2, str4, this.zzg.zzc());
        return Tasks.forResult(new zzaa(str3, str4));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        if (this.zzl.zza()) {
            zzj();
        }
    }
}
