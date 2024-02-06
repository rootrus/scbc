package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedMap;

public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {
    /* access modifiers changed from: protected */
    public abstract SortedMap<K, V> delegate();

    protected ForwardingSortedMap() {
    }

    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    public K firstKey() {
        return delegate().firstKey();
    }

    public SortedMap<K, V> headMap(K k) {
        return delegate().headMap(k);
    }

    public K lastKey() {
        return delegate().lastKey();
    }

    public SortedMap<K, V> subMap(K k, K k2) {
        return delegate().subMap(k, k2);
    }

    public SortedMap<K, V> tailMap(K k) {
        return delegate().tailMap(k);
    }

    private int unsafeCompare(Object obj, Object obj2) {
        Comparator comparator = comparator();
        if (comparator == null) {
            return ((Comparable) obj).compareTo(obj2);
        }
        return comparator.compare(obj, obj2);
    }

    /* access modifiers changed from: protected */
    public boolean standardContainsKey(Object obj) {
        try {
            return unsafeCompare(tailMap(obj).firstKey(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public V standardRemove(Object obj) {
        try {
            Iterator it = tailMap(obj).entrySet().iterator();
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (unsafeCompare(entry.getKey(), obj) != 0) {
                return null;
            }
            V value = entry.getValue();
            it.remove();
            return value;
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public SortedMap<K, V> standardSubMap(K k, K k2) {
        return tailMap(k).headMap(k2);
    }
}
