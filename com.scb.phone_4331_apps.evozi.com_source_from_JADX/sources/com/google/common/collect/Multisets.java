package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

public final class Multisets {
    private Multisets() {
    }

    public static <E> Multiset<E> unmodifiableMultiset(Multiset<? extends E> multiset) {
        return new UnmodifiableMultiset((Multiset) Preconditions.checkNotNull(multiset));
    }

    static class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Multiset<? extends E> delegate;
        transient Set<E> elementSet;
        transient Set<Multiset.Entry<E>> entrySet;

        UnmodifiableMultiset(Multiset<? extends E> multiset) {
            this.delegate = multiset;
        }

        /* access modifiers changed from: protected */
        public Multiset<E> delegate() {
            return this.delegate;
        }

        public Set<E> elementSet() {
            Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            Set<E> unmodifiableSet = Collections.unmodifiableSet(this.delegate.elementSet());
            this.elementSet = unmodifiableSet;
            return unmodifiableSet;
        }

        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Multiset.Entry<E>> unmodifiableSet = Collections.unmodifiableSet(this.delegate.entrySet());
            this.entrySet = unmodifiableSet;
            return unmodifiableSet;
        }

        public Iterator<E> iterator() {
            return Iterators.unmodifiableIterator(this.delegate.iterator());
        }

        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        public int add(E e, int i) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public int remove(Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            throw new UnsupportedOperationException();
        }

        public int setCount(E e, int i) {
            throw new UnsupportedOperationException();
        }

        public boolean setCount(E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    public static <E> Multiset.Entry<E> immutableEntry(final E e, final int i) {
        Preconditions.checkArgument(i >= 0);
        return new AbstractEntry<E>() {
            public final E getElement() {
                return e;
            }

            public final int getCount() {
                return i;
            }
        };
    }

    static <E> Multiset<E> forSet(Set<E> set) {
        return new SetMultiset(set);
    }

    static class SetMultiset<E> extends ForwardingCollection<E> implements Multiset<E>, Serializable {
        private static final long serialVersionUID = 0;
        final Set<E> delegate;
        transient Set<E> elementSet;
        transient Set<Multiset.Entry<E>> entrySet;

        SetMultiset(Set<E> set) {
            this.delegate = (Set) Preconditions.checkNotNull(set);
        }

        /* access modifiers changed from: protected */
        public Set<E> delegate() {
            return this.delegate;
        }

        public int count(Object obj) {
            return this.delegate.contains(obj) ? 1 : 0;
        }

        public int add(E e, int i) {
            throw new UnsupportedOperationException();
        }

        public int remove(Object obj, int i) {
            if (i == 0) {
                return count(obj);
            }
            Preconditions.checkArgument(i > 0);
            return this.delegate.remove(obj) ? 1 : 0;
        }

        public Set<E> elementSet() {
            Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            ElementSet elementSet2 = new ElementSet();
            this.elementSet = elementSet2;
            return elementSet2;
        }

        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            EntrySet entrySet2 = new EntrySet();
            this.entrySet = entrySet2;
            return entrySet2;
        }

        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public int setCount(E e, int i) {
            Multisets.checkNonnegative(i, "count");
            if (i == count(e)) {
                return i;
            }
            if (i == 0) {
                remove(e);
                return 1;
            }
            throw new UnsupportedOperationException();
        }

        public boolean setCount(E e, int i, int i2) {
            return Multisets.setCountImpl(this, e, i, i2);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Multiset)) {
                return false;
            }
            Multiset multiset = (Multiset) obj;
            if (size() != multiset.size() || !this.delegate.equals(multiset.elementSet())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    i = 0;
                } else {
                    i = next.hashCode();
                }
                i2 += i ^ 1;
            }
            return i2;
        }

        class ElementSet extends ForwardingSet<E> {
            ElementSet() {
            }

            /* access modifiers changed from: protected */
            public Set<E> delegate() {
                return SetMultiset.this.delegate;
            }

            public boolean add(E e) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }
        }

        class EntrySet extends AbstractSet<Multiset.Entry<E>> {
            EntrySet() {
            }

            public int size() {
                return SetMultiset.this.delegate.size();
            }

            public Iterator<Multiset.Entry<E>> iterator() {
                return new Iterator<Multiset.Entry<E>>() {
                    final Iterator<E> elements = SetMultiset.this.delegate.iterator();

                    public boolean hasNext() {
                        return this.elements.hasNext();
                    }

                    public Multiset.Entry<E> next() {
                        return Multisets.immutableEntry(this.elements.next(), 1);
                    }

                    public void remove() {
                        this.elements.remove();
                    }
                };
            }
        }
    }

    static int inferDistinctElements(Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).elementSet().size();
        }
        return 11;
    }

    public static <E> Multiset<E> intersection(final Multiset<E> multiset, final Multiset<?> multiset2) {
        Preconditions.checkNotNull(multiset);
        Preconditions.checkNotNull(multiset2);
        return new AbstractMultiset<E>() {
            final Set<Multiset.Entry<E>> entrySet = new AbstractSet<Multiset.Entry<E>>() {
                public Iterator<Multiset.Entry<E>> iterator() {
                    final Iterator it = multiset.entrySet().iterator();
                    return new AbstractIterator<Multiset.Entry<E>>() {
                        /* access modifiers changed from: protected */
                        public Multiset.Entry<E> computeNext() {
                            while (it.hasNext()) {
                                Multiset.Entry entry = (Multiset.Entry) it.next();
                                Object element = entry.getElement();
                                int min = Math.min(entry.getCount(), multiset2.count(element));
                                if (min > 0) {
                                    return Multisets.immutableEntry(element, min);
                                }
                            }
                            return (Multiset.Entry) endOfData();
                        }
                    };
                }

                public int size() {
                    return C77642.this.elementSet().size();
                }

                /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
                    r4 = (com.google.common.collect.Multiset.Entry) r4;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public boolean contains(java.lang.Object r4) {
                    /*
                        r3 = this;
                        boolean r0 = r4 instanceof com.google.common.collect.Multiset.Entry
                        r1 = 0
                        if (r0 == 0) goto L_0x001a
                        com.google.common.collect.Multiset$Entry r4 = (com.google.common.collect.Multiset.Entry) r4
                        int r0 = r4.getCount()
                        if (r0 <= 0) goto L_0x001a
                        com.google.common.collect.Multisets$2 r2 = com.google.common.collect.Multisets.C77642.this
                        java.lang.Object r4 = r4.getElement()
                        int r4 = r2.count(r4)
                        if (r4 != r0) goto L_0x001a
                        r1 = 1
                    L_0x001a:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Multisets.C77642.C77651.contains(java.lang.Object):boolean");
                }

                public boolean isEmpty() {
                    return C77642.this.elementSet().isEmpty();
                }
            };

            public final int count(Object obj) {
                int count = multiset.count(obj);
                if (count == 0) {
                    return 0;
                }
                return Math.min(count, multiset2.count(obj));
            }

            /* access modifiers changed from: package-private */
            public final Set<E> createElementSet() {
                return Sets.intersection(multiset.elementSet(), multiset2.elementSet());
            }

            public final Set<Multiset.Entry<E>> entrySet() {
                return this.entrySet;
            }
        };
    }

    static abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        AbstractEntry() {
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            if (getCount() != entry.getCount() || !Objects.equal(getElement(), entry.getElement())) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            Object element = getElement();
            if (element == null) {
                i = 0;
            } else {
                i = element.hashCode();
            }
            return i ^ getCount();
        }

        public String toString() {
            String valueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return valueOf;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(valueOf);
            sb.append(" x ");
            sb.append(count);
            return sb.toString();
        }
    }

    static boolean equalsImpl(Multiset<?> multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    static <E> boolean addAllImpl(Multiset<E> multiset, Collection<? extends E> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        if (collection instanceof Multiset) {
            for (Multiset.Entry next : cast(collection).entrySet()) {
                multiset.add(next.getElement(), next.getCount());
            }
            return true;
        }
        Iterators.addAll(multiset, collection.iterator());
        return true;
    }

    static boolean removeAllImpl(Multiset<?> multiset, Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    static boolean retainAllImpl(Multiset<?> multiset, Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    static <E> int setCountImpl(Multiset<E> multiset, E e, int i) {
        checkNonnegative(i, "count");
        int count = multiset.count(e);
        int i2 = i - count;
        if (i2 > 0) {
            multiset.add(e, i2);
        } else if (i2 < 0) {
            multiset.remove(e, -i2);
        }
        return count;
    }

    static <E> boolean setCountImpl(Multiset<E> multiset, E e, int i, int i2) {
        checkNonnegative(i, "oldCount");
        checkNonnegative(i2, "newCount");
        if (multiset.count(e) != i) {
            return false;
        }
        multiset.setCount(e, i2);
        return true;
    }

    static <E> Set<E> elementSetImpl(Multiset<E> multiset) {
        return new ElementSetImpl(multiset);
    }

    static final class ElementSetImpl<E> extends AbstractSet<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Multiset<E> multiset;

        ElementSetImpl(Multiset<E> multiset2) {
            this.multiset = multiset2;
        }

        public final boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            this.multiset.clear();
        }

        public final boolean contains(Object obj) {
            return this.multiset.contains(obj);
        }

        public final boolean containsAll(Collection<?> collection) {
            return this.multiset.containsAll(collection);
        }

        public final boolean isEmpty() {
            return this.multiset.isEmpty();
        }

        public final Iterator<E> iterator() {
            final Iterator<Multiset.Entry<E>> it = this.multiset.entrySet().iterator();
            return new Iterator<E>() {
                public boolean hasNext() {
                    return it.hasNext();
                }

                public E next() {
                    return ((Multiset.Entry) it.next()).getElement();
                }

                public void remove() {
                    it.remove();
                }
            };
        }

        public final boolean remove(Object obj) {
            int count = this.multiset.count(obj);
            if (count <= 0) {
                return false;
            }
            this.multiset.remove(obj, count);
            return true;
        }

        public final int size() {
            return this.multiset.entrySet().size();
        }
    }

    static <E> Iterator<E> iteratorImpl(Multiset<E> multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static final class MultisetIteratorImpl<E> implements Iterator<E> {
        private boolean canRemove;
        private Multiset.Entry<E> currentEntry;
        private final Iterator<Multiset.Entry<E>> entryIterator;
        private int laterCount;
        private final Multiset<E> multiset;
        private int totalCount;

        MultisetIteratorImpl(Multiset<E> multiset2, Iterator<Multiset.Entry<E>> it) {
            this.multiset = multiset2;
            this.entryIterator = it;
        }

        public final boolean hasNext() {
            return this.laterCount > 0 || this.entryIterator.hasNext();
        }

        public final E next() {
            if (hasNext()) {
                if (this.laterCount == 0) {
                    Multiset.Entry<E> next = this.entryIterator.next();
                    this.currentEntry = next;
                    int count = next.getCount();
                    this.laterCount = count;
                    this.totalCount = count;
                }
                this.laterCount--;
                this.canRemove = true;
                return this.currentEntry.getElement();
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            Preconditions.checkState(this.canRemove, "no calls to next() since the last call to remove()");
            if (this.totalCount == 1) {
                this.entryIterator.remove();
            } else {
                this.multiset.remove(this.currentEntry.getElement());
            }
            this.totalCount--;
            this.canRemove = false;
        }
    }

    static int sizeImpl(Multiset<?> multiset) {
        long j = 0;
        for (Multiset.Entry<?> count : multiset.entrySet()) {
            j += (long) count.getCount();
        }
        return Ints.saturatedCast(j);
    }

    static void checkNonnegative(int i, String str) {
        Preconditions.checkArgument(i >= 0, "%s cannot be negative: %s", str, Integer.valueOf(i));
    }

    static <T> Multiset<T> cast(Iterable<T> iterable) {
        return (Multiset) iterable;
    }
}
