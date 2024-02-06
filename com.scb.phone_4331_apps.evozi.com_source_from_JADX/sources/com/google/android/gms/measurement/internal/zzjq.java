package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

final /* synthetic */ class zzjq implements Runnable {
    private final zzjo zza;
    private final zzeu zzb;
    private final JobParameters zzc;

    zzjq(zzjo zzjo, zzeu zzeu, JobParameters jobParameters) {
        this.zza = zzjo;
        this.zzb = zzeu;
        this.zzc = jobParameters;
    }

    public final void run() {
        this.zza.zza(this.zzb, this.zzc);
    }
}
