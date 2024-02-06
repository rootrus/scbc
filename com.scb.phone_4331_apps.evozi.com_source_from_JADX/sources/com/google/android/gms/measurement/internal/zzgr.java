package com.google.android.gms.measurement.internal;

final class zzgr implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzgd zzb;

    zzgr(zzgd zzgd, zzn zzn) {
        this.zzb = zzgd;
        this.zza = zzn;
    }

    public final void run() {
        this.zzb.zza.zzo();
        this.zzb.zza.zzb(this.zza);
    }
}
