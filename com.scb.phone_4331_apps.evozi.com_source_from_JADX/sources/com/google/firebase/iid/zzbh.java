package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class zzbh implements ServiceConnection {
    private final Context zza;
    private final Intent zzb;
    private final ScheduledExecutorService zzc;
    private final Queue<zzbg> zzd;
    private zzbc zze;
    private boolean zzf;

    public zzbh(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private zzbh(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.zzd = new ArrayDeque();
        this.zzf = false;
        this.zza = context.getApplicationContext();
        this.zzb = new Intent(str).setPackage(this.zza.getPackageName());
        this.zzc = scheduledExecutorService;
    }

    public final Task<Void> zza(Intent intent) {
        Task<Void> zza2;
        synchronized (this) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
            }
            zzbg zzbg = new zzbg(intent);
            ScheduledExecutorService scheduledExecutorService = this.zzc;
            zzbg.zza().addOnCompleteListener((Executor) scheduledExecutorService, new zzbi(scheduledExecutorService.schedule(new zzbj(zzbg), 9000, TimeUnit.MILLISECONDS)));
            this.zzd.add(zzbg);
            zza();
            zza2 = zzbg.zza();
        }
        return zza2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "flush queue called"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0011:
            java.util.Queue<com.google.firebase.iid.zzbg> r0 = r4.zzd     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "found intent to be delivered"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0028:
            com.google.firebase.iid.zzbc r0 = r4.zze     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0051
            com.google.firebase.iid.zzbc r0 = r4.zze     // Catch:{ all -> 0x00a7 }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0051
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = "binder is alive, sending the intent."
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0043:
            java.util.Queue<com.google.firebase.iid.zzbg> r0 = r4.zzd     // Catch:{ all -> 0x00a7 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00a7 }
            com.google.firebase.iid.zzbg r0 = (com.google.firebase.iid.zzbg) r0     // Catch:{ all -> 0x00a7 }
            com.google.firebase.iid.zzbc r2 = r4.zze     // Catch:{ all -> 0x00a7 }
            r2.zza(r0)     // Catch:{ all -> 0x00a7 }
            goto L_0x0011
        L_0x0051:
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00a7 }
            r1 = 1
            if (r0 == 0) goto L_0x0075
            boolean r0 = r4.zzf     // Catch:{ all -> 0x00a7 }
            r0 = r0 ^ r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
            r3 = 39
            r2.<init>(r3)     // Catch:{ all -> 0x00a7 }
            java.lang.String r3 = "binder is dead. start connection? "
            r2.append(r3)     // Catch:{ all -> 0x00a7 }
            r2.append(r0)     // Catch:{ all -> 0x00a7 }
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00a7 }
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x00a7 }
        L_0x0075:
            boolean r0 = r4.zzf     // Catch:{ all -> 0x00a7 }
            if (r0 != 0) goto L_0x00a3
            r4.zzf = r1     // Catch:{ all -> 0x00a7 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ SecurityException -> 0x0095 }
            android.content.Context r1 = r4.zza     // Catch:{ SecurityException -> 0x0095 }
            android.content.Intent r2 = r4.zzb     // Catch:{ SecurityException -> 0x0095 }
            r3 = 65
            boolean r0 = r0.bindService(r1, r2, r4, r3)     // Catch:{ SecurityException -> 0x0095 }
            if (r0 == 0) goto L_0x008d
            monitor-exit(r4)
            return
        L_0x008d:
            java.lang.String r0 = "FirebaseInstanceId"
            java.lang.String r1 = "binding to the service failed"
            android.util.Log.e(r0, r1)     // Catch:{ SecurityException -> 0x0095 }
            goto L_0x009d
        L_0x0095:
            r0 = move-exception
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r2 = "Exception while binding the service"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x00a7 }
        L_0x009d:
            r0 = 0
            r4.zzf = r0     // Catch:{ all -> 0x00a7 }
            r4.zzb()     // Catch:{ all -> 0x00a7 }
        L_0x00a3:
            monitor-exit(r4)
            return
        L_0x00a5:
            monitor-exit(r4)
            return
        L_0x00a7:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzbh.zza():void");
    }

    private final void zzb() {
        while (!this.zzd.isEmpty()) {
            this.zzd.poll().zzb();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            this.zzf = false;
            if (!(iBinder instanceof zzbc)) {
                String valueOf2 = String.valueOf(iBinder);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                sb2.append("Invalid service connection: ");
                sb2.append(valueOf2);
                Log.e("FirebaseInstanceId", sb2.toString());
                zzb();
                return;
            }
            this.zze = (zzbc) iBinder;
            zza();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
            Log.d("FirebaseInstanceId", sb.toString());
        }
        zza();
    }
}
