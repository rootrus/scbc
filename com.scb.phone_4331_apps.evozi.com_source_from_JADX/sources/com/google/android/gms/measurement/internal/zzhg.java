package com.google.android.gms.measurement.internal;

final class zzhg implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzhc zzb;

    zzhg(zzhc zzhc, long j) {
        this.zzb = zzhc;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzs().zzl.zza(this.zza);
        this.zzb.zzr().zzw().zza("Session timeout duration set", Long.valueOf(this.zza));
    }
}
