package com.google.android.gms.measurement.internal;

final class zzjn implements Runnable {
    private final /* synthetic */ zzem zza;
    private final /* synthetic */ zzji zzb;

    zzjn(zzji zzji, zzem zzem) {
        this.zzb = zzji;
        this.zza = zzem;
    }

    public final void run() {
        synchronized (this.zzb) {
            boolean unused = this.zzb.zzb = false;
            if (!this.zzb.zza.zzab()) {
                this.zzb.zza.zzr().zzw().zza("Connected to remote service");
                this.zzb.zza.zza(this.zza);
            }
        }
    }
}
