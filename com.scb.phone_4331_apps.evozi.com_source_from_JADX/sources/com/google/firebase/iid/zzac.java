package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.firebase_messaging.zze;
import java.util.ArrayDeque;
import java.util.Queue;

final class zzac implements ServiceConnection {
    int zza;
    final Messenger zzb;
    zzal zzc;
    final Queue<zzan<?>> zzd;
    final SparseArray<zzan<?>> zze;
    final /* synthetic */ zzab zzf;

    private zzac(zzab zzab) {
        this.zzf = zzab;
        this.zza = 0;
        this.zzb = new Messenger(new zze(Looper.getMainLooper(), new zzaf(this)));
        this.zzd = new ArrayDeque();
        this.zze = new SparseArray<>();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(com.google.firebase.iid.zzan<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.zza     // Catch:{ all -> 0x0097 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            int r0 = r5.zza     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r2 = 26
            r1.<init>(r2)     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "Unknown state: "
            r1.append(r2)     // Catch:{ all -> 0x0097 }
            r1.append(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0097 }
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<com.google.firebase.iid.zzan<?>> r0 = r5.zzd     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            r5.zza()     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<com.google.firebase.iid.zzan<?>> r0 = r5.zzd     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<com.google.firebase.iid.zzan<?>> r0 = r5.zzd     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            int r6 = r5.zza     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x004c
            r6 = r3
            goto L_0x004d
        L_0x004c:
            r6 = r2
        L_0x004d:
            com.google.android.gms.common.internal.Preconditions.checkState(r6)     // Catch:{ all -> 0x0097 }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x0097 }
        L_0x005f:
            r5.zza = r3     // Catch:{ all -> 0x0097 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ all -> 0x0097 }
            com.google.firebase.iid.zzab r1 = r5.zzf     // Catch:{ all -> 0x0097 }
            android.content.Context r1 = r1.zzb     // Catch:{ all -> 0x0097 }
            boolean r6 = r0.bindService(r1, r6, r5, r3)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = "Unable to bind to service"
            r5.zza(r2, r6)     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0083:
            com.google.firebase.iid.zzab r6 = r5.zzf     // Catch:{ all -> 0x0097 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.zzc     // Catch:{ all -> 0x0097 }
            com.google.firebase.iid.zzae r0 = new com.google.firebase.iid.zzae     // Catch:{ all -> 0x0097 }
            r0.<init>(r5)     // Catch:{ all -> 0x0097 }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0097 }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r5)
            return r3
        L_0x0097:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzac.zza(com.google.firebase.iid.zzan):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005e, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0060, code lost:
        r1.zza(new com.google.firebase.iid.zzam(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r1.zza(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zza(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0023
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 41
            r1.<init>(r2)
            java.lang.String r2 = "Received response to request: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MessengerIpcClient"
            android.util.Log.d(r2, r1)
        L_0x0023:
            monitor-enter(r4)
            android.util.SparseArray<com.google.firebase.iid.zzan<?>> r1 = r4.zze     // Catch:{ all -> 0x0070 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0070 }
            com.google.firebase.iid.zzan r1 = (com.google.firebase.iid.zzan) r1     // Catch:{ all -> 0x0070 }
            r2 = 1
            if (r1 != 0) goto L_0x0049
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r1 = 50
            r5.<init>(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = "Received response for unknown request: "
            r5.append(r1)     // Catch:{ all -> 0x0070 }
            r5.append(r0)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "MessengerIpcClient"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0070 }
            android.util.Log.w(r0, r5)     // Catch:{ all -> 0x0070 }
            monitor-exit(r4)
            return r2
        L_0x0049:
            android.util.SparseArray<com.google.firebase.iid.zzan<?>> r3 = r4.zze     // Catch:{ all -> 0x0070 }
            r3.remove(r0)     // Catch:{ all -> 0x0070 }
            r4.zzb()     // Catch:{ all -> 0x0070 }
            monitor-exit(r4)
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r3 = "unsupported"
            boolean r0 = r5.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x006c
            com.google.firebase.iid.zzam r5 = new com.google.firebase.iid.zzam
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.zza((com.google.firebase.iid.zzam) r5)
            goto L_0x006f
        L_0x006c:
            r1.zza((android.os.Bundle) r5)
        L_0x006f:
            return r2
        L_0x0070:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzac.zza(android.os.Message):boolean");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.zzf.zzc.execute(new zzah(this, iBinder));
    }

    /* access modifiers changed from: package-private */
    public final void zza() {
        this.zzf.zzc.execute(new zzag(this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.zzf.zzc.execute(new zzaj(this));
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i, String str) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
            }
            int i2 = this.zza;
            if (i2 == 0) {
                throw new IllegalStateException();
            } else if (i2 == 1 || i2 == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.zza = 4;
                ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
                zzam zzam = new zzam(i, str);
                for (zzan zza2 : this.zzd) {
                    zza2.zza(zzam);
                }
                this.zzd.clear();
                for (int i3 = 0; i3 < this.zze.size(); i3++) {
                    this.zze.valueAt(i3).zza(zzam);
                }
                this.zze.clear();
            } else if (i2 == 3) {
                this.zza = 4;
            } else if (i2 != 4) {
                int i4 = this.zza;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzb() {
        synchronized (this) {
            if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.zza = 3;
                ConnectionTracker.getInstance().unbindService(this.zzf.zzb, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzc() {
        synchronized (this) {
            if (this.zza == 1) {
                zza(1, "Timed out while binding");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(int i) {
        synchronized (this) {
            zzan zzan = this.zze.get(i);
            if (zzan != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                this.zze.remove(i);
                zzan.zza(new zzam(3, "Timed out waiting for response"));
                zzb();
            }
        }
    }
}
