package com.google.android.gms.measurement.internal;

final class zzb implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ long zzb;
    private final /* synthetic */ zza zzc;

    zzb(zza zza2, String str, long j) {
        this.zzc = zza2;
        this.zza = str;
        this.zzb = j;
    }

    public final void run() {
        this.zzc.zzd(this.zza, this.zzb);
    }
}