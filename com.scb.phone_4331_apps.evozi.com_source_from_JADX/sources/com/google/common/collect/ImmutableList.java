package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    public ImmutableList<E> asList() {
        return this;
    }

    public abstract int indexOf(Object obj);

    public abstract int lastIndexOf(Object obj);

    public abstract UnmodifiableListIterator<E> listIterator(int i);

    public abstract ImmutableList<E> subList(int i, int i2);

    /* renamed from: of */
    public static <E> ImmutableList<E> m3621of() {
        return EmptyImmutableList.INSTANCE;
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3622of(E e) {
        return new SingletonImmutableList(e);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3623of(E e, E e2) {
        return construct(e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3624of(E e, E e2, E e3) {
        return construct(e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3625of(E e, E e2, E e3, E e4) {
        return construct(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3626of(E e, E e2, E e3, E e4, E e5) {
        return construct(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3627of(E e, E e2, E e3, E e4, E e5, E e6) {
        return construct(e, e2, e3, e4, e5, e6);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3628of(E e, E e2, E e3, E e4, E e5, E e6, E e7) {
        return construct(e, e2, e3, e4, e5, e6, e7);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3629of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3630of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3631of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3632of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11) {
        return construct(e, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11);
    }

    /* renamed from: of */
    public static <E> ImmutableList<E> m3633of(E e, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10, E e11, E e12, E... eArr) {
        Object[] objArr = new Object[(eArr.length + 12)];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        objArr[6] = e7;
        objArr[7] = e8;
        objArr[8] = e9;
        objArr[9] = e10;
        objArr[10] = e11;
        objArr[11] = e12;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return construct(objArr);
    }

    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableList<E> m3634of(E[] eArr) {
        return copyOf(eArr);
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        return iterable instanceof Collection ? copyOf(Collections2.cast(iterable)) : copyOf(iterable.iterator());
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (!(collection instanceof ImmutableCollection)) {
            return copyFromCollection(collection);
        }
        ImmutableList<E> asList = ((ImmutableCollection) collection).asList();
        return asList.isPartialView() ? copyFromCollection(asList) : asList;
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        return copyFromCollection(Lists.newArrayList(it));
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m3621of();
        }
        if (length != 1) {
            return construct((Object[]) eArr.clone());
        }
        return new SingletonImmutableList(eArr[0]);
    }

    private static <E> ImmutableList<E> copyFromCollection(Collection<? extends E> collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return m3621of();
        }
        if (length != 1) {
            return construct(array);
        }
        return new SingletonImmutableList(array[0]);
    }

    private static <E> ImmutableList<E> construct(Object... objArr) {
        for (int i = 0; i < objArr.length; i++) {
            checkElementNotNull(objArr[i], i);
        }
        return new RegularImmutableList(objArr);
    }

    private static Object checkElementNotNull(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    ImmutableList() {
    }

    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> reverse() {
        return new ReverseImmutableList(this);
    }

    static class ReverseImmutableList<E> extends ImmutableList<E> {
        private final transient ImmutableList<E> forwardList;
        private final transient int size;

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return ImmutableList.super.iterator();
        }

        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return ImmutableList.super.listIterator();
        }

        ReverseImmutableList(ImmutableList<E> immutableList) {
            this.forwardList = immutableList;
            this.size = immutableList.size();
        }

        /* access modifiers changed from: private */
        public int reverseIndex(int i) {
            return (this.size - 1) - i;
        }

        private int reversePosition(int i) {
            return this.size - i;
        }

        public ImmutableList<E> reverse() {
            return this.forwardList;
        }

        public boolean contains(Object obj) {
            return this.forwardList.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.forwardList.containsAll(collection);
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.forwardList.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return reverseIndex(lastIndexOf);
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.forwardList.indexOf(obj);
            if (indexOf >= 0) {
                return reverseIndex(indexOf);
            }
            return -1;
        }

        public ImmutableList<E> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, this.size);
            return this.forwardList.subList(reversePosition(i2), reversePosition(i)).reverse();
        }

        public E get(int i) {
            Preconditions.checkElementIndex(i, this.size);
            return this.forwardList.get(reverseIndex(i));
        }

        public UnmodifiableListIterator<E> listIterator(int i) {
            Preconditions.checkPositionIndex(i, this.size);
            final UnmodifiableListIterator<E> listIterator = this.forwardList.listIterator(reversePosition(i));
            return new UnmodifiableListIterator<E>() {
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                public E next() {
                    return listIterator.previous();
                }

                public int nextIndex() {
                    return ReverseImmutableList.this.reverseIndex(listIterator.previousIndex());
                }

                public E previous() {
                    return listIterator.next();
                }

                public int previousIndex() {
                    return ReverseImmutableList.this.reverseIndex(listIterator.nextIndex());
                }
            };
        }

        public int size() {
            return this.size;
        }

        public boolean isEmpty() {
            return this.forwardList.isEmpty();
        }

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return this.forwardList.isPartialView();
        }
    }

    public boolean equals(Object obj) {
        return Lists.equalsImpl(this, obj);
    }

    public int hashCode() {
        return Lists.hashCodeImpl(this);
    }

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return ImmutableList.copyOf((E[]) this.elements);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static final class Builder<E> extends ImmutableCollection.Builder<E> {
        private final ArrayList<E> contents = Lists.newArrayList();

        public final Builder<E> add(E e) {
            this.contents.add(Preconditions.checkNotNull(e));
            return this;
        }

        public final Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                ArrayList<E> arrayList = this.contents;
                arrayList.ensureCapacity(arrayList.size() + ((Collection) iterable).size());
            }
            super.addAll(iterable);
            return this;
        }

        public final Builder<E> add(E... eArr) {
            ArrayList<E> arrayList = this.contents;
            arrayList.ensureCapacity(arrayList.size() + eArr.length);
            super.add(eArr);
            return this;
        }

        public final Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll(it);
            return this;
        }

        public final ImmutableList<E> build() {
            return ImmutableList.copyOf(this.contents);
        }
    }
}
