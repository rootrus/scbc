package com.google.android.gms.measurement.internal;

final class zzge implements Runnable {
    private final /* synthetic */ zzw zza;
    private final /* synthetic */ zzgd zzb;

    zzge(zzgd zzgd, zzw zzw) {
        this.zzb = zzgd;
        this.zza = zzw;
    }

    public final void run() {
        this.zzb.zza.zzo();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zzb(this.zza);
        } else {
            this.zzb.zza.zza(this.zza);
        }
    }
}
