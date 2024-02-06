package com.google.common.collect;

import java.io.Serializable;

class ImmutableEntry<K, V> extends AbstractMapEntry<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final K key;
    private final V value;

    ImmutableEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public K getKey() {
        return this.key;
    }

    public V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
