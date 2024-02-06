package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzgf implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzgd zzb;

    zzgf(zzgd zzgd, zzn zzn) {
        this.zzb = zzgd;
        this.zza = zzn;
    }

    public final void run() {
        this.zzb.zza.zzo();
        zzkj zza2 = this.zzb.zza;
        zzn zzn = this.zza;
        zza2.zzq().zzd();
        zza2.zzk();
        Preconditions.checkNotEmpty(zzn.zza);
        zza2.zzc(zzn);
    }
}
