package com.google.android.gms.measurement.internal;

final class zzaj implements Runnable {
    private final /* synthetic */ zzgu zza;
    private final /* synthetic */ zzag zzb;

    zzaj(zzag zzag, zzgu zzgu) {
        this.zzb = zzag;
        this.zza = zzgu;
    }

    public final void run() {
        this.zza.zzu();
        if (zzx.zza()) {
            this.zza.zzq().zza((Runnable) this);
            return;
        }
        boolean zzb2 = this.zzb.zzb();
        long unused = this.zzb.zzd = 0;
        if (zzb2) {
            this.zzb.zza();
        }
    }
}
