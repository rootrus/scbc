package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzla;
import java.util.concurrent.atomic.AtomicReference;

final class zzhk implements Runnable {
    private final /* synthetic */ long zza;
    private final /* synthetic */ zzhc zzb;

    zzhk(zzhc zzhc, long j) {
        this.zzb = zzhc;
        this.zza = j;
    }

    public final void run() {
        zzhc zzhc = this.zzb;
        long j = this.zza;
        zzhc.zzd();
        zzhc.zzb();
        zzhc.zzw();
        zzhc.zzr().zzw().zza("Resetting analytics data (FE)");
        zzjv zzk = zzhc.zzk();
        zzk.zzd();
        zzk.zzb.zza();
        boolean zzab = zzhc.zzy.zzab();
        zzfg zzs = zzhc.zzs();
        zzs.zzh.zza(j);
        if (!TextUtils.isEmpty(zzs.zzs().zzu.zza())) {
            zzs.zzu.zza((String) null);
        }
        if (zzla.zzb() && zzs.zzt().zza(zzaq.zzbv)) {
            zzs.zzp.zza(0);
        }
        if (!zzs.zzt().zzh()) {
            zzs.zzc(!zzab);
        }
        zzs.zzv.zza((String) null);
        zzs.zzw.zza(0);
        zzs.zzx.zza((Bundle) null);
        zzhc.zzh().zzad();
        if (zzla.zzb() && zzhc.zzt().zza(zzaq.zzbv)) {
            zzhc.zzk().zza.zza();
        }
        zzhc.zzc = !zzab;
        this.zzb.zzh().zza((AtomicReference<String>) new AtomicReference());
    }
}
