package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

final class zzit implements Runnable {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ zzkq zzb;
    private final /* synthetic */ zzn zzc;
    private final /* synthetic */ zzir zzd;

    zzit(zzir zzir, boolean z, zzkq zzkq, zzn zzn) {
        this.zzd = zzir;
        this.zza = z;
        this.zzb = zzkq;
        this.zzc = zzn;
    }

    public final void run() {
        zzem zzd2 = this.zzd.zzb;
        if (zzd2 == null) {
            this.zzd.zzr().zzf().zza("Discarding data. Failed to set user property");
            return;
        }
        this.zzd.zza(zzd2, (AbstractSafeParcelable) this.zza ? null : this.zzb, this.zzc);
        this.zzd.zzak();
    }
}
