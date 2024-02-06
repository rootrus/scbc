package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;

public final class zzfv extends zzgv {
    /* access modifiers changed from: private */
    public static final AtomicLong zzj = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */
    public zzfz zza;
    /* access modifiers changed from: private */
    public zzfz zzb;
    private final PriorityBlockingQueue<zzfw<?>> zzc = new PriorityBlockingQueue<>();
    private final BlockingQueue<zzfw<?>> zzd = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler zze = new zzfx(this, "Thread death: Uncaught exception on worker thread");
    private final Thread.UncaughtExceptionHandler zzf = new zzfx(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */
    public final Object zzg = new Object();
    /* access modifiers changed from: private */
    public final Semaphore zzh = new Semaphore(2);
    /* access modifiers changed from: private */
    public volatile boolean zzi;

    zzfv(zzfy zzfy) {
        super(zzfy);
    }

    /* access modifiers changed from: protected */
    public final boolean zze() {
        return false;
    }

    public final void zzd() {
        if (Thread.currentThread() != this.zza) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final void zzc() {
        if (Thread.currentThread() != this.zzb) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final boolean zzg() {
        return Thread.currentThread() == this.zza;
    }

    public final <V> Future<V> zza(Callable<V> callable) throws IllegalStateException {
        zzaa();
        Preconditions.checkNotNull(callable);
        zzfw zzfw = new zzfw(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zza) {
            if (!this.zzc.isEmpty()) {
                zzr().zzi().zza("Callable skipped the worker queue.");
            }
            zzfw.run();
        } else {
            zza((zzfw<?>) zzfw);
        }
        return zzfw;
    }

    public final <V> Future<V> zzb(Callable<V> callable) throws IllegalStateException {
        zzaa();
        Preconditions.checkNotNull(callable);
        zzfw zzfw = new zzfw(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zza) {
            zzfw.run();
        } else {
            zza((zzfw<?>) zzfw);
        }
        return zzfw;
    }

    public final void zza(Runnable runnable) throws IllegalStateException {
        zzaa();
        Preconditions.checkNotNull(runnable);
        zza((zzfw<?>) new zzfw(this, runnable, false, "Task exception on worker thread"));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|(1:18)(1:19)|20|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r4.length() == 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r4 = "Timed out waiting for ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        r4 = new java.lang.String("Timed out waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r3.zza(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = zzr().zzi();
        r4 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r4.length() != 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r4 = "Interrupted waiting for ".concat(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        r4 = new java.lang.String("Interrupted waiting for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        r3.zza(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r2 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = zzr().zzi();
        r4 = java.lang.String.valueOf(r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T zza(java.util.concurrent.atomic.AtomicReference<T> r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.zzfv r0 = r1.zzq()     // Catch:{ all -> 0x005c }
            r0.zza((java.lang.Runnable) r6)     // Catch:{ all -> 0x005c }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0036 }
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0035
            com.google.android.gms.measurement.internal.zzeu r3 = r1.zzr()
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzi()
            java.lang.String r4 = java.lang.String.valueOf(r5)
            int r5 = r4.length()
            if (r5 == 0) goto L_0x002b
            java.lang.String r5 = "Timed out waiting for "
            java.lang.String r4 = r5.concat(r4)
            goto L_0x0032
        L_0x002b:
            java.lang.String r4 = new java.lang.String
            java.lang.String r5 = "Timed out waiting for "
            r4.<init>(r5)
        L_0x0032:
            r3.zza(r4)
        L_0x0035:
            return r2
        L_0x0036:
            com.google.android.gms.measurement.internal.zzeu r3 = r1.zzr()     // Catch:{ all -> 0x005c }
            com.google.android.gms.measurement.internal.zzew r3 = r3.zzi()     // Catch:{ all -> 0x005c }
            java.lang.String r4 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x005c }
            int r5 = r4.length()     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x004f
            java.lang.String r5 = "Interrupted waiting for "
            java.lang.String r4 = r5.concat(r4)     // Catch:{ all -> 0x005c }
            goto L_0x0056
        L_0x004f:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x005c }
            java.lang.String r5 = "Interrupted waiting for "
            r4.<init>(r5)     // Catch:{ all -> 0x005c }
        L_0x0056:
            r3.zza(r4)     // Catch:{ all -> 0x005c }
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            r2 = 0
            return r2
        L_0x005c:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfv.zza(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    private final void zza(zzfw<?> zzfw) {
        synchronized (this.zzg) {
            this.zzc.add(zzfw);
            if (this.zza == null) {
                zzfz zzfz = new zzfz(this, "Measurement Worker", this.zzc);
                this.zza = zzfz;
                zzfz.setUncaughtExceptionHandler(this.zze);
                this.zza.start();
            } else {
                this.zza.zza();
            }
        }
    }

    public final void zzb(Runnable runnable) throws IllegalStateException {
        zzaa();
        Preconditions.checkNotNull(runnable);
        zzfw zzfw = new zzfw(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzg) {
            this.zzd.add(zzfw);
            if (this.zzb == null) {
                zzfz zzfz = new zzfz(this, "Measurement Network", this.zzd);
                this.zzb = zzfz;
                zzfz.setUncaughtExceptionHandler(this.zzf);
                this.zzb.start();
            } else {
                this.zzb.zza();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zza() {
        super.zza();
    }

    public final /* bridge */ /* synthetic */ void zzb() {
        super.zzb();
    }

    public final /* bridge */ /* synthetic */ zzai zzl() {
        return super.zzl();
    }

    public final /* bridge */ /* synthetic */ Clock zzm() {
        return super.zzm();
    }

    public final /* bridge */ /* synthetic */ Context zzn() {
        return super.zzn();
    }

    public final /* bridge */ /* synthetic */ zzes zzo() {
        return super.zzo();
    }

    public final /* bridge */ /* synthetic */ zzkr zzp() {
        return super.zzp();
    }

    public final /* bridge */ /* synthetic */ zzfv zzq() {
        return super.zzq();
    }

    public final /* bridge */ /* synthetic */ zzeu zzr() {
        return super.zzr();
    }

    public final /* bridge */ /* synthetic */ zzfg zzs() {
        return super.zzs();
    }

    public final /* bridge */ /* synthetic */ zzy zzt() {
        return super.zzt();
    }

    public final /* bridge */ /* synthetic */ zzx zzu() {
        return super.zzu();
    }
}
