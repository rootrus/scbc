package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<T> comparator;

    ComparatorOrdering(Comparator<T> comparator2) {
        this.comparator = (Comparator) Preconditions.checkNotNull(comparator2);
    }

    public final int compare(T t, T t2) {
        return this.comparator.compare(t, t2);
    }

    public final int binarySearch(List<? extends T> list, T t) {
        return Collections.binarySearch(list, t, this.comparator);
    }

    public final <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        ArrayList<E> newArrayList = Lists.newArrayList(iterable);
        Collections.sort(newArrayList, this.comparator);
        return newArrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.comparator.equals(((ComparatorOrdering) obj).comparator);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparator.hashCode();
    }

    public final String toString() {
        return this.comparator.toString();
    }
}
