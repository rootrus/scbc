package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

final class zzjm implements Runnable {
    private final /* synthetic */ zzji zza;

    zzjm(zzji zzji) {
        this.zza = zzji;
    }

    public final void run() {
        zzir zzir = this.zza.zza;
        Context zzn = this.zza.zza.zzn();
        this.zza.zza.zzu();
        zzir.zza(new ComponentName(zzn, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
