package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.SortedLists;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

public class ImmutableSortedMap<K, V> extends ImmutableSortedMapFauxverideShim<K, V> implements SortedMap<K, V> {
    private static final ImmutableSortedMap<Comparable, Object> NATURAL_EMPTY_MAP = new ImmutableSortedMap<>(ImmutableList.m3621of(), NATURAL_ORDER);
    private static final Comparator<Comparable> NATURAL_ORDER = Ordering.natural();
    private static final long serialVersionUID = 0;
    private final transient Comparator<? super K> comparator;
    final transient ImmutableList<Map.Entry<K, V>> entries;
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;
    final transient Function<Map.Entry<K, V>, K> keyFunction = new Function<Map.Entry<K, V>, K>() {
        public K apply(Map.Entry<K, V> entry) {
            return entry.getKey();
        }
    };
    private transient ImmutableSortedSet<K> keySet;
    private transient ImmutableCollection<V> values;

    /* renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m3661of() {
        return NATURAL_EMPTY_MAP;
    }

    private static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator2) {
        if (NATURAL_ORDER.equals(comparator2)) {
            return NATURAL_EMPTY_MAP;
        }
        return new ImmutableSortedMap<>(ImmutableList.m3621of(), comparator2);
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m3662of(K k, V v) {
        return new ImmutableSortedMap<>(ImmutableList.m3622of(entryOf(k, v)), Ordering.natural());
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m3663of(K k, V v, K k2, V v2) {
        return new Builder(Ordering.natural()).put((Object) k, (Object) v).put((Object) k2, (Object) v2).build();
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m3664of(K k, V v, K k2, V v2, K k3, V v3) {
        return new Builder(Ordering.natural()).put((Object) k, (Object) v).put((Object) k2, (Object) v2).put((Object) k3, (Object) v3).build();
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m3665of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        return new Builder(Ordering.natural()).put((Object) k, (Object) v).put((Object) k2, (Object) v2).put((Object) k3, (Object) v3).put((Object) k4, (Object) v4).build();
    }

    /* renamed from: of */
    public static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> m3666of(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return new Builder(Ordering.natural()).put((Object) k, (Object) v).put((Object) k2, (Object) v2).put((Object) k3, (Object) v3).put((Object) k4, (Object) v4).put((Object) k5, (Object) v5).build();
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, Ordering.natural());
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator2) {
        return copyOfInternal(map, (Comparator) Preconditions.checkNotNull(comparator2));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map, java.util.SortedMap<K, ? extends V>, java.util.SortedMap] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfSorted(java.util.SortedMap<K, ? extends V> r1) {
        /*
            java.util.Comparator r0 = r1.comparator()
            if (r0 != 0) goto L_0x0008
            java.util.Comparator<java.lang.Comparable> r0 = NATURAL_ORDER
        L_0x0008:
            com.google.common.collect.ImmutableSortedMap r1 = copyOfInternal(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.copyOfSorted(java.util.SortedMap):com.google.common.collect.ImmutableSortedMap");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[LOOP:0: B:16:0x0036->B:18:0x0039, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <K, V> com.google.common.collect.ImmutableSortedMap<K, V> copyOfInternal(java.util.Map<? extends K, ? extends V> r4, java.util.Comparator<? super K> r5) {
        /*
            boolean r0 = r4 instanceof java.util.SortedMap
            r1 = 0
            if (r0 == 0) goto L_0x0019
            r0 = r4
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            java.util.Comparator r0 = r0.comparator()
            if (r0 != 0) goto L_0x0014
            java.util.Comparator<java.lang.Comparable> r0 = NATURAL_ORDER
            if (r5 != r0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0014:
            boolean r0 = r5.equals(r0)
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x002a
            boolean r2 = r4 instanceof com.google.common.collect.ImmutableSortedMap
            if (r2 == 0) goto L_0x002a
            r2 = r4
            com.google.common.collect.ImmutableSortedMap r2 = (com.google.common.collect.ImmutableSortedMap) r2
            boolean r3 = r2.isPartialView()
            if (r3 != 0) goto L_0x002a
            return r2
        L_0x002a:
            java.util.Set r4 = r4.entrySet()
            java.util.Map$Entry[] r2 = new java.util.Map.Entry[r1]
            java.lang.Object[] r4 = r4.toArray(r2)
            java.util.Map$Entry[] r4 = (java.util.Map.Entry[]) r4
        L_0x0036:
            int r2 = r4.length
            if (r1 >= r2) goto L_0x004c
            r2 = r4[r1]
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            java.util.Map$Entry r2 = entryOf(r3, r2)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L_0x0036
        L_0x004c:
            java.util.List r4 = java.util.Arrays.asList(r4)
            if (r0 != 0) goto L_0x0058
            sortEntries(r4, r5)
            validateEntries(r4, r5)
        L_0x0058:
            com.google.common.collect.ImmutableSortedMap r0 = new com.google.common.collect.ImmutableSortedMap
            com.google.common.collect.ImmutableList r4 = com.google.common.collect.ImmutableList.copyOf(r4)
            r0.<init>(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.copyOfInternal(java.util.Map, java.util.Comparator):com.google.common.collect.ImmutableSortedMap");
    }

    /* access modifiers changed from: private */
    public static <K, V> void sortEntries(List<Map.Entry<K, V>> list, final Comparator<? super K> comparator2) {
        Collections.sort(list, new Comparator<Map.Entry<K, V>>() {
            public final int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
                return comparator2.compare(entry.getKey(), entry2.getKey());
            }
        });
    }

    /* access modifiers changed from: private */
    public static <K, V> void validateEntries(List<Map.Entry<K, V>> list, Comparator<? super K> comparator2) {
        int i = 1;
        while (i < list.size()) {
            int i2 = i - 1;
            if (comparator2.compare(list.get(i2).getKey(), list.get(i).getKey()) != 0) {
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Duplicate keys in mappings ");
                sb.append(list.get(i2));
                sb.append(" and ");
                sb.append(list.get(i));
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public static <K extends Comparable<K>, V> Builder<K, V> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    public static <K, V> Builder<K, V> orderedBy(Comparator<K> comparator2) {
        return new Builder<>(comparator2);
    }

    public static <K extends Comparable<K>, V> Builder<K, V> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        private final Comparator<? super K> comparator;

        public Builder(Comparator<? super K> comparator2) {
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator2);
        }

        public Builder<K, V> put(K k, V v) {
            this.entries.add(ImmutableMap.entryOf(k, v));
            return this;
        }

        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry next : map.entrySet()) {
                put(next.getKey(), next.getValue());
            }
            return this;
        }

        public ImmutableSortedMap<K, V> build() {
            ImmutableSortedMap.sortEntries(this.entries, this.comparator);
            ImmutableSortedMap.validateEntries(this.entries, this.comparator);
            return new ImmutableSortedMap<>(ImmutableList.copyOf(this.entries), this.comparator);
        }
    }

    ImmutableSortedMap(ImmutableList<Map.Entry<K, V>> immutableList, Comparator<? super K> comparator2) {
        this.entries = immutableList;
        this.comparator = comparator2;
    }

    public int size() {
        return this.entries.size();
    }

    /* access modifiers changed from: package-private */
    public Comparator<Object> unsafeComparator() {
        return this.comparator;
    }

    public V get(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            int binarySearch = SortedLists.binarySearch(Lists.transform(this.entries, this.keyFunction), obj, unsafeComparator(), SortedLists.Relation.EQUAL, false);
            if (binarySearch >= 0) {
                return ((Map.Entry) this.entries.get(binarySearch)).getValue();
            }
            return null;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return Iterators.contains(valueIterator(), obj);
    }

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return this.entries.isPartialView();
    }

    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> createEntrySet = createEntrySet();
        this.entrySet = createEntrySet;
        return createEntrySet;
    }

    private ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? ImmutableSet.m89of() : new EntrySet(this);
    }

    static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        final transient ImmutableSortedMap<K, V> map;

        EntrySet(ImmutableSortedMap<K, V> immutableSortedMap) {
            this.map = immutableSortedMap;
        }

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return this.map.isPartialView();
        }

        public int size() {
            return this.map.size();
        }

        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return this.map.entries.iterator();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            V v = this.map.get(entry.getKey());
            if (v == null || !v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new EntrySetSerializedForm(this.map);
        }
    }

    static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableSortedMap<K, V> map;

        EntrySetSerializedForm(ImmutableSortedMap<K, V> immutableSortedMap) {
            this.map = immutableSortedMap;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.map.entrySet();
        }
    }

    public ImmutableSortedSet<K> keySet() {
        ImmutableSortedSet<K> immutableSortedSet = this.keySet;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    private ImmutableSortedSet<K> createKeySet() {
        if (isEmpty()) {
            return ImmutableSortedSet.emptySet(this.comparator);
        }
        return new RegularImmutableSortedSet(new TransformedImmutableList<Map.Entry<K, V>, K>(this.entries) {
            /* access modifiers changed from: package-private */
            public K transform(Map.Entry<K, V> entry) {
                return entry.getKey();
            }
        }, this.comparator);
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

    /* access modifiers changed from: package-private */
    public UnmodifiableIterator<V> valueIterator() {
        final UnmodifiableIterator<Map.Entry<K, V>> it = this.entries.iterator();
        return new UnmodifiableIterator<V>() {
            public boolean hasNext() {
                return it.hasNext();
            }

            public V next() {
                return ((Map.Entry) it.next()).getValue();
            }
        };
    }

    static class Values<V> extends ImmutableCollection<V> {
        private final ImmutableSortedMap<?, V> map;

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return true;
        }

        Values(ImmutableSortedMap<?, V> immutableSortedMap) {
            this.map = immutableSortedMap;
        }

        public int size() {
            return this.map.size();
        }

        public UnmodifiableIterator<V> iterator() {
            return this.map.valueIterator();
        }

        public boolean contains(Object obj) {
            return this.map.containsValue(obj);
        }

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return new ValuesSerializedForm(this.map);
        }
    }

    static class ValuesSerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableSortedMap<?, V> map;

        ValuesSerializedForm(ImmutableSortedMap<?, V> immutableSortedMap) {
            this.map = immutableSortedMap;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.map.values();
        }
    }

    public Comparator<? super K> comparator() {
        return this.comparator;
    }

    public K firstKey() {
        if (!isEmpty()) {
            return ((Map.Entry) this.entries.get(0)).getKey();
        }
        throw new NoSuchElementException();
    }

    public K lastKey() {
        if (!isEmpty()) {
            return ((Map.Entry) this.entries.get(size() - 1)).getKey();
        }
        throw new NoSuchElementException();
    }

    public ImmutableSortedMap<K, V> headMap(K k) {
        return createSubmap(0, findSubmapIndex(Preconditions.checkNotNull(k)));
    }

    public ImmutableSortedMap<K, V> subMap(K k, K k2) {
        Preconditions.checkNotNull(k);
        Preconditions.checkNotNull(k2);
        Preconditions.checkArgument(this.comparator.compare(k, k2) <= 0);
        return createSubmap(findSubmapIndex(k), findSubmapIndex(k2));
    }

    public ImmutableSortedMap<K, V> tailMap(K k) {
        return createSubmap(findSubmapIndex(Preconditions.checkNotNull(k)), size());
    }

    private int findSubmapIndex(K k) {
        return SortedLists.binarySearch(Lists.transform(this.entries, this.keyFunction), k, this.comparator, SortedLists.Relation.CEILING, false);
    }

    private ImmutableSortedMap<K, V> createSubmap(int i, int i2) {
        if (i < i2) {
            return new ImmutableSortedMap<>(this.entries.subList(i, i2), this.comparator);
        }
        return emptyMap(this.comparator);
    }

    static class SerializedForm extends ImmutableMap.SerializedForm {
        private static final long serialVersionUID = 0;
        private final Comparator<Object> comparator;

        SerializedForm(ImmutableSortedMap<?, ?> immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return createMap(new Builder(this.comparator));
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
