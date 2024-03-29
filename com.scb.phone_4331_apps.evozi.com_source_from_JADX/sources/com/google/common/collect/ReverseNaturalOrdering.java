package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;

final class ReverseNaturalOrdering extends Ordering<Comparable> implements Serializable {
    static final ReverseNaturalOrdering INSTANCE = new ReverseNaturalOrdering();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    public final int compare(Comparable comparable, Comparable comparable2) {
        Preconditions.checkNotNull(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final <S extends Comparable> Ordering<S> reverse() {
        return Ordering.natural();
    }

    public final <E extends Comparable> E min(E e, E e2) {
        return (Comparable) NaturalOrdering.INSTANCE.max(e, e2);
    }

    public final <E extends Comparable> E min(E e, E e2, E e3, E... eArr) {
        return (Comparable) NaturalOrdering.INSTANCE.max(e, e2, e3, eArr);
    }

    public final <E extends Comparable> E min(Iterable<E> iterable) {
        return (Comparable) NaturalOrdering.INSTANCE.max(iterable);
    }

    public final <E extends Comparable> E max(E e, E e2) {
        return (Comparable) NaturalOrdering.INSTANCE.min(e, e2);
    }

    public final <E extends Comparable> E max(E e, E e2, E e3, E... eArr) {
        return (Comparable) NaturalOrdering.INSTANCE.min(e, e2, e3, eArr);
    }

    public final <E extends Comparable> E max(Iterable<E> iterable) {
        return (Comparable) NaturalOrdering.INSTANCE.min(iterable);
    }

    private Object readResolve() {
        return INSTANCE;
    }

    private ReverseNaturalOrdering() {
    }
}
