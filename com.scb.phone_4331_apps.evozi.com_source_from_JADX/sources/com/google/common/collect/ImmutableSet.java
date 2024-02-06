package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    static final int CUTOFF = 536870912;
    static final int MAX_TABLE_SIZE = 1073741824;

    /* access modifiers changed from: package-private */
    public boolean isHashCodeFast() {
        return false;
    }

    public abstract UnmodifiableIterator<E> iterator();

    /* renamed from: of */
    public static <E> ImmutableSet<E> m89of() {
        return EmptyImmutableSet.INSTANCE;
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m90of(E e) {
        return new SingletonImmutableSet(e);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m91of(E e, E e2) {
        return construct(e, e2);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m92of(E e, E e2, E e3) {
        return construct(e, e2, e3);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m93of(E e, E e2, E e3, E e4) {
        return construct(e, e2, e3, e4);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m94of(E e, E e2, E e3, E e4, E e5) {
        return construct(e, e2, e3, e4, e5);
    }

    /* renamed from: of */
    public static <E> ImmutableSet<E> m95of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        for (int i = 6; i < length; i++) {
            objArr[i] = eArr[i - 6];
        }
        return construct(objArr);
    }

    private static <E> ImmutableSet<E> construct(Object... objArr) {
        int chooseTableSize;
        Object[] objArr2;
        int i;
        int i2;
        do {
            chooseTableSize = chooseTableSize(objArr.length);
            objArr2 = new Object[chooseTableSize];
            i = chooseTableSize - 1;
            ArrayList arrayList = null;
            i2 = 0;
            for (int i3 = 0; i3 < objArr.length; i3++) {
                Object obj = objArr[i3];
                int hashCode = obj.hashCode();
                int smear = Hashing.smear(hashCode);
                while (true) {
                    int i4 = smear & i;
                    Object obj2 = objArr2[i4];
                    if (obj2 == null) {
                        if (arrayList != null) {
                            arrayList.add(obj);
                        }
                        objArr2[i4] = obj;
                        i2 += hashCode;
                    } else if (!obj2.equals(obj)) {
                        smear++;
                    } else if (arrayList == null) {
                        arrayList = new ArrayList(objArr.length);
                        for (int i5 = 0; i5 < i3; i5++) {
                            arrayList.add(objArr[i5]);
                        }
                    }
                }
            }
            if (arrayList != null) {
                objArr = arrayList.toArray();
            }
            if (objArr.length == 1) {
                return new SingletonImmutableSet(objArr[0], i2);
            }
        } while (chooseTableSize > (chooseTableSize(objArr.length) << 1));
        return new RegularImmutableSet(objArr, i2, objArr2, i);
    }

    static int chooseTableSize(int i) {
        if (i < 536870912) {
            return Integer.highestOneBit(i) << 2;
        }
        Preconditions.checkArgument(i < 1073741824, "collection too large");
        return 1073741824;
    }

    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableSet<E> m96of(E[] eArr) {
        return copyOf(eArr);
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m89of();
        }
        if (length != 1) {
            return construct((Object[]) eArr.clone());
        }
        return m90of(eArr[0]);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? copyOf(Collections2.cast(iterable)) : copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        return copyFromCollection(Lists.newArrayList(it));
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof ImmutableSortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        return copyFromCollection(collection);
    }

    private static <E> ImmutableSet<E> copyFromCollection(Collection<? extends E> collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return m89of();
        }
        if (length != 1) {
            return construct(array);
        }
        return m90of(array[0]);
    }

    ImmutableSet() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableSet) || !isHashCodeFast() || !((ImmutableSet) obj).isHashCodeFast() || hashCode() == obj.hashCode()) {
            return Sets.equalsImpl(this, obj);
        }
        return false;
    }

    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    static abstract class ArrayImmutableSet<E> extends ImmutableSet<E> {
        final transient Object[] elements;

        public boolean isEmpty() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return false;
        }

        ArrayImmutableSet(Object[] objArr) {
            this.elements = objArr;
        }

        public int size() {
            return this.elements.length;
        }

        public UnmodifiableIterator<E> iterator() {
            return Iterators.forArray(this.elements);
        }

        public Object[] toArray() {
            Object[] objArr = new Object[size()];
            System.arraycopy(this.elements, 0, objArr, 0, size());
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = ObjectArrays.newArray(tArr, size);
            } else if (tArr.length > size) {
                tArr[size] = null;
            }
            System.arraycopy(this.elements, 0, tArr, 0, size);
            return tArr;
        }

        public boolean containsAll(Collection<?> collection) {
            if (collection == this) {
                return true;
            }
            if (!(collection instanceof ArrayImmutableSet)) {
                return ImmutableSet.super.containsAll(collection);
            }
            if (collection.size() > size()) {
                return false;
            }
            for (Object contains : ((ArrayImmutableSet) collection).elements) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public ImmutableList<E> createAsList() {
            return new ImmutableAsList(this.elements, this);
        }
    }

    static abstract class TransformedImmutableSet<D, E> extends ImmutableSet<E> {
        final int hashCode;
        final D[] source;

        public boolean isEmpty() {
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isHashCodeFast() {
            return true;
        }

        /* access modifiers changed from: package-private */
        public abstract E transform(D d);

        TransformedImmutableSet(D[] dArr, int i) {
            this.source = dArr;
            this.hashCode = i;
        }

        public int size() {
            return this.source.length;
        }

        public UnmodifiableIterator<E> iterator() {
            return new AbstractIndexedListIterator<E>(this.source.length) {
                /* access modifiers changed from: protected */
                public E get(int i) {
                    TransformedImmutableSet transformedImmutableSet = TransformedImmutableSet.this;
                    return transformedImmutableSet.transform(transformedImmutableSet.source[i]);
                }
            };
        }

        public Object[] toArray() {
            return toArray(new Object[size()]);
        }

        public <T> T[] toArray(T[] tArr) {
            int size = size();
            if (tArr.length < size) {
                tArr = ObjectArrays.newArray(tArr, size);
            } else if (tArr.length > size) {
                tArr[size] = null;
            }
            int i = 0;
            while (true) {
                D[] dArr = this.source;
                if (i >= dArr.length) {
                    return tArr;
                }
                tArr[i] = transform(dArr[i]);
                i++;
            }
        }

        public final int hashCode() {
            return this.hashCode;
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
            return ImmutableSet.copyOf((E[]) this.elements);
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static class Builder<E> extends ImmutableCollection.Builder<E> {
        final ArrayList<E> contents = Lists.newArrayList();

        public Builder<E> add(E e) {
            this.contents.add(Preconditions.checkNotNull(e));
            return this;
        }

        public Builder<E> add(E... eArr) {
            ArrayList<E> arrayList = this.contents;
            arrayList.ensureCapacity(arrayList.size() + eArr.length);
            super.add(eArr);
            return this;
        }

        public Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Collection) {
                ArrayList<E> arrayList = this.contents;
                arrayList.ensureCapacity(arrayList.size() + ((Collection) iterable).size());
            }
            super.addAll(iterable);
            return this;
        }

        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll(it);
            return this;
        }

        public ImmutableSet<E> build() {
            return ImmutableSet.copyOf(this.contents);
        }
    }
}
