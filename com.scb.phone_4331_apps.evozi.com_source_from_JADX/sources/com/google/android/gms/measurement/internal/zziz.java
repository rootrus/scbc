package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

final class zziz implements Runnable {
    private final /* synthetic */ zzij zza;
    private final /* synthetic */ zzir zzb;

    zziz(zzir zzir, zzij zzij) {
        this.zzb = zzir;
        this.zza = zzij;
    }

    public final void run() {
        zzem zzd = this.zzb.zzb;
        if (zzd == null) {
            this.zzb.zzr().zzf().zza("Failed to send current screen to service");
            return;
        }
        try {
            if (this.zza == null) {
                zzd.zza(0, (String) null, (String) null, this.zzb.zzn().getPackageName());
            } else {
                zzd.zza(this.zza.zzc, this.zza.zza, this.zza.zzb, this.zzb.zzn().getPackageName());
            }
            this.zzb.zzak();
        } catch (RemoteException e) {
            this.zzb.zzr().zzf().zza("Failed to send current screen to the service", e);
        }
    }
}
