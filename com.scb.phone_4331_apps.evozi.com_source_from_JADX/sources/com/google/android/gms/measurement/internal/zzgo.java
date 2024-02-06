package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class zzgo implements Callable<List<zzks>> {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzgd zzb;

    zzgo(zzgd zzgd, zzn zzn) {
        this.zzb = zzgd;
        this.zza = zzn;
    }

    public final /* synthetic */ Object call() throws Exception {
        this.zzb.zza.zzo();
        return this.zzb.zza.zze().zza(this.zza.zza);
    }
}
