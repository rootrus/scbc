package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final long serialVersionUID = 0;
    /* access modifiers changed from: private */
    public final transient LinkedEntry<K, V>[] entries;
    private transient ImmutableSet<Map.Entry<K, V>> entrySet;
    private transient ImmutableSet<K> keySet;
    /* access modifiers changed from: private */
    public final transient int keySetHashCode;
    private final transient int mask;
    private final transient LinkedEntry<K, V>[] table;
    private transient ImmutableCollection<V> values;

    interface LinkedEntry<K, V> extends Map.Entry<K, V> {
        LinkedEntry<K, V> next();
    }

    public final boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    RegularImmutableMap(Map.Entry<?, ?>... entryArr) {
        int length = entryArr.length;
        this.entries = createEntryArray(length);
        int chooseTableSize = chooseTableSize(length);
        this.table = createEntryArray(chooseTableSize);
        this.mask = chooseTableSize - 1;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Map.Entry<?, ?> entry = entryArr[i2];
            Object key = entry.getKey();
            int hashCode = key.hashCode();
            i += hashCode;
            int smear = Hashing.smear(hashCode) & this.mask;
            LinkedEntry<K, V> linkedEntry = this.table[smear];
            LinkedEntry<K, V> newLinkedEntry = newLinkedEntry(key, entry.getValue(), linkedEntry);
            this.table[smear] = newLinkedEntry;
            this.entries[i2] = newLinkedEntry;
            while (linkedEntry != null) {
                Preconditions.checkArgument(!key.equals(linkedEntry.getKey()), "duplicate key: %s", key);
                linkedEntry = linkedEntry.next();
            }
        }
        this.keySetHashCode = i;
    }

    private static int chooseTableSize(int i) {
        int highestOneBit = Integer.highestOneBit(i) << 1;
        Preconditions.checkArgument(highestOneBit > 0, "table too large: %s", Integer.valueOf(i));
        return highestOneBit;
    }

    private LinkedEntry<K, V>[] createEntryArray(int i) {
        return new LinkedEntry[i];
    }

    private static <K, V> LinkedEntry<K, V> newLinkedEntry(K k, V v, LinkedEntry<K, V> linkedEntry) {
        return linkedEntry == null ? new TerminalEntry(k, v) : new NonTerminalEntry(k, v, linkedEntry);
    }

    static final class NonTerminalEntry<K, V> extends ImmutableEntry<K, V> implements LinkedEntry<K, V> {
        final LinkedEntry<K, V> next;

        NonTerminalEntry(K k, V v, LinkedEntry<K, V> linkedEntry) {
            super(k, v);
            this.next = linkedEntry;
        }

        public final LinkedEntry<K, V> next() {
            return this.next;
        }
    }

    static final class TerminalEntry<K, V> extends ImmutableEntry<K, V> implements LinkedEntry<K, V> {
        public final LinkedEntry<K, V> next() {
            return null;
        }

        TerminalEntry(K k, V v) {
            super(k, v);
        }
    }

    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        for (LinkedEntry<K, V> linkedEntry = this.table[Hashing.smear(obj.hashCode()) & this.mask]; linkedEntry != null; linkedEntry = linkedEntry.next()) {
            if (obj.equals(linkedEntry.getKey())) {
                return linkedEntry.getValue();
            }
        }
        return null;
    }

    public final int size() {
        return this.entries.length;
    }

    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        for (LinkedEntry<K, V> value : this.entries) {
            if (value.getValue().equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public final ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet2 = new EntrySet(this);
        this.entrySet = entrySet2;
        return entrySet2;
    }

    static class EntrySet<K, V> extends ImmutableSet.ArrayImmutableSet<Map.Entry<K, V>> {
        final transient RegularImmutableMap<K, V> map;

        EntrySet(RegularImmutableMap<K, V> regularImmutableMap) {
            super(regularImmutableMap.entries);
            this.map = regularImmutableMap;
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
    }

    public final ImmutableSet<K> keySet() {
        ImmutableSet<K> immutableSet = this.keySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        KeySet keySet2 = new KeySet(this);
        this.keySet = keySet2;
        return keySet2;
    }

    static class KeySet<K, V> extends ImmutableSet.TransformedImmutableSet<Map.Entry<K, V>, K> {
        final RegularImmutableMap<K, V> map;

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return true;
        }

        KeySet(RegularImmutableMap<K, V> regularImmutableMap) {
            super(regularImmutableMap.entries, regularImmutableMap.keySetHashCode);
            this.map = regularImmutableMap;
        }

        /* access modifiers changed from: package-private */
        public K transform(Map.Entry<K, V> entry) {
            return entry.getKey();
        }

        public boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }
    }

    public final ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.values;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        Values values2 = new Values(this);
        this.values = values2;
        return values2;
    }

    static class Values<V> extends ImmutableCollection<V> {
        final RegularImmutableMap<?, V> map;

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return true;
        }

        Values(RegularImmutableMap<?, V> regularImmutableMap) {
            this.map = regularImmutableMap;
        }

        public int size() {
            return this.map.entries.length;
        }

        public UnmodifiableIterator<V> iterator() {
            return new AbstractIndexedListIterator<V>(this.map.entries.length) {
                /* access modifiers changed from: protected */
                public V get(int i) {
                    return Values.this.map.entries[i].getValue();
                }
            };
        }

        public boolean contains(Object obj) {
            return this.map.containsValue(obj);
        }
    }

    public final String toString() {
        StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(size());
        newStringBuilderForCollection.append('{');
        Collections2.STANDARD_JOINER.appendTo(newStringBuilderForCollection, (Object[]) this.entries);
        newStringBuilderForCollection.append('}');
        return newStringBuilderForCollection.toString();
    }
}
