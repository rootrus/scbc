package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class NaturalOrdering extends Ordering<Comparable> implements Serializable {
    static final NaturalOrdering INSTANCE = new NaturalOrdering();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural()";
    }

    public final int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable2);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable.compareTo(comparable2);
    }

    public final <S extends Comparable> Ordering<S> reverse() {
        return ReverseNaturalOrdering.INSTANCE;
    }

    public final int binarySearch(List<? extends Comparable> list, Comparable comparable) {
        return Collections.binarySearch(list, comparable);
    }

    public final <E extends Comparable> List<E> sortedCopy(Iterable<E> iterable) {
        ArrayList<E> newArrayList = Lists.newArrayList(iterable);
        Collections.sort(newArrayList);
        return newArrayList;
    }

    private Object readResolve() {
        return INSTANCE;
    }

    private NaturalOrdering() {
    }
}
