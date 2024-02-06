package com.google.android.gms.measurement.internal;

final class zzgn implements Runnable {
    private final /* synthetic */ zzao zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzgd zzc;

    zzgn(zzgd zzgd, zzao zzao, String str) {
        this.zzc = zzgd;
        this.zza = zzao;
        this.zzb = str;
    }

    public final void run() {
        this.zzc.zza.zzo();
        this.zzc.zza.zza(this.zza, this.zzb);
    }
}
