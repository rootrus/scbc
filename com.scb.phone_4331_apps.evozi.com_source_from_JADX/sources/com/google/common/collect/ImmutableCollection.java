package com.google.common.collect;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

public abstract class ImmutableCollection<E> implements Collection<E>, Serializable {
    static final ImmutableCollection<Object> EMPTY_IMMUTABLE_COLLECTION = new EmptyImmutableCollection();
    private transient ImmutableList<E> asList;

    /* access modifiers changed from: package-private */
    public abstract boolean isPartialView();

    public abstract UnmodifiableIterator<E> iterator();

    ImmutableCollection() {
    }

    public Object[] toArray() {
        return ObjectArrays.toArrayImpl(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return ObjectArrays.toArrayImpl(this, tArr);
    }

    public boolean contains(Object obj) {
        return obj != null && Iterators.contains(iterator(), obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return Collections2.containsAllImpl(this, collection);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public String toString() {
        return Collections2.toStringImpl(this);
    }

    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> createAsList = createAsList();
        this.asList = createAsList;
        return createAsList;
    }

    /* access modifiers changed from: package-private */
    public ImmutableList<E> createAsList() {
        int size = size();
        if (size == 0) {
            return ImmutableList.m3621of();
        }
        if (size != 1) {
            return new ImmutableAsList(toArray(), this);
        }
        return ImmutableList.m3622of(iterator().next());
    }

    static class EmptyImmutableCollection extends ImmutableCollection<Object> {
        private static final Object[] EMPTY_ARRAY = new Object[0];

        public boolean contains(Object obj) {
            return false;
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

        private EmptyImmutableCollection() {
        }

        public UnmodifiableIterator<Object> iterator() {
            return Iterators.EMPTY_ITERATOR;
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

        /* access modifiers changed from: package-private */
        public ImmutableList<Object> createAsList() {
            return ImmutableList.m3621of();
        }
    }

    static class ArrayImmutableCollection<E> extends ImmutableCollection<E> {
        private final E[] elements;

        public boolean isEmpty() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return false;
        }

        ArrayImmutableCollection(E[] eArr) {
            this.elements = eArr;
        }

        public int size() {
            return this.elements.length;
        }

        public UnmodifiableIterator<E> iterator() {
            return Iterators.forArray(this.elements);
        }

        /* access modifiers changed from: package-private */
        public ImmutableList<E> createAsList() {
            E[] eArr = this.elements;
            return eArr.length == 1 ? new SingletonImmutableList(eArr[0]) : new RegularImmutableList(eArr);
        }
    }

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.elements.length == 0 ? ImmutableCollection.EMPTY_IMMUTABLE_COLLECTION : new ArrayImmutableCollection(Platform.clone(this.elements));
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    static abstract class Builder<E> {
        public abstract Builder<E> add(E e);

        public abstract ImmutableCollection<E> build();

        Builder() {
        }

        public Builder<E> add(E... eArr) {
            for (E add : eArr) {
                add(add);
            }
            return this;
        }

        public Builder<E> addAll(Iterable<? extends E> iterable) {
            for (Object add : iterable) {
                add(add);
            }
            return this;
        }

        public Builder<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }
    }
}
