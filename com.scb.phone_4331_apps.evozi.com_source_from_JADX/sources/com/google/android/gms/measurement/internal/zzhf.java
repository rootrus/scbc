package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzlr;

final /* synthetic */ class zzhf implements Runnable {
    private final zzhc zza;
    private final Bundle zzb;

    zzhf(zzhc zzhc, Bundle bundle) {
        this.zza = zzhc;
        this.zzb = bundle;
    }

    public final void run() {
        zzhc zzhc = this.zza;
        Bundle bundle = this.zzb;
        if (zzlr.zzb() && zzhc.zzt().zza(zzaq.zzcm)) {
            if (bundle == null) {
                zzhc.zzs().zzx.zza(new Bundle());
                return;
            }
            Bundle zza2 = zzhc.zzs().zzx.zza();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    zzhc.zzp();
                    if (zzkr.zza(obj)) {
                        zzhc.zzp().zza(27, (String) null, (String) null, 0);
                    }
                    zzhc.zzr().zzk().zza("Invalid default event parameter type. Name, value", str, obj);
                } else if (zzkr.zze(str)) {
                    zzhc.zzr().zzk().zza("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    zza2.remove(str);
                } else if (zzhc.zzp().zza("param", str, 100, obj)) {
                    zzhc.zzp().zza(zza2, str, obj);
                }
            }
            zzhc.zzp();
            if (zzkr.zza(zza2, zzhc.zzt().zze())) {
                zzhc.zzp().zza(26, (String) null, (String) null, 0);
                zzhc.zzr().zzk().zza("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            zzhc.zzs().zzx.zza(zza2);
            zzhc.zzh().zza(zza2);
        }
    }
}
