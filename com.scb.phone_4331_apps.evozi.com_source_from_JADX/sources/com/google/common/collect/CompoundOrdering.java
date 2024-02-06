package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

final class CompoundOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final ImmutableList<Comparator<? super T>> comparators;

    CompoundOrdering(Comparator<? super T> comparator, Comparator<? super T> comparator2) {
        this.comparators = ImmutableList.m3623of(comparator, comparator2);
    }

    CompoundOrdering(Iterable<? extends Comparator<? super T>> iterable) {
        this.comparators = ImmutableList.copyOf(iterable);
    }

    CompoundOrdering(List<? extends Comparator<? super T>> list, Comparator<? super T> comparator) {
        this.comparators = new ImmutableList.Builder().addAll((Iterable) list).add((Object) comparator).build();
    }

    public final int compare(T t, T t2) {
        UnmodifiableIterator<Comparator<? super T>> it = this.comparators.iterator();
        while (it.hasNext()) {
            int compare = it.next().compare(t, t2);
            if (compare != 0) {
                return compare;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return this.comparators.equals(((CompoundOrdering) obj).comparators);
        }
        return false;
    }

    public final int hashCode() {
        return this.comparators.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordering.compound(");
        sb.append(this.comparators);
        sb.append(")");
        return sb.toString();
    }
}
