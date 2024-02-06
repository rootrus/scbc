package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class zzjd implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzir zzb;

    zzjd(zzir zzir, zzn zzn) {
        this.zzb = zzir;
        this.zza = zzn;
    }

    public final void run() {
        zzem zzd = this.zzb.zzb;
        if (zzd == null) {
            this.zzb.zzr().zzf().zza("Failed to send measurementEnabled to service");
            return;
        }
        try {
            zzd.zzb(this.zza);
            this.zzb.zzak();
        } catch (RemoteException e) {
            this.zzb.zzr().zzf().zza("Failed to send measurementEnabled to the service", e);
        }
    }
}
