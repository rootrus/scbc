package com.google.android.gms.measurement.internal;

final class zzke extends zzag {
    private final /* synthetic */ zzkj zza;
    private final /* synthetic */ zzkf zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzke(zzkf zzkf, zzgu zzgu, zzkj zzkj) {
        super(zzgu);
        this.zzb = zzkf;
        this.zza = zzkj;
    }

    public final void zza() {
        this.zzb.zzf();
        this.zzb.zzr().zzx().zza("Starting upload from DelayedRunnable");
        this.zza.zzl();
    }
}
