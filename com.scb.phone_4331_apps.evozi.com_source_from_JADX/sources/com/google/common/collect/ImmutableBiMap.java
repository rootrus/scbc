package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Set;

public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {
    /* access modifiers changed from: private */
    public static final ImmutableBiMap<Object, Object> EMPTY_IMMUTABLE_BIMAP = new EmptyBiMap();

    /* access modifiers changed from: package-private */
    public abstract ImmutableMap<K, V> delegate();

    public abstract ImmutableBiMap<V, K> inverse();

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m3615of() {
        return EMPTY_IMMUTABLE_BIMAP;
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m3616of(K k, V v) {
        return new RegularImmutableBiMap(ImmutableMap.m84of(k, v));
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m3617of(K k, V v, K k2, V v2) {
        return new RegularImmutableBiMap(ImmutableMap.m85of(k, v, k2, v2));
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m3618of(K k, V v, K k2, V v2, K k3, V v3) {
        return new RegularImmutableBiMap(ImmutableMap.m86of(k, v, k2, v2, k3, v3));
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m3619of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return new RegularImmutableBiMap(ImmutableMap.m87of(k, v, k2, v2, k3, v3, k4, v4));
    }

    /* renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m3620of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return new RegularImmutableBiMap(ImmutableMap.m88of(k, v, k2, v2, k3, v3, k4, v4, k5, v5));
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public final Builder<K, V> put(K k, V v) {
            super.put(k, v);
            return this;
        }

        public final Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll(map);
            return this;
        }

        public final ImmutableBiMap<K, V> build() {
            ImmutableMap build = super.build();
            if (build.isEmpty()) {
                return ImmutableBiMap.m3615of();
            }
            return new RegularImmutableBiMap(build);
        }
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        if (map.isEmpty()) {
            return m3615of();
        }
        return new RegularImmutableBiMap(ImmutableMap.copyOf(map));
    }

    ImmutableBiMap() {
    }

    public boolean containsKey(Object obj) {
        return delegate().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return inverse().containsKey(obj);
    }

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return delegate().entrySet();
    }

    public V get(Object obj) {
        return delegate().get(obj);
    }

    public ImmutableSet<K> keySet() {
        return delegate().keySet();
    }

    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    public V forcePut(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return delegate().isEmpty();
    }

    public int size() {
        return delegate().size();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public String toString() {
        return delegate().toString();
    }

    static class EmptyBiMap extends ImmutableBiMap<Object, Object> {
        public ImmutableBiMap<Object, Object> inverse() {
            return this;
        }

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return false;
        }

        public /* bridge */ /* synthetic */ Set entrySet() {
            return ImmutableBiMap.super.entrySet();
        }

        public /* bridge */ /* synthetic */ Set keySet() {
            return ImmutableBiMap.super.keySet();
        }

        EmptyBiMap() {
        }

        /* access modifiers changed from: package-private */
        public ImmutableMap<Object, Object> delegate() {
            return ImmutableMap.m83of();
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return ImmutableBiMap.EMPTY_IMMUTABLE_BIMAP;
        }
    }

    static class SerializedForm extends ImmutableMap.SerializedForm {
        private static final long serialVersionUID = 0;

        SerializedForm(ImmutableBiMap<?, ?> immutableBiMap) {
            super(immutableBiMap);
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return createMap(new Builder());
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
