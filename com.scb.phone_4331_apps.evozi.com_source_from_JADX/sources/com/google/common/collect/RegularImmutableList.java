package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.List;

class RegularImmutableList<E> extends ImmutableList<E> {
    /* access modifiers changed from: private */
    public final transient Object[] array;
    /* access modifiers changed from: private */
    public final transient int offset;
    private final transient int size;

    public boolean isEmpty() {
        return false;
    }

    RegularImmutableList(Object[] objArr, int i, int i2) {
        this.offset = i;
        this.size = i2;
        this.array = objArr;
    }

    RegularImmutableList(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    public int size() {
        return this.size;
    }

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return (this.offset == 0 && this.size == this.array.length) ? false : true;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public UnmodifiableIterator<E> iterator() {
        return Iterators.forArray(this.array, this.offset, this.size);
    }

    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        System.arraycopy(this.array, this.offset, objArr, 0, this.size);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        int length = tArr.length;
        int i = this.size;
        if (length < i) {
            tArr = ObjectArrays.newArray(tArr, i);
        } else if (tArr.length > i) {
            tArr[i] = null;
        }
        System.arraycopy(this.array, this.offset, tArr, 0, this.size);
        return tArr;
    }

    public E get(int i) {
        Preconditions.checkElementIndex(i, this.size);
        return this.array[i + this.offset];
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int i = this.offset; i < this.offset + this.size; i++) {
            if (this.array[i].equals(obj)) {
                return i - this.offset;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int i = this.offset + this.size;
        while (true) {
            i--;
            if (i < this.offset) {
                return -1;
            }
            if (this.array[i].equals(obj)) {
                return i - this.offset;
            }
        }
    }

    public ImmutableList<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, this.size);
        return i == i2 ? ImmutableList.m3621of() : new RegularImmutableList(this.array, this.offset + i, i2 - i);
    }

    public UnmodifiableListIterator<E> listIterator(int i) {
        return new AbstractIndexedListIterator<E>(this.size, i) {
            /* access modifiers changed from: protected */
            public E get(int i) {
                return RegularImmutableList.this.array[i + RegularImmutableList.this.offset];
            }
        };
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List<Object> list = (List) obj;
        if (size() != list.size()) {
            return false;
        }
        int i = this.offset;
        if (obj instanceof RegularImmutableList) {
            RegularImmutableList regularImmutableList = (RegularImmutableList) obj;
            int i2 = regularImmutableList.offset;
            while (i2 < regularImmutableList.offset + regularImmutableList.size) {
                if (!this.array[i].equals(regularImmutableList.array[i2])) {
                    return false;
                }
                i2++;
                i++;
            }
        } else {
            for (Object equals : list) {
                if (!this.array[i].equals(equals)) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = this.offset; i2 < this.offset + this.size; i2++) {
            i = (i * 31) + this.array[i2].hashCode();
        }
        return i;
    }

    public String toString() {
        StringBuilder newStringBuilderForCollection = Collections2.newStringBuilderForCollection(size());
        newStringBuilderForCollection.append('[');
        newStringBuilderForCollection.append(this.array[this.offset]);
        int i = this.offset;
        while (true) {
            i++;
            if (i < this.offset + this.size) {
                newStringBuilderForCollection.append(", ");
                newStringBuilderForCollection.append(this.array[i]);
            } else {
                newStringBuilderForCollection.append(']');
                return newStringBuilderForCollection.toString();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int offset() {
        return this.offset;
    }

    /* access modifiers changed from: package-private */
    public Object[] array() {
        return this.array;
    }
}
