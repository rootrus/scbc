package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class zzjy implements Runnable {
    private final zzjz zza;

    zzjy(zzjz zzjz) {
        this.zza = zzjz;
    }

    public final void run() {
        zzjz zzjz = this.zza;
        zzjw zzjw = zzjz.zzc;
        long j = zzjz.zza;
        long j2 = zzjz.zzb;
        zzjw.zza.zzd();
        zzjw.zza.zzr().zzw().zza("Application going to the background");
        boolean z = true;
        if (zzjw.zza.zzt().zza(zzaq.zzcc)) {
            zzjw.zza.zzs().zzr.zza(true);
        }
        Bundle bundle = new Bundle();
        if (!zzjw.zza.zzt().zzj().booleanValue()) {
            zzjw.zza.zzb.zzb(j2);
            if (zzjw.zza.zzt().zza(zzaq.zzbr)) {
                bundle.putLong("_et", zzjw.zza.zza(j2));
                zzii.zza(zzjw.zza.zzi().zza(true), bundle, true);
            } else {
                z = false;
            }
            zzjw.zza.zza(false, z, j2);
        }
        zzjw.zza.zzf().zza("auto", "_ab", j, bundle);
    }
}
