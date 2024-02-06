package com.google.common.base;

public final class Equivalences {

    enum Impl implements Equivalence<Object> {
        EQUALS {
            public final boolean equivalent(Object obj, Object obj2) {
                if (obj == null) {
                    return obj2 == null;
                }
                return obj.equals(obj2);
            }

            public final int hash(Object obj) {
                if (obj == null) {
                    return 0;
                }
                return obj.hashCode();
            }
        },
        IDENTITY {
            public final boolean equivalent(Object obj, Object obj2) {
                return obj == obj2;
            }

            public final int hash(Object obj) {
                return System.identityHashCode(obj);
            }
        }
    }

    private Equivalences() {
    }

    public static Equivalence<Object> equals() {
        return Impl.EQUALS;
    }

    public static Equivalence<Object> identity() {
        return Impl.IDENTITY;
    }

    public static <T> Equivalence<Iterable<T>> pairwise(Equivalence<? super T> equivalence) {
        return new PairwiseEquivalence(equivalence);
    }
}
