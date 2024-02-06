package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    private final transient ImmutableList<E> elements;

    public final boolean isEmpty() {
        return false;
    }

    RegularImmutableSortedSet(ImmutableList<E> immutableList, Comparator<? super E> comparator) {
        super(comparator);
        this.elements = immutableList;
        Preconditions.checkArgument(!immutableList.isEmpty());
    }

    public final UnmodifiableIterator<E> iterator() {
        return this.elements.iterator();
    }

    public final int size() {
        return this.elements.size();
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return binarySearch(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final boolean containsAll(Collection<?> collection) {
        if (!hasSameComparator(collection, comparator()) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator it = iterator();
        Iterator<?> it2 = collection.iterator();
        Object next = it2.next();
        while (it.hasNext()) {
            try {
                int unsafeCompare = unsafeCompare(it.next(), next);
                if (unsafeCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (unsafeCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        return false;
    }

    private int binarySearch(Object obj) {
        return Collections.binarySearch(this.elements, obj, this.comparator);
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return this.elements.isPartialView();
    }

    public final Object[] toArray() {
        return this.elements.toArray();
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.elements.toArray(tArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[Catch:{ ClassCastException | NoSuchElementException -> 0x003f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Set
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.Set r6 = (java.util.Set) r6
            int r1 = r5.size()
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            java.util.Comparator<? super E> r1 = r5.comparator
            boolean r1 = hasSameComparator(r6, r1)
            if (r1 == 0) goto L_0x0040
            java.util.Iterator r6 = r6.iterator()
            com.google.common.collect.UnmodifiableIterator r1 = r5.iterator()     // Catch:{ ClassCastException | NoSuchElementException -> 0x003f }
        L_0x0027:
            boolean r3 = r1.hasNext()     // Catch:{ ClassCastException | NoSuchElementException -> 0x003f }
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r1.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x003f }
            java.lang.Object r4 = r6.next()     // Catch:{ ClassCastException | NoSuchElementException -> 0x003f }
            if (r4 == 0) goto L_0x003d
            int r3 = r5.unsafeCompare(r3, r4)     // Catch:{ ClassCastException | NoSuchElementException -> 0x003f }
            if (r3 == 0) goto L_0x0027
        L_0x003d:
            return r2
        L_0x003e:
            return r0
        L_0x003f:
            return r2
        L_0x0040:
            boolean r6 = r5.containsAll(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableSortedSet.equals(java.lang.Object):boolean");
    }

    public final E first() {
        return this.elements.get(0);
    }

    public final E last() {
        return this.elements.get(size() - 1);
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSortedSet<E> headSetImpl(E e) {
        return createSubset(0, findSubsetIndex(e));
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSortedSet<E> subSetImpl(E e, E e2) {
        return createSubset(findSubsetIndex(e), findSubsetIndex(e2));
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSortedSet<E> tailSetImpl(E e) {
        return createSubset(findSubsetIndex(e), size());
    }

    private int findSubsetIndex(E e) {
        int binarySearch = binarySearch(e);
        return binarySearch < 0 ? (-binarySearch) - 1 : binarySearch;
    }

    private ImmutableSortedSet<E> createSubset(int i, int i2) {
        if (i < i2) {
            return new RegularImmutableSortedSet(this.elements.subList(i, i2), this.comparator);
        }
        return emptySet(this.comparator);
    }

    /* access modifiers changed from: package-private */
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = binarySearch(obj);
            if (binarySearch < 0 || !this.elements.get(binarySearch).equals(obj)) {
                return -1;
            }
            return binarySearch;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final ImmutableList<E> createAsList() {
        return new ImmutableSortedAsList(this, this.elements);
    }
}
