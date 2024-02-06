package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzgs implements zzgt {
    zzgs() {
    }

    public final Map<?, ?> zza(Object obj) {
        return (zzgq) obj;
    }

    public final zzgr<?, ?> zzb(Object obj) {
        zzgo zzgo = (zzgo) obj;
        throw new NoSuchMethodError();
    }

    public final Map<?, ?> zzc(Object obj) {
        return (zzgq) obj;
    }

    public final boolean zzd(Object obj) {
        return !((zzgq) obj).zzd();
    }

    public final Object zze(Object obj) {
        ((zzgq) obj).zzc();
        return obj;
    }

    public final Object zzf(Object obj) {
        return zzgq.zza().zzb();
    }

    public final Object zza(Object obj, Object obj2) {
        zzgq zzgq = (zzgq) obj;
        zzgq zzgq2 = (zzgq) obj2;
        if (!zzgq2.isEmpty()) {
            if (!zzgq.zzd()) {
                zzgq = zzgq.zzb();
            }
            zzgq.zza(zzgq2);
        }
        return zzgq;
    }

    public final int zza(int i, Object obj, Object obj2) {
        zzgq zzgq = (zzgq) obj;
        zzgo zzgo = (zzgo) obj2;
        if (zzgq.isEmpty()) {
            return 0;
        }
        Iterator it = zzgq.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
