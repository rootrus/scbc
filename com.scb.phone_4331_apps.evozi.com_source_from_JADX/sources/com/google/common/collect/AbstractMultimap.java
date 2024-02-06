package com.google.common.collect;

import WrappedCollection.WrappedIterator;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

abstract class AbstractMultimap<K, V> implements Multimap<K, V>, Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    private transient Map<K, Collection<V>> asMap;
    private transient Collection<Map.Entry<K, V>> entries;
    private transient Set<K> keySet;
    /* access modifiers changed from: private */
    public transient Map<K, Collection<V>> map;
    private transient Multiset<K> multiset;
    /* access modifiers changed from: private */
    public transient int totalSize;
    private transient Collection<V> valuesCollection;

    /* access modifiers changed from: package-private */
    public abstract Collection<V> createCollection();

    static /* synthetic */ int access$208(AbstractMultimap abstractMultimap) {
        int i = abstractMultimap.totalSize;
        abstractMultimap.totalSize = i + 1;
        return i;
    }

    static /* synthetic */ int access$210(AbstractMultimap abstractMultimap) {
        int i = abstractMultimap.totalSize;
        abstractMultimap.totalSize = i - 1;
        return i;
    }

    static /* synthetic */ int access$212(AbstractMultimap abstractMultimap, int i) {
        int i2 = abstractMultimap.totalSize + i;
        abstractMultimap.totalSize = i2;
        return i2;
    }

    static /* synthetic */ int access$220(AbstractMultimap abstractMultimap, int i) {
        int i2 = abstractMultimap.totalSize - i;
        abstractMultimap.totalSize = i2;
        return i2;
    }

    protected AbstractMultimap(Map<K, Collection<V>> map2) {
        Preconditions.checkArgument(map2.isEmpty());
        this.map = map2;
    }

    /* access modifiers changed from: package-private */
    public final void setMap(Map<K, Collection<V>> map2) {
        this.map = map2;
        this.totalSize = 0;
        for (Collection next : map2.values()) {
            Preconditions.checkArgument(!next.isEmpty());
            this.totalSize += next.size();
        }
    }

    /* access modifiers changed from: package-private */
    public Collection<V> createCollection(K k) {
        return createCollection();
    }

    /* access modifiers changed from: package-private */
    public Map<K, Collection<V>> backingMap() {
        return this.map;
    }

    public int size() {
        return this.totalSize;
    }

    public boolean isEmpty() {
        return this.totalSize == 0;
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        for (Collection<V> contains : this.map.values()) {
            if (contains.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsEntry(Object obj, Object obj2) {
        Collection collection = this.map.get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean put(K k, V v) {
        if (!getOrCreateCollection(k).add(v)) {
            return false;
        }
        this.totalSize++;
        return true;
    }

    private Collection<V> getOrCreateCollection(K k) {
        Collection<V> collection = this.map.get(k);
        if (collection != null) {
            return collection;
        }
        Collection<V> createCollection = createCollection(k);
        this.map.put(k, createCollection);
        return createCollection;
    }

    public boolean remove(Object obj, Object obj2) {
        Collection collection = this.map.get(obj);
        if (collection == null) {
            return false;
        }
        boolean remove = collection.remove(obj2);
        if (remove) {
            this.totalSize--;
            if (collection.isEmpty()) {
                this.map.remove(obj);
            }
        }
        return remove;
    }

    public boolean putAll(K k, Iterable<? extends V> iterable) {
        boolean z;
        boolean z2 = false;
        if (!iterable.iterator().hasNext()) {
            return false;
        }
        Collection orCreateCollection = getOrCreateCollection(k);
        int size = orCreateCollection.size();
        if (iterable instanceof Collection) {
            z = orCreateCollection.addAll(Collections2.cast(iterable));
        } else {
            for (Object add : iterable) {
                z2 |= orCreateCollection.add(add);
            }
            z = z2;
        }
        this.totalSize += orCreateCollection.size() - size;
        return z;
    }

    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        boolean z = false;
        for (Map.Entry next : multimap.entries()) {
            z |= put(next.getKey(), next.getValue());
        }
        return z;
    }

    public Collection<V> replaceValues(K k, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k);
        }
        Collection orCreateCollection = getOrCreateCollection(k);
        Collection createCollection = createCollection();
        createCollection.addAll(orCreateCollection);
        this.totalSize -= orCreateCollection.size();
        orCreateCollection.clear();
        while (it.hasNext()) {
            if (orCreateCollection.add(it.next())) {
                this.totalSize++;
            }
        }
        return unmodifiableCollectionSubclass(createCollection);
    }

    public Collection<V> removeAll(Object obj) {
        Collection remove = this.map.remove(obj);
        Collection createCollection = createCollection();
        if (remove != null) {
            createCollection.addAll(remove);
            this.totalSize -= remove.size();
            remove.clear();
        }
        return unmodifiableCollectionSubclass(createCollection);
    }

    private Collection<V> unmodifiableCollectionSubclass(Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return Collections.unmodifiableSortedSet((SortedSet) collection);
        }
        if (collection instanceof Set) {
            return Collections.unmodifiableSet((Set) collection);
        }
        if (collection instanceof List) {
            return Collections.unmodifiableList((List) collection);
        }
        return Collections.unmodifiableCollection(collection);
    }

    public void clear() {
        for (Collection<V> clear : this.map.values()) {
            clear.clear();
        }
        this.map.clear();
        this.totalSize = 0;
    }

    public Collection<V> get(K k) {
        Collection collection = this.map.get(k);
        if (collection == null) {
            collection = createCollection(k);
        }
        return wrapCollection(k, collection);
    }

    /* access modifiers changed from: private */
    public Collection<V> wrapCollection(K k, Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return new WrappedSortedSet(k, (SortedSet) collection, (AbstractMultimap<K, V>.WrappedCollection) null);
        }
        if (collection instanceof Set) {
            return new WrappedSet(k, (Set) collection);
        }
        if (collection instanceof List) {
            return wrapList(k, (List) collection, (AbstractMultimap<K, V>.WrappedCollection) null);
        }
        return new WrappedCollection(k, collection, (AbstractMultimap<K, V>.WrappedCollection) null);
    }

    /* access modifiers changed from: private */
    public List<V> wrapList(K k, List<V> list, AbstractMultimap<K, V>.WrappedCollection wrappedCollection) {
        return list instanceof RandomAccess ? new RandomAccessWrappedList(k, list, wrappedCollection) : new WrappedList(k, list, wrappedCollection);
    }

    class WrappedCollection extends AbstractCollection<V> {
        final AbstractMultimap<K, V>.WrappedCollection ancestor;
        final Collection<V> ancestorDelegate;
        Collection<V> delegate;
        final K key;

        WrappedCollection(K k, Collection<V> collection, AbstractMultimap<K, V>.WrappedCollection wrappedCollection) {
            Collection<V> collection2;
            this.key = k;
            this.delegate = collection;
            this.ancestor = wrappedCollection;
            if (wrappedCollection == null) {
                collection2 = null;
            } else {
                collection2 = wrappedCollection.getDelegate();
            }
            this.ancestorDelegate = collection2;
        }

        /* access modifiers changed from: package-private */
        public void refreshIfEmpty() {
            Collection<V> collection;
            AbstractMultimap<K, V>.WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.refreshIfEmpty();
                if (this.ancestor.getDelegate() != this.ancestorDelegate) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.delegate.isEmpty() && (collection = (Collection) AbstractMultimap.this.map.get(this.key)) != null) {
                this.delegate = collection;
            }
        }

        /* access modifiers changed from: package-private */
        public void removeIfEmpty() {
            AbstractMultimap<K, V>.WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.removeIfEmpty();
            } else if (this.delegate.isEmpty()) {
                AbstractMultimap.this.map.remove(this.key);
            }
        }

        /* access modifiers changed from: package-private */
        public K getKey() {
            return this.key;
        }

        /* access modifiers changed from: package-private */
        public void addToMap() {
            AbstractMultimap<K, V>.WrappedCollection wrappedCollection = this.ancestor;
            if (wrappedCollection != null) {
                wrappedCollection.addToMap();
            } else {
                AbstractMultimap.this.map.put(this.key, this.delegate);
            }
        }

        public int size() {
            refreshIfEmpty();
            return this.delegate.size();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            refreshIfEmpty();
            return this.delegate.equals(obj);
        }

        public int hashCode() {
            refreshIfEmpty();
            return this.delegate.hashCode();
        }

        public String toString() {
            refreshIfEmpty();
            return this.delegate.toString();
        }

        /* access modifiers changed from: package-private */
        public Collection<V> getDelegate() {
            return this.delegate;
        }

        public Iterator<V> iterator() {
            refreshIfEmpty();
            return new WrappedIterator();
        }

        class WrappedIterator implements Iterator<V> {
            final Iterator<V> delegateIterator;
            final Collection<V> originalDelegate = WrappedCollection.this.delegate;

            WrappedIterator() {
                this.delegateIterator = AbstractMultimap.this.iteratorOrListIterator(WrappedCollection.this.delegate);
            }

            WrappedIterator(Iterator<V> it) {
                this.delegateIterator = it;
            }

            /* access modifiers changed from: package-private */
            public void validateIterator() {
                WrappedCollection.this.refreshIfEmpty();
                if (WrappedCollection.this.delegate != this.originalDelegate) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                validateIterator();
                return this.delegateIterator.hasNext();
            }

            public V next() {
                validateIterator();
                return this.delegateIterator.next();
            }

            public void remove() {
                this.delegateIterator.remove();
                AbstractMultimap.access$210(AbstractMultimap.this);
                WrappedCollection.this.removeIfEmpty();
            }

            /* access modifiers changed from: package-private */
            public Iterator<V> getDelegateIterator() {
                validateIterator();
                return this.delegateIterator;
            }
        }

        public boolean add(V v) {
            refreshIfEmpty();
            boolean isEmpty = this.delegate.isEmpty();
            boolean add = this.delegate.add(v);
            if (add) {
                AbstractMultimap.access$208(AbstractMultimap.this);
                if (isEmpty) {
                    addToMap();
                }
            }
            return add;
        }

        /* access modifiers changed from: package-private */
        public AbstractMultimap<K, V>.WrappedCollection getAncestor() {
            return this.ancestor;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.delegate.addAll(collection);
            if (addAll) {
                AbstractMultimap.access$212(AbstractMultimap.this, this.delegate.size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        public boolean contains(Object obj) {
            refreshIfEmpty();
            return this.delegate.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            refreshIfEmpty();
            return this.delegate.containsAll(collection);
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.delegate.clear();
                AbstractMultimap.access$220(AbstractMultimap.this, size);
                removeIfEmpty();
            }
        }

        public boolean remove(Object obj) {
            refreshIfEmpty();
            boolean remove = this.delegate.remove(obj);
            if (remove) {
                AbstractMultimap.access$210(AbstractMultimap.this);
                removeIfEmpty();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.delegate.removeAll(collection);
            if (removeAll) {
                AbstractMultimap.access$212(AbstractMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.delegate.retainAll(collection);
            if (retainAll) {
                AbstractMultimap.access$212(AbstractMultimap.this, this.delegate.size() - size);
                removeIfEmpty();
            }
            return retainAll;
        }
    }

    /* access modifiers changed from: private */
    public Iterator<V> iteratorOrListIterator(Collection<V> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    class WrappedSet extends AbstractMultimap<K, V>.WrappedCollection implements Set<V> {
        WrappedSet(K k, Set<V> set) {
            super(k, set, (AbstractMultimap<K, V>.WrappedCollection) null);
        }
    }

    class WrappedSortedSet extends AbstractMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        WrappedSortedSet(K k, SortedSet<V> sortedSet, AbstractMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, sortedSet, wrappedCollection);
        }

        /* access modifiers changed from: package-private */
        public SortedSet<V> getSortedSetDelegate() {
            return (SortedSet) getDelegate();
        }

        public Comparator<? super V> comparator() {
            return getSortedSetDelegate().comparator();
        }

        public V first() {
            refreshIfEmpty();
            return getSortedSetDelegate().first();
        }

        public V last() {
            refreshIfEmpty();
            return getSortedSetDelegate().last();
        }

        public SortedSet<V> headSet(V v) {
            refreshIfEmpty();
            return new WrappedSortedSet(getKey(), getSortedSetDelegate().headSet(v), getAncestor() == null ? this : getAncestor());
        }

        public SortedSet<V> subSet(V v, V v2) {
            refreshIfEmpty();
            return new WrappedSortedSet(getKey(), getSortedSetDelegate().subSet(v, v2), getAncestor() == null ? this : getAncestor());
        }

        public SortedSet<V> tailSet(V v) {
            refreshIfEmpty();
            return new WrappedSortedSet(getKey(), getSortedSetDelegate().tailSet(v), getAncestor() == null ? this : getAncestor());
        }
    }

    class WrappedList extends AbstractMultimap<K, V>.WrappedCollection implements List<V> {
        WrappedList(K k, List<V> list, AbstractMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, list, wrappedCollection);
        }

        /* access modifiers changed from: package-private */
        public List<V> getListDelegate() {
            return (List) getDelegate();
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = getListDelegate().addAll(i, collection);
            if (addAll) {
                AbstractMultimap.access$212(AbstractMultimap.this, getDelegate().size() - size);
                if (size == 0) {
                    addToMap();
                }
            }
            return addAll;
        }

        public V get(int i) {
            refreshIfEmpty();
            return getListDelegate().get(i);
        }

        public V set(int i, V v) {
            refreshIfEmpty();
            return getListDelegate().set(i, v);
        }

        public void add(int i, V v) {
            refreshIfEmpty();
            boolean isEmpty = getDelegate().isEmpty();
            getListDelegate().add(i, v);
            AbstractMultimap.access$208(AbstractMultimap.this);
            if (isEmpty) {
                addToMap();
            }
        }

        public V remove(int i) {
            refreshIfEmpty();
            V remove = getListDelegate().remove(i);
            AbstractMultimap.access$210(AbstractMultimap.this);
            removeIfEmpty();
            return remove;
        }

        public int indexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            refreshIfEmpty();
            return getListDelegate().lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            refreshIfEmpty();
            return new WrappedListIterator();
        }

        public ListIterator<V> listIterator(int i) {
            refreshIfEmpty();
            return new WrappedListIterator(i);
        }

        public List<V> subList(int i, int i2) {
            refreshIfEmpty();
            return AbstractMultimap.this.wrapList(getKey(), getListDelegate().subList(i, i2), getAncestor() == null ? this : getAncestor());
        }

        class WrappedListIterator extends AbstractMultimap<K, V>.WrappedIterator implements ListIterator<V> {
            WrappedListIterator() {
                super();
            }

            public WrappedListIterator(int i) {
                super(WrappedList.this.getListDelegate().listIterator(i));
            }

            private ListIterator<V> getDelegateListIterator() {
                return (ListIterator) getDelegateIterator();
            }

            public boolean hasPrevious() {
                return getDelegateListIterator().hasPrevious();
            }

            public V previous() {
                return getDelegateListIterator().previous();
            }

            public int nextIndex() {
                return getDelegateListIterator().nextIndex();
            }

            public int previousIndex() {
                return getDelegateListIterator().previousIndex();
            }

            public void set(V v) {
                getDelegateListIterator().set(v);
            }

            public void add(V v) {
                boolean isEmpty = WrappedList.this.isEmpty();
                getDelegateListIterator().add(v);
                AbstractMultimap.access$208(AbstractMultimap.this);
                if (isEmpty) {
                    WrappedList.this.addToMap();
                }
            }
        }
    }

    class RandomAccessWrappedList extends WrappedList implements RandomAccess {
        RandomAccessWrappedList(K k, List<V> list, AbstractMultimap<K, V>.WrappedCollection wrappedCollection) {
            super(k, list, wrappedCollection);
        }
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        Set<K> createKeySet = createKeySet();
        this.keySet = createKeySet;
        return createKeySet;
    }

    private Set<K> createKeySet() {
        return this.map instanceof SortedMap ? new SortedKeySet((SortedMap) this.map) : new KeySet(this.map);
    }

    class KeySet extends AbstractSet<K> {
        final Map<K, Collection<V>> subMap;

        KeySet(Map<K, Collection<V>> map) {
            this.subMap = map;
        }

        public int size() {
            return this.subMap.size();
        }

        public Iterator<K> iterator() {
            return new Iterator<K>() {
                Map.Entry<K, Collection<V>> entry;
                final Iterator<Map.Entry<K, Collection<V>>> entryIterator = KeySet.this.subMap.entrySet().iterator();

                public boolean hasNext() {
                    return this.entryIterator.hasNext();
                }

                public K next() {
                    Map.Entry<K, Collection<V>> next = this.entryIterator.next();
                    this.entry = next;
                    return next.getKey();
                }

                public void remove() {
                    Preconditions.checkState(this.entry != null);
                    Collection value = this.entry.getValue();
                    this.entryIterator.remove();
                    AbstractMultimap.access$220(AbstractMultimap.this, value.size());
                    value.clear();
                }
            };
        }

        public boolean contains(Object obj) {
            return this.subMap.containsKey(obj);
        }

        public boolean remove(Object obj) {
            int i;
            Collection remove = this.subMap.remove(obj);
            if (remove != null) {
                i = remove.size();
                remove.clear();
                AbstractMultimap.access$220(AbstractMultimap.this, i);
            } else {
                i = 0;
            }
            if (i > 0) {
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            return super.removeAll(collection);
        }

        public boolean containsAll(Collection<?> collection) {
            return this.subMap.keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || this.subMap.keySet().equals(obj);
        }

        public int hashCode() {
            return this.subMap.keySet().hashCode();
        }
    }

    class SortedKeySet extends AbstractMultimap<K, V>.KeySet implements SortedSet<K> {
        SortedKeySet(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> sortedMap() {
            return (SortedMap) this.subMap;
        }

        public Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        public K first() {
            return sortedMap().firstKey();
        }

        public SortedSet<K> headSet(K k) {
            return new SortedKeySet(sortedMap().headMap(k));
        }

        public K last() {
            return sortedMap().lastKey();
        }

        public SortedSet<K> subSet(K k, K k2) {
            return new SortedKeySet(sortedMap().subMap(k, k2));
        }

        public SortedSet<K> tailSet(K k) {
            return new SortedKeySet(sortedMap().tailMap(k));
        }
    }

    public Multiset<K> keys() {
        Multiset<K> multiset2 = this.multiset;
        if (multiset2 != null) {
            return multiset2;
        }
        MultisetView multisetView = new MultisetView();
        this.multiset = multisetView;
        return multisetView;
    }

    class MultisetView extends AbstractMultiset<K> {
        transient Set<Multiset.Entry<K>> entrySet;

        private MultisetView() {
        }

        public int remove(Object obj, int i) {
            if (i == 0) {
                return count(obj);
            }
            Preconditions.checkArgument(i > 0);
            try {
                Collection collection = (Collection) AbstractMultimap.this.map.get(obj);
                if (collection == null) {
                    return 0;
                }
                int size = collection.size();
                if (i >= size) {
                    return AbstractMultimap.this.removeValuesForKey(obj);
                }
                Iterator it = collection.iterator();
                for (int i2 = 0; i2 < i; i2++) {
                    it.next();
                    it.remove();
                }
                AbstractMultimap.access$220(AbstractMultimap.this, i);
                return size;
            } catch (ClassCastException | NullPointerException unused) {
                return 0;
            }
        }

        public Set<K> elementSet() {
            return AbstractMultimap.this.keySet();
        }

        public Set<Multiset.Entry<K>> entrySet() {
            Set<Multiset.Entry<K>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            EntrySet entrySet2 = new EntrySet();
            this.entrySet = entrySet2;
            return entrySet2;
        }

        class EntrySet extends AbstractSet<Multiset.Entry<K>> {
            private EntrySet() {
            }

            public Iterator<Multiset.Entry<K>> iterator() {
                return new MultisetEntryIterator();
            }

            public int size() {
                return AbstractMultimap.this.map.size();
            }

            public boolean contains(Object obj) {
                if (!(obj instanceof Multiset.Entry)) {
                    return false;
                }
                Multiset.Entry entry = (Multiset.Entry) obj;
                Collection collection = (Collection) AbstractMultimap.this.map.get(entry.getElement());
                if (collection == null || collection.size() != entry.getCount()) {
                    return false;
                }
                return true;
            }

            public void clear() {
                AbstractMultimap.this.clear();
            }

            public boolean remove(Object obj) {
                return contains(obj) && AbstractMultimap.this.removeValuesForKey(((Multiset.Entry) obj).getElement()) > 0;
            }
        }

        public Iterator<K> iterator() {
            return new MultisetKeyIterator();
        }

        public int count(Object obj) {
            try {
                Collection collection = (Collection) AbstractMultimap.this.map.get(obj);
                if (collection != null) {
                    return collection.size();
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
            return 0;
        }

        public int size() {
            return AbstractMultimap.this.totalSize;
        }

        public void clear() {
            AbstractMultimap.this.clear();
        }
    }

    /* access modifiers changed from: private */
    public int removeValuesForKey(Object obj) {
        try {
            Collection remove = this.map.remove(obj);
            if (remove != null) {
                int size = remove.size();
                remove.clear();
                this.totalSize -= size;
                return size;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    class MultisetEntryIterator implements Iterator<Multiset.Entry<K>> {
        final Iterator<Map.Entry<K, Collection<V>>> asMapIterator;

        private MultisetEntryIterator() {
            this.asMapIterator = AbstractMultimap.this.asMap().entrySet().iterator();
        }

        public boolean hasNext() {
            return this.asMapIterator.hasNext();
        }

        public Multiset.Entry<K> next() {
            return new MultisetEntry(this.asMapIterator.next());
        }

        public void remove() {
            this.asMapIterator.remove();
        }
    }

    class MultisetEntry extends Multisets.AbstractEntry<K> {
        final Map.Entry<K, Collection<V>> entry;

        public MultisetEntry(Map.Entry<K, Collection<V>> entry2) {
            this.entry = entry2;
        }

        public K getElement() {
            return this.entry.getKey();
        }

        public int getCount() {
            return this.entry.getValue().size();
        }
    }

    class MultisetKeyIterator implements Iterator<K> {
        final Iterator<Map.Entry<K, V>> entryIterator;

        private MultisetKeyIterator() {
            this.entryIterator = AbstractMultimap.this.entries().iterator();
        }

        public boolean hasNext() {
            return this.entryIterator.hasNext();
        }

        public K next() {
            return this.entryIterator.next().getKey();
        }

        public void remove() {
            this.entryIterator.remove();
        }
    }

    public Collection<V> values() {
        Collection<V> collection = this.valuesCollection;
        if (collection != null) {
            return collection;
        }
        Values values = new Values();
        this.valuesCollection = values;
        return values;
    }

    class Values extends AbstractCollection<V> {
        private Values() {
        }

        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        public int size() {
            return AbstractMultimap.this.totalSize;
        }

        public void clear() {
            AbstractMultimap.this.clear();
        }

        public boolean contains(Object obj) {
            return AbstractMultimap.this.containsValue(obj);
        }
    }

    class ValueIterator implements Iterator<V> {
        final Iterator<Map.Entry<K, V>> entryIterator;

        private ValueIterator() {
            this.entryIterator = AbstractMultimap.this.createEntryIterator();
        }

        public boolean hasNext() {
            return this.entryIterator.hasNext();
        }

        public V next() {
            return this.entryIterator.next().getValue();
        }

        public void remove() {
            this.entryIterator.remove();
        }
    }

    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.entries;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> createEntries = createEntries();
        this.entries = createEntries;
        return createEntries;
    }

    private Collection<Map.Entry<K, V>> createEntries() {
        return this instanceof SetMultimap ? new EntrySet() : new Entries();
    }

    class Entries extends AbstractCollection<Map.Entry<K, V>> {
        private Entries() {
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractMultimap.this.createEntryIterator();
        }

        public int size() {
            return AbstractMultimap.this.totalSize;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractMultimap.this.containsEntry(entry.getKey(), entry.getValue());
        }

        public void clear() {
            AbstractMultimap.this.clear();
        }

        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractMultimap.this.remove(entry.getKey(), entry.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    public Iterator<Map.Entry<K, V>> createEntryIterator() {
        return new EntryIterator();
    }

    class EntryIterator implements Iterator<Map.Entry<K, V>> {
        Collection<V> collection;
        K key;
        final Iterator<Map.Entry<K, Collection<V>>> keyIterator;
        Iterator<V> valueIterator;

        EntryIterator() {
            Iterator<Map.Entry<K, Collection<V>>> it = AbstractMultimap.this.map.entrySet().iterator();
            this.keyIterator = it;
            if (it.hasNext()) {
                findValueIteratorAndKey();
            } else {
                this.valueIterator = Iterators.emptyModifiableIterator();
            }
        }

        /* access modifiers changed from: package-private */
        public void findValueIteratorAndKey() {
            Map.Entry next = this.keyIterator.next();
            this.key = next.getKey();
            Collection<V> collection2 = (Collection) next.getValue();
            this.collection = collection2;
            this.valueIterator = collection2.iterator();
        }

        public boolean hasNext() {
            return this.keyIterator.hasNext() || this.valueIterator.hasNext();
        }

        public Map.Entry<K, V> next() {
            if (!this.valueIterator.hasNext()) {
                findValueIteratorAndKey();
            }
            return Maps.immutableEntry(this.key, this.valueIterator.next());
        }

        public void remove() {
            this.valueIterator.remove();
            if (this.collection.isEmpty()) {
                this.keyIterator.remove();
            }
            AbstractMultimap.access$210(AbstractMultimap.this);
        }
    }

    class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        private EntrySet() {
            super();
        }

        public boolean equals(Object obj) {
            return Sets.equalsImpl(this, obj);
        }

        public int hashCode() {
            return Sets.hashCodeImpl(this);
        }
    }

    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map2 = this.asMap;
        if (map2 != null) {
            return map2;
        }
        Map<K, Collection<V>> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    private Map<K, Collection<V>> createAsMap() {
        return this.map instanceof SortedMap ? new SortedAsMap((SortedMap) this.map) : new AsMap(this.map);
    }

    class AsMap extends AbstractMap<K, Collection<V>> {
        transient Set<Map.Entry<K, Collection<V>>> entrySet;
        final transient Map<K, Collection<V>> submap;

        AsMap(Map<K, Collection<V>> map) {
            this.submap = map;
        }

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
            return Maps.safeContainsKey(this.submap, obj);
        }

        public Collection<V> get(Object obj) {
            Collection collection = (Collection) Maps.safeGet(this.submap, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMultimap.this.wrapCollection(obj, collection);
        }

        public Set<K> keySet() {
            return AbstractMultimap.this.keySet();
        }

        public Collection<V> remove(Object obj) {
            Collection remove = this.submap.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection<V> createCollection = AbstractMultimap.this.createCollection();
            createCollection.addAll(remove);
            AbstractMultimap.access$220(AbstractMultimap.this, remove.size());
            remove.clear();
            return createCollection;
        }

        public boolean equals(Object obj) {
            return this == obj || this.submap.equals(obj);
        }

        public int hashCode() {
            return this.submap.hashCode();
        }

        public String toString() {
            return this.submap.toString();
        }

        class AsMapEntries extends AbstractSet<Map.Entry<K, Collection<V>>> {
            AsMapEntries() {
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new AsMapIterator();
            }

            public int size() {
                return AsMap.this.submap.size();
            }

            public boolean contains(Object obj) {
                return Collections2.safeContains(AsMap.this.submap.entrySet(), obj);
            }

            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                int unused = AbstractMultimap.this.removeValuesForKey(((Map.Entry) obj).getKey());
                return true;
            }
        }

        class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {
            Collection<V> collection;
            final Iterator<Map.Entry<K, Collection<V>>> delegateIterator = AsMap.this.submap.entrySet().iterator();

            AsMapIterator() {
            }

            public boolean hasNext() {
                return this.delegateIterator.hasNext();
            }

            public Map.Entry<K, Collection<V>> next() {
                Map.Entry next = this.delegateIterator.next();
                Object key = next.getKey();
                this.collection = (Collection) next.getValue();
                return Maps.immutableEntry(key, AbstractMultimap.this.wrapCollection(key, this.collection));
            }

            public void remove() {
                this.delegateIterator.remove();
                AbstractMultimap.access$220(AbstractMultimap.this, this.collection.size());
                this.collection.clear();
            }
        }
    }

    class SortedAsMap extends AbstractMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {
        SortedSet<K> sortedKeySet;

        SortedAsMap(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        /* access modifiers changed from: package-private */
        public SortedMap<K, Collection<V>> sortedMap() {
            return (SortedMap) this.submap;
        }

        public Comparator<? super K> comparator() {
            return sortedMap().comparator();
        }

        public K firstKey() {
            return sortedMap().firstKey();
        }

        public K lastKey() {
            return sortedMap().lastKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k) {
            return new SortedAsMap(sortedMap().headMap(k));
        }

        public SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new SortedAsMap(sortedMap().subMap(k, k2));
        }

        public SortedMap<K, Collection<V>> tailMap(K k) {
            return new SortedAsMap(sortedMap().tailMap(k));
        }

        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.sortedKeySet;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedKeySet sortedKeySet2 = new SortedKeySet(sortedMap());
            this.sortedKeySet = sortedKeySet2;
            return sortedKeySet2;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Multimap) {
            return this.map.equals(((Multimap) obj).asMap());
        }
        return false;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    public String toString() {
        return this.map.toString();
    }
}
