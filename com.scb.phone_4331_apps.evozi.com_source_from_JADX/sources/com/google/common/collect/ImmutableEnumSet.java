package com.google.common.collect;

import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

final class ImmutableEnumSet<E extends Enum<E>> extends ImmutableSet<E> {
    private final transient EnumSet<E> delegate;
    private transient int hashCode;

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    ImmutableEnumSet(EnumSet<E> enumSet) {
        this.delegate = enumSet;
    }

    public final UnmodifiableIterator<E> iterator() {
        return Iterators.unmodifiableIterator(this.delegate.iterator());
    }

    public final int size() {
        return this.delegate.size();
    }

    public final boolean contains(Object obj) {
        return this.delegate.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.delegate.containsAll(collection);
    }

    public final boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    public final Object[] toArray() {
        return this.delegate.toArray();
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.delegate.toArray(tArr);
    }

    public final boolean equals(Object obj) {
        return obj == this || this.delegate.equals(obj);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode2 = this.delegate.hashCode();
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return this.delegate.toString();
    }

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return new EnumSerializedForm(this.delegate);
    }

    static class EnumSerializedForm<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;
        final EnumSet<E> delegate;

        EnumSerializedForm(EnumSet<E> enumSet) {
            this.delegate = enumSet;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return new ImmutableEnumSet(this.delegate.clone());
        }
    }
}
