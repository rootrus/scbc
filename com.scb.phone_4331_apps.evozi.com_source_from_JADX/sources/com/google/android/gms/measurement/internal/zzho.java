package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzho implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzhc zzb;

    zzho(zzhc zzhc, AtomicReference atomicReference) {
        this.zzb = zzhc;
        this.zza = atomicReference;
    }

    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(this.zzb.zzt().zzj(this.zzb.zzg().zzab()));
                this.zza.notify();
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
