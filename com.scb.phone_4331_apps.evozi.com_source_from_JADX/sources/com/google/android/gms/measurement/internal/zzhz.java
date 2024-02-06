package com.google.android.gms.measurement.internal;

final class zzhz implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzhc zzb;

    zzhz(zzhc zzhc, long j) {
        this.zzb = zzhc;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzs().zzk.zza(this.zza);
        this.zzb.zzr().zzw().zza("Minimum session duration set", Long.valueOf(this.zza));
    }
}
