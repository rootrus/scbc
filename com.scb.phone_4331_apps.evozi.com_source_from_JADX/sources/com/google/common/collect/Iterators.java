package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.HttpUrl;

public final class Iterators {
    static final UnmodifiableIterator<Object> EMPTY_ITERATOR = new UnmodifiableIterator<Object>() {
        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }
    };
    private static final Iterator<Object> EMPTY_MODIFIABLE_ITERATOR = new Iterator<Object>() {
        public final boolean hasNext() {
            return false;
        }

        public final Object next() {
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new IllegalStateException();
        }
    };

    private Iterators() {
    }

    public static <T> UnmodifiableIterator<T> emptyIterator() {
        return EMPTY_ITERATOR;
    }

    static <T> Iterator<T> emptyModifiableIterator() {
        return EMPTY_MODIFIABLE_ITERATOR;
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(final Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new UnmodifiableIterator<T>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final T next() {
                return it.next();
            }
        };
    }

    public static int size(Iterator<?> it) {
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
        }
        return i;
    }

    public static boolean contains(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean removeIf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0006  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean elementsEqual(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        /*
        L_0x0000:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x001d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto L_0x000e
            return r1
        L_0x000e:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.Objects.equal(r0, r2)
            if (r0 != 0) goto L_0x0000
            return r1
        L_0x001d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.Iterators.elementsEqual(java.util.Iterator, java.util.Iterator):boolean");
    }

    public static String toString(Iterator<?> it) {
        if (!it.hasNext()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(it.next());
        while (it.hasNext()) {
            sb.append(", ");
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    public static <T> T getOnlyElement(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        sb.append(sb2.toString());
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", ");
            sb3.append(it.next());
            sb.append(sb3.toString());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static <T> T getOnlyElement(Iterator<T> it, T t) {
        return it.hasNext() ? getOnlyElement(it) : t;
    }

    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return Iterables.toArray(Lists.newArrayList(it), cls);
    }

    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static int frequency(Iterator<?> it, Object obj) {
        int i = 0;
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    i++;
                }
            }
        } else {
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    i++;
                }
            }
        }
        return i;
    }

    public static <T> Iterator<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterator<T>() {
            Iterator<T> iterator = Iterators.emptyIterator();
            Iterator<T> removeFrom;

            public final boolean hasNext() {
                if (!this.iterator.hasNext()) {
                    this.iterator = iterable.iterator();
                }
                return this.iterator.hasNext();
            }

            public final T next() {
                if (hasNext()) {
                    Iterator<T> it = this.iterator;
                    this.removeFrom = it;
                    return it.next();
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                Preconditions.checkState(this.removeFrom != null, "no calls to next() since last call to remove()");
                this.removeFrom.remove();
                this.removeFrom = null;
            }
        };
    }

    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList((E[]) tArr));
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        return concat(Arrays.asList(new Iterator[]{it, it2}).iterator());
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        return concat(Arrays.asList(new Iterator[]{it, it2, it3}).iterator());
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        Preconditions.checkNotNull(it4);
        return concat(Arrays.asList(new Iterator[]{it, it2, it3, it4}).iterator());
    }

    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return concat(ImmutableList.copyOf((E[]) itArr).iterator());
    }

    public static <T> Iterator<T> concat(final Iterator<? extends Iterator<? extends T>> it) {
        Preconditions.checkNotNull(it);
        return new Iterator<T>() {
            Iterator<? extends T> current = Iterators.emptyIterator();
            Iterator<? extends T> removeFrom;

            public final boolean hasNext() {
                boolean hasNext;
                while (true) {
                    hasNext = ((Iterator) Preconditions.checkNotNull(this.current)).hasNext();
                    if (hasNext || !it.hasNext()) {
                        return hasNext;
                    }
                    this.current = (Iterator) it.next();
                }
                return hasNext;
            }

            public final T next() {
                if (hasNext()) {
                    Iterator<? extends T> it = this.current;
                    this.removeFrom = it;
                    return it.next();
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                Preconditions.checkState(this.removeFrom != null, "no calls to next() since last call to remove()");
                this.removeFrom.remove();
                this.removeFrom = null;
            }
        };
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it, int i) {
        return partitionImpl(it, i, false);
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it, int i) {
        return partitionImpl(it, i, true);
    }

    private static <T> UnmodifiableIterator<List<T>> partitionImpl(final Iterator<T> it, final int i, final boolean z) {
        Preconditions.checkNotNull(it);
        Preconditions.checkArgument(i > 0);
        return new UnmodifiableIterator<List<T>>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final List<T> next() {
                if (hasNext()) {
                    Object[] objArr = new Object[i];
                    int i = 0;
                    while (i < i && it.hasNext()) {
                        objArr[i] = it.next();
                        i++;
                    }
                    List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                    return (z || i == i) ? unmodifiableList : unmodifiableList.subList(0, i);
                }
                throw new NoSuchElementException();
            }
        };
    }

    public static <T> UnmodifiableIterator<T> filter(final Iterator<T> it, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        return new AbstractIterator<T>() {
            /* access modifiers changed from: protected */
            public final T computeNext() {
                while (it.hasNext()) {
                    T next = it.next();
                    if (predicate.apply(next)) {
                        return next;
                    }
                }
                return endOfData();
            }
        };
    }

    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it, Class<T> cls) {
        return filter(it, Predicates.instanceOf(cls));
    }

    public static <T> boolean any(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean all(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            if (!predicate.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> T find(Iterator<T> it, Predicate<? super T> predicate) {
        return filter(it, predicate).next();
    }

    public static <T> T find(Iterator<T> it, Predicate<? super T> predicate, T t) {
        UnmodifiableIterator<? super T> filter = filter(it, predicate);
        return filter.hasNext() ? filter.next() : t;
    }

    public static <T> int indexOf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static <F, T> Iterator<T> transform(final Iterator<F> it, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(function);
        return new Iterator<T>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final T next() {
                return function.apply(it.next());
            }

            public final void remove() {
                it.remove();
            }
        };
    }

    public static <T> T get(Iterator<T> it, int i) {
        checkNonnegative(i);
        int i2 = 0;
        while (it.hasNext()) {
            T next = it.next();
            if (i2 == i) {
                return next;
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("position (");
        sb.append(i);
        sb.append(") must be less than the number of elements that remained (");
        sb.append(i2);
        sb.append(")");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    private static void checkNonnegative(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("position (");
            sb.append(i);
            sb.append(") must not be negative");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public static <T> T get(Iterator<T> it, int i, T t) {
        checkNonnegative(i);
        try {
            return get(it, i);
        } catch (IndexOutOfBoundsException unused) {
            return t;
        }
    }

    public static <T> T getNext(Iterator<T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> T getLast(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static <T> T getLast(Iterator<T> it, T t) {
        return it.hasNext() ? getLast(it) : t;
    }

    public static <T> int skip(Iterator<T> it, int i) {
        Preconditions.checkNotNull(it);
        int i2 = 0;
        Preconditions.checkArgument(i >= 0, "number to skip cannot be negative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static <T> Iterator<T> limit(final Iterator<T> it, final int i) {
        Preconditions.checkNotNull(it);
        Preconditions.checkArgument(i >= 0, "limit is negative");
        return new Iterator<T>() {
            private int count;

            public final boolean hasNext() {
                return this.count < i && it.hasNext();
            }

            public final T next() {
                if (hasNext()) {
                    this.count++;
                    return it.next();
                }
                throw new NoSuchElementException();
            }

            public final void remove() {
                it.remove();
            }
        };
    }

    public static <T> Iterator<T> consumingIterator(final Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new UnmodifiableIterator<T>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final T next() {
                T next = it.next();
                it.remove();
                return next;
            }
        };
    }

    public static <T> UnmodifiableIterator<T> forArray(final T... tArr) {
        Preconditions.checkNotNull(tArr);
        return new AbstractIndexedListIterator<T>(tArr.length) {
            /* access modifiers changed from: protected */
            public final T get(int i) {
                return tArr[i];
            }
        };
    }

    static <T> UnmodifiableIterator<T> forArray(final T[] tArr, final int i, int i2) {
        Preconditions.checkArgument(i2 >= 0);
        Preconditions.checkPositionIndexes(i, i + i2, tArr.length);
        return new AbstractIndexedListIterator<T>(i2) {
            /* access modifiers changed from: protected */
            public final T get(int i) {
                return tArr[i + i];
            }
        };
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(final T t) {
        return new UnmodifiableIterator<T>() {
            boolean done;

            public final boolean hasNext() {
                return !this.done;
            }

            public final T next() {
                if (!this.done) {
                    this.done = true;
                    return t;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(final Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new UnmodifiableIterator<T>() {
            public final boolean hasNext() {
                return enumeration.hasMoreElements();
            }

            public final T next() {
                return enumeration.nextElement();
            }
        };
    }

    public static <T> Enumeration<T> asEnumeration(final Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new Enumeration<T>() {
            public final boolean hasMoreElements() {
                return it.hasNext();
            }

            public final T nextElement() {
                return it.next();
            }
        };
    }

    static class PeekingImpl<E> implements PeekingIterator<E> {
        private boolean hasPeeked;
        private final Iterator<? extends E> iterator;
        private E peekedElement;

        public PeekingImpl(Iterator<? extends E> it) {
            this.iterator = (Iterator) Preconditions.checkNotNull(it);
        }

        public boolean hasNext() {
            return this.hasPeeked || this.iterator.hasNext();
        }

        public E next() {
            if (!this.hasPeeked) {
                return this.iterator.next();
            }
            E e = this.peekedElement;
            this.hasPeeked = false;
            this.peekedElement = null;
            return e;
        }

        public void remove() {
            Preconditions.checkState(!this.hasPeeked, "Can't remove after you've peeked at next");
            this.iterator.remove();
        }

        public E peek() {
            if (!this.hasPeeked) {
                this.peekedElement = this.iterator.next();
                this.hasPeeked = true;
            }
            return this.peekedElement;
        }
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it) {
        if (it instanceof PeekingImpl) {
            return (PeekingImpl) it;
        }
        return new PeekingImpl(it);
    }
}
