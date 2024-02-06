package com.google.android.gms.measurement.internal;

final class zzgp implements Runnable {
    private final /* synthetic */ zzkq zza;
    private final /* synthetic */ zzn zzb;
    private final /* synthetic */ zzgd zzc;

    zzgp(zzgd zzgd, zzkq zzkq, zzn zzn) {
        this.zzc = zzgd;
        this.zza = zzkq;
        this.zzb = zzn;
    }

    public final void run() {
        this.zzc.zza.zzo();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzb(this.zza, this.zzb);
        } else {
            this.zzc.zza.zza(this.zza, this.zzb);
        }
    }
}
