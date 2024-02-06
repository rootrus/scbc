package com.google.android.gms.measurement.internal;

final class zzgk implements Runnable {
    private final /* synthetic */ zzao zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ zzgd zzc;

    zzgk(zzgd zzgd, zzao zzao, zzn zzn) {
        this.zzc = zzgd;
        this.zza = zzao;
        this.zzb = zzn;
    }

    public final void run() {
        zzao zzb2 = this.zzc.zzb(this.zza, this.zzb);
        this.zzc.zza.zzo();
        this.zzc.zza.zza(zzb2, this.zzb);
    }
}
