package com.google.android.gms.measurement.internal;

final class zzjz implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzjw zzc;

    zzjz(zzjw zzjw, long j, long j2) {
        this.zzc = zzjw;
        this.zza = j;
        this.zzb = j2;
    }

    public final void run() {
        this.zzc.zza.zzq().zza((Runnable) new zzjy(this));
    }
}
