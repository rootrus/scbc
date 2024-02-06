package com.google.android.gms.measurement.internal;

final class zzfh implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzfe zzb;

    zzfh(zzfe zzfe, boolean z) {
        this.zzb = zzfe;
        this.zza = z;
    }

    public final void run() {
        this.zzb.zzb.zza(this.zza);
    }
}
