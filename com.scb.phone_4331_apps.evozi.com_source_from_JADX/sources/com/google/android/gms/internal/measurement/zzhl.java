package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzhl {
    private static final zzhl zza = new zzhl();
    private final zzho zzb = new zzgn();
    private final ConcurrentMap<Class<?>, zzhp<?>> zzc = new ConcurrentHashMap();

    public static zzhl zza() {
        return zza;
    }

    public final <T> zzhp<T> zza(Class<T> cls) {
        zzfr.zza(cls, "messageType");
        zzhp<T> zzhp = (zzhp) this.zzc.get(cls);
        if (zzhp != null) {
            return zzhp;
        }
        zzhp<T> zza2 = this.zzb.zza(cls);
        zzfr.zza(cls, "messageType");
        zzfr.zza(zza2, "schema");
        zzhp<T> putIfAbsent = this.zzc.putIfAbsent(cls, zza2);
        return putIfAbsent != null ? putIfAbsent : zza2;
    }

    public final <T> zzhp<T> zza(T t) {
        return zza(t.getClass());
    }

    private zzhl() {
    }
}
