package com.google.android.gms.measurement.internal;

final class zzim implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzii zzb;

    zzim(zzii zzii, long j) {
        this.zzb = zzii;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zze().zza(this.zza);
        this.zzb.zza = null;
    }
}
