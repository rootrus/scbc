package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class zzhh implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ zzhc zzb;

    zzhh(zzhc zzhc, AtomicReference atomicReference) {
        this.zzb = zzhc;
        this.zza = atomicReference;
    }

    public final void run() {
        synchronized (this.zza) {
            try {
                this.zza.set(Boolean.valueOf(this.zzb.zzt().zzi(this.zzb.zzg().zzab())));
                this.zza.notify();
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
