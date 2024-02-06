package com.google.common.collect;

import java.util.Collection;
import java.util.Set;
import okhttp3.HttpUrl;

final class EmptyImmutableSet extends ImmutableSet<Object> {
    private static final Object[] EMPTY_ARRAY = new Object[0];
    static final EmptyImmutableSet INSTANCE = new EmptyImmutableSet();
    private static final long serialVersionUID = 0;

    public final boolean contains(Object obj) {
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final boolean isEmpty() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isHashCodeFast() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return 0;
    }

    public final String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    private EmptyImmutableSet() {
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

    public final boolean containsAll(Collection<?> collection) {
        return collection.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Object readResolve() {
        return INSTANCE;
    }
}
