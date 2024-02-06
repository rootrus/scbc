package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzag;
import com.google.android.gms.measurement.internal.zzhb;

final class zzbf extends zzag.zzb {
    private final /* synthetic */ zzhb zzc;
    private final /* synthetic */ zzag zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzbf(zzag zzag, zzhb zzhb) {
        super(zzag);
        this.zzd = zzag;
        this.zzc = zzhb;
    }

    /* access modifiers changed from: package-private */
    public final void zza() throws RemoteException {
        this.zzd.zzm.setEventInterceptor(new zzag.zza(this.zzc));
    }
}
