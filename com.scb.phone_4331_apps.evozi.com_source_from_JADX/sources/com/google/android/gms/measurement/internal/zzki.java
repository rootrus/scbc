package com.google.android.gms.measurement.internal;

final class zzki implements Runnable {
    private final /* synthetic */ zzko zza;
    private final /* synthetic */ zzkj zzb;

    zzki(zzkj zzkj, zzko zzko) {
        this.zzb = zzkj;
        this.zza = zzko;
    }

    public final void run() {
        this.zzb.zza(this.zza);
        this.zzb.zza();
    }
}
