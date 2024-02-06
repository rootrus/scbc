package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

public final class Iterables {
    private Iterables() {
    }

    public static <T> Iterable<T> unmodifiableIterable(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return Iterators.unmodifiableIterator(iterable.iterator());
            }

            public final String toString() {
                return iterable.toString();
            }
        };
    }

    public static int size(Iterable<?> iterable) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : Iterators.size(iterable.iterator());
    }

    public static boolean contains(Iterable<?> iterable, Object obj) {
        if (!(iterable instanceof Collection)) {
            return Iterators.contains(iterable.iterator(), obj);
        }
        try {
            return ((Collection) iterable).contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static boolean removeAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).removeAll((Collection) Preconditions.checkNotNull(collection)) : Iterators.removeAll(iterable.iterator(), collection);
    }

    public static boolean retainAll(Iterable<?> iterable, Collection<?> collection) {
        return iterable instanceof Collection ? ((Collection) iterable).retainAll((Collection) Preconditions.checkNotNull(collection)) : Iterators.retainAll(iterable.iterator(), collection);
    }

    public static <T> boolean removeIf(Iterable<T> iterable, Predicate<? super T> predicate) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return Iterators.removeIf(iterable.iterator(), predicate);
        }
        return removeIfFromRandomAccessList((List) iterable, (Predicate) Preconditions.checkNotNull(predicate));
    }

    private static <T> boolean removeIfFromRandomAccessList(List<T> list, Predicate<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!predicate.apply(t)) {
                if (i > i2) {
                    list.set(i2, t);
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            return true;
        }
        return false;
    }

    public static boolean elementsEqual(Iterable<?> iterable, Iterable<?> iterable2) {
        return Iterators.elementsEqual(iterable.iterator(), iterable2.iterator());
    }

    public static String toString(Iterable<?> iterable) {
        return Iterators.toString(iterable.iterator());
    }

    public static <T> T getOnlyElement(Iterable<T> iterable) {
        return Iterators.getOnlyElement(iterable.iterator());
    }

    public static <T> T getOnlyElement(Iterable<T> iterable, T t) {
        return Iterators.getOnlyElement(iterable.iterator(), t);
    }

    public static <T> T[] toArray(Iterable<? extends T> iterable, Class<T> cls) {
        Collection<E> collection = toCollection(iterable);
        return collection.toArray(ObjectArrays.newArray(cls, collection.size()));
    }

    static Object[] toArray(Iterable<?> iterable) {
        return toCollection(iterable).toArray();
    }

    private static <E> Collection<E> toCollection(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : Lists.newArrayList(iterable.iterator());
    }

    public static <T> boolean addAll(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll(Collections2.cast(iterable));
        }
        return Iterators.addAll(collection, iterable.iterator());
    }

    public static int frequency(Iterable<?> iterable, Object obj) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).count(obj);
        }
        if (iterable instanceof Set) {
            return ((Set) iterable).contains(obj) ? 1 : 0;
        }
        return Iterators.frequency(iterable.iterator(), obj);
    }

    public static <T> Iterable<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return Iterators.cycle(iterable);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append(iterable.toString());
                sb.append(" (cycled)");
                return sb.toString();
            }
        };
    }

    public static <T> Iterable<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList((E[]) tArr));
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(iterable2);
        return concat(Arrays.asList(new Iterable[]{iterable, iterable2}));
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(iterable2);
        Preconditions.checkNotNull(iterable3);
        return concat(Arrays.asList(new Iterable[]{iterable, iterable2, iterable3}));
    }

    public static <T> Iterable<T> concat(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3, Iterable<? extends T> iterable4) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(iterable2);
        Preconditions.checkNotNull(iterable3);
        Preconditions.checkNotNull(iterable4);
        return concat(Arrays.asList(new Iterable[]{iterable, iterable2, iterable3, iterable4}));
    }

    public static <T> Iterable<T> concat(Iterable<? extends T>... iterableArr) {
        return concat(ImmutableList.copyOf((E[]) iterableArr));
    }

    public static <T> Iterable<T> concat(final Iterable<? extends Iterable<? extends T>> iterable) {
        Preconditions.checkNotNull(iterable);
        return new IterableWithToString<T>() {
            public final Iterator<T> iterator() {
                return Iterators.concat(Iterables.iterators(iterable));
            }
        };
    }

    /* access modifiers changed from: private */
    public static <T> UnmodifiableIterator<Iterator<? extends T>> iterators(Iterable<? extends Iterable<? extends T>> iterable) {
        final Iterator<? extends Iterable<? extends T>> it = iterable.iterator();
        return new UnmodifiableIterator<Iterator<? extends T>>() {
            public final boolean hasNext() {
                return it.hasNext();
            }

            public final Iterator<? extends T> next() {
                return ((Iterable) it.next()).iterator();
            }
        };
    }

    public static <T> Iterable<List<T>> partition(final Iterable<T> iterable, final int i) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i > 0);
        return new IterableWithToString<List<T>>() {
            public final Iterator<List<T>> iterator() {
                return Iterators.partition(iterable.iterator(), i);
            }
        };
    }

    public static <T> Iterable<List<T>> paddedPartition(final Iterable<T> iterable, final int i) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i > 0);
        return new IterableWithToString<List<T>>() {
            public final Iterator<List<T>> iterator() {
                return Iterators.paddedPartition(iterable.iterator(), i);
            }
        };
    }

    public static <T> Iterable<T> filter(final Iterable<T> iterable, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(predicate);
        return new IterableWithToString<T>() {
            public final Iterator<T> iterator() {
                return Iterators.filter(iterable.iterator(), predicate);
            }
        };
    }

    public static <T> Iterable<T> filter(final Iterable<?> iterable, final Class<T> cls) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(cls);
        return new IterableWithToString<T>() {
            public final Iterator<T> iterator() {
                return Iterators.filter((Iterator<?>) iterable.iterator(), cls);
            }
        };
    }

    public static <T> boolean any(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.any(iterable.iterator(), predicate);
    }

    public static <T> boolean all(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.all(iterable.iterator(), predicate);
    }

    public static <T> T find(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.find(iterable.iterator(), predicate);
    }

    public static <T> T find(Iterable<T> iterable, Predicate<? super T> predicate, T t) {
        return Iterators.find(iterable.iterator(), predicate, t);
    }

    public static <T> int indexOf(Iterable<T> iterable, Predicate<? super T> predicate) {
        return Iterators.indexOf(iterable.iterator(), predicate);
    }

    public static <F, T> Iterable<T> transform(final Iterable<F> iterable, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(function);
        return new IterableWithToString<T>() {
            public final Iterator<T> iterator() {
                return Iterators.transform(iterable.iterator(), function);
            }
        };
    }

    public static <T> T get(Iterable<T> iterable, int i) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        if (iterable instanceof Collection) {
            Preconditions.checkElementIndex(i, ((Collection) iterable).size());
        } else {
            checkNonnegativeIndex(i);
        }
        return Iterators.get(iterable.iterator(), i);
    }

    private static void checkNonnegativeIndex(int i) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("position cannot be negative: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    public static <T> T get(Iterable<T> iterable, int i, T t) {
        Preconditions.checkNotNull(iterable);
        checkNonnegativeIndex(i);
        try {
            return get(iterable, i);
        } catch (IndexOutOfBoundsException unused) {
            return t;
        }
    }

    public static <T> T getFirst(Iterable<T> iterable, T t) {
        return Iterators.getNext(iterable.iterator(), t);
    }

    public static <T> T getLast(Iterable<T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return getLastInNonemptyList(list);
            }
            throw new NoSuchElementException();
        } else if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        } else {
            return Iterators.getLast(iterable.iterator());
        }
    }

    public static <T> T getLast(Iterable<T> iterable, T t) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return t;
        }
        if (iterable instanceof List) {
            return getLastInNonemptyList((List) iterable);
        }
        if (iterable instanceof SortedSet) {
            return ((SortedSet) iterable).last();
        }
        return Iterators.getLast(iterable.iterator(), t);
    }

    private static <T> T getLastInNonemptyList(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static <T> Iterable<T> skip(final Iterable<T> iterable, final int i) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i >= 0, "number to skip cannot be negative");
        if (!(iterable instanceof List)) {
            return new IterableWithToString<T>() {
                public final Iterator<T> iterator() {
                    final Iterator it = iterable.iterator();
                    Iterators.skip(it, i);
                    return new Iterator<T>() {
                        boolean atStart = true;

                        public boolean hasNext() {
                            return it.hasNext();
                        }

                        public T next() {
                            if (hasNext()) {
                                try {
                                    return it.next();
                                } finally {
                                    this.atStart = false;
                                }
                            } else {
                                throw new NoSuchElementException();
                            }
                        }

                        public void remove() {
                            if (!this.atStart) {
                                it.remove();
                                return;
                            }
                            throw new IllegalStateException();
                        }
                    };
                }
            };
        }
        final List list = (List) iterable;
        return new IterableWithToString<T>() {
            public final Iterator<T> iterator() {
                if (i >= list.size()) {
                    return Iterators.emptyIterator();
                }
                List list = list;
                return list.subList(i, list.size()).iterator();
            }
        };
    }

    public static <T> Iterable<T> limit(final Iterable<T> iterable, final int i) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkArgument(i >= 0, "limit is negative");
        return new IterableWithToString<T>() {
            public final Iterator<T> iterator() {
                return Iterators.limit(iterable.iterator(), i);
            }
        };
    }

    public static <T> Iterable<T> consumingIterable(final Iterable<T> iterable) {
        if (iterable instanceof Queue) {
            return new Iterable<T>() {
                public final Iterator<T> iterator() {
                    return new ConsumingQueueIterator((Queue) iterable);
                }
            };
        }
        Preconditions.checkNotNull(iterable);
        return new Iterable<T>() {
            public final Iterator<T> iterator() {
                return Iterators.consumingIterator(iterable.iterator());
            }
        };
    }

    static class ConsumingQueueIterator<T> extends AbstractIterator<T> {
        private final Queue<T> queue;

        private ConsumingQueueIterator(Queue<T> queue2) {
            this.queue = queue2;
        }

        public T computeNext() {
            try {
                return this.queue.remove();
            } catch (NoSuchElementException unused) {
                return endOfData();
            }
        }
    }

    @Deprecated
    public static <T> Iterable<T> reverse(List<T> list) {
        return Lists.reverse(list);
    }

    public static <T> boolean isEmpty(Iterable<T> iterable) {
        return !iterable.iterator().hasNext();
    }

    static boolean remove(Iterable<?> iterable, Object obj) {
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            if (Objects.equal(it.next(), obj)) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    static abstract class IterableWithToString<E> implements Iterable<E> {
        IterableWithToString() {
        }

        public String toString() {
            return Iterables.toString(this);
        }
    }
}
