package com.google.android.gms.measurement.internal;

final class zzjt implements Runnable {
    private final /* synthetic */ zzkj zza;
    private final /* synthetic */ Runnable zzb;

    zzjt(zzjo zzjo, zzkj zzkj, Runnable runnable) {
        this.zza = zzkj;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzo();
        this.zza.zza(this.zzb);
        this.zza.zzl();
    }
}
