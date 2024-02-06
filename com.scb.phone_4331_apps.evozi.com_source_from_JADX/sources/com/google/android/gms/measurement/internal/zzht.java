package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzht implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzhc zzb;

    zzht(zzhc zzhc, AtomicReference atomicReference) {
        this.zzb = zzhc;
        this.zza = atomicReference;
    }

    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(Long.valueOf(this.zzb.zzt().zza(this.zzb.zzg().zzab(), zzaq.zzal)));
                this.zza.notify();
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
