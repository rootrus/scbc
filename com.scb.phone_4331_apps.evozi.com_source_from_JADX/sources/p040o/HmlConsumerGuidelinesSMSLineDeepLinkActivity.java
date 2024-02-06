package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.HmlConsumerGuidelinesSMSLineDeepLinkActivity */
public final class HmlConsumerGuidelinesSMSLineDeepLinkActivity<T> extends AtomicInteger implements List<T>, RandomAccess {
    private ArrayList<T> IconCompatParcelizer = new ArrayList<>();

    public final int size() {
        return get();
    }

    public final boolean isEmpty() {
        return get() == 0;
    }

    public final boolean contains(Object obj) {
        return this.IconCompatParcelizer.contains(obj);
    }

    public final Iterator<T> iterator() {
        return this.IconCompatParcelizer.iterator();
    }

    public final Object[] toArray() {
        return this.IconCompatParcelizer.toArray();
    }

    public final <E> E[] toArray(E[] eArr) {
        return this.IconCompatParcelizer.toArray(eArr);
    }

    public final boolean add(T t) {
        boolean add = this.IconCompatParcelizer.add(t);
        lazySet(this.IconCompatParcelizer.size());
        return add;
    }

    public final boolean remove(Object obj) {
        boolean remove = this.IconCompatParcelizer.remove(obj);
        lazySet(this.IconCompatParcelizer.size());
        return remove;
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.IconCompatParcelizer.containsAll(collection);
    }

    public final boolean addAll(Collection<? extends T> collection) {
        boolean addAll = this.IconCompatParcelizer.addAll(collection);
        lazySet(this.IconCompatParcelizer.size());
        return addAll;
    }

    public final boolean addAll(int i, Collection<? extends T> collection) {
        boolean addAll = this.IconCompatParcelizer.addAll(i, collection);
        lazySet(this.IconCompatParcelizer.size());
        return addAll;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.IconCompatParcelizer.removeAll(collection);
        lazySet(this.IconCompatParcelizer.size());
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.IconCompatParcelizer.retainAll(collection);
        lazySet(this.IconCompatParcelizer.size());
        return retainAll;
    }

    public final void clear() {
        this.IconCompatParcelizer.clear();
        lazySet(0);
    }

    public final T get(int i) {
        return this.IconCompatParcelizer.get(i);
    }

    public final T set(int i, T t) {
        return this.IconCompatParcelizer.set(i, t);
    }

    public final void add(int i, T t) {
        this.IconCompatParcelizer.add(i, t);
        lazySet(this.IconCompatParcelizer.size());
    }

    public final T remove(int i) {
        T remove = this.IconCompatParcelizer.remove(i);
        lazySet(this.IconCompatParcelizer.size());
        return remove;
    }

    public final int indexOf(Object obj) {
        return this.IconCompatParcelizer.indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        return this.IconCompatParcelizer.lastIndexOf(obj);
    }

    public final ListIterator<T> listIterator() {
        return this.IconCompatParcelizer.listIterator();
    }

    public final ListIterator<T> listIterator(int i) {
        return this.IconCompatParcelizer.listIterator(i);
    }

    public final List<T> subList(int i, int i2) {
        return this.IconCompatParcelizer.subList(i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof HmlConsumerGuidelinesSMSLineDeepLinkActivity) {
            return this.IconCompatParcelizer.equals(((HmlConsumerGuidelinesSMSLineDeepLinkActivity) obj).IconCompatParcelizer);
        }
        return this.IconCompatParcelizer.equals(obj);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        return this.IconCompatParcelizer.toString();
    }
}
