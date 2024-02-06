package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class StandardTable<R, C, V> implements Table<R, C, V>, Serializable {
    private static final long serialVersionUID = 0;
    final Map<R, Map<C, V>> backingMap;
    private transient StandardTable<R, C, V>.CellSet cellSet;
    private transient Set<C> columnKeySet;
    private transient StandardTable<R, C, V>.ColumnMap columnMap;
    final Supplier<? extends Map<C, V>> factory;
    private transient StandardTable<R, C, V>.RowKeySet rowKeySet;
    private transient StandardTable<R, C, V>.RowMap rowMap;
    private transient StandardTable<R, C, V>.Values values;

    StandardTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
        this.backingMap = map;
        this.factory = supplier;
    }

    public boolean contains(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.safeGet(this.backingMap, obj)) == null || !Maps.safeContainsKey(map, obj2)) {
            return false;
        }
        return true;
    }

    public boolean containsColumn(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map<C, V> safeContainsKey : this.backingMap.values()) {
            if (Maps.safeContainsKey(safeContainsKey, obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsRow(Object obj) {
        return obj != null && Maps.safeContainsKey(this.backingMap, obj);
    }

    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        for (Map<C, V> containsValue : this.backingMap.values()) {
            if (containsValue.containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public V get(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.safeGet(this.backingMap, obj)) == null) {
            return null;
        }
        return Maps.safeGet(map, obj2);
    }

    public boolean isEmpty() {
        return this.backingMap.isEmpty();
    }

    public int size() {
        int i = 0;
        for (Map<C, V> size : this.backingMap.values()) {
            i += size.size();
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Table) {
            return cellSet().equals(((Table) obj).cellSet());
        }
        return false;
    }

    public int hashCode() {
        return cellSet().hashCode();
    }

    public String toString() {
        return rowMap().toString();
    }

    public void clear() {
        this.backingMap.clear();
    }

    private Map<C, V> getOrCreate(R r) {
        Map<C, V> map = this.backingMap.get(r);
        if (map != null) {
            return map;
        }
        Map<C, V> map2 = (Map) this.factory.get();
        this.backingMap.put(r, map2);
        return map2;
    }

    public V put(R r, C c, V v) {
        Preconditions.checkNotNull(r);
        Preconditions.checkNotNull(c);
        Preconditions.checkNotNull(v);
        return getOrCreate(r).put(c, v);
    }

    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        for (Table.Cell next : table.cellSet()) {
            put(next.getRowKey(), next.getColumnKey(), next.getValue());
        }
    }

    public V remove(Object obj, Object obj2) {
        Map map;
        if (obj == null || obj2 == null || (map = (Map) Maps.safeGet(this.backingMap, obj)) == null) {
            return null;
        }
        V remove = map.remove(obj2);
        if (map.isEmpty()) {
            this.backingMap.remove(obj);
        }
        return remove;
    }

    /* access modifiers changed from: private */
    public Map<R, V> removeColumn(Object obj) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<R, Map<C, V>>> it = this.backingMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            Object remove = ((Map) next.getValue()).remove(obj);
            if (remove != null) {
                linkedHashMap.put(next.getKey(), remove);
                if (((Map) next.getValue()).isEmpty()) {
                    it.remove();
                }
            }
        }
        return linkedHashMap;
    }

    /* access modifiers changed from: private */
    public boolean containsMapping(Object obj, Object obj2, Object obj3) {
        return obj3 != null && obj3.equals(get(obj, obj2));
    }

    /* access modifiers changed from: private */
    public boolean removeMapping(Object obj, Object obj2, Object obj3) {
        if (!containsMapping(obj, obj2, obj3)) {
            return false;
        }
        remove(obj, obj2);
        return true;
    }

    abstract class TableCollection<T> extends AbstractCollection<T> {
        private TableCollection() {
        }

        public boolean isEmpty() {
            return StandardTable.this.backingMap.isEmpty();
        }

        public void clear() {
            StandardTable.this.backingMap.clear();
        }
    }

    abstract class TableSet<T> extends AbstractSet<T> {
        private TableSet() {
        }

        public boolean isEmpty() {
            return StandardTable.this.backingMap.isEmpty();
        }

        public void clear() {
            StandardTable.this.backingMap.clear();
        }
    }

    public Set<Table.Cell<R, C, V>> cellSet() {
        StandardTable<R, C, V>.CellSet cellSet2 = this.cellSet;
        if (cellSet2 != null) {
            return cellSet2;
        }
        StandardTable<R, C, V>.CellSet cellSet3 = new CellSet();
        this.cellSet = cellSet3;
        return cellSet3;
    }

    class CellSet extends StandardTable<R, C, V>.TableSet<Table.Cell<R, C, V>> {
        private CellSet() {
            super();
        }

        public Iterator<Table.Cell<R, C, V>> iterator() {
            return new CellIterator();
        }

        public int size() {
            return StandardTable.this.size();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            return StandardTable.this.containsMapping(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Table.Cell)) {
                return false;
            }
            Table.Cell cell = (Table.Cell) obj;
            return StandardTable.this.removeMapping(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
        }
    }

    class CellIterator implements Iterator<Table.Cell<R, C, V>> {
        Iterator<Map.Entry<C, V>> columnIterator;
        Map.Entry<R, Map<C, V>> rowEntry;
        final Iterator<Map.Entry<R, Map<C, V>>> rowIterator;

        private CellIterator() {
            this.rowIterator = StandardTable.this.backingMap.entrySet().iterator();
            this.columnIterator = Iterators.emptyModifiableIterator();
        }

        public boolean hasNext() {
            return this.rowIterator.hasNext() || this.columnIterator.hasNext();
        }

        public Table.Cell<R, C, V> next() {
            if (!this.columnIterator.hasNext()) {
                Map.Entry<R, Map<C, V>> next = this.rowIterator.next();
                this.rowEntry = next;
                this.columnIterator = next.getValue().entrySet().iterator();
            }
            Map.Entry next2 = this.columnIterator.next();
            return Tables.immutableCell(this.rowEntry.getKey(), next2.getKey(), next2.getValue());
        }

        public void remove() {
            this.columnIterator.remove();
            if (this.rowEntry.getValue().isEmpty()) {
                this.rowIterator.remove();
            }
        }
    }

    public Map<C, V> row(R r) {
        return new Row(r);
    }

    class Row extends Maps.ImprovedAbstractMap<C, V> {
        final R rowKey;

        Row(R r) {
            this.rowKey = Preconditions.checkNotNull(r);
        }

        /* access modifiers changed from: protected */
        public Set<Map.Entry<C, V>> createEntrySet() {
            return new RowEntrySet();
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.contains(this.rowKey, obj);
        }

        public V get(Object obj) {
            return StandardTable.this.get(this.rowKey, obj);
        }

        public V put(C c, V v) {
            return StandardTable.this.put(this.rowKey, c, v);
        }

        public V remove(Object obj) {
            return StandardTable.this.remove(this.rowKey, obj);
        }

        class RowEntrySet extends AbstractSet<Map.Entry<C, V>> {
            private RowEntrySet() {
            }

            public void clear() {
                StandardTable.this.backingMap.remove(Row.this.rowKey);
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.containsMapping(Row.this.rowKey, entry.getKey(), entry.getValue());
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.removeMapping(Row.this.rowKey, entry.getKey(), entry.getValue());
            }

            public int size() {
                Map map = StandardTable.this.backingMap.get(Row.this.rowKey);
                if (map == null) {
                    return 0;
                }
                return map.size();
            }

            public Iterator<Map.Entry<C, V>> iterator() {
                final Map map = StandardTable.this.backingMap.get(Row.this.rowKey);
                if (map == null) {
                    return Iterators.emptyModifiableIterator();
                }
                final Iterator it = map.entrySet().iterator();
                return new Iterator<Map.Entry<C, V>>() {
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public Map.Entry<C, V> next() {
                        final Map.Entry entry = (Map.Entry) it.next();
                        return new ForwardingMapEntry<C, V>() {
                            /* access modifiers changed from: protected */
                            public Map.Entry<C, V> delegate() {
                                return entry;
                            }

                            public V setValue(V v) {
                                return super.setValue(Preconditions.checkNotNull(v));
                            }
                        };
                    }

                    public void remove() {
                        it.remove();
                        if (map.isEmpty()) {
                            StandardTable.this.backingMap.remove(Row.this.rowKey);
                        }
                    }
                };
            }
        }
    }

    public Map<R, V> column(C c) {
        return new Column(c);
    }

    class Column extends Maps.ImprovedAbstractMap<R, V> {
        final C columnKey;
        StandardTable<R, C, V>.Column.Values columnValues;
        StandardTable<R, C, V>.Column.KeySet keySet;

        Column(C c) {
            this.columnKey = Preconditions.checkNotNull(c);
        }

        public V put(R r, V v) {
            return StandardTable.this.put(r, this.columnKey, v);
        }

        public V get(Object obj) {
            return StandardTable.this.get(obj, this.columnKey);
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.contains(obj, this.columnKey);
        }

        public V remove(Object obj) {
            return StandardTable.this.remove(obj, this.columnKey);
        }

        public Set<Map.Entry<R, V>> createEntrySet() {
            return new EntrySet();
        }

        public Collection<V> values() {
            StandardTable<R, C, V>.Column.Values values = this.columnValues;
            if (values != null) {
                return values;
            }
            Values values2 = new Values();
            this.columnValues = values2;
            return values2;
        }

        /* access modifiers changed from: package-private */
        public boolean removePredicate(Predicate<? super Map.Entry<R, V>> predicate) {
            Iterator<Map.Entry<R, Map<C, V>>> it = StandardTable.this.backingMap.entrySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map.Entry next = it.next();
                Map map = (Map) next.getValue();
                Object obj = map.get(this.columnKey);
                if (obj != null && predicate.apply(new ImmutableEntry(next.getKey(), obj))) {
                    map.remove(this.columnKey);
                    if (map.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        class EntrySet extends AbstractSet<Map.Entry<R, V>> {
            EntrySet() {
            }

            public Iterator<Map.Entry<R, V>> iterator() {
                return new EntrySetIterator();
            }

            public int size() {
                int i = 0;
                for (Map<C, V> containsKey : StandardTable.this.backingMap.values()) {
                    if (containsKey.containsKey(Column.this.columnKey)) {
                        i++;
                    }
                }
                return i;
            }

            public boolean isEmpty() {
                return !StandardTable.this.containsColumn(Column.this.columnKey);
            }

            public void clear() {
                Column.this.removePredicate(Predicates.alwaysTrue());
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.containsMapping(entry.getKey(), Column.this.columnKey, entry.getValue());
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return StandardTable.this.removeMapping(entry.getKey(), Column.this.columnKey, entry.getValue());
            }

            public boolean removeAll(Collection<?> collection) {
                boolean z = false;
                for (Object remove : collection) {
                    z |= remove(remove);
                }
                return z;
            }

            public boolean retainAll(Collection<?> collection) {
                return Column.this.removePredicate(Predicates.not(Predicates.m3607in(collection)));
            }
        }

        class EntrySetIterator extends AbstractIterator<Map.Entry<R, V>> {
            final Iterator<Map.Entry<R, Map<C, V>>> iterator = StandardTable.this.backingMap.entrySet().iterator();

            EntrySetIterator() {
            }

            /* access modifiers changed from: protected */
            public Map.Entry<R, V> computeNext() {
                while (this.iterator.hasNext()) {
                    final Map.Entry next = this.iterator.next();
                    if (((Map) next.getValue()).containsKey(Column.this.columnKey)) {
                        return new AbstractMapEntry<R, V>() {
                            public R getKey() {
                                return next.getKey();
                            }

                            public V getValue() {
                                return ((Map) next.getValue()).get(Column.this.columnKey);
                            }

                            public V setValue(V v) {
                                return ((Map) next.getValue()).put(Column.this.columnKey, Preconditions.checkNotNull(v));
                            }
                        };
                    }
                }
                return (Map.Entry) endOfData();
            }
        }

        public Set<R> keySet() {
            StandardTable<R, C, V>.Column.KeySet keySet2 = this.keySet;
            if (keySet2 != null) {
                return keySet2;
            }
            KeySet keySet3 = new KeySet();
            this.keySet = keySet3;
            return keySet3;
        }

        class KeySet extends AbstractSet<R> {
            KeySet() {
            }

            public Iterator<R> iterator() {
                return StandardTable.keyIteratorImpl(Column.this);
            }

            public int size() {
                return Column.this.entrySet().size();
            }

            public boolean isEmpty() {
                return !StandardTable.this.containsColumn(Column.this.columnKey);
            }

            public boolean contains(Object obj) {
                return StandardTable.this.contains(obj, Column.this.columnKey);
            }

            public boolean remove(Object obj) {
                return StandardTable.this.remove(obj, Column.this.columnKey) != null;
            }

            public void clear() {
                Column.this.entrySet().clear();
            }

            public boolean removeAll(Collection<?> collection) {
                boolean z = false;
                for (Object remove : collection) {
                    z |= remove(remove);
                }
                return z;
            }

            public boolean retainAll(final Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                return Column.this.removePredicate(new Predicate<Map.Entry<R, V>>() {
                    public boolean apply(Map.Entry<R, V> entry) {
                        return !collection.contains(entry.getKey());
                    }
                });
            }
        }

        class Values extends AbstractCollection<V> {
            Values() {
            }

            public Iterator<V> iterator() {
                return StandardTable.valueIteratorImpl(Column.this);
            }

            public int size() {
                return Column.this.entrySet().size();
            }

            public boolean isEmpty() {
                return !StandardTable.this.containsColumn(Column.this.columnKey);
            }

            public void clear() {
                Column.this.entrySet().clear();
            }

            public boolean remove(Object obj) {
                if (obj == null) {
                    return false;
                }
                Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
                while (it.hasNext()) {
                    Map next = it.next();
                    if (next.entrySet().remove(new ImmutableEntry(Column.this.columnKey, obj))) {
                        if (!next.isEmpty()) {
                            return true;
                        }
                        it.remove();
                        return true;
                    }
                }
                return false;
            }

            public boolean removeAll(final Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                return Column.this.removePredicate(new Predicate<Map.Entry<R, V>>() {
                    public boolean apply(Map.Entry<R, V> entry) {
                        return collection.contains(entry.getValue());
                    }
                });
            }

            public boolean retainAll(final Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                return Column.this.removePredicate(new Predicate<Map.Entry<R, V>>() {
                    public boolean apply(Map.Entry<R, V> entry) {
                        return !collection.contains(entry.getValue());
                    }
                });
            }
        }
    }

    public Set<R> rowKeySet() {
        StandardTable<R, C, V>.RowKeySet rowKeySet2 = this.rowKeySet;
        if (rowKeySet2 != null) {
            return rowKeySet2;
        }
        StandardTable<R, C, V>.RowKeySet rowKeySet3 = new RowKeySet();
        this.rowKeySet = rowKeySet3;
        return rowKeySet3;
    }

    class RowKeySet extends StandardTable<R, C, V>.TableSet<R> {
        RowKeySet() {
            super();
        }

        public Iterator<R> iterator() {
            return StandardTable.keyIteratorImpl(StandardTable.this.rowMap());
        }

        public int size() {
            return StandardTable.this.backingMap.size();
        }

        public boolean contains(Object obj) {
            return StandardTable.this.containsRow(obj);
        }

        public boolean remove(Object obj) {
            return (obj == null || StandardTable.this.backingMap.remove(obj) == null) ? false : true;
        }
    }

    public Set<C> columnKeySet() {
        Set<C> set = this.columnKeySet;
        if (set != null) {
            return set;
        }
        ColumnKeySet columnKeySet2 = new ColumnKeySet();
        this.columnKeySet = columnKeySet2;
        return columnKeySet2;
    }

    class ColumnKeySet extends StandardTable<R, C, V>.TableSet<C> {
        private ColumnKeySet() {
            super();
        }

        public Iterator<C> iterator() {
            return StandardTable.this.createColumnKeyIterator();
        }

        public int size() {
            return Iterators.size(iterator());
        }

        public boolean remove(Object obj) {
            boolean z = false;
            if (obj == null) {
                return false;
            }
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            while (it.hasNext()) {
                Map next = it.next();
                if (next.keySet().remove(obj)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        public boolean removeAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map next = it.next();
                if (Iterators.removeAll(next.keySet().iterator(), collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            Iterator<Map<C, V>> it = StandardTable.this.backingMap.values().iterator();
            boolean z = false;
            while (it.hasNext()) {
                Map next = it.next();
                if (next.keySet().retainAll(collection)) {
                    if (next.isEmpty()) {
                        it.remove();
                    }
                    z = true;
                }
            }
            return z;
        }

        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            for (Map<C, V> containsKey : StandardTable.this.backingMap.values()) {
                if (containsKey.containsKey(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public Iterator<C> createColumnKeyIterator() {
        return new ColumnKeyIterator();
    }

    class ColumnKeyIterator extends AbstractIterator<C> {
        Iterator<Map.Entry<C, V>> entryIterator;
        final Iterator<Map<C, V>> mapIterator;
        final Map<C, V> seen;

        private ColumnKeyIterator() {
            this.seen = (Map) StandardTable.this.factory.get();
            this.mapIterator = StandardTable.this.backingMap.values().iterator();
            this.entryIterator = Iterators.emptyIterator();
        }

        /* access modifiers changed from: protected */
        public C computeNext() {
            while (true) {
                if (this.entryIterator.hasNext()) {
                    Map.Entry next = this.entryIterator.next();
                    if (!this.seen.containsKey(next.getKey())) {
                        this.seen.put(next.getKey(), next.getValue());
                        return next.getKey();
                    }
                } else if (!this.mapIterator.hasNext()) {
                    return endOfData();
                } else {
                    this.entryIterator = this.mapIterator.next().entrySet().iterator();
                }
            }
        }
    }

    public Collection<V> values() {
        StandardTable<R, C, V>.Values values2 = this.values;
        if (values2 != null) {
            return values2;
        }
        StandardTable<R, C, V>.Values values3 = new Values();
        this.values = values3;
        return values3;
    }

    class Values extends StandardTable<R, C, V>.TableCollection<V> {
        private Values() {
            super();
        }

        public Iterator<V> iterator() {
            final Iterator it = StandardTable.this.cellSet().iterator();
            return new Iterator<V>() {
                public boolean hasNext() {
                    return it.hasNext();
                }

                public V next() {
                    return ((Table.Cell) it.next()).getValue();
                }

                public void remove() {
                    it.remove();
                }
            };
        }

        public int size() {
            return StandardTable.this.size();
        }
    }

    public Map<R, Map<C, V>> rowMap() {
        StandardTable<R, C, V>.RowMap rowMap2 = this.rowMap;
        if (rowMap2 != null) {
            return rowMap2;
        }
        StandardTable<R, C, V>.RowMap rowMap3 = new RowMap();
        this.rowMap = rowMap3;
        return rowMap3;
    }

    class RowMap extends Maps.ImprovedAbstractMap<R, Map<C, V>> {
        RowMap() {
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.containsRow(obj);
        }

        public Map<C, V> get(Object obj) {
            if (StandardTable.this.containsRow(obj)) {
                return StandardTable.this.row(obj);
            }
            return null;
        }

        public Set<R> keySet() {
            return StandardTable.this.rowKeySet();
        }

        public Map<C, V> remove(Object obj) {
            if (obj == null) {
                return null;
            }
            return StandardTable.this.backingMap.remove(obj);
        }

        /* access modifiers changed from: protected */
        public Set<Map.Entry<R, Map<C, V>>> createEntrySet() {
            return new EntrySet();
        }

        class EntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<R, Map<C, V>>> {
            EntrySet() {
                super();
            }

            public Iterator<Map.Entry<R, Map<C, V>>> iterator() {
                return new EntryIterator();
            }

            public int size() {
                return StandardTable.this.backingMap.size();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !Collections2.safeContains(StandardTable.this.backingMap.entrySet(), entry)) {
                    return false;
                }
                return true;
            }

            public boolean remove(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || !(entry.getValue() instanceof Map) || !StandardTable.this.backingMap.entrySet().remove(entry)) {
                    return false;
                }
                return true;
            }
        }

        class EntryIterator implements Iterator<Map.Entry<R, Map<C, V>>> {
            final Iterator<R> delegate = StandardTable.this.backingMap.keySet().iterator();

            EntryIterator() {
            }

            public boolean hasNext() {
                return this.delegate.hasNext();
            }

            public Map.Entry<R, Map<C, V>> next() {
                R next = this.delegate.next();
                return new ImmutableEntry(next, StandardTable.this.row(next));
            }

            public void remove() {
                this.delegate.remove();
            }
        }
    }

    public Map<C, Map<R, V>> columnMap() {
        StandardTable<R, C, V>.ColumnMap columnMap2 = this.columnMap;
        if (columnMap2 != null) {
            return columnMap2;
        }
        StandardTable<R, C, V>.ColumnMap columnMap3 = new ColumnMap();
        this.columnMap = columnMap3;
        return columnMap3;
    }

    class ColumnMap extends Maps.ImprovedAbstractMap<C, Map<R, V>> {
        StandardTable<R, C, V>.ColumnMap.ColumnMapValues columnMapValues;

        private ColumnMap() {
        }

        public Map<R, V> get(Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                return StandardTable.this.column(obj);
            }
            return null;
        }

        public boolean containsKey(Object obj) {
            return StandardTable.this.containsColumn(obj);
        }

        public Map<R, V> remove(Object obj) {
            if (StandardTable.this.containsColumn(obj)) {
                return StandardTable.this.removeColumn(obj);
            }
            return null;
        }

        public Set<Map.Entry<C, Map<R, V>>> createEntrySet() {
            return new ColumnMapEntrySet();
        }

        public Set<C> keySet() {
            return StandardTable.this.columnKeySet();
        }

        public Collection<Map<R, V>> values() {
            StandardTable<R, C, V>.ColumnMap.ColumnMapValues columnMapValues2 = this.columnMapValues;
            if (columnMapValues2 != null) {
                return columnMapValues2;
            }
            ColumnMapValues columnMapValues3 = new ColumnMapValues();
            this.columnMapValues = columnMapValues3;
            return columnMapValues3;
        }

        class ColumnMapEntrySet extends StandardTable<R, C, V>.TableSet<Map.Entry<C, Map<R, V>>> {
            ColumnMapEntrySet() {
                super();
            }

            public Iterator<Map.Entry<C, Map<R, V>>> iterator() {
                final Iterator it = StandardTable.this.columnKeySet().iterator();
                return new UnmodifiableIterator<Map.Entry<C, Map<R, V>>>() {
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    public Map.Entry<C, Map<R, V>> next() {
                        Object next = it.next();
                        return new ImmutableEntry(next, StandardTable.this.column(next));
                    }
                };
            }

            public int size() {
                return StandardTable.this.columnKeySet().size();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!StandardTable.this.containsColumn(entry.getKey())) {
                    return false;
                }
                return ColumnMap.this.get(entry.getKey()).equals(entry.getValue());
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map unused = StandardTable.this.removeColumn(((Map.Entry) obj).getKey());
                return true;
            }

            public boolean removeAll(Collection<?> collection) {
                boolean z = false;
                for (Object remove : collection) {
                    z |= remove(remove);
                }
                return z;
            }

            public boolean retainAll(Collection<?> collection) {
                Iterator it = Lists.newArrayList(StandardTable.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(new ImmutableEntry(next, StandardTable.this.column(next)))) {
                        Map unused = StandardTable.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }
        }

        class ColumnMapValues extends StandardTable<R, C, V>.TableCollection<Map<R, V>> {
            private ColumnMapValues() {
                super();
            }

            public Iterator<Map<R, V>> iterator() {
                return StandardTable.valueIteratorImpl(ColumnMap.this);
            }

            public boolean remove(Object obj) {
                for (Map.Entry entry : ColumnMap.this.entrySet()) {
                    if (((Map) entry.getValue()).equals(obj)) {
                        Map unused = StandardTable.this.removeColumn(entry.getKey());
                        return true;
                    }
                }
                return false;
            }

            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                Iterator it = Lists.newArrayList(StandardTable.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (collection.contains(StandardTable.this.column(next))) {
                        Map unused = StandardTable.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }

            public boolean retainAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                Iterator it = Lists.newArrayList(StandardTable.this.columnKeySet().iterator()).iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!collection.contains(StandardTable.this.column(next))) {
                        Map unused = StandardTable.this.removeColumn(next);
                        z = true;
                    }
                }
                return z;
            }

            public int size() {
                return StandardTable.this.columnKeySet().size();
            }
        }
    }

    static <K, V> Iterator<K> keyIteratorImpl(Map<K, V> map) {
        final Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        return new Iterator<K>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final K next() {
                return ((Map.Entry) it.next()).getKey();
            }

            public final void remove() {
                it.remove();
            }
        };
    }

    static <K, V> Iterator<V> valueIteratorImpl(Map<K, V> map) {
        final Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        return new Iterator<V>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final V next() {
                return ((Map.Entry) it.next()).getValue();
            }

            public final void remove() {
                it.remove();
            }
        };
    }
}
