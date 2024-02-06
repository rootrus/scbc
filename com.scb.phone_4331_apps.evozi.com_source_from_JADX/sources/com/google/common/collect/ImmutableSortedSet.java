package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;

public abstract class ImmutableSortedSet<E> extends ImmutableSortedSetFauxverideShim<E> implements SortedSet<E> {
    private static final ImmutableSortedSet<Comparable> NATURAL_EMPTY_SET = new EmptyImmutableSortedSet(NATURAL_ORDER);
    private static final Comparator<Comparable> NATURAL_ORDER = Ordering.natural();
    final transient Comparator<? super E> comparator;

    /* access modifiers changed from: package-private */
    public abstract ImmutableSortedSet<E> headSetImpl(E e);

    /* access modifiers changed from: package-private */
    public abstract int indexOf(Object obj);

    /* access modifiers changed from: package-private */
    public abstract ImmutableSortedSet<E> subSetImpl(E e, E e2);

    /* access modifiers changed from: package-private */
    public abstract ImmutableSortedSet<E> tailSetImpl(E e);

    private static <E> ImmutableSortedSet<E> emptySet() {
        return NATURAL_EMPTY_SET;
    }

    static <E> ImmutableSortedSet<E> emptySet(Comparator<? super E> comparator2) {
        if (NATURAL_ORDER.equals(comparator2)) {
            return emptySet();
        }
        return new EmptyImmutableSortedSet(comparator2);
    }

    /* renamed from: of */
    public static <E> ImmutableSortedSet<E> m3672of() {
        return emptySet();
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m3673of(E e) {
        return new RegularImmutableSortedSet(ImmutableList.m3622of(e), Ordering.natural());
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m3674of(E e, E e2) {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[]{e, e2}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m3675of(E e, E e2, E e3) {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[]{e, e2, e3}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m3676of(E e, E e2, E e3, E e4) {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[]{e, e2, e3, e4}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m3677of(E e, E e2, E e3, E e4, E e5) {
        return copyOf(Ordering.natural(), Arrays.asList(new Comparable[]{e, e2, e3, e4, e5}));
    }

    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m3678of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        ArrayList arrayList = new ArrayList(eArr.length + 6);
        Collections.addAll(arrayList, new Comparable[]{e, e2, e3, e4, e5, e6});
        Collections.addAll(arrayList, eArr);
        return copyOf(Ordering.natural(), arrayList);
    }

    @Deprecated
    /* renamed from: of */
    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> m3679of(E[] eArr) {
        return copyOf(eArr);
    }

    public static <E extends Comparable<? super E>> ImmutableSortedSet<E> copyOf(E[] eArr) {
        return copyOf(Ordering.natural(), Arrays.asList(eArr));
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf(Ordering.natural(), collection);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOfInternal(Ordering.natural(), it);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Iterator<? extends E> it) {
        Preconditions.checkNotNull(comparator2);
        return copyOfInternal(comparator2, it);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator2);
        return copyOfInternal(comparator2, iterable, false);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator2, Collection<? extends E> collection) {
        Preconditions.checkNotNull(comparator2);
        return copyOfInternal(comparator2, collection, false);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.SortedSet<E>, java.util.SortedSet, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E> com.google.common.collect.ImmutableSortedSet<E> copyOfSorted(java.util.SortedSet<E> r2) {
        /*
            java.util.Comparator r0 = r2.comparator()
            if (r0 != 0) goto L_0x0008
            java.util.Comparator<java.lang.Comparable> r0 = NATURAL_ORDER
        L_0x0008:
            r1 = 1
            com.google.common.collect.ImmutableSortedSet r2 = copyOfInternal(r0, r2, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedSet.copyOfSorted(java.util.SortedSet):com.google.common.collect.ImmutableSortedSet");
    }

    private static <E> ImmutableSortedSet<E> copyOfInternal(Comparator<? super E> comparator2, Iterable<? extends E> iterable, boolean z) {
        ImmutableList<E> copyOf;
        if (!(z || hasSameComparator(iterable, comparator2)) || !(iterable instanceof ImmutableSortedSet)) {
            ImmutableList<E> immutableSortedUniqueCopy = immutableSortedUniqueCopy(comparator2, Lists.newArrayList(iterable));
            if (immutableSortedUniqueCopy.isEmpty()) {
                return emptySet(comparator2);
            }
            return new RegularImmutableSortedSet(immutableSortedUniqueCopy, comparator2);
        }
        ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
        if (!immutableSortedSet.isEmpty() && immutableSortedSet.asList() != (copyOf = ImmutableList.copyOf(iterable))) {
            return new RegularImmutableSortedSet(copyOf, comparator2);
        }
        return immutableSortedSet;
    }

    /* access modifiers changed from: private */
    public static <E> ImmutableSortedSet<E> copyOfInternal(Comparator<? super E> comparator2, Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return emptySet(comparator2);
        }
        return new RegularImmutableSortedSet(immutableSortedUniqueCopy(comparator2, Lists.newArrayList(it)), comparator2);
    }

    private static <E> ImmutableList<E> immutableSortedUniqueCopy(Comparator<? super E> comparator2, List<E> list) {
        if (list.isEmpty()) {
            return ImmutableList.m3621of();
        }
        Collections.sort(list, comparator2);
        int i = 1;
        for (int i2 = 1; i2 < list.size(); i2++) {
            E e = list.get(i2);
            if (comparator2.compare(e, list.get(i - 1)) != 0) {
                list.set(i, e);
                i++;
            }
        }
        return ImmutableList.copyOf(list.subList(0, i));
    }

    static boolean hasSameComparator(Iterable<?> iterable, Comparator<?> comparator2) {
        if (!(iterable instanceof SortedSet)) {
            return false;
        }
        Comparator comparator3 = ((SortedSet) iterable).comparator();
        if (comparator3 != null) {
            return comparator2.equals(comparator3);
        }
        if (comparator2 == Ordering.natural()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static <E> ImmutableSortedSet<E> withExplicitOrder(List<E> list) {
        return ExplicitOrderedImmutableSortedSet.create(list);
    }

    @Deprecated
    public static <E> ImmutableSortedSet<E> withExplicitOrder(E e, E... eArr) {
        return withExplicitOrder(Lists.asList(e, eArr));
    }

    public static <E> Builder<E> orderedBy(Comparator<E> comparator2) {
        return new Builder<>(comparator2);
    }

    public static <E extends Comparable<E>> Builder<E> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    public static <E extends Comparable<E>> Builder<E> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    public static final class Builder<E> extends ImmutableSet.Builder<E> {
        private final Comparator<? super E> comparator;

        public Builder(Comparator<? super E> comparator2) {
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator2);
        }

        public final Builder<E> add(E e) {
            super.add((Object) e);
            return this;
        }

        public final Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        public final Builder<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        public final Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        public final ImmutableSortedSet<E> build() {
            return ImmutableSortedSet.copyOfInternal(this.comparator, this.contents.iterator());
        }
    }

    /* access modifiers changed from: package-private */
    public int unsafeCompare(Object obj, Object obj2) {
        return unsafeCompare(this.comparator, obj, obj2);
    }

    static int unsafeCompare(Comparator<?> comparator2, Object obj, Object obj2) {
        return comparator2.compare(obj, obj2);
    }

    ImmutableSortedSet(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    public ImmutableSortedSet<E> headSet(E e) {
        return headSetImpl(Preconditions.checkNotNull(e));
    }

    public ImmutableSortedSet<E> subSet(E e, E e2) {
        Preconditions.checkNotNull(e);
        Preconditions.checkNotNull(e2);
        Preconditions.checkArgument(this.comparator.compare(e, e2) <= 0);
        return subSetImpl(e, e2);
    }

    public ImmutableSortedSet<E> tailSet(E e) {
        return tailSetImpl(Preconditions.checkNotNull(e));
    }

    static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        public SerializedForm(Comparator<? super E> comparator2, Object[] objArr) {
            this.comparator = comparator2;
            this.elements = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new Builder(this.comparator).add(this.elements).build();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(this.comparator, toArray());
    }
}
