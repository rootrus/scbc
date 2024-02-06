package com.google.android.gms.measurement.internal;

final class zzip implements Runnable {
    private final /* synthetic */ zzij zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zzii zzc;

    zzip(zzii zzii, zzij zzij, long j) {
        this.zzc = zzii;
        this.zza = zzij;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zza(this.zza, false, this.zzb);
        this.zzc.zza = null;
        this.zzc.zzh().zza((zzij) null);
    }
}
