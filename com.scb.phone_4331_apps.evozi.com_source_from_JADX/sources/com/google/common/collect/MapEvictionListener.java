package com.google.common.collect;

public interface MapEvictionListener<K, V> {
    void onEviction(K k, V v);
}
