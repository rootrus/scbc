package com.google.common.collect;

import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.primitives.Ints;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = -2250766705698539974L;
    /* access modifiers changed from: private */
    public transient Map<E, AtomicInteger> backingMap;
    private transient AbstractMapBasedMultiset<E>.EntrySet entrySet;
    /* access modifiers changed from: private */
    public transient long size = ((long) super.size());

    static /* synthetic */ long access$210(AbstractMapBasedMultiset abstractMapBasedMultiset) {
        long j = abstractMapBasedMultiset.size;
        abstractMapBasedMultiset.size = j - 1;
        return j;
    }

    static /* synthetic */ long access$222(AbstractMapBasedMultiset abstractMapBasedMultiset, long j) {
        long j2 = abstractMapBasedMultiset.size - j;
        abstractMapBasedMultiset.size = j2;
        return j2;
    }

    protected AbstractMapBasedMultiset(Map<E, AtomicInteger> map) {
        this.backingMap = (Map) Preconditions.checkNotNull(map);
    }

    /* access modifiers changed from: package-private */
    public Map<E, AtomicInteger> backingMap() {
        return this.backingMap;
    }

    /* access modifiers changed from: package-private */
    public void setBackingMap(Map<E, AtomicInteger> map) {
        this.backingMap = map;
    }

    public Set<Multiset.Entry<E>> entrySet() {
        AbstractMapBasedMultiset<E>.EntrySet entrySet2 = this.entrySet;
        if (entrySet2 != null) {
            return entrySet2;
        }
        AbstractMapBasedMultiset<E>.EntrySet entrySet3 = new EntrySet();
        this.entrySet = entrySet3;
        return entrySet3;
    }

    class EntrySet extends AbstractSet<Multiset.Entry<E>> {
        private EntrySet() {
        }

        public Iterator<Multiset.Entry<E>> iterator() {
            final Iterator it = AbstractMapBasedMultiset.this.backingMap.entrySet().iterator();
            return new Iterator<Multiset.Entry<E>>() {
                Map.Entry<E, AtomicInteger> toRemove;

                public boolean hasNext() {
                    return it.hasNext();
                }

                public Multiset.Entry<E> next() {
                    final Map.Entry<E, AtomicInteger> entry = (Map.Entry) it.next();
                    this.toRemove = entry;
                    return new Multisets.AbstractEntry<E>() {
                        public E getElement() {
                            return entry.getKey();
                        }

                        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
                            r1 = (java.util.concurrent.atomic.AtomicInteger) com.google.common.collect.AbstractMapBasedMultiset.access$100(r3.this$2.this$1.this$0).get(getElement());
                         */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public int getCount() {
                            /*
                                r3 = this;
                                java.util.Map$Entry r0 = r0
                                java.lang.Object r0 = r0.getValue()
                                java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
                                int r0 = r0.get()
                                if (r0 != 0) goto L_0x0028
                                com.google.common.collect.AbstractMapBasedMultiset$EntrySet$1 r1 = com.google.common.collect.AbstractMapBasedMultiset.EntrySet.C76741.this
                                com.google.common.collect.AbstractMapBasedMultiset$EntrySet r1 = com.google.common.collect.AbstractMapBasedMultiset.EntrySet.this
                                com.google.common.collect.AbstractMapBasedMultiset r1 = com.google.common.collect.AbstractMapBasedMultiset.this
                                java.util.Map r1 = r1.backingMap
                                java.lang.Object r2 = r3.getElement()
                                java.lang.Object r1 = r1.get(r2)
                                java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
                                if (r1 == 0) goto L_0x0028
                                int r0 = r1.get()
                            L_0x0028:
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.AbstractMapBasedMultiset.EntrySet.C76741.C76751.getCount():int");
                        }
                    };
                }

                public void remove() {
                    Preconditions.checkState(this.toRemove != null, "no calls to next() since the last call to remove()");
                    AbstractMapBasedMultiset.access$222(AbstractMapBasedMultiset.this, (long) this.toRemove.getValue().getAndSet(0));
                    it.remove();
                    this.toRemove = null;
                }
            };
        }

        public int size() {
            return AbstractMapBasedMultiset.this.backingMap.size();
        }

        public void clear() {
            for (AtomicInteger atomicInteger : AbstractMapBasedMultiset.this.backingMap.values()) {
                atomicInteger.set(0);
            }
            AbstractMapBasedMultiset.this.backingMap.clear();
            long unused = AbstractMapBasedMultiset.this.size = 0;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Multiset.Entry)) {
                return false;
            }
            Multiset.Entry entry = (Multiset.Entry) obj;
            int count = AbstractMapBasedMultiset.this.count(entry.getElement());
            if (count != entry.getCount() || count <= 0) {
                return false;
            }
            return true;
        }

        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractMapBasedMultiset.access$222(AbstractMapBasedMultiset.this, (long) ((AtomicInteger) AbstractMapBasedMultiset.this.backingMap.remove(((Multiset.Entry) obj).getElement())).getAndSet(0));
            return true;
        }
    }

    public int size() {
        return Ints.saturatedCast(this.size);
    }

    public Iterator<E> iterator() {
        return new MapBasedMultisetIterator();
    }

    class MapBasedMultisetIterator implements Iterator<E> {
        boolean canRemove;
        Map.Entry<E, AtomicInteger> currentEntry;
        final Iterator<Map.Entry<E, AtomicInteger>> entryIterator;
        int occurrencesLeft;

        MapBasedMultisetIterator() {
            this.entryIterator = AbstractMapBasedMultiset.this.backingMap.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.occurrencesLeft > 0 || this.entryIterator.hasNext();
        }

        public E next() {
            if (this.occurrencesLeft == 0) {
                Map.Entry<E, AtomicInteger> next = this.entryIterator.next();
                this.currentEntry = next;
                this.occurrencesLeft = next.getValue().get();
            }
            this.occurrencesLeft--;
            this.canRemove = true;
            return this.currentEntry.getKey();
        }

        public void remove() {
            Preconditions.checkState(this.canRemove, "no calls to next() since the last call to remove()");
            if (this.currentEntry.getValue().get() > 0) {
                if (this.currentEntry.getValue().addAndGet(-1) == 0) {
                    this.entryIterator.remove();
                }
                AbstractMapBasedMultiset.access$210(AbstractMapBasedMultiset.this);
                this.canRemove = false;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public boolean contains(Object obj) {
        AtomicInteger atomicInteger = this.backingMap.get(obj);
        return atomicInteger != null && atomicInteger.get() > 0;
    }

    public int count(Object obj) {
        AtomicInteger atomicInteger = this.backingMap.get(obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    public int add(E e, int i) {
        if (i == 0) {
            return count(e);
        }
        int i2 = 0;
        Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", Integer.valueOf(i));
        AtomicInteger atomicInteger = this.backingMap.get(e);
        if (atomicInteger == null) {
            this.backingMap.put(e, new AtomicInteger(i));
        } else {
            int i3 = atomicInteger.get();
            long j = ((long) i3) + ((long) i);
            Preconditions.checkArgument(j <= 2147483647L, "too many occurrences: %s", Long.valueOf(j));
            atomicInteger.getAndAdd(i);
            i2 = i3;
        }
        this.size += (long) i;
        return i2;
    }

    public int remove(Object obj, int i) {
        if (i == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i > 0, "occurrences cannot be negative: %s", Integer.valueOf(i));
        AtomicInteger atomicInteger = this.backingMap.get(obj);
        if (atomicInteger == null) {
            return 0;
        }
        int i2 = atomicInteger.get();
        if (i2 <= i) {
            this.backingMap.remove(obj);
            i = i2;
        }
        atomicInteger.addAndGet(-i);
        this.size -= (long) i;
        return i2;
    }

    public int setCount(E e, int i) {
        int i2;
        Multisets.checkNonnegative(i, "count");
        if (i == 0) {
            i2 = getAndSet(this.backingMap.remove(e), i);
        } else {
            AtomicInteger atomicInteger = this.backingMap.get(e);
            int andSet = getAndSet(atomicInteger, i);
            if (atomicInteger == null) {
                this.backingMap.put(e, new AtomicInteger(i));
            }
            i2 = andSet;
        }
        this.size += (long) (i - i2);
        return i2;
    }

    private static int getAndSet(AtomicInteger atomicInteger, int i) {
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.getAndSet(i);
    }

    /* access modifiers changed from: private */
    public int removeAllOccurrences(Object obj, Map<E, AtomicInteger> map) {
        AtomicInteger remove = map.remove(obj);
        if (remove == null) {
            return 0;
        }
        int andSet = remove.getAndSet(0);
        this.size -= (long) andSet;
        return andSet;
    }

    /* access modifiers changed from: package-private */
    public Set<E> createElementSet() {
        return new MapBasedElementSet(this.backingMap);
    }

    class MapBasedElementSet extends ForwardingSet<E> {
        private final Set<E> delegate;
        private final Map<E, AtomicInteger> map;

        MapBasedElementSet(Map<E, AtomicInteger> map2) {
            this.map = map2;
            this.delegate = map2.keySet();
        }

        /* access modifiers changed from: protected */
        public Set<E> delegate() {
            return this.delegate;
        }

        public Iterator<E> iterator() {
            final Iterator<Map.Entry<E, AtomicInteger>> it = this.map.entrySet().iterator();
            return new Iterator<E>() {
                Map.Entry<E, AtomicInteger> toRemove;

                public boolean hasNext() {
                    return it.hasNext();
                }

                public E next() {
                    Map.Entry<E, AtomicInteger> entry = (Map.Entry) it.next();
                    this.toRemove = entry;
                    return entry.getKey();
                }

                public void remove() {
                    Preconditions.checkState(this.toRemove != null, "no calls to next() since the last call to remove()");
                    AbstractMapBasedMultiset.access$222(AbstractMapBasedMultiset.this, (long) this.toRemove.getValue().getAndSet(0));
                    it.remove();
                    this.toRemove = null;
                }
            };
        }

        public boolean remove(Object obj) {
            return AbstractMapBasedMultiset.this.removeAllOccurrences(obj, this.map) != 0;
        }

        public boolean removeAll(Collection<?> collection) {
            return Iterators.removeAll(iterator(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return Iterators.retainAll(iterator(), collection);
        }

        public void clear() {
            if (this.map == AbstractMapBasedMultiset.this.backingMap) {
                AbstractMapBasedMultiset.this.clear();
                return;
            }
            Iterator it = iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }

        public Map<E, AtomicInteger> getMap() {
            return this.map;
        }
    }

    private void readObjectNoData() throws ObjectStreamException {
        throw new InvalidObjectException("Stream data required");
    }
}
