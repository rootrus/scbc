package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

final class zzuu<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zzbpx;

    public zzuu(Iterator<Map.Entry<K, Object>> it) {
        this.zzbpx = it;
    }

    public final boolean hasNext() {
        return this.zzbpx.hasNext();
    }

    public final void remove() {
        this.zzbpx.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zzbpx.next();
        return next.getValue() instanceof zzur ? new zzut(next) : next;
    }
}
