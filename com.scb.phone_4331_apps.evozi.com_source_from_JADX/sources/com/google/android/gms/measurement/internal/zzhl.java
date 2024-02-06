package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class zzhl implements Runnable {
    private final /* synthetic */ AtomicReference zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ zzhc zzc;

    zzhl(zzhc zzhc, AtomicReference atomicReference, boolean z) {
        this.zzc = zzhc;
        this.zza = atomicReference;
        this.zzb = z;
    }

    public final void run() {
        this.zzc.zzh().zza((AtomicReference<List<zzkq>>) this.zza, this.zzb);
    }
}
