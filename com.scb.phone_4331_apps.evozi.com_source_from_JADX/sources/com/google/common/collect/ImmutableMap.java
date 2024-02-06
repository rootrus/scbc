package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {
    public abstract boolean containsValue(Object obj);

    public abstract ImmutableSet<Map.Entry<K, V>> entrySet();

    public abstract V get(Object obj);

    /* access modifiers changed from: package-private */
    public abstract boolean isPartialView();

    public abstract ImmutableSet<K> keySet();

    public abstract ImmutableCollection<V> values();

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m83of() {
        return EmptyImmutableMap.INSTANCE;
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m84of(K k, V v) {
        return new SingletonImmutableMap(Preconditions.checkNotNull(k), Preconditions.checkNotNull(v));
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m85of(K k, V v, K k2, V v2) {
        return new RegularImmutableMap(entryOf(k, v), entryOf(k2, v2));
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m86of(K k, V v, K k2, V v2, K k3, V v3) {
        return new RegularImmutableMap(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3));
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m87of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return new RegularImmutableMap(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4));
    }

    /* renamed from: of */
    public static <K, V> ImmutableMap<K, V> m88of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return new RegularImmutableMap(entryOf(k, v), entryOf(k2, v2), entryOf(k3, v3), entryOf(k4, v4), entryOf(k5, v5));
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    static <K, V> Map.Entry<K, V> entryOf(K k, V v) {
        return Maps.immutableEntry(Preconditions.checkNotNull(k, "null key"), Preconditions.checkNotNull(v, "null value"));
    }

    public static class Builder<K, V> {
        final ArrayList<Map.Entry<K, V>> entries = Lists.newArrayList();

        public Builder<K, V> put(K k, V v) {
            this.entries.add(ImmutableMap.entryOf(k, v));
            return this;
        }

        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            ArrayList<Map.Entry<K, V>> arrayList = this.entries;
            arrayList.ensureCapacity(arrayList.size() + map.size());
            for (Map.Entry next : map.entrySet()) {
                put(next.getKey(), next.getValue());
            }
            return this;
        }

        public ImmutableMap<K, V> build() {
            return fromEntryList(this.entries);
        }

        private static <K, V> ImmutableMap<K, V> fromEntryList(List<Map.Entry<K, V>> list) {
            int size = list.size();
            if (size == 0) {
                return ImmutableMap.m83of();
            }
            if (size != 1) {
                return new RegularImmutableMap((Map.Entry[]) list.toArray(new Map.Entry[list.size()]));
            }
            return new SingletonImmutableMap((Map.Entry) Iterables.getOnlyElement(list));
        }
    }

    public static <K, V> ImmutableMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof ImmutableSortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.isPartialView()) {
                return immutableMap;
            }
        }
        Map.Entry[] entryArr = (Map.Entry[]) map.entrySet().toArray(new Map.Entry[0]);
        int length = entryArr.length;
        if (length == 0) {
            return m83of();
        }
        if (length == 1) {
            return new SingletonImmutableMap(entryOf(entryArr[0].getKey(), entryArr[0].getValue()));
        }
        for (int i = 0; i < entryArr.length; i++) {
            entryArr[i] = entryOf(entryArr[i].getKey(), entryArr[i].getValue());
        }
        return new RegularImmutableMap(entryArr);
    }

    ImmutableMap() {
    }

    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public String toString() {
        return Maps.toStringImpl(this);
    }

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] keys;
        private final Object[] values;

        SerializedForm(ImmutableMap<?, ?> immutableMap) {
            this.keys = new Object[immutableMap.size()];
            this.values = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<?, ?>> it = immutableMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                this.keys[i] = next.getKey();
                this.values[i] = next.getValue();
                i++;
            }
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return createMap(new Builder());
        }

        /* access modifiers changed from: package-private */
        public Object createMap(Builder<Object, Object> builder) {
            int i = 0;
            while (true) {
                Object[] objArr = this.keys;
                if (i >= objArr.length) {
                    return builder.build();
                }
                builder.put(objArr[i], this.values[i]);
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
