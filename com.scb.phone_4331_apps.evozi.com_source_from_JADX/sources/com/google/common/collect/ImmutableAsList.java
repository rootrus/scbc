package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

final class ImmutableAsList<E> extends RegularImmutableList<E> {
    private final transient ImmutableCollection<E> collection;

    ImmutableAsList(Object[] objArr, ImmutableCollection<E> immutableCollection) {
        super(objArr, 0, objArr.length);
        this.collection = immutableCollection;
    }

    public final boolean contains(Object obj) {
        return this.collection.contains(obj);
    }

    static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final ImmutableCollection<?> collection;

        SerializedForm(ImmutableCollection<?> immutableCollection) {
            this.collection = immutableCollection;
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.collection.asList();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* access modifiers changed from: package-private */
    public final Object writeReplace() {
        return new SerializedForm(this.collection);
    }
}
