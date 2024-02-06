package com.google.android.gms.internal.firebase_ml;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzwb {
    private static final zzwb zzbrq = new zzwb();
    private final zzwf zzbrr = new zzvd();
    private final ConcurrentMap<Class<?>, zzwe<?>> zzbrs = new ConcurrentHashMap();

    public static zzwb zzso() {
        return zzbrq;
    }

    public final <T> zzwe<T> zzk(Class<T> cls) {
        zzug.zza(cls, "messageType");
        zzwe<T> zzwe = (zzwe) this.zzbrs.get(cls);
        if (zzwe != null) {
            return zzwe;
        }
        zzwe<T> zzj = this.zzbrr.zzj(cls);
        zzug.zza(cls, "messageType");
        zzug.zza(zzj, "schema");
        zzwe<T> putIfAbsent = this.zzbrs.putIfAbsent(cls, zzj);
        return putIfAbsent != null ? putIfAbsent : zzj;
    }

    public final <T> zzwe<T> zzad(T t) {
        return zzk(t.getClass());
    }

    private zzwb() {
    }
}
