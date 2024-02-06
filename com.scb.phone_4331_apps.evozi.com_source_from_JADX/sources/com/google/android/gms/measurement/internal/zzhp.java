package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class zzhp implements Runnable {
    private final /* synthetic */ Bundle zza;
    private final /* synthetic */ zzhc zzb;

    zzhp(zzhc zzhc, Bundle bundle) {
        this.zzb = zzhc;
        this.zza = bundle;
    }

    public final void run() {
        this.zzb.zzd(this.zza);
    }
}
