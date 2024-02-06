package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

class zzwq extends AbstractSet<Map.Entry<K, V>> {
    private final /* synthetic */ zzwh zzbsf;

    private zzwq(zzwh zzwh) {
        this.zzbsf = zzwh;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzwp(this.zzbsf, (zzwi) null);
    }

    public int size() {
        return this.zzbsf.size();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzbsf.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzbsf.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.zzbsf.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzbsf.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    /* synthetic */ zzwq(zzwh zzwh, zzwi zzwi) {
        this(zzwh);
    }
}
