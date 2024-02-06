package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final /* synthetic */ class zzgc implements Runnable {
    private final zzgd zza;
    private final zzn zzb;
    private final Bundle zzc;

    zzgc(zzgd zzgd, zzn zzn, Bundle bundle) {
        this.zza = zzgd;
        this.zzb = zzn;
        this.zzc = bundle;
    }

    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}
