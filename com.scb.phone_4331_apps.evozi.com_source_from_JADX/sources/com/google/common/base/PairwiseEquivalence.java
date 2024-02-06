package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

final class PairwiseEquivalence<T> implements Equivalence<Iterable<T>>, Serializable {
    private static final long serialVersionUID = 0;
    final Equivalence<? super T> elementEquivalence;

    PairwiseEquivalence(Equivalence<? super T> equivalence) {
        this.elementEquivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
    }

    public final boolean equivalent(Iterable<T> iterable, Iterable<T> iterable2) {
        if (iterable == null) {
            return iterable2 == null;
        }
        if (iterable2 == null) {
            return false;
        }
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            if (!this.elementEquivalence.equivalent(it.next(), it2.next())) {
                return false;
            }
        }
        if (it.hasNext() || it2.hasNext()) {
            return false;
        }
        return true;
    }

    public final int hash(Iterable<T> iterable) {
        if (iterable == null) {
            return 0;
        }
        int i = 78721;
        for (T hash : iterable) {
            i = (i * 24943) + this.elementEquivalence.hash(hash);
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PairwiseEquivalence) {
            return this.elementEquivalence.equals(((PairwiseEquivalence) obj).elementEquivalence);
        }
        return false;
    }

    public final int hashCode() {
        return this.elementEquivalence.hashCode() ^ 1185147655;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equivalences.pairwise(");
        sb.append(this.elementEquivalence);
        sb.append(")");
        return sb.toString();
    }
}
