package com.google.common.collect;

import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Set;
import okhttp3.HttpUrl;

class EmptyImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    private static final Object[] EMPTY_ARRAY = new Object[0];

    public boolean contains(Object obj) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedSet<E> headSetImpl(E e) {
        return this;
    }

    /* access modifiers changed from: package-private */
    public int indexOf(Object obj) {
        return -1;
    }

    public boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedSet<E> subSetImpl(E e, E e2) {
        return this;
    }

    /* access modifiers changed from: package-private */
    public ImmutableSortedSet<E> tailSetImpl(E e) {
        return this;
    }

    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    EmptyImmutableSortedSet(Comparator<? super E> comparator) {
        super(comparator);
    }

    public UnmodifiableIterator<E> iterator() {
        return Iterators.emptyIterator();
    }

    public Object[] toArray() {
        return EMPTY_ARRAY;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    public boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    public E first() {
        throw new NoSuchElementException();
    }

    public E last() {
        throw new NoSuchElementException();
    }
}
