package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Ordering<T> implements Comparator<T> {
    static final int LEFT_IS_GREATER = 1;
    static final int RIGHT_IS_GREATER = -1;

    public abstract int compare(T t, T t2);

    public static <C extends Comparable> Ordering<C> natural() {
        return NaturalOrdering.INSTANCE;
    }

    public static <T> Ordering<T> from(Comparator<T> comparator) {
        return comparator instanceof Ordering ? (Ordering) comparator : new ComparatorOrdering(comparator);
    }

    @Deprecated
    public static <T> Ordering<T> from(Ordering<T> ordering) {
        return (Ordering) Preconditions.checkNotNull(ordering);
    }

    public static <T> Ordering<T> explicit(List<T> list) {
        return new ExplicitOrdering(list);
    }

    public static <T> Ordering<T> explicit(T t, T... tArr) {
        return explicit(Lists.asList(t, tArr));
    }

    static class IncomparableValueException extends ClassCastException {
        private static final long serialVersionUID = 0;
        final Object value;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        IncomparableValueException(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot compare value: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                r2.value = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Ordering.IncomparableValueException.<init>(java.lang.Object):void");
        }
    }

    public static Ordering<Object> arbitrary() {
        return ArbitraryOrderingHolder.ARBITRARY_ORDERING;
    }

    static class ArbitraryOrderingHolder {
        static final Ordering<Object> ARBITRARY_ORDERING = new ArbitraryOrdering();

        private ArbitraryOrderingHolder() {
        }
    }

    static class ArbitraryOrdering extends Ordering<Object> {
        private Map<Object, Integer> uids = Platform.tryWeakKeys(new MapMaker()).makeComputingMap(new Function<Object, Integer>() {
            final AtomicInteger counter = new AtomicInteger(0);

            public Integer apply(Object obj) {
                return Integer.valueOf(this.counter.getAndIncrement());
            }
        });

        public String toString() {
            return "Ordering.arbitrary()";
        }

        ArbitraryOrdering() {
        }

        public int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            int identityHashCode = identityHashCode(obj);
            int identityHashCode2 = identityHashCode(obj2);
            if (identityHashCode != identityHashCode2) {
                return identityHashCode < identityHashCode2 ? -1 : 1;
            }
            int compareTo = this.uids.get(obj).compareTo(this.uids.get(obj2));
            if (compareTo != 0) {
                return compareTo;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public int identityHashCode(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static Ordering<Object> usingToString() {
        return UsingToStringOrdering.INSTANCE;
    }

    public static <T> Ordering<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new CompoundOrdering(iterable);
    }

    protected Ordering() {
    }

    public <U extends T> Ordering<U> compound(Comparator<? super U> comparator) {
        return new CompoundOrdering(this, (Ordering) (Comparator) Preconditions.checkNotNull(comparator));
    }

    public <S extends T> Ordering<S> reverse() {
        return new ReverseOrdering(this);
    }

    public <F> Ordering<F> onResultOf(Function<F, ? extends T> function) {
        return new ByFunctionOrdering(function, this);
    }

    public <S extends T> Ordering<Iterable<S>> lexicographical() {
        return new LexicographicalOrdering(this);
    }

    public <S extends T> Ordering<S> nullsFirst() {
        return new NullsFirstOrdering(this);
    }

    public <S extends T> Ordering<S> nullsLast() {
        return new NullsLastOrdering(this);
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i) {
        Preconditions.checkArgument(i >= 0, "%d is negative", Integer.valueOf(i));
        Object[] array = Iterables.toArray(iterable);
        if (array.length <= i) {
            Arrays.sort(array, this);
        } else {
            quicksortLeastK(array, 0, array.length - 1, i);
            Object[] objArr = new Object[i];
            System.arraycopy(array, 0, objArr, 0, i);
            array = objArr;
        }
        return Collections.unmodifiableList(Arrays.asList(array));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    private <E extends T> void quicksortLeastK(E[] eArr, int i, int i2, int i3) {
        while (i2 > i) {
            int partition = partition(eArr, i, i2, (i + i2) >>> 1);
            quicksortLeastK(eArr, i, partition - 1, i3);
            if (partition < i3) {
                i = partition + 1;
            } else {
                return;
            }
        }
    }

    private <E extends T> int partition(E[] eArr, int i, int i2, int i3) {
        E e = eArr[i3];
        eArr[i3] = eArr[i2];
        eArr[i2] = e;
        int i4 = i;
        while (i < i2) {
            if (compare(eArr[i], e) < 0) {
                ObjectArrays.swap(eArr, i4, i);
                i4++;
            }
            i++;
        }
        ObjectArrays.swap(eArr, i2, i4);
        return i4;
    }

    public int binarySearch(List<? extends T> list, T t) {
        return Collections.binarySearch(list, t, this);
    }

    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        ArrayList<E> newArrayList = Lists.newArrayList(iterable);
        Collections.sort(newArrayList, this);
        return newArrayList;
    }

    public <E extends T> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.copyOf(sortedCopy(iterable));
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            if (compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public <E extends T> E max(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        E next = it.next();
        while (it.hasNext()) {
            next = max(next, it.next());
        }
        return next;
    }

    public <E extends T> E max(E e, E e2, E e3, E... eArr) {
        E max = max(max(e, e2), e3);
        for (E max2 : eArr) {
            max = max(max, max2);
        }
        return max;
    }

    public <E extends T> E max(E e, E e2) {
        return compare(e, e2) < 0 ? e2 : e;
    }

    public <E extends T> E min(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        E next = it.next();
        while (it.hasNext()) {
            next = min(next, it.next());
        }
        return next;
    }

    public <E extends T> E min(E e, E e2, E e3, E... eArr) {
        E min = min(min(e, e2), e3);
        for (E min2 : eArr) {
            min = min(min, min2);
        }
        return min;
    }

    public <E extends T> E min(E e, E e2) {
        return compare(e, e2) > 0 ? e2 : e;
    }
}
