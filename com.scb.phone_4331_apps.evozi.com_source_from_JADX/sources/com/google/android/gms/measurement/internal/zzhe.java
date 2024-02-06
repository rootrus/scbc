package com.google.android.gms.measurement.internal;

final /* synthetic */ class zzhe implements Runnable {
    private final zzhc zza;

    zzhe(zzhc zzhc) {
        this.zza = zzhc;
    }

    public final void run() {
        zzhc zzhc = this.zza;
        zzhc.zzd();
        if (zzhc.zzs().zzs.zza()) {
            zzhc.zzr().zzw().zza("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long zza2 = zzhc.zzs().zzt.zza();
        zzhc.zzs().zzt.zza(1 + zza2);
        if (zza2 >= 5) {
            zzhc.zzr().zzi().zza("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            zzhc.zzs().zzs.zza(true);
            return;
        }
        zzhc.zzy.zzah();
    }
}
