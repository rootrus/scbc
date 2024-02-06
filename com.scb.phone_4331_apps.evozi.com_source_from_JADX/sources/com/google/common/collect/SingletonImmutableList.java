package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.List;
import java.util.NoSuchElementException;

final class SingletonImmutableList<E> extends ImmutableList<E> {
    final transient E element;

    public final boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final ImmutableList<E> reverse() {
        return this;
    }

    public final int size() {
        return 1;
    }

    SingletonImmutableList(E e) {
        this.element = Preconditions.checkNotNull(e);
    }

    public final E get(int i) {
        Preconditions.checkElementIndex(i, 1);
        return this.element;
    }

    public final int indexOf(Object obj) {
        return this.element.equals(obj) ? 0 : -1;
    }

    public final UnmodifiableIterator<E> iterator() {
        return Iterators.singletonIterator(this.element);
    }

    public final int lastIndexOf(Object obj) {
        return this.element.equals(obj) ? 0 : -1;
    }

    public final UnmodifiableListIterator<E> listIterator(final int i) {
        Preconditions.checkPositionIndex(i, 1);
        return new UnmodifiableListIterator<E>() {
            boolean hasNext;

            {
                this.hasNext = i == 0;
            }

            public boolean hasNext() {
                return this.hasNext;
            }

            public boolean hasPrevious() {
                return !this.hasNext;
            }

            public E next() {
                if (this.hasNext) {
                    this.hasNext = false;
                    return SingletonImmutableList.this.element;
                }
                throw new NoSuchElementException();
            }

            public int nextIndex() {
                return this.hasNext ^ true ? 1 : 0;
            }

            public E previous() {
                if (!this.hasNext) {
                    this.hasNext = true;
                    return SingletonImmutableList.this.element;
                }
                throw new NoSuchElementException();
            }

            public int previousIndex() {
                return this.hasNext ? -1 : 0;
            }
        };
    }

    public final ImmutableList<E> subList(int i, int i2) {
        Preconditions.checkPositionIndexes(i, i2, 1);
        return i == i2 ? ImmutableList.m3621of() : this;
    }

    public final boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (list.size() != 1 || !this.element.equals(list.get(0))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.element.hashCode() + 31;
    }

    public final String toString() {
        String obj = this.element.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    public final Object[] toArray() {
        return new Object[]{this.element};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: T[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: T[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T[] toArray(T[] r3) {
        /*
            r2 = this;
            int r0 = r3.length
            r1 = 1
            if (r0 != 0) goto L_0x0009
            java.lang.Object[] r3 = com.google.common.collect.ObjectArrays.newArray((T[]) r3, (int) r1)
            goto L_0x000f
        L_0x0009:
            int r0 = r3.length
            if (r0 <= r1) goto L_0x000f
            r0 = 0
            r3[r1] = r0
        L_0x000f:
            r0 = 0
            E r1 = r2.element
            r3[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.SingletonImmutableList.toArray(java.lang.Object[]):java.lang.Object[]");
    }
}
