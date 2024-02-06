package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public final class Collections2 {
    static final Joiner STANDARD_JOINER = Joiner.m82on(", ");

    private Collections2() {
    }

    public static <E> Collection<E> filter(Collection<E> collection, Predicate<? super E> predicate) {
        if (collection instanceof FilteredCollection) {
            return ((FilteredCollection) collection).createCombined(predicate);
        }
        return new FilteredCollection((Collection) Preconditions.checkNotNull(collection), (Predicate) Preconditions.checkNotNull(predicate));
    }

    static boolean safeContains(Collection<?> collection, Object obj) {
        try {
            return collection.contains(obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    static class FilteredCollection<E> implements Collection<E> {
        final Predicate<? super E> predicate;
        final Collection<E> unfiltered;

        FilteredCollection(Collection<E> collection, Predicate<? super E> predicate2) {
            this.unfiltered = collection;
            this.predicate = predicate2;
        }

        /* access modifiers changed from: package-private */
        public FilteredCollection<E> createCombined(Predicate<? super E> predicate2) {
            return new FilteredCollection<>(this.unfiltered, Predicates.and(this.predicate, predicate2));
        }

        public boolean add(E e) {
            Preconditions.checkArgument(this.predicate.apply(e));
            return this.unfiltered.add(e);
        }

        public boolean addAll(Collection<? extends E> collection) {
            for (Object apply : collection) {
                Preconditions.checkArgument(this.predicate.apply(apply));
            }
            return this.unfiltered.addAll(collection);
        }

        public void clear() {
            Iterables.removeIf(this.unfiltered, this.predicate);
        }

        public boolean contains(Object obj) {
            try {
                return this.predicate.apply(obj) && this.unfiltered.contains(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return !Iterators.any(this.unfiltered.iterator(), this.predicate);
        }

        public Iterator<E> iterator() {
            return Iterators.filter(this.unfiltered.iterator(), this.predicate);
        }

        public boolean remove(Object obj) {
            try {
                return this.predicate.apply(obj) && this.unfiltered.remove(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean removeAll(final Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            return Iterables.removeIf(this.unfiltered, new Predicate<E>() {
                public boolean apply(E e) {
                    return FilteredCollection.this.predicate.apply(e) && collection.contains(e);
                }
            });
        }

        public boolean retainAll(final Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            return Iterables.removeIf(this.unfiltered, new Predicate<E>() {
                public boolean apply(E e) {
                    return FilteredCollection.this.predicate.apply(e) && !collection.contains(e);
                }
            });
        }

        public int size() {
            return Iterators.size(iterator());
        }

        public Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return Lists.newArrayList(iterator()).toArray(tArr);
        }

        public String toString() {
            return Iterators.toString(iterator());
        }
    }

    public static <F, T> Collection<T> transform(Collection<F> collection, Function<? super F, T> function) {
        return new TransformedCollection(collection, function);
    }

    static class TransformedCollection<F, T> extends AbstractCollection<T> {
        final Collection<F> fromCollection;
        final Function<? super F, ? extends T> function;

        TransformedCollection(Collection<F> collection, Function<? super F, ? extends T> function2) {
            this.fromCollection = (Collection) Preconditions.checkNotNull(collection);
            this.function = (Function) Preconditions.checkNotNull(function2);
        }

        public void clear() {
            this.fromCollection.clear();
        }

        public boolean isEmpty() {
            return this.fromCollection.isEmpty();
        }

        public Iterator<T> iterator() {
            return Iterators.transform(this.fromCollection.iterator(), this.function);
        }

        public int size() {
            return this.fromCollection.size();
        }
    }

    static boolean containsAllImpl(Collection<?> collection, Collection<?> collection2) {
        Preconditions.checkNotNull(collection);
        for (Object contains : collection2) {
            if (!collection.contains(contains)) {
                return false;
            }
        }
        return true;
    }

    static String toStringImpl(final Collection<?> collection) {
        StringBuilder newStringBuilderForCollection = newStringBuilderForCollection(collection.size());
        newStringBuilderForCollection.append('[');
        STANDARD_JOINER.appendTo(newStringBuilderForCollection, (Iterable<?>) Iterables.transform(collection, new Function<Object, Object>() {
            public final Object apply(Object obj) {
                return obj == collection ? "(this Collection)" : obj;
            }
        }));
        newStringBuilderForCollection.append(']');
        return newStringBuilderForCollection.toString();
    }

    static StringBuilder newStringBuilderForCollection(int i) {
        Preconditions.checkArgument(i >= 0, "size must be non-negative");
        return new StringBuilder((int) Math.min(((long) i) << 3, 1073741824));
    }

    static <T> Collection<T> cast(Iterable<T> iterable) {
        return (Collection) iterable;
    }
}
