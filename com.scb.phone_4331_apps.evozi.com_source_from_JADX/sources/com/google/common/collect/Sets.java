package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public final class Sets {
    private Sets() {
    }

    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(E e, E... eArr) {
        return new ImmutableEnumSet(EnumSet.of(e, eArr));
    }

    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return ImmutableSet.m89of();
        }
        if (iterable instanceof EnumSet) {
            return new ImmutableEnumSet(EnumSet.copyOf((EnumSet) iterable));
        }
        EnumSet of = EnumSet.of((Enum) it.next());
        while (it.hasNext()) {
            of.add(it.next());
        }
        return new ImmutableEnumSet(of);
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
        Preconditions.checkNotNull(iterable);
        EnumSet<E> noneOf = EnumSet.noneOf(cls);
        Iterables.addAll(noneOf, iterable);
        return noneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSet = new HashSet<>(Maps.capacity(eArr.length));
        Collections.addAll(hashSet, eArr);
        return hashSet;
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i) {
        return new HashSet<>(Maps.capacity(i));
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        return iterable instanceof Collection ? new HashSet<>(Collections2.cast(iterable)) : newHashSet(iterable.iterator());
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
        HashSet<E> newHashSet = newHashSet();
        while (it.hasNext()) {
            newHashSet.add(it.next());
        }
        return newHashSet;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>(Collections2.cast(iterable));
        }
        LinkedHashSet<E> newLinkedHashSet = newLinkedHashSet();
        for (Object add : iterable) {
            newLinkedHashSet.add(add);
        }
        return newLinkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
        TreeSet<E> newTreeSet = newTreeSet();
        Iterator<? extends E> it = iterable.iterator();
        while (it.hasNext()) {
            newTreeSet.add((Comparable) it.next());
        }
        return newTreeSet;
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return newSetFromMap(Maps.newIdentityHashMap());
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        Preconditions.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return makeComplementByHand(collection, ((Enum) collection.iterator().next()).getDeclaringClass());
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
        Preconditions.checkNotNull(collection);
        return collection instanceof EnumSet ? EnumSet.complementOf((EnumSet) collection) : makeComplementByHand(collection, cls);
    }

    private static <E extends Enum<E>> EnumSet<E> makeComplementByHand(Collection<E> collection, Class<E> cls) {
        EnumSet<E> allOf = EnumSet.allOf(cls);
        allOf.removeAll(collection);
        return allOf;
    }

    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return new SetFromMap(map);
    }

    static class SetFromMap<E> extends AbstractSet<E> implements Set<E>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: m */
        private final Map<E, Boolean> f51m;

        /* renamed from: s */
        private transient Set<E> f52s;

        SetFromMap(Map<E, Boolean> map) {
            Preconditions.checkArgument(map.isEmpty(), "Map is non-empty");
            this.f51m = map;
            this.f52s = map.keySet();
        }

        public void clear() {
            this.f51m.clear();
        }

        public int size() {
            return this.f51m.size();
        }

        public boolean isEmpty() {
            return this.f51m.isEmpty();
        }

        public boolean contains(Object obj) {
            return this.f51m.containsKey(obj);
        }

        public boolean remove(Object obj) {
            return this.f51m.remove(obj) != null;
        }

        public boolean add(E e) {
            return this.f51m.put(e, Boolean.TRUE) == null;
        }

        public Iterator<E> iterator() {
            return this.f52s.iterator();
        }

        public Object[] toArray() {
            return this.f52s.toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return this.f52s.toArray(tArr);
        }

        public String toString() {
            return this.f52s.toString();
        }

        public int hashCode() {
            return this.f52s.hashCode();
        }

        public boolean equals(Object obj) {
            return this == obj || this.f52s.equals(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f52s.containsAll(collection);
        }

        public boolean removeAll(Collection<?> collection) {
            return this.f52s.removeAll(collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return this.f52s.retainAll(collection);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f52s = this.f51m.keySet();
        }
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        private SetView() {
        }

        public ImmutableSet<E> immutableCopy() {
            return ImmutableSet.copyOf(this);
        }

        public <S extends Set<E>> S copyInto(S s) {
            s.addAll(this);
            return s;
        }
    }

    public static <E> SetView<E> union(final Set<? extends E> set, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        final SetView<? extends E> difference = difference(set2, set);
        return new SetView<E>() {
            public final int size() {
                return set.size() + difference.size();
            }

            public final boolean isEmpty() {
                return set.isEmpty() && set2.isEmpty();
            }

            public final Iterator<E> iterator() {
                return Iterators.unmodifiableIterator(Iterators.concat(set.iterator(), difference.iterator()));
            }

            public final boolean contains(Object obj) {
                return set.contains(obj) || set2.contains(obj);
            }

            public final <S extends Set<E>> S copyInto(S s) {
                s.addAll(set);
                s.addAll(set2);
                return s;
            }

            public final ImmutableSet<E> immutableCopy() {
                return new ImmutableSet.Builder().addAll((Iterable) set).addAll((Iterable) set2).build();
            }
        };
    }

    public static <E> SetView<E> intersection(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        final Predicate<T> in = Predicates.m3607in(set2);
        return new SetView<E>() {
            public final Iterator<E> iterator() {
                return Iterators.filter(set.iterator(), in);
            }

            public final int size() {
                return Iterators.size(iterator());
            }

            public final boolean isEmpty() {
                return !iterator().hasNext();
            }

            public final boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            public final boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }
        };
    }

    public static <E> SetView<E> difference(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        final Predicate<T> not = Predicates.not(Predicates.m3607in(set2));
        return new SetView<E>() {
            public final Iterator<E> iterator() {
                return Iterators.filter(set.iterator(), not);
            }

            public final int size() {
                return Iterators.size(iterator());
            }

            public final boolean isEmpty() {
                return set2.containsAll(set);
            }

            public final boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }
        };
    }

    public static <E> SetView<E> symmetricDifference(Set<? extends E> set, Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return difference(union(set, set2), intersection(set, set2));
    }

    public static <E> Set<E> filter(Set<E> set, Predicate<? super E> predicate) {
        if (!(set instanceof FilteredSet)) {
            return new FilteredSet((Set) Preconditions.checkNotNull(set), (Predicate) Preconditions.checkNotNull(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) set;
        return new FilteredSet((Set) filteredSet.unfiltered, Predicates.and(filteredSet.predicate, predicate));
    }

    static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        FilteredSet(Set<E> set, Predicate<? super E> predicate) {
            super(set, predicate);
        }

        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
        CartesianSet cartesianSet = new CartesianSet(list);
        return cartesianSet.isEmpty() ? ImmutableSet.m89of() : cartesianSet;
    }

    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
        return cartesianProduct(Arrays.asList(setArr));
    }

    static class CartesianSet<B> extends AbstractSet<List<B>> {
        final ImmutableList<CartesianSet<B>.Axis> axes;
        final int size;

        CartesianSet(List<? extends Set<? extends B>> list) {
            ImmutableList.Builder builder = ImmutableList.builder();
            long j = 1;
            for (Set axis : list) {
                Axis axis2 = new Axis(axis, (int) j);
                builder.add((Object) axis2);
                j *= (long) axis2.size();
            }
            this.axes = builder.build();
            this.size = Ints.checkedCast(j);
        }

        public int size() {
            return this.size;
        }

        public UnmodifiableIterator<List<B>> iterator() {
            return new UnmodifiableIterator<List<B>>() {
                int index;

                public boolean hasNext() {
                    return this.index < CartesianSet.this.size;
                }

                public List<B> next() {
                    if (hasNext()) {
                        int size = CartesianSet.this.axes.size();
                        Object[] objArr = new Object[size];
                        for (int i = 0; i < size; i++) {
                            objArr[i] = ((Axis) CartesianSet.this.axes.get(i)).getForIndex(this.index);
                        }
                        this.index++;
                        return ImmutableList.copyOf((E[]) objArr);
                    }
                    throw new NoSuchElementException();
                }
            };
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int size2 = this.axes.size();
            if (list.size() != size2) {
                return false;
            }
            for (int i = 0; i < size2; i++) {
                if (!((Axis) this.axes.get(i)).contains(list.get(i))) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof CartesianSet) {
                return this.axes.equals(((CartesianSet) obj).axes);
            }
            return super.equals(obj);
        }

        public int hashCode() {
            int i = this.size - 1;
            for (int i2 = 0; i2 < this.axes.size(); i2++) {
                i *= 31;
            }
            return this.axes.hashCode() + i;
        }

        class Axis {
            final ImmutableSet<? extends B> choices;
            final ImmutableList<? extends B> choicesList;
            final int dividend;

            Axis(Set<? extends B> set, int i) {
                ImmutableSet<? extends B> copyOf = ImmutableSet.copyOf(set);
                this.choices = copyOf;
                this.choicesList = copyOf.asList();
                this.dividend = i;
            }

            /* access modifiers changed from: package-private */
            public int size() {
                return this.choices.size();
            }

            /* access modifiers changed from: package-private */
            public B getForIndex(int i) {
                return this.choicesList.get((i / this.dividend) % size());
            }

            /* access modifiers changed from: package-private */
            public boolean contains(Object obj) {
                return this.choices.contains(obj);
            }

            public boolean equals(Object obj) {
                if (obj instanceof Axis) {
                    return this.choices.equals(((Axis) obj).choices);
                }
                return false;
            }

            public int hashCode() {
                return (CartesianSet.this.size / this.choices.size()) * this.choices.hashCode();
            }
        }
    }

    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        ImmutableSet<E> copyOf = ImmutableSet.copyOf(set);
        Preconditions.checkArgument(copyOf.size() <= 30, "Too many elements to create power set: %s > 30", Integer.valueOf(copyOf.size()));
        return new PowerSet(copyOf);
    }

    static final class PowerSet<E> extends AbstractSet<Set<E>> {
        final ImmutableList<E> inputList;
        final ImmutableSet<E> inputSet;
        final int powerSetSize;

        public final boolean isEmpty() {
            return false;
        }

        PowerSet(ImmutableSet<E> immutableSet) {
            this.inputSet = immutableSet;
            this.inputList = immutableSet.asList();
            this.powerSetSize = 1 << immutableSet.size();
        }

        public final int size() {
            return this.powerSetSize;
        }

        public final Iterator<Set<E>> iterator() {
            return new AbstractIndexedListIterator<Set<E>>(this.powerSetSize) {
                /* access modifiers changed from: protected */
                public Set<E> get(final int i) {
                    return new AbstractSet<E>() {
                        public int size() {
                            return Integer.bitCount(i);
                        }

                        public Iterator<E> iterator() {
                            return new BitFilteredSetIterator(PowerSet.this.inputList, i);
                        }
                    };
                }
            };
        }

        static final class BitFilteredSetIterator<E> extends UnmodifiableIterator<E> {
            final ImmutableList<E> input;
            int remainingSetBits;

            BitFilteredSetIterator(ImmutableList<E> immutableList, int i) {
                this.input = immutableList;
                this.remainingSetBits = i;
            }

            public final boolean hasNext() {
                return this.remainingSetBits != 0;
            }

            public final E next() {
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(this.remainingSetBits);
                if (numberOfTrailingZeros != 32) {
                    this.remainingSetBits = (~(1 << numberOfTrailingZeros)) & this.remainingSetBits;
                    return this.input.get(numberOfTrailingZeros);
                }
                throw new NoSuchElementException();
            }
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.inputSet.containsAll((Set) obj);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof PowerSet) {
                return this.inputSet.equals(((PowerSet) obj).inputSet);
            }
            return super.equals(obj);
        }

        public final int hashCode() {
            return this.inputSet.hashCode() << (this.inputSet.size() - 1);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("powerSet(");
            sb.append(this.inputSet);
            sb.append(")");
            return sb.toString();
        }
    }

    static int hashCodeImpl(Set<?> set) {
        Iterator<?> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    static boolean equalsImpl(Set<?> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static <A, B> Set<B> transform(Set<A> set, InvertibleFunction<A, B> invertibleFunction) {
        return new TransformedSet((Set) Preconditions.checkNotNull(set, "set"), (InvertibleFunction) Preconditions.checkNotNull(invertibleFunction, "bijection"));
    }

    static abstract class InvertibleFunction<A, B> implements Function<A, B> {
        /* access modifiers changed from: package-private */
        public abstract A invert(B b);

        InvertibleFunction() {
        }

        public InvertibleFunction<B, A> inverse() {
            return new InvertibleFunction<B, A>() {
                public A apply(B b) {
                    return InvertibleFunction.this.invert(b);
                }

                /* access modifiers changed from: package-private */
                public B invert(A a) {
                    return InvertibleFunction.this.apply(a);
                }

                public InvertibleFunction<A, B> inverse() {
                    return InvertibleFunction.this;
                }
            };
        }
    }

    static class TransformedSet<A, B> extends AbstractSet<B> {
        final InvertibleFunction<A, B> bijection;
        final Set<A> delegate;

        TransformedSet(Set<A> set, InvertibleFunction<A, B> invertibleFunction) {
            this.delegate = set;
            this.bijection = invertibleFunction;
        }

        public Iterator<B> iterator() {
            return Iterators.transform(this.delegate.iterator(), this.bijection);
        }

        public int size() {
            return this.delegate.size();
        }

        public boolean contains(Object obj) {
            A invert = this.bijection.invert(obj);
            return this.delegate.contains(invert) && Objects.equal(this.bijection.apply(invert), obj);
        }

        public boolean add(B b) {
            return this.delegate.add(this.bijection.invert(b));
        }

        public boolean remove(Object obj) {
            if (contains(obj)) {
                return this.delegate.remove(this.bijection.invert(obj));
            }
            return false;
        }

        public void clear() {
            this.delegate.clear();
        }
    }
}
