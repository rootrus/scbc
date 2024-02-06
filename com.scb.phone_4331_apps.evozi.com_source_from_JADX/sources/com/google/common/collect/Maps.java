package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

public final class Maps {
    static final Joiner.MapJoiner STANDARD_JOINER = Collections2.STANDARD_JOINER.withKeyValueSeparator("=");

    public interface EntryTransformer<K, V1, V2> {
        V2 transformEntry(K k, V1 v1);
    }

    private Maps() {
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i) {
        return new HashMap<>(capacity(i));
    }

    static int capacity(int i) {
        Preconditions.checkArgument(i >= 0);
        return Ints.saturatedCast(Math.max(((long) i) << 1, 16));
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new MapMaker().makeMap();
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>(sortedMap);
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        return new EnumMap<>((Class) Preconditions.checkNotNull(cls));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> BiMap<K, V> synchronizedBiMap(BiMap<K, V> biMap) {
        return Synchronized.biMap(biMap, (Object) null);
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        HashMap newHashMap = newHashMap();
        HashMap hashMap = new HashMap(map2);
        HashMap newHashMap2 = newHashMap();
        HashMap newHashMap3 = newHashMap();
        boolean z = false;
        boolean z2 = true;
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (map2.containsKey(key)) {
                Object remove = hashMap.remove(key);
                if (Objects.equal(value, remove)) {
                    newHashMap2.put(key, value);
                } else {
                    newHashMap3.put(key, new ValueDifferenceImpl(value, remove));
                }
            } else {
                newHashMap.put(key, value);
            }
            z2 = false;
        }
        if (z2 && hashMap.isEmpty()) {
            z = true;
        }
        return mapDifference(z, newHashMap, hashMap, newHashMap2, newHashMap3);
    }

    private static <K, V> MapDifference<K, V> mapDifference(boolean z, Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, MapDifference.ValueDifference<V>> map4) {
        return new MapDifferenceImpl(z, Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2), Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
    }

    static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {
        final boolean areEqual;
        final Map<K, MapDifference.ValueDifference<V>> differences;
        final Map<K, V> onBoth;
        final Map<K, V> onlyOnLeft;
        final Map<K, V> onlyOnRight;

        MapDifferenceImpl(boolean z, Map<K, V> map, Map<K, V> map2, Map<K, V> map3, Map<K, MapDifference.ValueDifference<V>> map4) {
            this.areEqual = z;
            this.onlyOnLeft = map;
            this.onlyOnRight = map2;
            this.onBoth = map3;
            this.differences = map4;
        }

        public boolean areEqual() {
            return this.areEqual;
        }

        public Map<K, V> entriesOnlyOnLeft() {
            return this.onlyOnLeft;
        }

        public Map<K, V> entriesOnlyOnRight() {
            return this.onlyOnRight;
        }

        public Map<K, V> entriesInCommon() {
            return this.onBoth;
        }

        public Map<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return this.differences;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MapDifference)) {
                return false;
            }
            MapDifference mapDifference = (MapDifference) obj;
            if (!entriesOnlyOnLeft().equals(mapDifference.entriesOnlyOnLeft()) || !entriesOnlyOnRight().equals(mapDifference.entriesOnlyOnRight()) || !entriesInCommon().equals(mapDifference.entriesInCommon()) || !entriesDiffering().equals(mapDifference.entriesDiffering())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public String toString() {
            if (this.areEqual) {
                return "equal";
            }
            StringBuilder sb = new StringBuilder("not equal");
            if (!this.onlyOnLeft.isEmpty()) {
                sb.append(": only on left=");
                sb.append(this.onlyOnLeft);
            }
            if (!this.onlyOnRight.isEmpty()) {
                sb.append(": only on right=");
                sb.append(this.onlyOnRight);
            }
            if (!this.differences.isEmpty()) {
                sb.append(": value differences=");
                sb.append(this.differences);
            }
            return sb.toString();
        }
    }

    static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {
        private final V left;
        private final V right;

        ValueDifferenceImpl(V v, V v2) {
            this.left = v;
            this.right = v2;
        }

        public V leftValue() {
            return this.left;
        }

        public V rightValue() {
            return this.right;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof MapDifference.ValueDifference)) {
                return false;
            }
            MapDifference.ValueDifference valueDifference = (MapDifference.ValueDifference) obj;
            if (!Objects.equal(this.left, valueDifference.leftValue()) || !Objects.equal(this.right, valueDifference.rightValue())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.left, this.right);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(this.left);
            sb.append(", ");
            sb.append(this.right);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterable<V> iterable, Function<? super V, K> function) {
        Preconditions.checkNotNull(function);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (V next : iterable) {
            builder.put(function.apply(next), next);
        }
        return builder.build();
    }

    public static ImmutableMap<String, String> fromProperties(Properties properties) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Enumeration<?> propertyNames = properties.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            builder.put(str, properties.getProperty(str));
        }
        return builder.build();
    }

    public static <K, V> Map.Entry<K, V> immutableEntry(K k, V v) {
        return new ImmutableEntry(k, v);
    }

    static <K, V> Set<Map.Entry<K, V>> unmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
        return new UnmodifiableEntrySet(Collections.unmodifiableSet(set));
    }

    static <K, V> Map.Entry<K, V> unmodifiableEntry(final Map.Entry<K, V> entry) {
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry<K, V>() {
            public final K getKey() {
                return entry.getKey();
            }

            public final V getValue() {
                return entry.getValue();
            }
        };
    }

    static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {
        private final Collection<Map.Entry<K, V>> entries;

        UnmodifiableEntries(Collection<Map.Entry<K, V>> collection) {
            this.entries = collection;
        }

        /* access modifiers changed from: protected */
        public Collection<Map.Entry<K, V>> delegate() {
            return this.entries;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            final Iterator it = super.iterator();
            return new ForwardingIterator<Map.Entry<K, V>>() {
                public Map.Entry<K, V> next() {
                    return Maps.unmodifiableEntry((Map.Entry) super.next());
                }

                public void remove() {
                    throw new UnsupportedOperationException();
                }

                /* access modifiers changed from: protected */
                public Iterator<Map.Entry<K, V>> delegate() {
                    return it;
                }
            };
        }

        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public Object[] toArray() {
            return standardToArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return standardToArray(tArr);
        }
    }

    static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        UnmodifiableEntrySet(Set<Map.Entry<K, V>> set) {
            super(set);
        }

        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    public static <K, V> BiMap<K, V> unmodifiableBiMap(BiMap<? extends K, ? extends V> biMap) {
        return new UnmodifiableBiMap(biMap, (BiMap) null);
    }

    static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final BiMap<? extends K, ? extends V> delegate;
        transient BiMap<V, K> inverse;
        final Map<K, V> unmodifiableMap;
        transient Set<V> values;

        UnmodifiableBiMap(BiMap<? extends K, ? extends V> biMap, BiMap<V, K> biMap2) {
            this.unmodifiableMap = Collections.unmodifiableMap(biMap);
            this.delegate = biMap;
            this.inverse = biMap2;
        }

        /* access modifiers changed from: protected */
        public Map<K, V> delegate() {
            return this.unmodifiableMap;
        }

        public V forcePut(K k, V v) {
            throw new UnsupportedOperationException();
        }

        public BiMap<V, K> inverse() {
            BiMap<V, K> biMap = this.inverse;
            if (biMap != null) {
                return biMap;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.delegate.inverse(), this);
            this.inverse = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        public Set<V> values() {
            Set<V> set = this.values;
            if (set != null) {
                return set;
            }
            Set<V> unmodifiableSet = Collections.unmodifiableSet(this.delegate.values());
            this.values = unmodifiableSet;
            return unmodifiableSet;
        }
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, final Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return transformEntries(map, new EntryTransformer<K, V1, V2>() {
            public final V2 transformEntry(K k, V1 v1) {
                return function.apply(v1);
            }
        });
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesMap(map, entryTransformer);
    }

    static class TransformedEntriesMap<K, V1, V2> extends AbstractMap<K, V2> {
        TransformedEntriesMap<K, V1, V2>.EntrySet entrySet;
        final Map<K, V1> fromMap;
        final EntryTransformer<? super K, ? super V1, V2> transformer;

        TransformedEntriesMap(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            this.fromMap = (Map) Preconditions.checkNotNull(map);
            this.transformer = (EntryTransformer) Preconditions.checkNotNull(entryTransformer);
        }

        public int size() {
            return this.fromMap.size();
        }

        public boolean containsKey(Object obj) {
            return this.fromMap.containsKey(obj);
        }

        public V2 get(Object obj) {
            V1 v1 = this.fromMap.get(obj);
            if (v1 != null || this.fromMap.containsKey(obj)) {
                return this.transformer.transformEntry(obj, v1);
            }
            return null;
        }

        public V2 remove(Object obj) {
            if (this.fromMap.containsKey(obj)) {
                return this.transformer.transformEntry(obj, this.fromMap.remove(obj));
            }
            return null;
        }

        public void clear() {
            this.fromMap.clear();
        }

        public Set<Map.Entry<K, V2>> entrySet() {
            TransformedEntriesMap<K, V1, V2>.EntrySet entrySet2 = this.entrySet;
            if (entrySet2 != null) {
                return entrySet2;
            }
            TransformedEntriesMap<K, V1, V2>.EntrySet entrySet3 = new EntrySet();
            this.entrySet = entrySet3;
            return entrySet3;
        }

        class EntrySet extends AbstractSet<Map.Entry<K, V2>> {
            EntrySet() {
            }

            public int size() {
                return TransformedEntriesMap.this.size();
            }

            public Iterator<Map.Entry<K, V2>> iterator() {
                final Iterator<Map.Entry<K, V1>> it = TransformedEntriesMap.this.fromMap.entrySet().iterator();
                return new Iterator<Map.Entry<K, V2>>() {
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public Map.Entry<K, V2> next() {
                        final Map.Entry entry = (Map.Entry) it.next();
                        return new AbstractMapEntry<K, V2>() {
                            public K getKey() {
                                return entry.getKey();
                            }

                            public V2 getValue() {
                                return TransformedEntriesMap.this.transformer.transformEntry(entry.getKey(), entry.getValue());
                            }
                        };
                    }

                    public void remove() {
                        it.remove();
                    }
                };
            }

            public void clear() {
                TransformedEntriesMap.this.fromMap.clear();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = TransformedEntriesMap.this.get(key);
                if (obj2 != null) {
                    return obj2.equals(value);
                }
                if (value != null || !TransformedEntriesMap.this.containsKey(key)) {
                    return false;
                }
                return true;
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                TransformedEntriesMap.this.fromMap.remove(((Map.Entry) obj).getKey());
                return true;
            }
        }
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, final Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        C02383 r0 = new Predicate<Map.Entry<K, V>>() {
            public final boolean apply(Map.Entry<K, V> entry) {
                return predicate.apply(entry.getKey());
            }
        };
        return map instanceof AbstractFilteredMap ? filterFiltered((AbstractFilteredMap) map, r0) : new FilteredKeyMap((Map) Preconditions.checkNotNull(map), predicate, r0);
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, final Predicate<? super V> predicate) {
        Preconditions.checkNotNull(predicate);
        return filterEntries(map, new Predicate<Map.Entry<K, V>>() {
            public final boolean apply(Map.Entry<K, V> entry) {
                return predicate.apply(entry.getValue());
            }
        });
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        return map instanceof AbstractFilteredMap ? filterFiltered((AbstractFilteredMap) map, predicate) : new FilteredEntryMap((Map) Preconditions.checkNotNull(map), predicate);
    }

    private static <K, V> Map<K, V> filterFiltered(AbstractFilteredMap<K, V> abstractFilteredMap, Predicate<? super Map.Entry<K, V>> predicate) {
        return new FilteredEntryMap(abstractFilteredMap.unfiltered, Predicates.and(abstractFilteredMap.predicate, predicate));
    }

    static abstract class AbstractFilteredMap<K, V> extends AbstractMap<K, V> {
        final Predicate<? super Map.Entry<K, V>> predicate;
        final Map<K, V> unfiltered;
        Collection<V> values;

        AbstractFilteredMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate2) {
            this.unfiltered = map;
            this.predicate = predicate2;
        }

        /* access modifiers changed from: package-private */
        public boolean apply(Object obj, V v) {
            return this.predicate.apply(Maps.immutableEntry(obj, v));
        }

        public V put(K k, V v) {
            Preconditions.checkArgument(apply(k, v));
            return this.unfiltered.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry next : map.entrySet()) {
                Preconditions.checkArgument(apply(next.getKey(), next.getValue()));
            }
            this.unfiltered.putAll(map);
        }

        public boolean containsKey(Object obj) {
            return this.unfiltered.containsKey(obj) && apply(obj, this.unfiltered.get(obj));
        }

        public V get(Object obj) {
            V v = this.unfiltered.get(obj);
            if (v == null || !apply(obj, v)) {
                return null;
            }
            return v;
        }

        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        public V remove(Object obj) {
            if (containsKey(obj)) {
                return this.unfiltered.remove(obj);
            }
            return null;
        }

        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            Values values2 = new Values();
            this.values = values2;
            return values2;
        }

        class Values extends AbstractCollection<V> {
            Values() {
            }

            public Iterator<V> iterator() {
                final Iterator it = AbstractFilteredMap.this.entrySet().iterator();
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
                return AbstractFilteredMap.this.entrySet().size();
            }

            public void clear() {
                AbstractFilteredMap.this.entrySet().clear();
            }

            public boolean isEmpty() {
                return AbstractFilteredMap.this.entrySet().isEmpty();
            }

            public boolean remove(Object obj) {
                Iterator<Map.Entry<K, V>> it = AbstractFilteredMap.this.unfiltered.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    if (Objects.equal(obj, next.getValue()) && AbstractFilteredMap.this.predicate.apply(next)) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            }

            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                Iterator<Map.Entry<K, V>> it = AbstractFilteredMap.this.unfiltered.entrySet().iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    if (collection.contains(next.getValue()) && AbstractFilteredMap.this.predicate.apply(next)) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            }

            public boolean retainAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                Iterator<Map.Entry<K, V>> it = AbstractFilteredMap.this.unfiltered.entrySet().iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    if (!collection.contains(next.getValue()) && AbstractFilteredMap.this.predicate.apply(next)) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            }

            public Object[] toArray() {
                return Lists.newArrayList(iterator()).toArray();
            }

            public <T> T[] toArray(T[] tArr) {
                return Lists.newArrayList(iterator()).toArray(tArr);
            }
        }
    }

    static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {
        Set<Map.Entry<K, V>> entrySet;
        Predicate<? super K> keyPredicate;
        Set<K> keySet;

        FilteredKeyMap(Map<K, V> map, Predicate<? super K> predicate, Predicate<Map.Entry<K, V>> predicate2) {
            super(map, predicate2);
            this.keyPredicate = predicate;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> filter = Sets.filter(this.unfiltered.entrySet(), this.predicate);
            this.entrySet = filter;
            return filter;
        }

        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            Set<K> filter = Sets.filter(this.unfiltered.keySet(), this.keyPredicate);
            this.keySet = filter;
            return filter;
        }

        public boolean containsKey(Object obj) {
            return this.unfiltered.containsKey(obj) && this.keyPredicate.apply(obj);
        }
    }

    static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {
        Set<Map.Entry<K, V>> entrySet;
        final Set<Map.Entry<K, V>> filteredEntrySet;
        Set<K> keySet;

        FilteredEntryMap(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
            super(map, predicate);
            this.filteredEntrySet = Sets.filter(map.entrySet(), this.predicate);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            EntrySet entrySet2 = new EntrySet();
            this.entrySet = entrySet2;
            return entrySet2;
        }

        class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            private EntrySet() {
            }

            /* access modifiers changed from: protected */
            public Set<Map.Entry<K, V>> delegate() {
                return FilteredEntryMap.this.filteredEntrySet;
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                final Iterator<Map.Entry<K, V>> it = FilteredEntryMap.this.filteredEntrySet.iterator();
                return new UnmodifiableIterator<Map.Entry<K, V>>() {
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public Map.Entry<K, V> next() {
                        final Map.Entry entry = (Map.Entry) it.next();
                        return new ForwardingMapEntry<K, V>() {
                            /* access modifiers changed from: protected */
                            public Map.Entry<K, V> delegate() {
                                return entry;
                            }

                            public V setValue(V v) {
                                Preconditions.checkArgument(FilteredEntryMap.this.apply(entry.getKey(), v));
                                return super.setValue(v);
                            }
                        };
                    }
                };
            }
        }

        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            KeySet keySet2 = new KeySet();
            this.keySet = keySet2;
            return keySet2;
        }

        class KeySet extends AbstractSet<K> {
            private KeySet() {
            }

            public Iterator<K> iterator() {
                final Iterator<Map.Entry<K, V>> it = FilteredEntryMap.this.filteredEntrySet.iterator();
                return new UnmodifiableIterator<K>() {
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public K next() {
                        return ((Map.Entry) it.next()).getKey();
                    }
                };
            }

            public int size() {
                return FilteredEntryMap.this.filteredEntrySet.size();
            }

            public void clear() {
                FilteredEntryMap.this.filteredEntrySet.clear();
            }

            public boolean contains(Object obj) {
                return FilteredEntryMap.this.containsKey(obj);
            }

            public boolean remove(Object obj) {
                if (!FilteredEntryMap.this.containsKey(obj)) {
                    return false;
                }
                FilteredEntryMap.this.unfiltered.remove(obj);
                return true;
            }

            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                boolean z = false;
                for (Object remove : collection) {
                    z |= remove(remove);
                }
                return z;
            }

            public boolean retainAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                Iterator<Map.Entry<K, V>> it = FilteredEntryMap.this.unfiltered.entrySet().iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    if (!collection.contains(next.getKey()) && FilteredEntryMap.this.predicate.apply(next)) {
                        it.remove();
                        z = true;
                    }
                }
                return z;
            }

            public Object[] toArray() {
                return Lists.newArrayList(iterator()).toArray();
            }

            public <T> T[] toArray(T[] tArr) {
                return Lists.newArrayList(iterator()).toArray(tArr);
            }
        }
    }

    static abstract class ImprovedAbstractMap<K, V> extends AbstractMap<K, V> {
        private Set<Map.Entry<K, V>> entrySet;
        private Set<K> keySet;
        private Collection<V> values;

        /* access modifiers changed from: protected */
        public abstract Set<Map.Entry<K, V>> createEntrySet();

        ImprovedAbstractMap() {
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> createEntrySet = createEntrySet();
            this.entrySet = createEntrySet;
            return createEntrySet;
        }

        public Set<K> keySet() {
            Set<K> set = this.keySet;
            if (set != null) {
                return set;
            }
            final Set keySet2 = super.keySet();
            C02441 r1 = new ForwardingSet<K>() {
                /* access modifiers changed from: protected */
                public Set<K> delegate() {
                    return keySet2;
                }

                public boolean isEmpty() {
                    return ImprovedAbstractMap.this.isEmpty();
                }

                public boolean remove(Object obj) {
                    if (!contains(obj)) {
                        return false;
                    }
                    ImprovedAbstractMap.this.remove(obj);
                    return true;
                }
            };
            this.keySet = r1;
            return r1;
        }

        public Collection<V> values() {
            Collection<V> collection = this.values;
            if (collection != null) {
                return collection;
            }
            final Collection values2 = super.values();
            C02452 r1 = new ForwardingCollection<V>() {
                /* access modifiers changed from: protected */
                public Collection<V> delegate() {
                    return values2;
                }

                public boolean isEmpty() {
                    return ImprovedAbstractMap.this.isEmpty();
                }
            };
            this.values = r1;
            return r1;
        }

        public boolean isEmpty() {
            return entrySet().isEmpty();
        }
    }

    static <V> V safeGet(Map<?, V> map, Object obj) {
        try {
            return map.get(obj);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    static boolean safeContainsKey(Map<?, ?> map, Object obj) {
        try {
            return map.containsKey(obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    static <K, V> Set<Map.Entry<K, V>> entrySetImpl(Map<K, V> map, Supplier<Iterator<Map.Entry<K, V>>> supplier) {
        return new EntrySetImpl(map, supplier);
    }

    static class EntrySetImpl<K, V> extends AbstractSet<Map.Entry<K, V>> {
        private final Supplier<Iterator<Map.Entry<K, V>>> entryIteratorSupplier;
        private final Map<K, V> map;

        /* JADX WARNING: type inference failed for: r2v0, types: [com.google.common.base.Supplier<java.util.Iterator<java.util.Map$Entry<K, V>>>, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        EntrySetImpl(java.util.Map<K, V> r1, com.google.common.base.Supplier<java.util.Iterator<java.util.Map.Entry<K, V>>> r2) {
            /*
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Map r1 = (java.util.Map) r1
                r0.map = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Supplier r1 = (com.google.common.base.Supplier) r1
                r0.entryIteratorSupplier = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Maps.EntrySetImpl.<init>(java.util.Map, com.google.common.base.Supplier):void");
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return this.entryIteratorSupplier.get();
        }

        public int size() {
            return this.map.size();
        }

        public void clear() {
            this.map.clear();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (this.map.containsKey(entry.getKey())) {
                return Objects.equal(this.map.get(entry.getKey()), entry.getValue());
            }
            return false;
        }

        public boolean isEmpty() {
            return this.map.isEmpty();
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            this.map.remove(((Map.Entry) obj).getKey());
            return true;
        }

        public int hashCode() {
            return this.map.hashCode();
        }
    }

    static <K, V> boolean containsEntryImpl(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.contains(unmodifiableEntry((Map.Entry) obj));
    }

    static <K, V> boolean removeEntryImpl(Collection<Map.Entry<K, V>> collection, Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return collection.remove(unmodifiableEntry((Map.Entry) obj));
    }

    static boolean equalsImpl(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static int hashCodeImpl(Map<?, ?> map) {
        return Sets.hashCodeImpl(map.entrySet());
    }

    static String toStringImpl(Map<?, ?> map) {
        StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(map.size());
        newStringBuilderForCollection.append('{');
        STANDARD_JOINER.appendTo(newStringBuilderForCollection, map);
        newStringBuilderForCollection.append('}');
        return newStringBuilderForCollection.toString();
    }

    static <K, V> void putAllImpl(Map<K, V> map, Map<? extends K, ? extends V> map2) {
        for (Map.Entry next : map2.entrySet()) {
            map.put(next.getKey(), next.getValue());
        }
    }

    static <K, V> Set<K> keySetImpl(Map<K, V> map) {
        return new AbstractMapWrapper(map).keySet();
    }

    static boolean containsKeyImpl(Map<?, ?> map, Object obj) {
        for (Map.Entry<?, ?> key : map.entrySet()) {
            if (Objects.equal(key.getKey(), obj)) {
                return true;
            }
        }
        return false;
    }

    static <K, V> Collection<V> valuesImpl(Map<K, V> map) {
        return new AbstractMapWrapper(map).values();
    }

    static boolean containsValueImpl(Map<?, ?> map, Object obj) {
        for (Map.Entry<?, ?> value : map.entrySet()) {
            if (Objects.equal(value.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    static final class AbstractMapWrapper<K, V> extends ImprovedAbstractMap<K, V> {
        private final Map<K, V> map;

        AbstractMapWrapper(Map<K, V> map2) {
            this.map = (Map) Preconditions.checkNotNull(map2);
        }

        public final void clear() {
            this.map.clear();
        }

        public final boolean containsKey(Object obj) {
            return this.map.containsKey(obj);
        }

        public final V remove(Object obj) {
            return this.map.remove(obj);
        }

        public final boolean containsValue(Object obj) {
            return this.map.containsValue(obj);
        }

        /* access modifiers changed from: protected */
        public final Set<Map.Entry<K, V>> createEntrySet() {
            return this.map.entrySet();
        }

        public final boolean isEmpty() {
            return this.map.isEmpty();
        }

        public final int size() {
            return this.map.size();
        }
    }
}
