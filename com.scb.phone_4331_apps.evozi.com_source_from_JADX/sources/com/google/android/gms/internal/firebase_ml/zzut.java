package com.google.android.gms.internal.firebase_ml;

import java.util.Map;

final class zzut<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzur> zzbpw;

    private zzut(Map.Entry<K, zzur> entry) {
        this.zzbpw = entry;
    }

    public final K getKey() {
        return this.zzbpw.getKey();
    }

    public final Object getValue() {
        if (this.zzbpw.getValue() == null) {
            return null;
        }
        return zzur.zzrt();
    }

    public final zzur zzru() {
        return this.zzbpw.getValue();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof zzvo) {
            return this.zzbpw.getValue().zzi((zzvo) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
