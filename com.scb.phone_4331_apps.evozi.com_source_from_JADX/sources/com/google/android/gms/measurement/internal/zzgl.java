package com.google.android.gms.measurement.internal;

final class zzgl implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzgd zzb;

    zzgl(zzgd zzgd, zzn zzn) {
        this.zzb = zzgd;
        this.zza = zzn;
    }

    public final void run() {
        this.zzb.zza.zzo();
        this.zzb.zza.zza(this.zza);
    }
}
