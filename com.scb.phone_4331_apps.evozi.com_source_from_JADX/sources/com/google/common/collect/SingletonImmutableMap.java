package com.google.common.collect;

import java.util.Map;

final class SingletonImmutableMap<K, V> extends ImmutableMap<K, V> {
    private transient Map.Entry<K, V> entry;
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;
    private transient ImmutableSet<K> keySet;
    final transient K singleKey;
    final transient V singleValue;
    private transient ImmutableCollection<V> values;

    public final boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return 1;
    }

    SingletonImmutableMap(K k, V v) {
        this.singleKey = k;
        this.singleValue = v;
    }

    SingletonImmutableMap(Map.Entry<K, V> entry2) {
        this.entry = entry2;
        this.singleKey = entry2.getKey();
        this.singleValue = entry2.getValue();
    }

    private Map.Entry<K, V> entry() {
        Map.Entry<K, V> entry2 = this.entry;
        if (entry2 != null) {
            return entry2;
        }
        Map.Entry<K, V> immutableEntry = Maps.immutableEntry(this.singleKey, this.singleValue);
        this.entry = immutableEntry;
        return immutableEntry;
    }

    public final V get(Object obj) {
        if (this.singleKey.equals(obj)) {
            return this.singleValue;
        }
        return null;
    }

    public final boolean containsKey(Object obj) {
        return this.singleKey.equals(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.singleValue.equals(obj);
    }

    public final ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> of = ImmutableSet.m90of(entry());
        this.entrySet = of;
        return of;
    }

    public final ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> of = ImmutableSet.m90of(this.singleKey);
        this.keySet = of;
        return of;
    }

    public final ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        Values values2 = new Values(this.singleValue);
        this.values = values2;
        return values2;
    }

    static class Values<V> extends ImmutableCollection<V> {
        final V singleValue;

        public boolean isEmpty() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return 1;
        }

        Values(V v) {
            this.singleValue = v;
        }

        public boolean contains(Object obj) {
            return this.singleValue.equals(obj);
        }

        public UnmodifiableIterator<V> iterator() {
            return Iterators.singletonIterator(this.singleValue);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != 1) {
            return false;
        }
        Map.Entry entry2 = (Map.Entry) map.entrySet().iterator().next();
        if (!this.singleKey.equals(entry2.getKey()) || !this.singleValue.equals(entry2.getValue())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.singleKey.hashCode() ^ this.singleValue.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        sb.append(this.singleKey.toString());
        sb.append('=');
        sb.append(this.singleValue.toString());
        sb.append('}');
        return sb.toString();
    }
}
