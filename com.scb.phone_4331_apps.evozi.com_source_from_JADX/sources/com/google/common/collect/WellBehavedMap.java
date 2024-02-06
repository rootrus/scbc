package com.google.common.collect;

import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

final class WellBehavedMap<K, V> extends ForwardingMap<K, V> {
    private final Map<K, V> delegate;
    private Set<Map.Entry<K, V>> entrySet;

    private WellBehavedMap(Map<K, V> map) {
        this.delegate = map;
    }

    static <K, V> WellBehavedMap<K, V> wrap(Map<K, V> map) {
        return new WellBehavedMap<>(map);
    }

    /* access modifiers changed from: protected */
    public final Map<K, V> delegate() {
        return this.delegate;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> transform = Sets.transform(this.delegate.keySet(), new KeyToEntryConverter(this));
        this.entrySet = transform;
        return transform;
    }

    static class KeyToEntryConverter<K, V> extends Sets.InvertibleFunction<K, Map.Entry<K, V>> {
        final Map<K, V> map;

        KeyToEntryConverter(Map<K, V> map2) {
            this.map = map2;
        }

        public Map.Entry<K, V> apply(final K k) {
            return new AbstractMapEntry<K, V>() {
                public K getKey() {
                    return k;
                }

                public V getValue() {
                    return KeyToEntryConverter.this.map.get(k);
                }

                public V setValue(V v) {
                    return KeyToEntryConverter.this.map.put(k, v);
                }
            };
        }

        public K invert(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    }
}
