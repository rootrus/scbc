package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.measurement.internal.zzha;

final class zzbj extends zzag.zzb {
    private final /* synthetic */ zzha zzc;
    private final /* synthetic */ zzag zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbj(zzag zzag, zzha zzha) {
        super(zzag);
        this.zzd = zzag;
        this.zzc = zzha;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        for (int i = 0; i < this.zzd.zzf.size(); i++) {
            if (this.zzc.equals(((Pair) this.zzd.zzf.get(i)).first)) {
                Log.w(this.zzd.zzc, "OnEventListener already registered.");
                return;
            }
        }
        zzag.zzd zzd2 = new zzag.zzd(this.zzc);
        this.zzd.zzf.add(new Pair(this.zzc, zzd2));
        this.zzd.zzm.registerOnMeasurementEventListener(zzd2);
    }
}
