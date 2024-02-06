package com.google.android.gms.measurement.internal;

final class zzhu implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzhc zzb;

    zzhu(zzhc zzhc, boolean z) {
        this.zzb = zzhc;
        this.zza = z;
    }

    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
