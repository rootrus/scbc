package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Serialization;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class ImmutableMultimap<K, V> implements Multimap<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient ImmutableCollection<Map.Entry<K, V>> entries;
    private transient ImmutableMultiset<K> keys;
    final transient ImmutableMap<K, ? extends ImmutableCollection<V>> map;
    final transient int size;
    private transient ImmutableCollection<V> values;

    public abstract ImmutableCollection<V> get(K k);

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m3641of() {
        return ImmutableListMultimap.m3635of();
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m3642of(K k, V v) {
        return ImmutableListMultimap.m3636of(k, v);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m3643of(K k, V v, K k2, V v2) {
        return ImmutableListMultimap.m3637of(k, v, k2, v2);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m3644of(K k, V v, K k2, V v2, K k3, V v3) {
        return ImmutableListMultimap.m3638of(k, v, k2, v2, k3, v3);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m3645of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return ImmutableListMultimap.m3639of(k, v, k2, v2, k3, v3, k4, v4);
    }

    /* renamed from: of */
    public static <K, V> ImmutableMultimap<K, V> m3646of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return ImmutableListMultimap.m3640of(k, v, k2, v2, k3, v3, k4, v4, k5, v5);
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    static class BuilderMultimap<K, V> extends AbstractMultimap<K, V> {
        private static final long serialVersionUID = 0;

        BuilderMultimap() {
            super(new LinkedHashMap());
        }

        /* access modifiers changed from: package-private */
        public Collection<V> createCollection() {
            return Lists.newArrayList();
        }
    }

    static class SortedKeyBuilderMultimap<K, V> extends AbstractMultimap<K, V> {
        private static final long serialVersionUID = 0;

        SortedKeyBuilderMultimap(Comparator<? super K> comparator, Multimap<K, V> multimap) {
            super(new TreeMap(comparator));
            putAll(multimap);
        }

        /* access modifiers changed from: package-private */
        public Collection<V> createCollection() {
            return Lists.newArrayList();
        }
    }

    public static class Builder<K, V> {
        Multimap<K, V> builderMultimap = new BuilderMultimap();
        Comparator<? super V> valueComparator;

        public Builder<K, V> put(K k, V v) {
            this.builderMultimap.put(Preconditions.checkNotNull(k), Preconditions.checkNotNull(v));
            return this;
        }

        public Builder<K, V> putAll(K k, Iterable<? extends V> iterable) {
            Collection<V> collection = this.builderMultimap.get(Preconditions.checkNotNull(k));
            for (Object checkNotNull : iterable) {
                collection.add(Preconditions.checkNotNull(checkNotNull));
            }
            return this;
        }

        public Builder<K, V> putAll(K k, V... vArr) {
            return putAll(k, Arrays.asList(vArr));
        }

        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            for (Map.Entry next : multimap.asMap().entrySet()) {
                putAll(next.getKey(), (Iterable) next.getValue());
            }
            return this;
        }

        public Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            this.builderMultimap = new SortedKeyBuilderMultimap((Comparator) Preconditions.checkNotNull(comparator), this.builderMultimap);
            return this;
        }

        public Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            this.valueComparator = (Comparator) Preconditions.checkNotNull(comparator);
            return this;
        }

        public ImmutableMultimap<K, V> build() {
            if (this.valueComparator != null) {
                Iterator<Collection<V>> it = this.builderMultimap.asMap().values().iterator();
                while (it.hasNext()) {
                    Collections.sort((List) it.next(), this.valueComparator);
                }
            }
            return ImmutableMultimap.copyOf(this.builderMultimap);
        }
    }

    public static <K, V> ImmutableMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap instanceof ImmutableMultimap) {
            ImmutableMultimap<K, V> immutableMultimap = (ImmutableMultimap) multimap;
            if (!immutableMultimap.isPartialView()) {
                return immutableMultimap;
            }
        }
        return ImmutableListMultimap.copyOf(multimap);
    }

    static class FieldSettersHolder {
        static final Serialization.FieldSetter<ImmutableMultimap> MAP_FIELD_SETTER = Serialization.getFieldSetter(ImmutableMultimap.class, "map");
        static final Serialization.FieldSetter<ImmutableMultimap> SIZE_FIELD_SETTER = Serialization.getFieldSetter(ImmutableMultimap.class, "size");

        FieldSettersHolder() {
        }
    }

    ImmutableMultimap(ImmutableMap<K, ? extends ImmutableCollection<V>> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    public ImmutableCollection<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    public ImmutableCollection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    public boolean containsEntry(Object obj, Object obj2) {
        Collection collection = (Collection) this.map.get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        UnmodifiableIterator<? extends ImmutableCollection<V>> it = this.map.values().iterator();
        while (it.hasNext()) {
            if (((ImmutableCollection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return this.size;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Multimap) {
            return this.map.equals(((Multimap) obj).asMap());
        }
        return false;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return this.map.toString();
    }

    public ImmutableSet<K> keySet() {
        return this.map.keySet();
    }

    public ImmutableMap<K, Collection<V>> asMap() {
        return this.map;
    }

    public ImmutableCollection<Map.Entry<K, V>> entries() {
        ImmutableCollection<Map.Entry<K, V>> immutableCollection = this.entries;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        EntryCollection entryCollection = new EntryCollection(this);
        this.entries = entryCollection;
        return entryCollection;
    }

    static class EntryCollection<K, V> extends ImmutableCollection<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;
        final ImmutableMultimap<K, V> multimap;

        EntryCollection(ImmutableMultimap<K, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            final UnmodifiableIterator<Map.Entry<K, ? extends ImmutableCollection<V>>> it = this.multimap.map.entrySet().iterator();
            return new UnmodifiableIterator<Map.Entry<K, V>>() {
                K key;
                Iterator<V> valueIterator;

                public boolean hasNext() {
                    return (this.key != null && this.valueIterator.hasNext()) || it.hasNext();
                }

                public Map.Entry<K, V> next() {
                    if (this.key == null || !this.valueIterator.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        this.key = entry.getKey();
                        this.valueIterator = ((ImmutableCollection) entry.getValue()).iterator();
                    }
                    return Maps.immutableEntry(this.key, this.valueIterator.next());
                }
            };
        }

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return this.multimap.isPartialView();
        }

        public int size() {
            return this.multimap.size();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }
    }

    public ImmutableMultiset<K> keys() {
        ImmutableMultiset<K> immutableMultiset = this.keys;
        if (immutableMultiset != null) {
            return immutableMultiset;
        }
        ImmutableMultiset<K> createKeys = createKeys();
        this.keys = createKeys;
        return createKeys;
    }

    private ImmutableMultiset<K> createKeys() {
        ImmutableMultiset.Builder builder = ImmutableMultiset.builder();
        UnmodifiableIterator<Map.Entry<K, ? extends ImmutableCollection<V>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            builder.addCopies(next.getKey(), ((ImmutableCollection) next.getValue()).size());
        }
        return builder.build();
    }

    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        Values values2 = new Values(this);
        this.values = values2;
        return values2;
    }

    static class Values<V> extends ImmutableCollection<V> {
        private static final long serialVersionUID = 0;
        final ImmutableMultimap<?, V> multimap;

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return true;
        }

        Values(ImmutableMultimap<?, V> immutableMultimap) {
            this.multimap = immutableMultimap;
        }

        public UnmodifiableIterator<V> iterator() {
            final UnmodifiableIterator<Map.Entry<?, V>> it = this.multimap.entries().iterator();
            return new UnmodifiableIterator<V>() {
                public boolean hasNext() {
                    return it.hasNext();
                }

                public V next() {
                    return ((Map.Entry) it.next()).getValue();
                }
            };
        }

        public int size() {
            return this.multimap.size();
        }
    }
}
