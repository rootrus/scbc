package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

class RegularImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    final transient ImmutableMap<K, V> delegate;
    final transient ImmutableBiMap<V, K> inverse;

    RegularImmutableBiMap(ImmutableMap<K, V> immutableMap) {
        this.delegate = immutableMap;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        UnmodifiableIterator<Map.Entry<K, V>> it = immutableMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            builder.put(next.getValue(), next.getKey());
        }
        this.inverse = new RegularImmutableBiMap(builder.build(), this);
    }

    RegularImmutableBiMap(ImmutableMap<K, V> immutableMap, ImmutableBiMap<V, K> immutableBiMap) {
        this.delegate = immutableMap;
        this.inverse = immutableBiMap;
    }

    /* access modifiers changed from: package-private */
    public ImmutableMap<K, V> delegate() {
        return this.delegate;
    }

    public ImmutableBiMap<V, K> inverse() {
        return this.inverse;
    }

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return this.delegate.isPartialView() || this.inverse.delegate().isPartialView();
    }
}
