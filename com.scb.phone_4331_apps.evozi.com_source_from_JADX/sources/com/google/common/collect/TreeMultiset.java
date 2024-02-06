package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class TreeMultiset<E> extends AbstractMapBasedMultiset<E> {
    private static final long serialVersionUID = 0;

    public final /* bridge */ /* synthetic */ int add(Object obj, int i) {
        return super.add(obj, i);
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public final /* bridge */ /* synthetic */ int remove(Object obj, int i) {
        return super.remove(obj, i);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ int setCount(Object obj, int i) {
        return super.setCount(obj, i);
    }

    public final /* bridge */ /* synthetic */ boolean setCount(Object obj, int i, int i2) {
        return super.setCount(obj, i, i2);
    }

    public final /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>();
    }

    public static <E> TreeMultiset<E> create(Comparator<? super E> comparator) {
        return new TreeMultiset<>(comparator);
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> create = create();
        Iterables.addAll(create, iterable);
        return create;
    }

    private TreeMultiset() {
        super(new TreeMap());
    }

    private TreeMultiset(Comparator<? super E> comparator) {
        super(new TreeMap(comparator));
    }

    public final SortedSet<E> elementSet() {
        return (SortedSet) super.elementSet();
    }

    public final int count(Object obj) {
        try {
            return super.count(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final Set<E> createElementSet() {
        return new SortedMapBasedElementSet((SortedMap) backingMap());
    }

    class SortedMapBasedElementSet extends AbstractMapBasedMultiset<E>.MapBasedElementSet implements SortedSet<E> {
        SortedMapBasedElementSet(SortedMap<E, AtomicInteger> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        public SortedMap<E, AtomicInteger> sortedMap() {
            return (SortedMap) getMap();
        }

        public Comparator<? super E> comparator() {
            return sortedMap().comparator();
        }

        public E first() {
            return sortedMap().firstKey();
        }

        public E last() {
            return sortedMap().lastKey();
        }

        public SortedSet<E> headSet(E e) {
            return new SortedMapBasedElementSet(sortedMap().headMap(e));
        }

        public SortedSet<E> subSet(E e, E e2) {
            return new SortedMapBasedElementSet(sortedMap().subMap(e, e2));
        }

        public SortedSet<E> tailSet(E e) {
            return new SortedMapBasedElementSet(sortedMap().tailMap(e));
        }

        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        Serialization.writeMultiset(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        setBackingMap(new TreeMap((Comparator) objectInputStream.readObject()));
        Serialization.populateMultiset(this, objectInputStream);
    }
}
