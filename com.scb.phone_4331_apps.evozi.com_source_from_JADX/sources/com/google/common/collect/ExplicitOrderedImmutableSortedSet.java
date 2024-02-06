package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

final class ExplicitOrderedImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    private final Object[] elements;
    private final int fromIndex;
    private final int toIndex;

    public final boolean isEmpty() {
        return false;
    }

    static <E> ImmutableSortedSet<E> create(List<E> list) {
        ExplicitOrdering explicitOrdering = new ExplicitOrdering(list);
        if (explicitOrdering.rankMap.isEmpty()) {
            return emptySet(explicitOrdering);
        }
        return new ExplicitOrderedImmutableSortedSet(explicitOrdering.rankMap.keySet().toArray(), explicitOrdering);
    }

    ExplicitOrderedImmutableSortedSet(Object[] objArr, Comparator<? super E> comparator) {
        this(objArr, comparator, 0, objArr.length);
    }

    ExplicitOrderedImmutableSortedSet(Object[] objArr, Comparator<? super E> comparator, int i, int i2) {
        super(comparator);
        this.elements = objArr;
        this.fromIndex = i;
        this.toIndex = i2;
    }

    private ImmutableMap<E, Integer> rankMap() {
        return ((ExplicitOrdering) comparator()).rankMap;
    }

    public final UnmodifiableIterator<E> iterator() {
        return Iterators.forArray(this.elements, this.fromIndex, size());
    }

    public final int size() {
        return this.toIndex - this.fromIndex;
    }

    public final boolean contains(Object obj) {
        Integer num = (Integer) rankMap().get(obj);
        return num != null && num.intValue() >= this.fromIndex && num.intValue() < this.toIndex;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return (this.fromIndex == 0 && this.toIndex == this.elements.length) ? false : true;
    }

    public final Object[] toArray() {
        Object[] objArr = new Object[size()];
        Platform.unsafeArrayCopy(this.elements, this.fromIndex, objArr, 0, size());
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = ObjectArrays.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        Platform.unsafeArrayCopy(this.elements, this.fromIndex, tArr, 0, size);
        return tArr;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = this.fromIndex; i2 < this.toIndex; i2++) {
            i += this.elements[i2].hashCode();
        }
        return i;
    }

    public final E first() {
        return this.elements[this.fromIndex];
    }

    public final E last() {
        return this.elements[this.toIndex - 1];
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSortedSet<E> headSetImpl(E e) {
        return createSubset(this.fromIndex, findSubsetIndex(e));
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSortedSet<E> subSetImpl(E e, E e2) {
        return createSubset(findSubsetIndex(e), findSubsetIndex(e2));
    }

    /* access modifiers changed from: package-private */
    public final ImmutableSortedSet<E> tailSetImpl(E e) {
        return createSubset(findSubsetIndex(e), this.toIndex);
    }

    private int findSubsetIndex(E e) {
        Integer num = (Integer) rankMap().get(e);
        if (num != null) {
            int intValue = num.intValue();
            int i = this.fromIndex;
            if (intValue <= i) {
                return i;
            }
            int intValue2 = num.intValue();
            int i2 = this.toIndex;
            if (intValue2 >= i2) {
                return i2;
            }
            return num.intValue();
        }
        throw new ClassCastException();
    }

    private ImmutableSortedSet<E> createSubset(int i, int i2) {
        if (i < i2) {
            return new ExplicitOrderedImmutableSortedSet(this.elements, this.comparator, i, i2);
        }
        return emptySet(this.comparator);
    }

    /* access modifiers changed from: package-private */
    public final int indexOf(Object obj) {
        Integer num = (Integer) rankMap().get(obj);
        if (num == null || num.intValue() < this.fromIndex || num.intValue() >= this.toIndex) {
            return -1;
        }
        return num.intValue() - this.fromIndex;
    }

    /* access modifiers changed from: package-private */
    public final ImmutableList<E> createAsList() {
        return new ImmutableSortedAsList(this, new RegularImmutableList(this.elements, this.fromIndex, size()));
    }

    static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return ImmutableSortedSet.withExplicitOrder(Arrays.asList(this.elements));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return new SerializedForm(toArray());
    }
}
