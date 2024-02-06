package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;

final class zzix implements Runnable {
    private final /* synthetic */ zzn zza;
    private final /* synthetic */ zzw zzb;
    private final /* synthetic */ zzir zzc;

    zzix(zzir zzir, zzn zzn, zzw zzw) {
        this.zzc = zzir;
        this.zza = zzn;
        this.zzb = zzw;
    }

    public final void run() {
        try {
            zzem zzd = this.zzc.zzb;
            if (zzd == null) {
                this.zzc.zzr().zzf().zza("Failed to get app instance id");
                return;
            }
            String zzc2 = zzd.zzc(this.zza);
            if (zzc2 != null) {
                this.zzc.zzf().zza(zzc2);
                this.zzc.zzs().zzj.zza(zzc2);
            }
            this.zzc.zzak();
            this.zzc.zzp().zza(this.zzb, zzc2);
        } catch (RemoteException e) {
            this.zzc.zzr().zzf().zza("Failed to get app instance id", e);
        } finally {
            this.zzc.zzp().zza(this.zzb, (String) null);
        }
    }
}
