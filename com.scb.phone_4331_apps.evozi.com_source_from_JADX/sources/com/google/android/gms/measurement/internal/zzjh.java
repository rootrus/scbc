package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzw;
import java.util.ArrayList;

final class zzjh implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzn zzc;
    private final /* synthetic */ zzw zzd;
    private final /* synthetic */ zzir zze;

    zzjh(zzir zzir, String str, String str2, zzn zzn, zzw zzw) {
        this.zze = zzir;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzn;
        this.zzd = zzw;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            zzem zzd2 = this.zze.zzb;
            if (zzd2 == null) {
                this.zze.zzr().zzf().zza("Failed to get conditional properties; not connected to service", this.zza, this.zzb);
                return;
            }
            arrayList = zzkr.zzb(zzd2.zza(this.zza, this.zzb, this.zzc));
            this.zze.zzak();
            this.zze.zzp().zza(this.zzd, arrayList);
        } catch (RemoteException e) {
            this.zze.zzr().zzf().zza("Failed to get conditional properties; remote exception", this.zza, this.zzb, e);
        } finally {
            this.zze.zzp().zza(this.zzd, arrayList);
        }
    }
}
