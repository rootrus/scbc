package com.google.android.gms.measurement.internal;

final class zzju implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzjv zzb;

    zzju(zzjv zzjv, long j) {
        this.zzb = zzjv;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
