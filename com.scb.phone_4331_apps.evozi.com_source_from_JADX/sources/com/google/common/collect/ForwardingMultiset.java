package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.collect.Multiset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {
    /* access modifiers changed from: protected */
    public abstract Multiset<E> delegate();

    protected ForwardingMultiset() {
    }

    public int count(Object obj) {
        return delegate().count(obj);
    }

    public int add(E e, int i) {
        return delegate().add(e, i);
    }

    public int remove(Object obj, int i) {
        return delegate().remove(obj, i);
    }

    public Set<E> elementSet() {
        return delegate().elementSet();
    }

    public Set<Multiset.Entry<E>> entrySet() {
        return delegate().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || delegate().equals(obj);
    }

    public int hashCode() {
        return delegate().hashCode();
    }

    public int setCount(E e, int i) {
        return delegate().setCount(e, i);
    }

    public boolean setCount(E e, int i, int i2) {
        return delegate().setCount(e, i, i2);
    }

    /* access modifiers changed from: protected */
    public boolean standardContains(Object obj) {
        return count(obj) > 0;
    }

    /* access modifiers changed from: protected */
    public void standardClear() {
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* access modifiers changed from: protected */
    public int standardCount(Object obj) {
        for (Multiset.Entry entry : entrySet()) {
            if (Objects.equal(entry.getElement(), obj)) {
                return entry.getCount();
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean standardAdd(E e) {
        add(e, 1);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean standardAddAll(Collection<? extends E> collection) {
        return Multisets.addAllImpl(this, collection);
    }

    /* access modifiers changed from: protected */
    public boolean standardRemove(Object obj) {
        return remove(obj, 1) > 0;
    }

    /* access modifiers changed from: protected */
    public boolean standardRemoveAll(Collection<?> collection) {
        return Multisets.removeAllImpl(this, collection);
    }

    /* access modifiers changed from: protected */
    public boolean standardRetainAll(Collection<?> collection) {
        return Multisets.retainAllImpl(this, collection);
    }

    /* access modifiers changed from: protected */
    public int standardSetCount(E e, int i) {
        return Multisets.setCountImpl(this, e, i);
    }

    /* access modifiers changed from: protected */
    public boolean standardSetCount(E e, int i, int i2) {
        return Multisets.setCountImpl(this, e, i, i2);
    }

    /* access modifiers changed from: protected */
    public Set<E> standardElementSet() {
        return Multisets.elementSetImpl(this);
    }

    /* access modifiers changed from: protected */
    public Iterator<E> standardIterator() {
        return Multisets.iteratorImpl(this);
    }

    /* access modifiers changed from: protected */
    public int standardSize() {
        return Multisets.sizeImpl(this);
    }

    /* access modifiers changed from: protected */
    public boolean standardEquals(Object obj) {
        return Multisets.equalsImpl(this, obj);
    }

    /* access modifiers changed from: protected */
    public int standardHashCode() {
        return entrySet().hashCode();
    }

    /* access modifiers changed from: protected */
    public String standardToString() {
        return entrySet().toString();
    }
}