package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class zzgc<K> implements Iterator<Map.Entry<K, Object>> {
    private Iterator<Map.Entry<K, Object>> zza;

    public zzgc(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final void remove() {
        this.zza.remove();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.zza.next();
        return next.getValue() instanceof zzgb ? new zzgd(next) : next;
    }
}
