package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

final class EmptyImmutableList extends ImmutableList<Object> {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final EmptyImmutableList INSTANCE = new EmptyImmutableList();
    static final UnmodifiableListIterator<Object> ITERATOR = new UnmodifiableListIterator<Object>() {
        public final boolean hasNext() {
            return false;
        }

        public final boolean hasPrevious() {
            return false;
        }

        public final int nextIndex() {
            return 0;
        }

        public final int previousIndex() {
            return -1;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final Object previous() {
            throw new NoSuchElementException();
        }
    };
    private static final long serialVersionUID = 0;

    public final boolean contains(Object obj) {
        return false;
    }

    public final int hashCode() {
        return 1;
    }

    public final int indexOf(Object obj) {
        return -1;
    }

    public final boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        return -1;
    }

    public final ImmutableList<Object> reverse() {
        return this;
    }

    public final int size() {
        return 0;
    }

    public final String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    private EmptyImmutableList() {
    }

    public final UnmodifiableIterator<Object> iterator() {
        return Iterators.emptyIterator();
    }

    public final Object[] toArray() {
        return EMPTY_ARRAY;
    }

    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length > 0) {
            tArr[0] = null;
        }
        return tArr;
    }

    public final Object get(int i) {
        Preconditions.checkElementIndex(i, 0);
        throw new AssertionError("unreachable");
    }

    public final ImmutableList<Object> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, 0);
        return this;
    }

    public final UnmodifiableListIterator<Object> listIterator() {
        return ITERATOR;
    }

    public final UnmodifiableListIterator<Object> listIterator(int i) {
        Preconditions.checkPositionIndex(i, 0);
        return ITERATOR;
    }

    public final boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).isEmpty();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        return INSTANCE;
    }
}
