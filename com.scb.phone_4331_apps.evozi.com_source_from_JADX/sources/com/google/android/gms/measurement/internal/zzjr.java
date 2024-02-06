package com.google.android.gms.measurement.internal;

import android.content.Intent;

final /* synthetic */ class zzjr implements Runnable {
    private final zzjo zza;
    private final int zzb;
    private final zzeu zzc;
    private final Intent zzd;

    zzjr(zzjo zzjo, int i, zzeu zzeu, Intent intent) {
        this.zza = zzjo;
        this.zzb = i;
        this.zzc = zzeu;
        this.zzd = intent;
    }

    public final void run() {
        this.zza.zza(this.zzb, this.zzc, this.zzd);
    }
}
