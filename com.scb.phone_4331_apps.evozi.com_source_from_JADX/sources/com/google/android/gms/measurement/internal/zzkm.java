package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class zzkm implements Callable<String> {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzkj zzb;

    zzkm(zzkj zzkj, zzn zzn) {
        this.zzb = zzkj;
        this.zza = zzn;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzf zzc = this.zzb.zzc(this.zza);
        if (zzc != null) {
            return zzc.zzd();
        }
        this.zzb.zzr().zzi().zza("App info was null when attempting to get app instance id");
        return null;
    }
}
