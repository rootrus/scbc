package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

public final class Multimaps {
    private Multimaps() {
    }

    public static <K, V> Multimap<K, V> newMultimap(Map<K, Collection<V>> map, Supplier<? extends Collection<V>> supplier) {
        return new CustomMultimap(map, supplier);
    }

    static class CustomMultimap<K, V> extends AbstractMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient Supplier<? extends Collection<V>> factory;

        CustomMultimap(Map<K, Collection<V>> map, Supplier<? extends Collection<V>> supplier) {
            super(map);
            this.factory = (Supplier) Preconditions.checkNotNull(supplier);
        }

        /* access modifiers changed from: protected */
        public Collection<V> createCollection() {
            return (Collection) this.factory.get();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (Supplier) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }
    }

    public static <K, V> ListMultimap<K, V> newListMultimap(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
        return new CustomListMultimap(map, supplier);
    }

    static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient Supplier<? extends List<V>> factory;

        CustomListMultimap(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
            super(map);
            this.factory = (Supplier) Preconditions.checkNotNull(supplier);
        }

        /* access modifiers changed from: protected */
        public List<V> createCollection() {
            return (List) this.factory.get();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (Supplier) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }
    }

    public static <K, V> SetMultimap<K, V> newSetMultimap(Map<K, Collection<V>> map, Supplier<? extends Set<V>> supplier) {
        return new CustomSetMultimap(map, supplier);
    }

    static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient Supplier<? extends Set<V>> factory;

        CustomSetMultimap(Map<K, Collection<V>> map, Supplier<? extends Set<V>> supplier) {
            super(map);
            this.factory = (Supplier) Preconditions.checkNotNull(supplier);
        }

        /* access modifiers changed from: protected */
        public Set<V> createCollection() {
            return (Set) this.factory.get();
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.factory = (Supplier) objectInputStream.readObject();
            setMap((Map) objectInputStream.readObject());
        }
    }

    public static <K, V> SortedSetMultimap<K, V> newSortedSetMultimap(Map<K, Collection<V>> map, Supplier<? extends SortedSet<V>> supplier) {
        return new CustomSortedSetMultimap(map, supplier);
    }

    static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;
        transient Supplier<? extends SortedSet<V>> factory;
        transient Comparator<? super V> valueComparator;

        CustomSortedSetMultimap(Map<K, Collection<V>> map, Supplier<? extends SortedSet<V>> supplier) {
            super(map);
            this.factory = (Supplier) Preconditions.checkNotNull(supplier);
            this.valueComparator = ((SortedSet) supplier.get()).comparator();
        }

        /* access modifiers changed from: protected */
        public SortedSet<V> createCollection() {
            return (SortedSet) this.factory.get();
        }

        public Comparator<? super V> valueComparator() {
            return this.valueComparator;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.factory);
            objectOutputStream.writeObject(backingMap());
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            Supplier<? extends SortedSet<V>> supplier = (Supplier) objectInputStream.readObject();
            this.factory = supplier;
            this.valueComparator = ((SortedSet) supplier.get()).comparator();
            setMap((Map) objectInputStream.readObject());
        }
    }

    public static <K, V, M extends Multimap<K, V>> M invertFrom(Multimap<? extends V, ? extends K> multimap, M m) {
        Preconditions.checkNotNull(m);
        for (Map.Entry next : multimap.entries()) {
            m.put(next.getValue(), next.getKey());
        }
        return m;
    }

    public static <K, V> Multimap<K, V> synchronizedMultimap(Multimap<K, V> multimap) {
        return Synchronized.multimap(multimap, (Object) null);
    }

    public static <K, V> Multimap<K, V> unmodifiableMultimap(Multimap<K, V> multimap) {
        return new UnmodifiableMultimap(multimap);
    }

    static class UnmodifiableMultimap<K, V> extends ForwardingMultimap<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final Multimap<K, V> delegate;
        transient Collection<Map.Entry<K, V>> entries;
        transient Set<K> keySet;
        transient Multiset<K> keys;
        transient Map<K, Collection<V>> map;
        transient Collection<V> values;

        UnmodifiableMultimap(Multimap<K, V> multimap) {
            this.delegate = (Multimap) Preconditions.checkNotNull(multimap);
        }

        /* access modifiers changed from: protected */
        public Multimap<K, V> delegate() {
            return this.delegate;
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map2 = this.map;
            if (map2 != null) {
                return map2;
            }
            final Map<K, Collection<V>> unmodifiableMap = Collections.unmodifiableMap(this.delegate.asMap());
            C77621 r1 = new ForwardingMap<K, Collection<V>>() {
                Collection<Collection<V>> asMapValues;
                Set<Map.Entry<K, Collection<V>>> entrySet;

                /* access modifiers changed from: protected */
                public Map<K, Collection<V>> delegate() {
                    return unmodifiableMap;
                }

                public Set<Map.Entry<K, Collection<V>>> entrySet() {
                    Set<Map.Entry<K, Collection<V>>> set = this.entrySet;
                    if (set != null) {
                        return set;
                    }
                    Set<Map.Entry<K, Collection<V>>> access$000 = Multimaps.unmodifiableAsMapEntries(unmodifiableMap.entrySet());
                    this.entrySet = access$000;
                    return access$000;
                }

                public Collection<V> get(Object obj) {
                    Collection collection = (Collection) unmodifiableMap.get(obj);
                    if (collection == null) {
                        return null;
                    }
                    return Multimaps.unmodifiableValueCollection(collection);
                }

                public Collection<Collection<V>> values() {
                    Collection<Collection<V>> collection = this.asMapValues;
                    if (collection != null) {
                        return collection;
                    }
                    UnmodifiableAsMapValues unmodifiableAsMapValues = new UnmodifiableAsMapValues(unmodifiableMap.values());
                    this.asMapValues = unmodifiableAsMapValues;
                    return unmodifiableAsMapValues;
                }

                public boolean containsValue(Object obj) {
                    return values().contains(obj);
                }
            };
            this.map = r1;
            return r1;
        }

        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.entries;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> access$200 = Multimaps.unmodifiableEntries(this.delegate.entries());
            this.entries = access$200;
            return access$200;
        }

        public Collection<V> get(K k) {
            return Multimaps.unmodifiableValueCollection(this.delegate.get(k));
        }

        public Multiset<K> keys() {
            Multiset<K> multiset = this.keys;
            if (multiset != null) {
                return multiset;
            }
            Multiset<K> unmodifiableMultiset = Multisets.unmodifiableMultiset(this.delegate.keys());
            this.keys = unmodifiableMultiset;
            return unmodifiableMultiset;
        }

        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            Set<K> unmodifiableSet = Collections.unmodifiableSet(this.delegate.keySet());
            this.keySet = unmodifiableSet;
            return unmodifiableSet;
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

        public Collection<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection<V> unmodifiableCollection = Collections.unmodifiableCollection(this.delegate.values());
            this.values = unmodifiableCollection;
            return unmodifiableCollection;
        }
    }

    static class UnmodifiableAsMapValues<V> extends ForwardingCollection<Collection<V>> {
        final Collection<Collection<V>> delegate;

        UnmodifiableAsMapValues(Collection<Collection<V>> collection) {
            this.delegate = Collections.unmodifiableCollection(collection);
        }

        /* access modifiers changed from: protected */
        public Collection<Collection<V>> delegate() {
            return this.delegate;
        }

        public Iterator<Collection<V>> iterator() {
            final Iterator<Collection<V>> it = this.delegate.iterator();
            return new Iterator<Collection<V>>() {
                public boolean hasNext() {
                    return it.hasNext();
                }

                public Collection<V> next() {
                    return Multimaps.unmodifiableValueCollection((Collection) it.next());
                }

                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }

        public Object[] toArray() {
            return standardToArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }

        public boolean contains(Object obj) {
            return standardContains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }
    }

    static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ListMultimap<K, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableListMultimap(ListMultimap<K, V> listMultimap) {
            super(listMultimap);
        }

        public ListMultimap<K, V> delegate() {
            return (ListMultimap) super.delegate();
        }

        public List<V> get(K k) {
            return Collections.unmodifiableList(delegate().get(k));
        }

        public List<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        public List<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements SetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableSetMultimap(SetMultimap<K, V> setMultimap) {
            super(setMultimap);
        }

        public SetMultimap<K, V> delegate() {
            return (SetMultimap) super.delegate();
        }

        public Set<V> get(K k) {
            return Collections.unmodifiableSet(delegate().get(k));
        }

        public Set<Map.Entry<K, V>> entries() {
            return Maps.unmodifiableEntrySet(delegate().entries());
        }

        public Set<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        private static final long serialVersionUID = 0;

        UnmodifiableSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
            super(sortedSetMultimap);
        }

        public SortedSetMultimap<K, V> delegate() {
            return (SortedSetMultimap) super.delegate();
        }

        public SortedSet<V> get(K k) {
            return Collections.unmodifiableSortedSet(delegate().get(k));
        }

        public SortedSet<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        public SortedSet<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public Comparator<? super V> valueComparator() {
            return delegate().valueComparator();
        }
    }

    public static <K, V> SetMultimap<K, V> synchronizedSetMultimap(SetMultimap<K, V> setMultimap) {
        return Synchronized.setMultimap(setMultimap, (Object) null);
    }

    public static <K, V> SetMultimap<K, V> unmodifiableSetMultimap(SetMultimap<K, V> setMultimap) {
        return new UnmodifiableSetMultimap(setMultimap);
    }

    public static <K, V> SortedSetMultimap<K, V> synchronizedSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return Synchronized.sortedSetMultimap(sortedSetMultimap, (Object) null);
    }

    public static <K, V> SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return new UnmodifiableSortedSetMultimap(sortedSetMultimap);
    }

    public static <K, V> ListMultimap<K, V> synchronizedListMultimap(ListMultimap<K, V> listMultimap) {
        return Synchronized.listMultimap(listMultimap, (Object) null);
    }

    public static <K, V> ListMultimap<K, V> unmodifiableListMultimap(ListMultimap<K, V> listMultimap) {
        return new UnmodifiableListMultimap(listMultimap);
    }

    /* access modifiers changed from: private */
    public static <V> Collection<V> unmodifiableValueCollection(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List) collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    /* access modifiers changed from: private */
    public static <K, V> Map.Entry<K, Collection<V>> unmodifiableAsMapEntry(final Map.Entry<K, Collection<V>> entry) {
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry<K, Collection<V>>() {
            public final K getKey() {
                return entry.getKey();
            }

            public final Collection<V> getValue() {
                return Multimaps.unmodifiableValueCollection((Collection) entry.getValue());
            }
        };
    }

    /* access modifiers changed from: private */
    public static <K, V> Collection<Map.Entry<K, V>> unmodifiableEntries(Collection<Map.Entry<K, V>> collection) {
        if (collection instanceof Set) {
            return Maps.unmodifiableEntrySet((Set) collection);
        }
        return new Maps.UnmodifiableEntries(Collections.unmodifiableCollection(collection));
    }

    /* access modifiers changed from: private */
    public static <K, V> Set<Map.Entry<K, Collection<V>>> unmodifiableAsMapEntries(Set<Map.Entry<K, Collection<V>>> set) {
        return new UnmodifiableAsMapEntries(Collections.unmodifiableSet(set));
    }

    static class UnmodifiableAsMapEntries<K, V> extends ForwardingSet<Map.Entry<K, Collection<V>>> {
        private final Set<Map.Entry<K, Collection<V>>> delegate;

        UnmodifiableAsMapEntries(Set<Map.Entry<K, Collection<V>>> set) {
            this.delegate = set;
        }

        /* access modifiers changed from: protected */
        public Set<Map.Entry<K, Collection<V>>> delegate() {
            return this.delegate;
        }

        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            final Iterator<Map.Entry<K, Collection<V>>> it = this.delegate.iterator();
            return new ForwardingIterator<Map.Entry<K, Collection<V>>>() {
                /* access modifiers changed from: protected */
                public Iterator<Map.Entry<K, Collection<V>>> delegate() {
                    return it;
                }

                public Map.Entry<K, Collection<V>> next() {
                    return Multimaps.unmodifiableAsMapEntry((Map.Entry) it.next());
                }
            };
        }

        public Object[] toArray() {
            return standardToArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }

        public boolean contains(Object obj) {
            return Maps.containsEntryImpl(delegate(), obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        public boolean equals(Object obj) {
            return standardEquals(obj);
        }
    }

    public static <K, V> SetMultimap<K, V> forMap(Map<K, V> map) {
        return new MapMultimap(map);
    }

    static class MapMultimap<K, V> implements SetMultimap<K, V>, Serializable {
        private static final Joiner.MapJoiner JOINER = Joiner.m82on("], ").withKeyValueSeparator("=[").useForNull("null");
        private static final long serialVersionUID = 7845222491160860175L;
        transient Map<K, Collection<V>> asMap;
        final Map<K, V> map;

        MapMultimap(Map<K, V> map2) {
            this.map = (Map) Preconditions.checkNotNull(map2);
        }

        public int size() {
            return this.map.size();
        }

        public boolean isEmpty() {
            return this.map.isEmpty();
        }

        public boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        public boolean containsEntry(Object obj, Object obj2) {
            return this.map.entrySet().contains(Maps.immutableEntry(obj, obj2));
        }

        public Set<V> get(final K k) {
            return new AbstractSet<V>() {
                public Iterator<V> iterator() {
                    return new Iterator<V>() {

                        /* renamed from: i */
                        int f3267i;

                        public boolean hasNext() {
                            return this.f3267i == 0 && MapMultimap.this.map.containsKey(k);
                        }

                        public V next() {
                            if (hasNext()) {
                                this.f3267i++;
                                return MapMultimap.this.map.get(k);
                            }
                            throw new NoSuchElementException();
                        }

                        public void remove() {
                            boolean z = true;
                            if (this.f3267i != 1) {
                                z = false;
                            }
                            Preconditions.checkState(z);
                            this.f3267i = -1;
                            MapMultimap.this.map.remove(k);
                        }
                    };
                }

                public int size() {
                    return MapMultimap.this.map.containsKey(k) ? 1 : 0;
                }
            };
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

        public Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            return this.map.entrySet().remove(Maps.immutableEntry(obj, obj2));
        }

        public Set<V> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.map.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.map.remove(obj));
            return hashSet;
        }

        public void clear() {
            this.map.clear();
        }

        public Set<K> keySet() {
            return this.map.keySet();
        }

        public Multiset<K> keys() {
            return Multisets.forSet(this.map.keySet());
        }

        public Collection<V> values() {
            return this.map.values();
        }

        public Set<Map.Entry<K, V>> entries() {
            return this.map.entrySet();
        }

        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map2 = this.asMap;
            if (map2 != null) {
                return map2;
            }
            AsMap asMap2 = new AsMap();
            this.asMap = asMap2;
            return asMap2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Multimap)) {
                return false;
            }
            Multimap multimap = (Multimap) obj;
            if (size() != multimap.size() || !asMap().equals(multimap.asMap())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public String toString() {
            if (this.map.isEmpty()) {
                return "{}";
            }
            StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(this.map.size());
            newStringBuilderForCollection.append('{');
            JOINER.appendTo(newStringBuilderForCollection, (Map<?, ?>) this.map);
            newStringBuilderForCollection.append("]}");
            return newStringBuilderForCollection.toString();
        }

        class AsMapEntries extends AbstractSet<Map.Entry<K, Collection<V>>> {
            AsMapEntries() {
            }

            public int size() {
                return MapMultimap.this.map.size();
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new Iterator<Map.Entry<K, Collection<V>>>() {
                    final Iterator<K> keys = MapMultimap.this.map.keySet().iterator();

                    public boolean hasNext() {
                        return this.keys.hasNext();
                    }

                    public Map.Entry<K, Collection<V>> next() {
                        final K next = this.keys.next();
                        return new AbstractMapEntry<K, Collection<V>>() {
                            public K getKey() {
                                return next;
                            }

                            public Collection<V> getValue() {
                                return MapMultimap.this.get(next);
                            }
                        };
                    }

                    public void remove() {
                        this.keys.remove();
                    }
                };
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!(entry.getValue() instanceof Set)) {
                    return false;
                }
                Set set = (Set) entry.getValue();
                if (set.size() != 1 || !MapMultimap.this.containsEntry(entry.getKey(), set.iterator().next())) {
                    return false;
                }
                return true;
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!(entry.getValue() instanceof Set)) {
                    return false;
                }
                Set set = (Set) entry.getValue();
                if (set.size() != 1 || !MapMultimap.this.map.entrySet().remove(Maps.immutableEntry(entry.getKey(), set.iterator().next()))) {
                    return false;
                }
                return true;
            }
        }

        class AsMap extends Maps.ImprovedAbstractMap<K, Collection<V>> {
            AsMap() {
            }

            /* access modifiers changed from: protected */
            public Set<Map.Entry<K, Collection<V>>> createEntrySet() {
                return new AsMapEntries();
            }

            public boolean containsKey(Object obj) {
                return MapMultimap.this.map.containsKey(obj);
            }

            public Collection<V> get(Object obj) {
                Set set = MapMultimap.this.get(obj);
                if (set.isEmpty()) {
                    return null;
                }
                return set;
            }

            public Collection<V> remove(Object obj) {
                Set removeAll = MapMultimap.this.removeAll(obj);
                if (removeAll.isEmpty()) {
                    return null;
                }
                return removeAll;
            }
        }
    }

    public static <K, V1, V2> Multimap<K, V2> transformValues(Multimap<K, V1> multimap, final Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return transformEntries(multimap, new Maps.EntryTransformer<K, V1, V2>() {
            public final V2 transformEntry(K k, V1 v1) {
                return function.apply(v1);
            }
        });
    }

    public static <K, V1, V2> Multimap<K, V2> transformEntries(Multimap<K, V1> multimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesMultimap(multimap, entryTransformer);
    }

    static class TransformedEntriesMultimap<K, V1, V2> implements Multimap<K, V2> {
        private transient Map<K, Collection<V2>> asMap;
        private transient Collection<Map.Entry<K, V2>> entries;
        final Multimap<K, V1> fromMultimap;
        final Maps.EntryTransformer<? super K, ? super V1, V2> transformer;
        private transient Collection<V2> values;

        TransformedEntriesMultimap(Multimap<K, V1> multimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.fromMultimap = (Multimap) Preconditions.checkNotNull(multimap);
            this.transformer = (Maps.EntryTransformer) Preconditions.checkNotNull(entryTransformer);
        }

        /* access modifiers changed from: package-private */
        public Collection<V2> transform(final K k, Collection<V1> collection) {
            return Collections2.transform(collection, new Function<V1, V2>() {
                public V2 apply(V1 v1) {
                    return TransformedEntriesMultimap.this.transformer.transformEntry(k, v1);
                }
            });
        }

        public Map<K, Collection<V2>> asMap() {
            Map<K, Collection<V2>> map = this.asMap;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V2>> transformEntries = Maps.transformEntries(this.fromMultimap.asMap(), new Maps.EntryTransformer<K, Collection<V1>, Collection<V2>>() {
                public Collection<V2> transformEntry(K k, Collection<V1> collection) {
                    return TransformedEntriesMultimap.this.transform(k, collection);
                }
            });
            this.asMap = transformEntries;
            return transformEntries;
        }

        public void clear() {
            this.fromMultimap.clear();
        }

        public boolean containsEntry(Object obj, Object obj2) {
            return get(obj).contains(obj2);
        }

        public boolean containsKey(Object obj) {
            return this.fromMultimap.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        public Collection<Map.Entry<K, V2>> entries() {
            Collection<Map.Entry<K, V2>> collection = this.entries;
            if (collection != null) {
                return collection;
            }
            TransformedEntries transformedEntries = new TransformedEntries(this.transformer);
            this.entries = transformedEntries;
            return transformedEntries;
        }

        class TransformedEntries extends Collections2.TransformedCollection<Map.Entry<K, V1>, Map.Entry<K, V2>> {
            TransformedEntries(final Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
                super(TransformedEntriesMultimap.this.fromMultimap.entries(), new Function<Map.Entry<K, V1>, Map.Entry<K, V2>>() {
                    public Map.Entry<K, V2> apply(final Map.Entry<K, V1> entry) {
                        return new AbstractMapEntry<K, V2>() {
                            public K getKey() {
                                return entry.getKey();
                            }

                            public V2 getValue() {
                                return entryTransformer.transformEntry(entry.getKey(), entry.getValue());
                            }
                        };
                    }
                });
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return TransformedEntriesMultimap.this.containsEntry(entry.getKey(), entry.getValue());
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return TransformedEntriesMultimap.this.get(entry.getKey()).remove(entry.getValue());
            }
        }

        public Collection<V2> get(K k) {
            return transform(k, this.fromMultimap.get(k));
        }

        public boolean isEmpty() {
            return this.fromMultimap.isEmpty();
        }

        public Set<K> keySet() {
            return this.fromMultimap.keySet();
        }

        public Multiset<K> keys() {
            return this.fromMultimap.keys();
        }

        public boolean put(K k, V2 v2) {
            throw new UnsupportedOperationException();
        }

        public boolean putAll(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        public boolean putAll(Multimap<? extends K, ? extends V2> multimap) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        public Collection<V2> removeAll(Object obj) {
            return transform(obj, this.fromMultimap.removeAll(obj));
        }

        public Collection<V2> replaceValues(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return this.fromMultimap.size();
        }

        public Collection<V2> values() {
            Collection<V2> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Collection<V2> transform = Collections2.transform(this.fromMultimap.entries(), new Function<Map.Entry<K, V1>, V2>() {
                public V2 apply(Map.Entry<K, V1> entry) {
                    return TransformedEntriesMultimap.this.transformer.transformEntry(entry.getKey(), entry.getValue());
                }
            });
            this.values = transform;
            return transform;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Multimap) {
                return asMap().equals(((Multimap) obj).asMap());
            }
            return false;
        }

        public int hashCode() {
            return asMap().hashCode();
        }

        public String toString() {
            return asMap().toString();
        }
    }

    public static <K, V1, V2> ListMultimap<K, V2> transformValues(ListMultimap<K, V1> listMultimap, final Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return transformEntries(listMultimap, new Maps.EntryTransformer<K, V1, V2>() {
            public final V2 transformEntry(K k, V1 v1) {
                return function.apply(v1);
            }
        });
    }

    public static <K, V1, V2> ListMultimap<K, V2> transformEntries(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesListMultimap(listMultimap, entryTransformer);
    }

    static final class TransformedEntriesListMultimap<K, V1, V2> extends TransformedEntriesMultimap<K, V1, V2> implements ListMultimap<K, V2> {
        TransformedEntriesListMultimap(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(listMultimap, entryTransformer);
        }

        /* access modifiers changed from: package-private */
        public final List<V2> transform(final K k, Collection<V1> collection) {
            return Lists.transform((List) collection, new Function<V1, V2>() {
                public V2 apply(V1 v1) {
                    return TransformedEntriesListMultimap.this.transformer.transformEntry(k, v1);
                }
            });
        }

        public final List<V2> get(K k) {
            return transform((Object) k, (Collection) this.fromMultimap.get(k));
        }

        public final List<V2> removeAll(Object obj) {
            return transform(obj, (Collection) this.fromMultimap.removeAll(obj));
        }

        public final List<V2> replaceValues(K k, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    public static <K, V> ImmutableListMultimap<K, V> index(Iterable<V> iterable, Function<? super V, K> function) {
        Preconditions.checkNotNull(function);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        for (V next : iterable) {
            Preconditions.checkNotNull(next, iterable);
            builder.put(function.apply(next), next);
        }
        return builder.build();
    }
}
