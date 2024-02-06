package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhs implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzhc zzb;

    zzhs(zzhc zzhc, AtomicReference atomicReference) {
        this.zzb = zzhc;
        this.zza = atomicReference;
    }

    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(Integer.valueOf(this.zzb.zzt().zzb(this.zzb.zzg().zzab(), zzaq.zzam)));
                this.zza.notify();
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
