package com.google.android.gms.measurement.internal;

final class zzhn implements Runnable {
    private final /* synthetic */ zzhb zza;
    private final /* synthetic */ zzhc zzb;

    zzhn(zzhc zzhc, zzhb zzhb) {
        this.zzb = zzhc;
        this.zza = zzhb;
    }

    public final void run() {
        this.zzb.zza(this.zza);
    }
}
