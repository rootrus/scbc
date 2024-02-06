package com.google.android.gms.measurement.internal;

final class zzga implements Runnable {
    private final /* synthetic */ zzhd zza;
    private final /* synthetic */ zzfy zzb;

    zzga(zzfy zzfy, zzhd zzhd) {
        this.zzb = zzfy;
        this.zza = zzhd;
    }

    public final void run() {
        this.zzb.zza(this.zza);
        this.zzb.zza();
    }
}
