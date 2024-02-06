package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public final class Lists {
    private Lists() {
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> newArrayList(E... eArr) {
        Preconditions.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(computeArrayListCapacity(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    static int computeArrayListCapacity(int i) {
        Preconditions.checkArgument(i >= 0);
        return Ints.saturatedCast(((long) i) + 5 + ((long) (i / 10)));
    }

    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        return iterable instanceof Collection ? new ArrayList<>(Collections2.cast(iterable)) : newArrayList(iterable.iterator());
    }

    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        Preconditions.checkNotNull(it);
        ArrayList<E> newArrayList = newArrayList();
        while (it.hasNext()) {
            newArrayList.add(it.next());
        }
        return newArrayList;
    }

    public static <E> ArrayList<E> newArrayListWithCapacity(int i) {
        Preconditions.checkArgument(i >= 0);
        return new ArrayList<>(i);
    }

    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i) {
        return new ArrayList<>(computeArrayListCapacity(i));
    }

    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> newLinkedList = newLinkedList();
        for (Object add : iterable) {
            newLinkedList.add(add);
        }
        return newLinkedList;
    }

    public static <E> List<E> asList(E e, E[] eArr) {
        return new OnePlusArrayList(e, eArr);
    }

    static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;

        OnePlusArrayList(E e, E[] eArr) {
            this.first = e;
            this.rest = (Object[]) Preconditions.checkNotNull(eArr);
        }

        public int size() {
            return this.rest.length + 1;
        }

        public E get(int i) {
            Preconditions.checkElementIndex(i, size());
            return i == 0 ? this.first : this.rest[i - 1];
        }
    }

    public static <E> List<E> asList(E e, E e2, E[] eArr) {
        return new TwoPlusArrayList(e, e2, eArr);
    }

    static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;
        final E second;

        TwoPlusArrayList(E e, E e2, E[] eArr) {
            this.first = e;
            this.second = e2;
            this.rest = (Object[]) Preconditions.checkNotNull(eArr);
        }

        public int size() {
            return this.rest.length + 2;
        }

        public E get(int i) {
            if (i == 0) {
                return this.first;
            }
            if (i == 1) {
                return this.second;
            }
            Preconditions.checkElementIndex(i, size());
            return this.rest[i - 2];
        }
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }

    static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function2) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function2);
        }

        public void clear() {
            this.fromList.clear();
        }

        public int size() {
            return this.fromList.size();
        }

        public ListIterator<T> listIterator(int i) {
            final ListIterator<F> listIterator = this.fromList.listIterator(i);
            return new ListIterator<T>() {
                public void add(T t) {
                    throw new UnsupportedOperationException();
                }

                public boolean hasNext() {
                    return listIterator.hasNext();
                }

                public boolean hasPrevious() {
                    return listIterator.hasPrevious();
                }

                public T next() {
                    return TransformingSequentialList.this.function.apply(listIterator.next());
                }

                public int nextIndex() {
                    return listIterator.nextIndex();
                }

                public T previous() {
                    return TransformingSequentialList.this.function.apply(listIterator.previous());
                }

                public int previousIndex() {
                    return listIterator.previousIndex();
                }

                public void remove() {
                    listIterator.remove();
                }

                public void set(T t) {
                    throw new UnsupportedOperationException("not supported");
                }
            };
        }
    }

    static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function2) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function2);
        }

        public void clear() {
            this.fromList.clear();
        }

        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        public T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        public int size() {
            return this.fromList.size();
        }
    }

    public static <T> List<List<T>> partition(List<T> list, int i) {
        Preconditions.checkNotNull(list);
        Preconditions.checkArgument(i > 0);
        return list instanceof RandomAccess ? new RandomAccessPartition(list, i) : new Partition(list, i);
    }

    static class Partition<T> extends AbstractList<List<T>> {
        final List<T> list;
        final int size;

        Partition(List<T> list2, int i) {
            this.list = list2;
            this.size = i;
        }

        public List<T> get(int i) {
            Preconditions.checkElementIndex(i, size());
            int i2 = this.size;
            int i3 = i * i2;
            return this.list.subList(i3, Math.min(i2 + i3, this.list.size()));
        }

        public int size() {
            int size2 = this.list.size();
            int i = this.size;
            return ((size2 + i) - 1) / i;
        }

        public boolean isEmpty() {
            return this.list.isEmpty();
        }
    }

    static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
        RandomAccessPartition(List<T> list, int i) {
            super(list, i);
        }
    }

    public static ImmutableList<Character> charactersOf(String str) {
        return new StringAsImmutableList((String) Preconditions.checkNotNull(str));
    }

    static final class StringAsImmutableList extends ImmutableList<Character> {
        int hash = 0;
        /* access modifiers changed from: private */
        public final String string;

        /* access modifiers changed from: package-private */
        public final boolean isPartialView() {
            return false;
        }

        StringAsImmutableList(String str) {
            this.string = str;
        }

        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        public final int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        public final UnmodifiableListIterator<Character> listIterator(int i) {
            return new AbstractIndexedListIterator<Character>(size(), i) {
                /* access modifiers changed from: protected */
                public Character get(int i) {
                    return Character.valueOf(StringAsImmutableList.this.string.charAt(i));
                }
            };
        }

        public final ImmutableList<Character> subList(int i, int i2) {
            return Lists.charactersOf(this.string.substring(i, i2));
        }

        public final Character get(int i) {
            return Character.valueOf(this.string.charAt(i));
        }

        public final int size() {
            return this.string.length();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int length = this.string.length();
            if (length != list.size()) {
                return false;
            }
            Iterator it = list.iterator();
            for (int i = 0; i < length; i++) {
                Object next = it.next();
                if (!(next instanceof Character) || ((Character) next).charValue() != this.string.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            int i = this.hash;
            if (i != 0) {
                return i;
            }
            int i2 = 1;
            for (int i3 = 0; i3 < this.string.length(); i3++) {
                i2 = (i2 * 31) + this.string.charAt(i3);
            }
            this.hash = i2;
            return i2;
        }
    }

    public static List<Character> charactersOf(CharSequence charSequence) {
        return new CharSequenceAsList((CharSequence) Preconditions.checkNotNull(charSequence));
    }

    static final class CharSequenceAsList extends AbstractList<Character> {
        private final CharSequence sequence;

        CharSequenceAsList(CharSequence charSequence) {
            this.sequence = charSequence;
        }

        public final Character get(int i) {
            return Character.valueOf(this.sequence.charAt(i));
        }

        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        public final int indexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            char charValue = ((Character) obj).charValue();
            for (int i = 0; i < this.sequence.length(); i++) {
                if (this.sequence.charAt(i) == charValue) {
                    return i;
                }
            }
            return -1;
        }

        public final int lastIndexOf(Object obj) {
            if (!(obj instanceof Character)) {
                return -1;
            }
            char charValue = ((Character) obj).charValue();
            for (int length = this.sequence.length() - 1; length >= 0; length--) {
                if (this.sequence.charAt(length) == charValue) {
                    return length;
                }
            }
            return -1;
        }

        public final int size() {
            return this.sequence.length();
        }

        public final List<Character> subList(int i, int i2) {
            return Lists.charactersOf(this.sequence.subSequence(i, i2));
        }

        public final int hashCode() {
            int i = 1;
            for (int i2 = 0; i2 < this.sequence.length(); i2++) {
                i = (i * 31) + this.sequence.charAt(i2);
            }
            return i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            int length = this.sequence.length();
            if (length != list.size()) {
                return false;
            }
            Iterator it = list.iterator();
            for (int i = 0; i < length; i++) {
                Object next = it.next();
                if (!(next instanceof Character) || ((Character) next).charValue() != this.sequence.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list instanceof ReverseList) {
            return ((ReverseList) list).getForwardList();
        }
        if (list instanceof RandomAccess) {
            return new RandomAccessReverseList(list);
        }
        return new ReverseList(list);
    }

    static class ReverseList<T> extends AbstractList<T> {
        private final List<T> forwardList;

        ReverseList(List<T> list) {
            this.forwardList = (List) Preconditions.checkNotNull(list);
        }

        /* access modifiers changed from: package-private */
        public List<T> getForwardList() {
            return this.forwardList;
        }

        private int reverseIndex(int i) {
            int size = size();
            Preconditions.checkElementIndex(i, size);
            return (size - 1) - i;
        }

        /* access modifiers changed from: private */
        public int reversePosition(int i) {
            int size = size();
            Preconditions.checkPositionIndex(i, size);
            return size - i;
        }

        public void add(int i, T t) {
            this.forwardList.add(reversePosition(i), t);
        }

        public void clear() {
            this.forwardList.clear();
        }

        public T remove(int i) {
            return this.forwardList.remove(reverseIndex(i));
        }

        /* access modifiers changed from: protected */
        public void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        public T set(int i, T t) {
            return this.forwardList.set(reverseIndex(i), t);
        }

        public T get(int i) {
            return this.forwardList.get(reverseIndex(i));
        }

        public boolean isEmpty() {
            return this.forwardList.isEmpty();
        }

        public int size() {
            return this.forwardList.size();
        }

        public boolean contains(Object obj) {
            return this.forwardList.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.forwardList.containsAll(collection);
        }

        public List<T> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            return Lists.reverse(this.forwardList.subList(reversePosition(i2), reversePosition(i)));
        }

        public int indexOf(Object obj) {
            int lastIndexOf = this.forwardList.lastIndexOf(obj);
            if (lastIndexOf >= 0) {
                return reverseIndex(lastIndexOf);
            }
            return -1;
        }

        public int lastIndexOf(Object obj) {
            int indexOf = this.forwardList.indexOf(obj);
            if (indexOf >= 0) {
                return reverseIndex(indexOf);
            }
            return -1;
        }

        public Iterator<T> iterator() {
            return listIterator();
        }

        public ListIterator<T> listIterator(int i) {
            final ListIterator<T> listIterator = this.forwardList.listIterator(reversePosition(i));
            return new ListIterator<T>() {
                boolean canRemove;
                boolean canSet;

                public void add(T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.canRemove = false;
                    this.canSet = false;
                }

                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                public T next() {
                    if (hasNext()) {
                        this.canRemove = true;
                        this.canSet = true;
                        return listIterator.previous();
                    }
                    throw new NoSuchElementException();
                }

                public int nextIndex() {
                    return ReverseList.this.reversePosition(listIterator.nextIndex());
                }

                public T previous() {
                    if (hasPrevious()) {
                        this.canRemove = true;
                        this.canSet = true;
                        return listIterator.next();
                    }
                    throw new NoSuchElementException();
                }

                public int previousIndex() {
                    return nextIndex() - 1;
                }

                public void remove() {
                    Preconditions.checkState(this.canRemove);
                    listIterator.remove();
                    this.canSet = false;
                    this.canRemove = false;
                }

                public void set(T t) {
                    Preconditions.checkState(this.canSet);
                    listIterator.set(t);
                }
            };
        }
    }

    static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        RandomAccessReverseList(List<T> list) {
            super(list);
        }
    }

    static int hashCodeImpl(List<?> list) {
        int i;
        int i2 = 1;
        for (Object next : list) {
            if (next == null) {
                i = 0;
            } else {
                i = next.hashCode();
            }
            i2 = (i2 * 31) + i;
        }
        return i2;
    }

    static boolean equalsImpl(List<?> list, Object obj) {
        if (obj == Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        if (list.size() != list2.size() || !Iterators.elementsEqual(list.iterator(), list2.iterator())) {
            return false;
        }
        return true;
    }

    static <E> boolean addAllImpl(List<E> list, int i, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i);
        boolean z = false;
        for (Object add : iterable) {
            listIterator.add(add);
            z = true;
        }
        return z;
    }

    static int indexOfImpl(List<?> list, Object obj) {
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    static int lastIndexOfImpl(List<?> list, Object obj) {
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    static <E> ListIterator<E> listIteratorImpl(List<E> list, int i) {
        return new AbstractListWrapper(list).listIterator(i);
    }

    static <E> List<E> subListImpl(List<E> list, int i, int i2) {
        List list2;
        if (list instanceof RandomAccess) {
            list2 = new RandomAccessListWrapper<E>(list) {
                private static final long serialVersionUID = 0;

                public final ListIterator<E> listIterator(int i) {
                    return this.backingList.listIterator(i);
                }
            };
        } else {
            list2 = new AbstractListWrapper<E>(list) {
                private static final long serialVersionUID = 0;

                public final ListIterator<E> listIterator(int i) {
                    return this.backingList.listIterator(i);
                }
            };
        }
        return list2.subList(i, i2);
    }

    static class AbstractListWrapper<E> extends AbstractList<E> {
        final List<E> backingList;

        AbstractListWrapper(List<E> list) {
            this.backingList = (List) Preconditions.checkNotNull(list);
        }

        public void add(int i, E e) {
            this.backingList.add(i, e);
        }

        public boolean addAll(int i, Collection<? extends E> collection) {
            return this.backingList.addAll(i, collection);
        }

        public E get(int i) {
            return this.backingList.get(i);
        }

        public E remove(int i) {
            return this.backingList.remove(i);
        }

        public E set(int i, E e) {
            return this.backingList.set(i, e);
        }

        public boolean contains(Object obj) {
            return this.backingList.contains(obj);
        }

        public int size() {
            return this.backingList.size();
        }
    }

    static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
        RandomAccessListWrapper(List<E> list) {
            super(list);
        }
    }
}
