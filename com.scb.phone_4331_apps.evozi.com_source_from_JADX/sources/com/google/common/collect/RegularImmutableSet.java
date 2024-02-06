package com.google.common.collect;

import com.google.common.collect.ImmutableSet;

final class RegularImmutableSet<E> extends ImmutableSet.ArrayImmutableSet<E> {
    private final transient int hashCode;
    private final transient int mask;
    final transient Object[] table;

    /* access modifiers changed from: package-private */
    public final boolean isHashCodeFast() {
        return true;
    }

    RegularImmutableSet(Object[] objArr, int i, Object[] objArr2, int i2) {
        super(objArr);
        this.table = objArr2;
        this.mask = i2;
        this.hashCode = i;
    }

    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int smear = Hashing.smear(obj.hashCode());
        while (true) {
            Object obj2 = this.table[this.mask & smear];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            smear++;
        }
    }

    public final int hashCode() {
        return this.hashCode;
    }
}
