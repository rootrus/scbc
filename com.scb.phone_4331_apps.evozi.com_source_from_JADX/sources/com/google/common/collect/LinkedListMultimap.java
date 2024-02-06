package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedListMultimap<K, V> implements ListMultimap<K, V>, Serializable {
    private static final long serialVersionUID = 0;
    private transient Collection<Map.Entry<K, V>> entries;
    /* access modifiers changed from: private */
    public transient Node<K, V> head;
    /* access modifiers changed from: private */
    public transient Multiset<K> keyCount;
    private transient Set<K> keySet;
    /* access modifiers changed from: private */
    public transient Map<K, Node<K, V>> keyToKeyHead;
    /* access modifiers changed from: private */
    public transient Map<K, Node<K, V>> keyToKeyTail;
    private transient Multiset<K> keys;
    private transient Map<K, Collection<V>> map;
    private transient Node<K, V> tail;
    private transient Collection<V> valuesCollection;

    static final class Node<K, V> {
        final K key;
        Node<K, V> next;
        Node<K, V> nextSibling;
        Node<K, V> previous;
        Node<K, V> previousSibling;
        V value;

        Node(K k, V v) {
            this.key = k;
            this.value = v;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.key);
            sb.append("=");
            sb.append(this.value);
            return sb.toString();
        }
    }

    public static <K, V> LinkedListMultimap<K, V> create() {
        return new LinkedListMultimap<>();
    }

    public static <K, V> LinkedListMultimap<K, V> create(int i) {
        return new LinkedListMultimap<>(i);
    }

    public static <K, V> LinkedListMultimap<K, V> create(Multimap<? extends K, ? extends V> multimap) {
        return new LinkedListMultimap<>(multimap);
    }

    private LinkedListMultimap() {
        this.keyCount = LinkedHashMultiset.create();
        this.keyToKeyHead = Maps.newHashMap();
        this.keyToKeyTail = Maps.newHashMap();
    }

    private LinkedListMultimap(int i) {
        this.keyCount = LinkedHashMultiset.create(i);
        this.keyToKeyHead = Maps.newHashMapWithExpectedSize(i);
        this.keyToKeyTail = Maps.newHashMapWithExpectedSize(i);
    }

    private LinkedListMultimap(Multimap<? extends K, ? extends V> multimap) {
        this(multimap.keySet().size());
        putAll(multimap);
    }

    /* access modifiers changed from: private */
    public Node<K, V> addNode(K k, V v, Node<K, V> node) {
        Node<K, V> node2 = new Node<>(k, v);
        if (this.head == null) {
            this.tail = node2;
            this.head = node2;
            this.keyToKeyHead.put(k, node2);
            this.keyToKeyTail.put(k, node2);
        } else if (node == null) {
            this.tail.next = node2;
            node2.previous = this.tail;
            Node<K, V> node3 = this.keyToKeyTail.get(k);
            if (node3 == null) {
                this.keyToKeyHead.put(k, node2);
            } else {
                node3.nextSibling = node2;
                node2.previousSibling = node3;
            }
            this.keyToKeyTail.put(k, node2);
            this.tail = node2;
        } else {
            node2.previous = node.previous;
            node2.previousSibling = node.previousSibling;
            node2.next = node;
            node2.nextSibling = node;
            if (node.previousSibling == null) {
                this.keyToKeyHead.put(k, node2);
            } else {
                node.previousSibling.nextSibling = node2;
            }
            if (node.previous == null) {
                this.head = node2;
            } else {
                node.previous.next = node2;
            }
            node.previous = node2;
            node.previousSibling = node2;
        }
        this.keyCount.add(k);
        return node2;
    }

    /* access modifiers changed from: private */
    public void removeNode(Node<K, V> node) {
        if (node.previous != null) {
            node.previous.next = node.next;
        } else {
            this.head = node.next;
        }
        if (node.next != null) {
            node.next.previous = node.previous;
        } else {
            this.tail = node.previous;
        }
        if (node.previousSibling != null) {
            node.previousSibling.nextSibling = node.nextSibling;
        } else if (node.nextSibling != null) {
            this.keyToKeyHead.put(node.key, node.nextSibling);
        } else {
            this.keyToKeyHead.remove(node.key);
        }
        if (node.nextSibling != null) {
            node.nextSibling.previousSibling = node.previousSibling;
        } else if (node.previousSibling != null) {
            this.keyToKeyTail.put(node.key, node.previousSibling);
        } else {
            this.keyToKeyTail.remove(node.key);
        }
        this.keyCount.remove(node.key);
    }

    /* access modifiers changed from: private */
    public void removeAllNodes(Object obj) {
        ValueForKeyIterator valueForKeyIterator = new ValueForKeyIterator(obj);
        while (valueForKeyIterator.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.remove();
        }
    }

    /* access modifiers changed from: private */
    public static void checkElement(Object obj) {
        if (obj == null) {
            throw new NoSuchElementException();
        }
    }

    class NodeIterator implements Iterator<Node<K, V>> {
        Node<K, V> current;
        Node<K, V> next;

        private NodeIterator() {
            this.next = LinkedListMultimap.this.head;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        public Node<K, V> next() {
            LinkedListMultimap.checkElement(this.next);
            Node<K, V> node = this.next;
            this.current = node;
            this.next = node.next;
            return this.current;
        }

        public void remove() {
            Preconditions.checkState(this.current != null);
            LinkedListMultimap.this.removeNode(this.current);
            this.current = null;
        }
    }

    class DistinctKeyIterator implements Iterator<K> {
        Node<K, V> current;
        Node<K, V> next;
        final Set<K> seenKeys;

        private DistinctKeyIterator() {
            this.seenKeys = new HashSet(Maps.capacity(LinkedListMultimap.this.keySet().size()));
            this.next = LinkedListMultimap.this.head;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        public K next() {
            Node<K, V> node;
            LinkedListMultimap.checkElement(this.next);
            Node<K, V> node2 = this.next;
            this.current = node2;
            this.seenKeys.add(node2.key);
            do {
                node = this.next.next;
                this.next = node;
                if (node == null || this.seenKeys.add(node.key)) {
                }
                node = this.next.next;
                this.next = node;
                break;
            } while (this.seenKeys.add(node.key));
            return this.current.key;
        }

        public void remove() {
            Preconditions.checkState(this.current != null);
            LinkedListMultimap.this.removeAllNodes(this.current.key);
            this.current = null;
        }
    }

    class ValueForKeyIterator implements ListIterator<V> {
        Node<K, V> current;
        final Object key;
        Node<K, V> next;
        int nextIndex;
        Node<K, V> previous;

        ValueForKeyIterator(Object obj) {
            this.key = obj;
            this.next = (Node) LinkedListMultimap.this.keyToKeyHead.get(obj);
        }

        public ValueForKeyIterator(Object obj, int i) {
            int count = LinkedListMultimap.this.keyCount.count(obj);
            Preconditions.checkPositionIndex(i, count);
            if (i >= count / 2) {
                this.previous = (Node) LinkedListMultimap.this.keyToKeyTail.get(obj);
                this.nextIndex = count;
                while (i < count) {
                    previous();
                    i++;
                }
            } else {
                this.next = (Node) LinkedListMultimap.this.keyToKeyHead.get(obj);
                while (i > 0) {
                    next();
                    i--;
                }
            }
            this.key = obj;
            this.current = null;
        }

        public boolean hasNext() {
            return this.next != null;
        }

        public V next() {
            LinkedListMultimap.checkElement(this.next);
            Node<K, V> node = this.next;
            this.current = node;
            this.previous = node;
            this.next = node.nextSibling;
            this.nextIndex++;
            return this.current.value;
        }

        public boolean hasPrevious() {
            return this.previous != null;
        }

        public V previous() {
            LinkedListMultimap.checkElement(this.previous);
            Node<K, V> node = this.previous;
            this.current = node;
            this.next = node;
            this.previous = node.previousSibling;
            this.nextIndex--;
            return this.current.value;
        }

        public int nextIndex() {
            return this.nextIndex;
        }

        public int previousIndex() {
            return this.nextIndex - 1;
        }

        public void remove() {
            Preconditions.checkState(this.current != null);
            Node<K, V> node = this.current;
            if (node != this.next) {
                this.previous = node.previousSibling;
                this.nextIndex--;
            } else {
                this.next = node.nextSibling;
            }
            LinkedListMultimap.this.removeNode(this.current);
            this.current = null;
        }

        public void set(V v) {
            Preconditions.checkState(this.current != null);
            this.current.value = v;
        }

        public void add(V v) {
            this.previous = LinkedListMultimap.this.addNode(this.key, v, this.next);
            this.nextIndex++;
            this.current = null;
        }
    }

    public final int size() {
        return this.keyCount.size();
    }

    public final boolean isEmpty() {
        return this.head == null;
    }

    public final boolean containsKey(Object obj) {
        return this.keyToKeyHead.containsKey(obj);
    }

    public final boolean containsValue(Object obj) {
        NodeIterator nodeIterator = new NodeIterator();
        while (nodeIterator.hasNext()) {
            if (Objects.equal(((Node) nodeIterator.next()).value, obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsEntry(Object obj, Object obj2) {
        ValueForKeyIterator valueForKeyIterator = new ValueForKeyIterator(obj);
        while (valueForKeyIterator.hasNext()) {
            if (Objects.equal(valueForKeyIterator.next(), obj2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean put(K k, V v) {
        addNode(k, v, (Node) null);
        return true;
    }

    public final boolean remove(Object obj, Object obj2) {
        ValueForKeyIterator valueForKeyIterator = new ValueForKeyIterator(obj);
        while (valueForKeyIterator.hasNext()) {
            if (Objects.equal(valueForKeyIterator.next(), obj2)) {
                valueForKeyIterator.remove();
                return true;
            }
        }
        return false;
    }

    public final boolean putAll(K k, Iterable<? extends V> iterable) {
        boolean z = false;
        for (Object put : iterable) {
            z |= put(k, put);
        }
        return z;
    }

    public final boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        boolean z = false;
        for (Map.Entry next : multimap.entries()) {
            z |= put(next.getKey(), next.getValue());
        }
        return z;
    }

    public final List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        List<V> copy = getCopy(k);
        ValueForKeyIterator valueForKeyIterator = new ValueForKeyIterator(k);
        Iterator<? extends V> it = iterable.iterator();
        while (valueForKeyIterator.hasNext() && it.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.set(it.next());
        }
        while (valueForKeyIterator.hasNext()) {
            valueForKeyIterator.next();
            valueForKeyIterator.remove();
        }
        while (it.hasNext()) {
            valueForKeyIterator.add(it.next());
        }
        return copy;
    }

    private List<V> getCopy(Object obj) {
        return Collections.unmodifiableList(Lists.newArrayList(new ValueForKeyIterator(obj)));
    }

    public final List<V> removeAll(Object obj) {
        List<V> copy = getCopy(obj);
        removeAllNodes(obj);
        return copy;
    }

    public final void clear() {
        this.head = null;
        this.tail = null;
        this.keyCount.clear();
        this.keyToKeyHead.clear();
        this.keyToKeyTail.clear();
    }

    public final List<V> get(final K k) {
        return new AbstractSequentialList<V>() {
            public int size() {
                return LinkedListMultimap.this.keyCount.count(k);
            }

            public ListIterator<V> listIterator(int i) {
                return new ValueForKeyIterator(k, i);
            }

            public boolean removeAll(Collection<?> collection) {
                return Iterators.removeAll(iterator(), collection);
            }

            public boolean retainAll(Collection<?> collection) {
                return Iterators.retainAll(iterator(), collection);
            }
        };
    }

    public final Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        C77232 r0 = new AbstractSet<K>() {
            public int size() {
                return LinkedListMultimap.this.keyCount.elementSet().size();
            }

            public Iterator<K> iterator() {
                return new DistinctKeyIterator();
            }

            public boolean contains(Object obj) {
                return LinkedListMultimap.this.keyCount.contains(obj);
            }

            public boolean removeAll(Collection<?> collection) {
                Preconditions.checkNotNull(collection);
                return super.removeAll(collection);
            }
        };
        this.keySet = r0;
        return r0;
    }

    public final Multiset<K> keys() {
        Multiset<K> multiset = this.keys;
        if (multiset != null) {
            return multiset;
        }
        MultisetView multisetView = new MultisetView();
        this.keys = multisetView;
        return multisetView;
    }

    class MultisetView extends AbstractCollection<K> implements Multiset<K> {
        private MultisetView() {
        }

        public int size() {
            return LinkedListMultimap.this.keyCount.size();
        }

        public Iterator<K> iterator() {
            final NodeIterator nodeIterator = new NodeIterator();
            return new Iterator<K>() {
                public boolean hasNext() {
                    return nodeIterator.hasNext();
                }

                public K next() {
                    return ((Node) nodeIterator.next()).key;
                }

                public void remove() {
                    nodeIterator.remove();
                }
            };
        }

        public int count(Object obj) {
            return LinkedListMultimap.this.keyCount.count(obj);
        }

        public int add(K k, int i) {
            throw new UnsupportedOperationException();
        }

        public int remove(Object obj, int i) {
            Preconditions.checkArgument(i >= 0);
            int count = count(obj);
            ValueForKeyIterator valueForKeyIterator = new ValueForKeyIterator(obj);
            while (i > 0 && valueForKeyIterator.hasNext()) {
                valueForKeyIterator.next();
                valueForKeyIterator.remove();
                i--;
            }
            return count;
        }

        public int setCount(K k, int i) {
            return Multisets.setCountImpl(this, k, i);
        }

        public boolean setCount(K k, int i, int i2) {
            return Multisets.setCountImpl(this, k, i, i2);
        }

        public boolean removeAll(Collection<?> collection) {
            return Iterators.removeAll(iterator(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return Iterators.retainAll(iterator(), collection);
        }

        public Set<K> elementSet() {
            return LinkedListMultimap.this.keySet();
        }

        public Set<Multiset.Entry<K>> entrySet() {
            return new AbstractSet<Multiset.Entry<K>>() {
                public int size() {
                    return LinkedListMultimap.this.keyCount.elementSet().size();
                }

                public Iterator<Multiset.Entry<K>> iterator() {
                    final DistinctKeyIterator distinctKeyIterator = new DistinctKeyIterator();
                    return new Iterator<Multiset.Entry<K>>() {
                        public boolean hasNext() {
                            return distinctKeyIterator.hasNext();
                        }

                        public Multiset.Entry<K> next() {
                            final Object next = distinctKeyIterator.next();
                            return new Multisets.AbstractEntry<K>() {
                                public K getElement() {
                                    return next;
                                }

                                public int getCount() {
                                    return LinkedListMultimap.this.keyCount.count(next);
                                }
                            };
                        }

                        public void remove() {
                            distinctKeyIterator.remove();
                        }
                    };
                }
            };
        }

        public boolean equals(Object obj) {
            return LinkedListMultimap.this.keyCount.equals(obj);
        }

        public int hashCode() {
            return LinkedListMultimap.this.keyCount.hashCode();
        }

        public String toString() {
            return LinkedListMultimap.this.keyCount.toString();
        }
    }

    public final Collection<V> values() {
        Collection<V> collection = this.valuesCollection;
        if (collection != null) {
            return collection;
        }
        C77243 r0 = new AbstractCollection<V>() {
            public int size() {
                return LinkedListMultimap.this.keyCount.size();
            }

            public Iterator<V> iterator() {
                final NodeIterator nodeIterator = new NodeIterator();
                return new Iterator<V>() {
                    public boolean hasNext() {
                        return nodeIterator.hasNext();
                    }

                    public V next() {
                        return ((Node) nodeIterator.next()).value;
                    }

                    public void remove() {
                        nodeIterator.remove();
                    }
                };
            }
        };
        this.valuesCollection = r0;
        return r0;
    }

    public final Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        C77264 r0 = new AbstractCollection<Map.Entry<K, V>>() {
            public int size() {
                return LinkedListMultimap.this.keyCount.size();
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                final NodeIterator nodeIterator = new NodeIterator();
                return new Iterator<Map.Entry<K, V>>() {
                    public boolean hasNext() {
                        return nodeIterator.hasNext();
                    }

                    public Map.Entry<K, V> next() {
                        final Node node = (Node) nodeIterator.next();
                        return new AbstractMapEntry<K, V>() {
                            public K getKey() {
                                return node.key;
                            }

                            public V getValue() {
                                return node.value;
                            }

                            public V setValue(V v) {
                                V v2 = node.value;
                                node.value = v;
                                return v2;
                            }
                        };
                    }

                    public void remove() {
                        nodeIterator.remove();
                    }
                };
            }
        };
        this.entries = r0;
        return r0;
    }

    class AsMapEntries extends AbstractSet<Map.Entry<K, Collection<V>>> {
        private AsMapEntries() {
        }

        public int size() {
            return LinkedListMultimap.this.keyCount.elementSet().size();
        }

        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            final DistinctKeyIterator distinctKeyIterator = new DistinctKeyIterator();
            return new Iterator<Map.Entry<K, Collection<V>>>() {
                public boolean hasNext() {
                    return distinctKeyIterator.hasNext();
                }

                public Map.Entry<K, Collection<V>> next() {
                    final Object next = distinctKeyIterator.next();
                    return new AbstractMapEntry<K, Collection<V>>() {
                        public K getKey() {
                            return next;
                        }

                        public Collection<V> getValue() {
                            return LinkedListMultimap.this.get(next);
                        }
                    };
                }

                public void remove() {
                    distinctKeyIterator.remove();
                }
            };
        }
    }

    public final Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map2 = this.map;
        if (map2 != null) {
            return map2;
        }
        C77295 r0 = new AbstractMap<K, Collection<V>>() {
            Set<Map.Entry<K, Collection<V>>> entrySet;

            public Set<Map.Entry<K, Collection<V>>> entrySet() {
                Set<Map.Entry<K, Collection<V>>> set = this.entrySet;
                if (set != null) {
                    return set;
                }
                AsMapEntries asMapEntries = new AsMapEntries();
                this.entrySet = asMapEntries;
                return asMapEntries;
            }

            public boolean containsKey(Object obj) {
                return LinkedListMultimap.this.containsKey(obj);
            }

            public Collection<V> get(Object obj) {
                List list = LinkedListMultimap.this.get(obj);
                if (list.isEmpty()) {
                    return null;
                }
                return list;
            }

            public Collection<V> remove(Object obj) {
                List removeAll = LinkedListMultimap.this.removeAll(obj);
                if (removeAll.isEmpty()) {
                    return null;
                }
                return removeAll;
            }
        };
        this.map = r0;
        return r0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Multimap) {
            return asMap().equals(((Multimap) obj).asMap());
        }
        return false;
    }

    public final int hashCode() {
        return asMap().hashCode();
    }

    public final String toString() {
        return asMap().toString();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry entry : entries()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.keyCount = LinkedHashMultiset.create();
        this.keyToKeyHead = Maps.newHashMap();
        this.keyToKeyTail = Maps.newHashMap();
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }
}
