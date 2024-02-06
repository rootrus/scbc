package com.google.firebase.crashlytics.internal.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class ImmutableList<E> implements List<E>, RandomAccess {
    private final List<E> immutableList;

    public static <E> ImmutableList<E> from(E... eArr) {
        return new ImmutableList<>(Arrays.asList(eArr));
    }

    public static <E> ImmutableList<E> from(List<E> list) {
        return new ImmutableList<>(list);
    }

    private ImmutableList(List<E> list) {
        this.immutableList = Collections.unmodifiableList(list);
    }

    public final int size() {
        return this.immutableList.size();
    }

    public final boolean isEmpty() {
        return this.immutableList.isEmpty();
    }

    public final boolean contains(Object obj) {
        return this.immutableList.contains(obj);
    }

    public final Iterator<E> iterator() {
        return this.immutableList.iterator();
    }

    public final Object[] toArray() {
        return this.immutableList.toArray();
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.immutableList.toArray(tArr);
    }

    public final boolean add(E e) {
        return this.immutableList.add(e);
    }

    public final boolean remove(Object obj) {
        return this.immutableList.remove(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.immutableList.containsAll(collection);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return this.immutableList.addAll(collection);
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.immutableList.addAll(i, collection);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.immutableList.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.immutableList.retainAll(collection);
    }

    public final void clear() {
        this.immutableList.clear();
    }

    public final boolean equals(Object obj) {
        return this.immutableList.equals(obj);
    }

    public final int hashCode() {
        return this.immutableList.hashCode();
    }

    public final E get(int i) {
        return this.immutableList.get(i);
    }

    public final E set(int i, E e) {
        return this.immutableList.set(i, e);
    }

    public final void add(int i, E e) {
        this.immutableList.add(i, e);
    }

    public final E remove(int i) {
        return this.immutableList.remove(i);
    }

    public final int indexOf(Object obj) {
        return this.immutableList.indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        return this.immutableList.lastIndexOf(obj);
    }

    public final ListIterator<E> listIterator() {
        return this.immutableList.listIterator();
    }

    public final ListIterator<E> listIterator(int i) {
        return this.immutableList.listIterator(i);
    }

    public final List<E> subList(int i, int i2) {
        return this.immutableList.subList(i, i2);
    }
}
