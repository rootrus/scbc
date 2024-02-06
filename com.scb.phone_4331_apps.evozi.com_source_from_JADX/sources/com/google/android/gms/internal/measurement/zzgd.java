package com.google.android.gms.internal.measurement;

import java.util.Map;

final class zzgd<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzgb> zza;

    private zzgd(Map.Entry<K, zzgb> entry) {
        this.zza = entry;
    }

    public final K getKey() {
        return this.zza.getKey();
    }

    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        return zzgb.zza();
    }

    public final zzgb zza() {
        return this.zza.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzgw) {
            return this.zza.getValue().zza((zzgw) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
