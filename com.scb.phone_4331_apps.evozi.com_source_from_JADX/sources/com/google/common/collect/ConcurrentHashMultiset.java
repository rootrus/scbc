package com.google.common.collect;

import com.google.android.gms.common.api.Api;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;
    /* access modifiers changed from: private */
    public final transient ConcurrentMap<E, Integer> countMap;
    private transient ConcurrentHashMultiset<E>.EntrySet entrySet;

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public final /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public final /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    static class FieldSettersHolder {
        static final Serialization.FieldSetter<ConcurrentHashMultiset> COUNT_MAP_FIELD_SETTER = Serialization.getFieldSetter(ConcurrentHashMultiset.class, "countMap");

        private FieldSettersHolder() {
        }
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> create = create();
        Iterables.addAll(create, iterable);
        return create;
    }

    public static <E> ConcurrentHashMultiset<E> create(GenericMapMaker<? super E, ? super Number> genericMapMaker) {
        return new ConcurrentHashMultiset<>(genericMapMaker.makeMap());
    }

    ConcurrentHashMultiset(ConcurrentMap<E, Integer> concurrentMap) {
        Preconditions.checkArgument(concurrentMap.isEmpty());
        this.countMap = concurrentMap;
    }

    public final int count(Object obj) {
        try {
            return unbox((Integer) this.countMap.get(obj));
        } catch (ClassCastException | NullPointerException unused) {
            return 0;
        }
    }

    public final int size() {
        long j = 0;
        for (Integer intValue : this.countMap.values()) {
            j += (long) intValue.intValue();
        }
        return Ints.saturatedCast(j);
    }

    public final Object[] toArray() {
        return snapshot().toArray();
    }

    public final <T> T[] toArray(T[] tArr) {
        return snapshot().toArray(tArr);
    }

    private List<E> snapshot() {
        ArrayList newArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
        for (Multiset.Entry entry : entrySet()) {
            Object element = entry.getElement();
            for (int count = entry.getCount(); count > 0; count--) {
                newArrayListWithExpectedSize.add(element);
            }
        }
        return newArrayListWithExpectedSize;
    }

    public final int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        Preconditions.checkArgument(i > 0, "Invalid occurrences: %s", Integer.valueOf(i));
        while (true) {
            int count = count(e);
            if (count != 0) {
                Preconditions.checkArgument(i <= Api.BaseClientBuilder.API_PRIORITY_OTHER - count, "Overflow adding %s occurrences to a count of %s", Integer.valueOf(i), Integer.valueOf(count));
                if (this.countMap.replace(e, Integer.valueOf(count), Integer.valueOf(count + i))) {
                    return count;
                }
            } else if (this.countMap.putIfAbsent(e, Integer.valueOf(i)) == null) {
                return 0;
            }
        }
    }

    public final int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i > 0, "Invalid occurrences: %s", Integer.valueOf(i));
        while (true) {
            int count = count(obj);
            if (count == 0) {
                return 0;
            }
            if (i >= count) {
                if (this.countMap.remove(obj, Integer.valueOf(count))) {
                    return count;
                }
            } else if (this.countMap.replace(obj, Integer.valueOf(count), Integer.valueOf(count - i))) {
                return count;
            }
        }
    }

    private int removeAllOccurrences(Object obj) {
        try {
            return unbox((Integer) this.countMap.remove(obj));
        } catch (ClassCastException | NullPointerException unused) {
            return 0;
        }
    }

    public final boolean removeExactly(Object obj, int i) {
        if (i == 0) {
            return true;
        }
        Preconditions.checkArgument(i > 0, "Invalid occurrences: %s", Integer.valueOf(i));
        while (true) {
            int count = count(obj);
            if (i > count) {
                return false;
            }
            if (i == count) {
                if (this.countMap.remove(obj, Integer.valueOf(i))) {
                    return true;
                }
            } else if (this.countMap.replace(obj, Integer.valueOf(count), Integer.valueOf(count - i))) {
                return true;
            }
        }
    }

    public final int setCount(E e, int i) {
        Multisets.checkNonnegative(i, "count");
        return i == 0 ? removeAllOccurrences(e) : unbox((Integer) this.countMap.put(e, Integer.valueOf(i)));
    }

    public final boolean setCount(E e, int i, int i2) {
        Multisets.checkNonnegative(i, "oldCount");
        Multisets.checkNonnegative(i2, "newCount");
        if (i2 == 0) {
            if (i == 0) {
                return !this.countMap.containsKey(e);
            }
            return this.countMap.remove(e, Integer.valueOf(i));
        } else if (i != 0) {
            return this.countMap.replace(e, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            if (this.countMap.putIfAbsent(e, Integer.valueOf(i2)) != null) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final Set<E> createElementSet() {
        final Set keySet = this.countMap.keySet();
        return new ForwardingSet<E>() {
            /* access modifiers changed from: protected */
            public Set<E> delegate() {
                return keySet;
            }

            public boolean remove(Object obj) {
                try {
                    return keySet.remove(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
        };
    }

    public final Set<Multiset.Entry<E>> entrySet() {
        ConcurrentHashMultiset<E>.EntrySet entrySet2 = this.entrySet;
        if (entrySet2 != null) {
            return entrySet2;
        }
        ConcurrentHashMultiset<E>.EntrySet entrySet3 = new EntrySet();
        this.entrySet = entrySet3;
        return entrySet3;
    }

    class EntrySet extends AbstractSet<Multiset.Entry<E>> {
        private EntrySet() {
        }

        public int size() {
            return ConcurrentHashMultiset.this.countMap.size();
        }

        public boolean isEmpty() {
            return ConcurrentHashMultiset.this.countMap.isEmpty();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            Object element = entry.getElement();
            int count = entry.getCount();
            if (count <= 0 || ConcurrentHashMultiset.this.count(element) != count) {
                return false;
            }
            return true;
        }

        public Iterator<Multiset.Entry<E>> iterator() {
            final Iterator it = ConcurrentHashMultiset.this.countMap.entrySet().iterator();
            return new Iterator<Multiset.Entry<E>>() {
                public boolean hasNext() {
                    return it.hasNext();
                }

                public Multiset.Entry<E> next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    return Multisets.immutableEntry(entry.getKey(), ((Integer) entry.getValue()).intValue());
                }

                public void remove() {
                    it.remove();
                }
            };
        }

        public Object[] toArray() {
            return snapshot().toArray();
        }

        public <T> T[] toArray(T[] tArr) {
            return snapshot().toArray(tArr);
        }

        private List<Multiset.Entry<E>> snapshot() {
            ArrayList newArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
            Iterator it = iterator();
            while (it.hasNext()) {
                newArrayListWithExpectedSize.add((Multiset.Entry) it.next());
            }
            return newArrayListWithExpectedSize;
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            return ConcurrentHashMultiset.this.countMap.remove(entry.getElement(), Integer.valueOf(entry.getCount()));
        }

        public void clear() {
            ConcurrentHashMultiset.this.countMap.clear();
        }

        public int hashCode() {
            return ConcurrentHashMultiset.this.countMap.hashCode();
        }
    }

    private static int unbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        FieldSettersHolder.COUNT_MAP_FIELD_SETTER.set(this, (Object) (ConcurrentMap) objectInputStream.readObject());
    }
}
