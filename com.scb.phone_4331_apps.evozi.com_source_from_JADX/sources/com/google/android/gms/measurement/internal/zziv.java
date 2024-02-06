package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class zziv implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzir zzb;

    zziv(zzir zzir, zzn zzn) {
        this.zzb = zzir;
        this.zza = zzn;
    }

    public final void run() {
        zzem zzd = this.zzb.zzb;
        if (zzd == null) {
            this.zzb.zzr().zzf().zza("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            zzd.zzd(this.zza);
        } catch (RemoteException e) {
            this.zzb.zzr().zzf().zza("Failed to reset data on the service: remote exception", e);
        }
        this.zzb.zzak();
    }
}
