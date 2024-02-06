package com.google.android.gms.measurement.internal;

final class zzjx implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzjv zzb;

    zzjx(zzjv zzjv, long j) {
        this.zzb = zzjv;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzc(this.zza);
    }
}
