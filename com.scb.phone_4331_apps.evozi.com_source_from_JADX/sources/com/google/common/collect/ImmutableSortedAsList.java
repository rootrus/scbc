package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableAsList;

final class ImmutableSortedAsList<E> extends ImmutableList<E> {
    private final transient ImmutableList<E> backingList;
    private final transient ImmutableSortedSet<E> backingSet;

    ImmutableSortedAsList(ImmutableSortedSet<E> immutableSortedSet, ImmutableList<E> immutableList) {
        this.backingSet = immutableSortedSet;
        this.backingList = immutableList;
    }

    public final boolean contains(Object obj) {
        return this.backingSet.indexOf(obj) >= 0;
    }

    public final int indexOf(Object obj) {
        return this.backingSet.indexOf(obj);
    }

    public final int lastIndexOf(Object obj) {
        return this.backingSet.indexOf(obj);
    }

    public final ImmutableList<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, size());
        return i == i2 ? ImmutableList.m3621of() : new RegularImmutableSortedSet(this.backingList.subList(i, i2), this.backingSet.comparator()).asList();
    }

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return new ImmutableAsList.SerializedForm(this.backingSet);
    }

    public final UnmodifiableIterator<E> iterator() {
        return this.backingList.iterator();
    }

    public final E get(int i) {
        return this.backingList.get(i);
    }

    public final UnmodifiableListIterator<E> listIterator() {
        return this.backingList.listIterator();
    }

    public final UnmodifiableListIterator<E> listIterator(int i) {
        return this.backingList.listIterator(i);
    }

    public final int size() {
        return this.backingList.size();
    }

    public final boolean equals(Object obj) {
        return this.backingList.equals(obj);
    }

    public final int hashCode() {
        return this.backingList.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return this.backingList.isPartialView();
    }
}
