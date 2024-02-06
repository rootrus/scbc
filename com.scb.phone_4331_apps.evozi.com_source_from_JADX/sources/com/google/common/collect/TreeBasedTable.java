package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {
    private static final long serialVersionUID = 0;
    private final Comparator<? super C> columnComparator;

    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    public /* bridge */ /* synthetic */ void putAll(Table table) {
        super.putAll(table);
    }

    public /* bridge */ /* synthetic */ Map row(Object obj) {
        return super.row(obj);
    }

    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    static class Factory<C, V> implements Supplier<TreeMap<C, V>>, Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super C> comparator;

        Factory(Comparator<? super C> comparator2) {
            this.comparator = comparator2;
        }

        public TreeMap<C, V> get() {
            return new TreeMap<>(this.comparator);
        }
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(Ordering.natural(), Ordering.natural());
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.rowComparator(), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }

    TreeBasedTable(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super(new TreeMap(comparator), new Factory(comparator2));
        this.columnComparator = comparator2;
    }

    public Comparator<? super R> rowComparator() {
        return rowKeySet().comparator();
    }

    public Comparator<? super C> columnComparator() {
        return this.columnComparator;
    }

    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    public boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    public boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public V get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public V remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    /* access modifiers changed from: package-private */
    public Iterator<C> createColumnKeyIterator() {
        return new MergingIterator(Iterables.transform(this.backingMap.values(), new Function<Map<C, V>, Iterator<C>>() {
            public Iterator<C> apply(Map<C, V> map) {
                return map.keySet().iterator();
            }
        }), columnComparator());
    }

    static class MergingIterator<T> extends AbstractIterator<T> {
        /* access modifiers changed from: private */
        public final Comparator<? super T> comparator;
        private T lastValue = null;
        private final Queue<PeekingIterator<T>> queue;

        public MergingIterator(Iterable<? extends Iterator<T>> iterable, Comparator<? super T> comparator2) {
            this.comparator = comparator2;
            this.queue = new PriorityQueue(Math.max(1, Iterables.size(iterable)), new Comparator<PeekingIterator<T>>() {
                public int compare(PeekingIterator<T> peekingIterator, PeekingIterator<T> peekingIterator2) {
                    return MergingIterator.this.comparator.compare(peekingIterator.peek(), peekingIterator2.peek());
                }
            });
            for (Iterator it : iterable) {
                if (it.hasNext()) {
                    this.queue.add(Iterators.peekingIterator(it));
                }
            }
        }

        /* access modifiers changed from: protected */
        public T computeNext() {
            while (!this.queue.isEmpty()) {
                PeekingIterator poll = this.queue.poll();
                T next = poll.next();
                T t = this.lastValue;
                boolean z = t != null && this.comparator.compare(next, t) == 0;
                if (poll.hasNext()) {
                    this.queue.add(poll);
                    continue;
                }
                if (!z) {
                    this.lastValue = next;
                    return next;
                }
            }
            this.lastValue = null;
            return endOfData();
        }
    }
}
