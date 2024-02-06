package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;

final class zzjb implements Runnable {
    private final /* synthetic */ zzao zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzw zzc;
    private final /* synthetic */ zzir zzd;

    zzjb(zzir zzir, zzao zzao, String str, zzw zzw) {
        this.zzd = zzir;
        this.zza = zzao;
        this.zzb = str;
        this.zzc = zzw;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            zzem zzd2 = this.zzd.zzb;
            if (zzd2 == null) {
                this.zzd.zzr().zzf().zza("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = zzd2.zza(this.zza, this.zzb);
            this.zzd.zzak();
            this.zzd.zzp().zza(this.zzc, bArr);
        } catch (RemoteException e) {
            this.zzd.zzr().zzf().zza("Failed to send event to the service to bundle", e);
        } finally {
            this.zzd.zzp().zza(this.zzc, bArr);
        }
    }
}
