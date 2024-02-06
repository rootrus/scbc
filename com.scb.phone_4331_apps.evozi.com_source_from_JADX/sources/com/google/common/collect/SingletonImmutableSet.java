package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.Set;

final class SingletonImmutableSet<E> extends ImmutableSet<E> {
    private transient Integer cachedHashCode;
    final transient E element;

    public final boolean isEmpty() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isHashCodeFast() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return 1;
    }

    SingletonImmutableSet(E e) {
        this.element = Preconditions.checkNotNull(e);
    }

    SingletonImmutableSet(E e, int i) {
        this.element = e;
        this.cachedHashCode = Integer.valueOf(i);
    }

    public final boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    public final UnmodifiableIterator<E> iterator() {
        return Iterators.singletonIterator(this.element);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.SingletonImmutableSet.toArray(java.lang.Object[]):java.lang.Object[]");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != 1 || !this.element.equals(set.iterator().next())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.cachedHashCode;
        if (num != null) {
            return num.intValue();
        }
        Integer valueOf = Integer.valueOf(this.element.hashCode());
        this.cachedHashCode = valueOf;
        return valueOf.intValue();
    }

    public final String toString() {
        String obj = this.element.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
