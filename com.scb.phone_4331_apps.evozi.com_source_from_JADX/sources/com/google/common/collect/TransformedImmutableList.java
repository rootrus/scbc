package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

abstract class TransformedImmutableList<D, E> extends ImmutableList<E> {
    private final transient ImmutableList<D> backingList;

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public abstract E transform(D d);

    class TransformedView extends TransformedImmutableList<D, E> {
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return TransformedImmutableList.super.listIterator(i);
        }

        public /* bridge */ /* synthetic */ List subList(int i, int i2) {
            return TransformedImmutableList.super.subList(i, i2);
        }

        TransformedView(ImmutableList<D> immutableList) {
            super(immutableList);
        }

        /* access modifiers changed from: package-private */
        public E transform(D d) {
            return TransformedImmutableList.this.transform(d);
        }
    }

    TransformedImmutableList(ImmutableList<D> immutableList) {
        this.backingList = (ImmutableList) Preconditions.checkNotNull(immutableList);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = 0; i < size(); i++) {
            if (get(i).equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (get(size).equals(obj)) {
                return size;
            }
        }
        return -1;
    }

    public E get(int i) {
        return transform(this.backingList.get(i));
    }

    public UnmodifiableListIterator<E> listIterator(int i) {
        return new AbstractIndexedListIterator<E>(size(), i) {
            /* access modifiers changed from: protected */
            public E get(int i) {
                return TransformedImmutableList.this.get(i);
            }
        };
    }

    public int size() {
        return this.backingList.size();
    }

    public ImmutableList<E> subList(int i, int i2) {
        return new TransformedView(this.backingList.subList(i, i2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (size() != list.size() || !Iterators.elementsEqual(iterator(), list.iterator())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        Iterator it = iterator();
        int i2 = 1;
        while (it.hasNext()) {
            Object next = it.next();
            if (next == null) {
                i = 0;
            } else {
                i = next.hashCode();
            }
            i2 = (i2 * 31) + i;
        }
        return i2;
    }

    public Object[] toArray() {
        return ObjectArrays.toArrayImpl(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return ObjectArrays.toArrayImpl(this, tArr);
    }
}
