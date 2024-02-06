package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ImmutableMultiset<E> extends ImmutableCollection<E> implements Multiset<E> {
    private static final long serialVersionUID = 0;
    private transient ImmutableSet<Multiset.Entry<E>> entrySet;
    /* access modifiers changed from: private */
    public final transient ImmutableMap<E, Integer> map;
    private final transient int size;

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return this;
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m3647of() {
        return EmptyImmutableMultiset.INSTANCE;
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m3648of(E e) {
        return copyOfInternal((E[]) new Object[]{e});
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m3649of(E e, E e2) {
        return copyOfInternal((E[]) new Object[]{e, e2});
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m3650of(E e, E e2, E e3) {
        return copyOfInternal((E[]) new Object[]{e, e2, e3});
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m3651of(E e, E e2, E e3, E e4) {
        return copyOfInternal((E[]) new Object[]{e, e2, e3, e4});
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m3652of(E e, E e2, E e3, E e4, E e5) {
        return copyOfInternal((E[]) new Object[]{e, e2, e3, e4, e5});
    }

    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m3653of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        ArrayList arrayList = new ArrayList(eArr.length + 6);
        Collections.addAll(arrayList, new Object[]{e, e2, e3, e4, e5, e6});
        Collections.addAll(arrayList, eArr);
        return copyOf(arrayList);
    }

    @Deprecated
    /* renamed from: of */
    public static <E> ImmutableMultiset<E> m3654of(E[] eArr) {
        return copyOf(Arrays.asList(eArr));
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return copyOf(Arrays.asList(eArr));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<? extends E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <E> com.google.common.collect.ImmutableMultiset<E> copyOf(java.lang.Iterable<? extends E> r2) {
        /*
            boolean r0 = r2 instanceof com.google.common.collect.ImmutableMultiset
            if (r0 == 0) goto L_0x000e
            r0 = r2
            com.google.common.collect.ImmutableMultiset r0 = (com.google.common.collect.ImmutableMultiset) r0
            boolean r1 = r0.isPartialView()
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            boolean r0 = r2 instanceof com.google.common.collect.Multiset
            if (r0 == 0) goto L_0x0017
            com.google.common.collect.Multiset r2 = com.google.common.collect.Multisets.cast(r2)
            goto L_0x001b
        L_0x0017:
            com.google.common.collect.LinkedHashMultiset r2 = com.google.common.collect.LinkedHashMultiset.create(r2)
        L_0x001b:
            com.google.common.collect.ImmutableMultiset r2 = copyOfInternal(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableMultiset.copyOf(java.lang.Iterable):com.google.common.collect.ImmutableMultiset");
    }

    private static <E> ImmutableMultiset<E> copyOfInternal(E... eArr) {
        return copyOf(Arrays.asList(eArr));
    }

    private static <E> ImmutableMultiset<E> copyOfInternal(Multiset<? extends E> multiset) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        long j = 0;
        for (Multiset.Entry next : multiset.entrySet()) {
            int count = next.getCount();
            if (count > 0) {
                builder.put(next.getElement(), Integer.valueOf(count));
                j += (long) count;
            }
        }
        if (j == 0) {
            return m3647of();
        }
        return new ImmutableMultiset<>(builder.build(), Ints.saturatedCast(j));
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        LinkedHashMultiset create = LinkedHashMultiset.create();
        Iterators.addAll(create, it);
        return copyOfInternal(create);
    }

    static class FieldSettersHolder {
        static final Serialization.FieldSetter<ImmutableMultiset> MAP_FIELD_SETTER = Serialization.getFieldSetter(ImmutableMultiset.class, "map");
        static final Serialization.FieldSetter<ImmutableMultiset> SIZE_FIELD_SETTER = Serialization.getFieldSetter(ImmutableMultiset.class, "size");

        private FieldSettersHolder() {
        }
    }

    ImmutableMultiset(ImmutableMap<E, Integer> immutableMap, int i) {
        this.map = immutableMap;
        this.size = i;
    }

    /* access modifiers changed from: package-private */
    public boolean isPartialView() {
        return this.map.isPartialView();
    }

    public int count(Object obj) {
        Integer num = this.map.get(obj);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public UnmodifiableIterator<E> iterator() {
        final UnmodifiableIterator<Map.Entry<E, Integer>> it = this.map.entrySet().iterator();
        return new UnmodifiableIterator<E>() {
            E element;
            int remaining;

            public boolean hasNext() {
                return this.remaining > 0 || it.hasNext();
            }

            public E next() {
                if (this.remaining <= 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.element = entry.getKey();
                    this.remaining = ((Integer) entry.getValue()).intValue();
                }
                this.remaining--;
                return this.element;
            }
        };
    }

    public int size() {
        return this.size;
    }

    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    public int add(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public int remove(Object obj, int i) {
        throw new UnsupportedOperationException();
    }

    public int setCount(E e, int i) {
        throw new UnsupportedOperationException();
    }

    public boolean setCount(E e, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Multiset)) {
            return false;
        }
        Multiset multiset = (Multiset) obj;
        if (size() != multiset.size()) {
            return false;
        }
        for (Multiset.Entry entry : multiset.entrySet()) {
            if (count(entry.getElement()) != entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return entrySet().toString();
    }

    public Set<E> elementSet() {
        return this.map.keySet();
    }

    public Set<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.entrySet;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet2 = new EntrySet(this);
        this.entrySet = entrySet2;
        return entrySet2;
    }

    static class EntrySet<E> extends ImmutableSet<Multiset.Entry<E>> {
        private static final long serialVersionUID = 0;
        final ImmutableMultiset<E> multiset;

        /* access modifiers changed from: package-private */
        public Object writeReplace() {
            return this;
        }

        public EntrySet(ImmutableMultiset<E> immutableMultiset) {
            this.multiset = immutableMultiset;
        }

        public UnmodifiableIterator<Multiset.Entry<E>> iterator() {
            final UnmodifiableIterator it = this.multiset.map.entrySet().iterator();
            return new UnmodifiableIterator<Multiset.Entry<E>>() {
                public boolean hasNext() {
                    return it.hasNext();
                }

                public Multiset.Entry<E> next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    return Multisets.immutableEntry(entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            };
        }

        public int size() {
            return this.multiset.map.size();
        }

        /* access modifiers changed from: package-private */
        public boolean isPartialView() {
            return this.multiset.isPartialView();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (entry.getCount() > 0 && this.multiset.count(entry.getElement()) == entry.getCount()) {
                return true;
            }
            return false;
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
            Iterator it = iterator();
            while (it.hasNext()) {
                tArr[i] = (Multiset.Entry) it.next();
                i++;
            }
            return tArr;
        }

        public int hashCode() {
            return this.multiset.map.hashCode();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultiset(this, objectOutputStream);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        long j = 0;
        int i = 0;
        while (i < readInt) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 > 0) {
                builder.put(readObject, Integer.valueOf(readInt2));
                j += (long) readInt2;
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid count ");
                sb.append(readInt2);
                throw new InvalidObjectException(sb.toString());
            }
        }
        FieldSettersHolder.MAP_FIELD_SETTER.set(this, (Object) builder.build());
        FieldSettersHolder.SIZE_FIELD_SETTER.set(this, Ints.saturatedCast(j));
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static final class Builder<E> extends ImmutableCollection.Builder<E> {
        private final Multiset<E> contents = LinkedHashMultiset.create();

        public final Builder<E> add(E e) {
            this.contents.add(Preconditions.checkNotNull(e));
            return this;
        }

        public final Builder<E> addCopies(E e, int i) {
            this.contents.add(Preconditions.checkNotNull(e), i);
            return this;
        }

        public final Builder<E> setCount(E e, int i) {
            this.contents.setCount(Preconditions.checkNotNull(e), i);
            return this;
        }

        public final Builder<E> add(E... eArr) {
            super.add(eArr);
            return this;
        }

        public final Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Multiset) {
                for (Multiset.Entry next : Multisets.cast(iterable).entrySet()) {
                    addCopies(next.getElement(), next.getCount());
                }
            } else {
                super.addAll(iterable);
            }
            return this;
        }

        public final Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll(it);
            return this;
        }

        public final ImmutableMultiset<E> build() {
            return ImmutableMultiset.copyOf(this.contents);
        }
    }
}
