package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class SortedMaps {
    private SortedMaps() {
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, final Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return transformEntries(sortedMap, new Maps.EntryTransformer<K, V1, V2>() {
            public final V2 transformEntry(K k, V1 v1) {
                return function.apply(v1);
            }
        });
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesSortedMap(sortedMap, entryTransformer);
    }

    static class TransformedEntriesSortedMap<K, V1, V2> extends Maps.TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        /* access modifiers changed from: protected */
        public SortedMap<K, V1> fromMap() {
            return (SortedMap) this.fromMap;
        }

        TransformedEntriesSortedMap(SortedMap<K, V1> sortedMap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        public Comparator<? super K> comparator() {
            return fromMap().comparator();
        }

        public K firstKey() {
            return fromMap().firstKey();
        }

        public SortedMap<K, V2> headMap(K k) {
            return SortedMaps.transformEntries(fromMap().headMap(k), this.transformer);
        }

        public K lastKey() {
            return fromMap().lastKey();
        }

        public SortedMap<K, V2> subMap(K k, K k2) {
            return SortedMaps.transformEntries(fromMap().subMap(k, k2), this.transformer);
        }

        public SortedMap<K, V2> tailMap(K k) {
            return SortedMaps.transformEntries(fromMap().tailMap(k), this.transformer);
        }
    }

    public static <K, V> SortedMapDifference<K, V> difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        Comparator<? super E> orNaturalOrder = orNaturalOrder(sortedMap.comparator());
        TreeMap<K, V> newTreeMap = Maps.newTreeMap(orNaturalOrder);
        TreeMap<K, V> newTreeMap2 = Maps.newTreeMap(orNaturalOrder);
        newTreeMap2.putAll(map);
        TreeMap<K, V> newTreeMap3 = Maps.newTreeMap(orNaturalOrder);
        TreeMap<K, V> newTreeMap4 = Maps.newTreeMap(orNaturalOrder);
        boolean z = false;
        boolean z2 = true;
        for (Map.Entry next : sortedMap.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (map.containsKey(key)) {
                Object remove = newTreeMap2.remove(key);
                if (Objects.equal(value, remove)) {
                    newTreeMap3.put(key, value);
                } else {
                    newTreeMap4.put(key, new Maps.ValueDifferenceImpl(value, remove));
                }
            } else {
                newTreeMap.put(key, value);
            }
            z2 = false;
        }
        if (z2 && newTreeMap2.isEmpty()) {
            z = true;
        }
        return sortedMapDifference(z, newTreeMap, newTreeMap2, newTreeMap3, newTreeMap4);
    }

    private static <K, V> SortedMapDifference<K, V> sortedMapDifference(boolean z, SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, MapDifference.ValueDifference<V>> sortedMap4) {
        return new SortedMapDifferenceImpl(z, Collections.unmodifiableSortedMap(sortedMap), Collections.unmodifiableSortedMap(sortedMap2), Collections.unmodifiableSortedMap(sortedMap3), Collections.unmodifiableSortedMap(sortedMap4));
    }

    static class SortedMapDifferenceImpl<K, V> extends Maps.MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        SortedMapDifferenceImpl(boolean z, SortedMap<K, V> sortedMap, SortedMap<K, V> sortedMap2, SortedMap<K, V> sortedMap3, SortedMap<K, MapDifference.ValueDifference<V>> sortedMap4) {
            super(z, sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        public SortedMap<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return (SortedMap) super.entriesDiffering();
        }

        public SortedMap<K, V> entriesInCommon() {
            return (SortedMap) super.entriesInCommon();
        }

        public SortedMap<K, V> entriesOnlyOnLeft() {
            return (SortedMap) super.entriesOnlyOnLeft();
        }

        public SortedMap<K, V> entriesOnlyOnRight() {
            return (SortedMap) super.entriesOnlyOnRight();
        }
    }

    static <E> Comparator<? super E> orNaturalOrder(Comparator<? super E> comparator) {
        return comparator != null ? comparator : Ordering.natural();
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, final Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        return filterEntries(sortedMap, new Predicate<Map.Entry<K, V>>() {
            public final boolean apply(Map.Entry<K, V> entry) {
                return predicate.apply(entry.getKey());
            }
        });
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, final Predicate<? super V> predicate) {
        Preconditions.checkNotNull(predicate);
        return filterEntries(sortedMap, new Predicate<Map.Entry<K, V>>() {
            public final boolean apply(Map.Entry<K, V> entry) {
                return predicate.apply(entry.getValue());
            }
        });
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        return sortedMap instanceof FilteredSortedMap ? filterFiltered((FilteredSortedMap) sortedMap, predicate) : new FilteredSortedMap((SortedMap) Preconditions.checkNotNull(sortedMap), predicate);
    }

    private static <K, V> SortedMap<K, V> filterFiltered(FilteredSortedMap<K, V> filteredSortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
        return new FilteredSortedMap(filteredSortedMap.sortedMap(), Predicates.and(filteredSortedMap.predicate, predicate));
    }

    static class FilteredSortedMap<K, V> extends Maps.FilteredEntryMap<K, V> implements SortedMap<K, V> {
        FilteredSortedMap(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
            super(sortedMap, predicate);
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, V> sortedMap() {
            return (SortedMap) this.unfiltered;
        }

        public Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        public K firstKey() {
            return keySet().iterator().next();
        }

        public K lastKey() {
            SortedMap sortedMap = sortedMap();
            while (true) {
                K lastKey = sortedMap.lastKey();
                if (apply(lastKey, this.unfiltered.get(lastKey))) {
                    return lastKey;
                }
                sortedMap = sortedMap().headMap(lastKey);
            }
        }

        public SortedMap<K, V> headMap(K k) {
            return new FilteredSortedMap(sortedMap().headMap(k), this.predicate);
        }

        public SortedMap<K, V> subMap(K k, K k2) {
            return new FilteredSortedMap(sortedMap().subMap(k, k2), this.predicate);
        }

        public SortedMap<K, V> tailMap(K k) {
            return new FilteredSortedMap(sortedMap().tailMap(k), this.predicate);
        }
    }
}
