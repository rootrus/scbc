package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public final class LinkedHashMultimap<K, V> extends AbstractSetMultimap<K, V> {
    private static final int DEFAULT_VALUES_PER_KEY = 8;
    private static final long serialVersionUID = 0;
    transient int expectedValuesPerKey;
    transient Collection<Map.Entry<K, V>> linkedEntries;

    public final /* bridge */ /* synthetic */ Map asMap() {
        return super.asMap();
    }

    public final /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public final /* bridge */ /* synthetic */ boolean containsEntry(Object obj, Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    public final /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* bridge */ /* synthetic */ Set get(Object obj) {
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public final /* bridge */ /* synthetic */ Multiset keys() {
        return super.keys();
    }

    public final /* bridge */ /* synthetic */ boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(Multimap multimap) {
        return super.putAll(multimap);
    }

    public final /* bridge */ /* synthetic */ boolean putAll(Object obj, Iterable iterable) {
        return super.putAll(obj, iterable);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Set removeAll(Object obj) {
        return super.removeAll(obj);
    }

    public final /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> LinkedHashMultimap<K, V> create() {
        return new LinkedHashMultimap<>();
    }

    public static <K, V> LinkedHashMultimap<K, V> create(int i, int i2) {
        return new LinkedHashMultimap<>(i, i2);
    }

    public static <K, V> LinkedHashMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        return new LinkedHashMultimap<>(multimap);
    }

    private LinkedHashMultimap() {
        super(new LinkedHashMap());
        this.expectedValuesPerKey = 8;
        this.linkedEntries = Sets.newLinkedHashSet();
    }

    private LinkedHashMultimap(int i, int i2) {
        super(new LinkedHashMap(i));
        this.expectedValuesPerKey = 8;
        Preconditions.checkArgument(i2 >= 0);
        this.expectedValuesPerKey = i2;
        this.linkedEntries = new LinkedHashSet((int) Math.min(1073741824, ((long) i) * ((long) i2)));
    }

    private LinkedHashMultimap(Multimap<? extends K, ? extends V> multimap) {
        super(new LinkedHashMap(Maps.capacity(multimap.keySet().size())));
        this.expectedValuesPerKey = 8;
        this.linkedEntries = new LinkedHashSet(Maps.capacity(multimap.size()));
        putAll(multimap);
    }

    /* access modifiers changed from: package-private */
    public final Set<V> createCollection() {
        return new LinkedHashSet(Maps.capacity(this.expectedValuesPerKey));
    }

    /* access modifiers changed from: package-private */
    public final Collection<V> createCollection(K k) {
        return new SetDecorator(k, createCollection());
    }

    class SetDecorator extends ForwardingSet<V> {
        final Set<V> delegate;
        final K key;

        SetDecorator(K k, Set<V> set) {
            this.delegate = set;
            this.key = k;
        }

        /* access modifiers changed from: protected */
        public Set<V> delegate() {
            return this.delegate;
        }

        /* access modifiers changed from: package-private */
        public <E> Map.Entry<K, E> createEntry(E e) {
            return Maps.immutableEntry(this.key, e);
        }

        /* access modifiers changed from: package-private */
        public <E> Collection<Map.Entry<K, E>> createEntries(Collection<E> collection) {
            ArrayList newArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(collection.size());
            for (E createEntry : collection) {
                newArrayListWithExpectedSize.add(createEntry(createEntry));
            }
            return newArrayListWithExpectedSize;
        }

        public boolean add(V v) {
            boolean add = this.delegate.add(v);
            if (add) {
                LinkedHashMultimap.this.linkedEntries.add(createEntry(v));
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            boolean addAll = this.delegate.addAll(collection);
            if (addAll) {
                LinkedHashMultimap.this.linkedEntries.addAll(createEntries(delegate()));
            }
            return addAll;
        }

        public void clear() {
            for (V createEntry : this.delegate) {
                LinkedHashMultimap.this.linkedEntries.remove(createEntry(createEntry));
            }
            this.delegate.clear();
        }

        public Iterator<V> iterator() {
            final Iterator<V> it = this.delegate.iterator();
            return new Iterator<V>() {
                V value;

                public boolean hasNext() {
                    return it.hasNext();
                }

                public V next() {
                    V next = it.next();
                    this.value = next;
                    return next;
                }

                public void remove() {
                    it.remove();
                    LinkedHashMultimap.this.linkedEntries.remove(SetDecorator.this.createEntry(this.value));
                }
            };
        }

        public boolean remove(Object obj) {
            boolean remove = this.delegate.remove(obj);
            if (remove) {
                LinkedHashMultimap.this.linkedEntries.remove(createEntry(obj));
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean removeAll = this.delegate.removeAll(collection);
            if (removeAll) {
                LinkedHashMultimap.this.linkedEntries.removeAll(createEntries(collection));
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator<V> it = this.delegate.iterator();
            boolean z = false;
            while (it.hasNext()) {
                V next = it.next();
                if (!collection.contains(next)) {
                    it.remove();
                    LinkedHashMultimap.this.linkedEntries.remove(Maps.immutableEntry(this.key, next));
                    z = true;
                }
            }
            return z;
        }
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<K, V>> createEntryIterator() {
        final Iterator<Map.Entry<K, V>> it = this.linkedEntries.iterator();
        return new Iterator<Map.Entry<K, V>>() {
            Map.Entry<K, V> entry;

            public boolean hasNext() {
                return it.hasNext();
            }

            public Map.Entry<K, V> next() {
                Map.Entry<K, V> entry2 = (Map.Entry) it.next();
                this.entry = entry2;
                return entry2;
            }

            public void remove() {
                it.remove();
                LinkedHashMultimap.this.remove(this.entry.getKey(), this.entry.getValue());
            }
        };
    }

    public final Set<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return super.replaceValues((Object) k, (Iterable) iterable);
    }

    public final Set<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    public final Collection<V> values() {
        return super.values();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.expectedValuesPerKey);
        Serialization.writeMultimap(this, objectOutputStream);
        for (Map.Entry next : this.linkedEntries) {
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.expectedValuesPerKey = objectInputStream.readInt();
        int readCount = Serialization.readCount(objectInputStream);
        setMap(new LinkedHashMap(Maps.capacity(readCount)));
        this.linkedEntries = new LinkedHashSet(this.expectedValuesPerKey * readCount);
        Serialization.populateMultimap(this, objectInputStream, readCount);
        this.linkedEntries.clear();
        for (int i = 0; i < size(); i++) {
            this.linkedEntries.add(Maps.immutableEntry(objectInputStream.readObject(), objectInputStream.readObject()));
        }
    }
}
