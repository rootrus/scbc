package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.Multiset;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {
    private transient Set<E> elementSet;

    public abstract Set<Multiset.Entry<E>> entrySet();

    AbstractMultiset() {
    }

    public int size() {
        return Multisets.sizeImpl(this);
    }

    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    public Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    public int count(Object obj) {
        for (Multiset.Entry entry : entrySet()) {
            if (Objects.equal(entry.getElement(), obj)) {
                return entry.getCount();
            }
        }
        return 0;
    }

    public boolean add(E e) {
        add(e, 1);
        return true;
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int setCount(E e, int i) {
        return Multisets.setCountImpl(this, e, i);
    }

    public boolean setCount(E e, int i, int i2) {
        return Multisets.setCountImpl(this, e, i, i2);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return Multisets.addAllImpl(this, collection);
    }

    public boolean removeAll(Collection<?> collection) {
        return Multisets.removeAllImpl(this, collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return Multisets.retainAllImpl(this, collection);
    }

    public void clear() {
        entrySet().clear();
    }

    public Set<E> elementSet() {
        Set<E> set = this.elementSet;
        if (set != null) {
            return set;
        }
        Set<E> createElementSet = createElementSet();
        this.elementSet = createElementSet;
        return createElementSet;
    }

    /* access modifiers changed from: package-private */
    public Set<E> createElementSet() {
        return Multisets.elementSetImpl(this);
    }

    public boolean equals(Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    public int hashCode() {
        return entrySet().hashCode();
    }

    public String toString() {
        return entrySet().toString();
    }
}
