package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private transient SortedSet<R> rowKeySet;
    private transient StandardRowSortedTable<R, C, V>.RowSortedMap rowMap;

    StandardRowSortedTable(SortedMap<R, Map<C, V>> sortedMap, Supplier<? extends Map<C, V>> supplier) {
        super(sortedMap, supplier);
    }

    /* access modifiers changed from: private */
    public SortedMap<R, Map<C, V>> sortedBackingMap() {
        return (SortedMap) this.backingMap;
    }

    public SortedSet<R> rowKeySet() {
        SortedSet<R> sortedSet = this.rowKeySet;
        if (sortedSet != null) {
            return sortedSet;
        }
        RowKeySortedSet rowKeySortedSet = new RowKeySortedSet();
        this.rowKeySet = rowKeySortedSet;
        return rowKeySortedSet;
    }

    class RowKeySortedSet extends StandardTable<R, C, V>.RowKeySet implements SortedSet<R> {
        private RowKeySortedSet() {
            super();
        }

        public Comparator<? super R> comparator() {
            return StandardRowSortedTable.this.sortedBackingMap().comparator();
        }

        public R first() {
            return StandardRowSortedTable.this.sortedBackingMap().firstKey();
        }

        public R last() {
            return StandardRowSortedTable.this.sortedBackingMap().lastKey();
        }

        public SortedSet<R> headSet(R r) {
            Preconditions.checkNotNull(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().headMap(r), StandardRowSortedTable.this.factory).rowKeySet();
        }

        public SortedSet<R> subSet(R r, R r2) {
            Preconditions.checkNotNull(r);
            Preconditions.checkNotNull(r2);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().subMap(r, r2), StandardRowSortedTable.this.factory).rowKeySet();
        }

        public SortedSet<R> tailSet(R r) {
            Preconditions.checkNotNull(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().tailMap(r), StandardRowSortedTable.this.factory).rowKeySet();
        }
    }

    public SortedMap<R, Map<C, V>> rowMap() {
        StandardRowSortedTable<R, C, V>.RowSortedMap rowSortedMap = this.rowMap;
        if (rowSortedMap != null) {
            return rowSortedMap;
        }
        StandardRowSortedTable<R, C, V>.RowSortedMap rowSortedMap2 = new RowSortedMap();
        this.rowMap = rowSortedMap2;
        return rowSortedMap2;
    }

    class RowSortedMap extends StandardTable<R, C, V>.RowMap implements SortedMap<R, Map<C, V>> {
        private RowSortedMap() {
            super();
        }

        public Comparator<? super R> comparator() {
            return StandardRowSortedTable.this.sortedBackingMap().comparator();
        }

        public R firstKey() {
            return StandardRowSortedTable.this.sortedBackingMap().firstKey();
        }

        public R lastKey() {
            return StandardRowSortedTable.this.sortedBackingMap().lastKey();
        }

        public SortedMap<R, Map<C, V>> headMap(R r) {
            Preconditions.checkNotNull(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().headMap(r), StandardRowSortedTable.this.factory).rowMap();
        }

        public SortedMap<R, Map<C, V>> subMap(R r, R r2) {
            Preconditions.checkNotNull(r);
            Preconditions.checkNotNull(r2);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().subMap(r, r2), StandardRowSortedTable.this.factory).rowMap();
        }

        public SortedMap<R, Map<C, V>> tailMap(R r) {
            Preconditions.checkNotNull(r);
            return new StandardRowSortedTable(StandardRowSortedTable.this.sortedBackingMap().tailMap(r), StandardRowSortedTable.this.factory).rowMap();
        }
    }
}
