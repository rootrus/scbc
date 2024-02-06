package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Equivalences;
import com.google.common.base.FinalizableReferenceQueue;
import com.google.common.base.FinalizableSoftReference;
import com.google.common.base.FinalizableWeakReference;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.collect.MapMaker;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

class CustomConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
    static final int CLEANUP_MAX = 16;
    static final Queue<? extends ReferenceEntry<?, ?>> DISCARDING_QUEUE = new AbstractQueue<ReferenceEntry<?, ?>>() {
        public final boolean offer(ReferenceEntry<?, ?> referenceEntry) {
            return true;
        }

        public final ReferenceEntry<?, ?> peek() {
            return null;
        }

        public final ReferenceEntry<?, ?> poll() {
            return null;
        }

        public final int size() {
            return 0;
        }

        public final Iterator<ReferenceEntry<?, ?>> iterator() {
            return Iterators.emptyIterator();
        }
    };
    static final int DRAIN_THRESHOLD = 63;
    static final int MAXIMUM_CAPACITY = 1073741824;
    static final int MAX_SEGMENTS = 65536;
    static final ValueReference<Object, Object> UNSET = new ValueReference<Object, Object>() {
        public final void clear() {
        }

        public final ValueReference<Object, Object> copyFor(ReferenceEntry<Object, Object> referenceEntry) {
            return this;
        }

        public final Object get() {
            return null;
        }

        public final boolean isComputingReference() {
            return false;
        }

        public final void notifyValueReclaimed() {
        }

        public final Object waitForValue() {
            return null;
        }
    };
    private static final long serialVersionUID = 4;
    final Executor cleanupExecutor;
    final int concurrencyLevel;
    final transient EntryFactory entryFactory = EntryFactory.getFactory(this.keyStrength, expires(), evictsBySize());
    Set<Map.Entry<K, V>> entrySet;
    final MapEvictionListener<? super K, ? super V> evictionListener;
    final Queue<ReferenceEntry<K, V>> evictionNotificationQueue;
    final long expireAfterAccessNanos;
    final long expireAfterWriteNanos;
    final Equivalence<Object> keyEquivalence;
    Set<K> keySet;
    final Strength keyStrength;
    final int maximumSize;
    final transient int segmentMask;
    final transient int segmentShift;
    final transient CustomConcurrentHashMap<K, V>.Segment[] segments;
    final Ticker ticker;
    final Equivalence<Object> valueEquivalence;
    final Strength valueStrength;
    Collection<V> values;

    enum NullEntry implements ReferenceEntry<Object, Object> {
        INSTANCE;

        public final long getExpirationTime() {
            return 0;
        }

        public final int getHash() {
            return 0;
        }

        public final Object getKey() {
            return null;
        }

        public final ReferenceEntry<Object, Object> getNext() {
            return null;
        }

        public final ReferenceEntry<Object, Object> getNextEvictable() {
            return this;
        }

        public final ReferenceEntry<Object, Object> getNextExpirable() {
            return this;
        }

        public final ReferenceEntry<Object, Object> getPreviousEvictable() {
            return this;
        }

        public final ReferenceEntry<Object, Object> getPreviousExpirable() {
            return this;
        }

        public final ValueReference<Object, Object> getValueReference() {
            return null;
        }

        public final void notifyKeyReclaimed() {
        }

        public final void notifyValueReclaimed(ValueReference<Object, Object> valueReference) {
        }

        public final void setExpirationTime(long j) {
        }

        public final void setNextEvictable(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setNextExpirable(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setPreviousEvictable(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setPreviousExpirable(ReferenceEntry<Object, Object> referenceEntry) {
        }

        public final void setValueReference(ValueReference<Object, Object> valueReference) {
        }
    }

    interface ReferenceEntry<K, V> {
        long getExpirationTime();

        int getHash();

        K getKey();

        ReferenceEntry<K, V> getNext();

        ReferenceEntry<K, V> getNextEvictable();

        ReferenceEntry<K, V> getNextExpirable();

        ReferenceEntry<K, V> getPreviousEvictable();

        ReferenceEntry<K, V> getPreviousExpirable();

        ValueReference<K, V> getValueReference();

        void notifyKeyReclaimed();

        void notifyValueReclaimed(ValueReference<K, V> valueReference);

        void setExpirationTime(long j);

        void setNextEvictable(ReferenceEntry<K, V> referenceEntry);

        void setNextExpirable(ReferenceEntry<K, V> referenceEntry);

        void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry);

        void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry);

        void setValueReference(ValueReference<K, V> valueReference);
    }

    enum Strength {
        STRONG {
            /* access modifiers changed from: package-private */
            public final <K, V> ValueReference<K, V> referenceValue(ReferenceEntry<K, V> referenceEntry, V v) {
                return new StrongValueReference(v);
            }

            /* access modifiers changed from: package-private */
            public final Equivalence<Object> defaultEquivalence() {
                return Equivalences.equals();
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            public final <K, V> ValueReference<K, V> referenceValue(ReferenceEntry<K, V> referenceEntry, V v) {
                return new SoftValueReference(v, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final Equivalence<Object> defaultEquivalence() {
                return Equivalences.identity();
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public final <K, V> ValueReference<K, V> referenceValue(ReferenceEntry<K, V> referenceEntry, V v) {
                return new WeakValueReference(v, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final Equivalence<Object> defaultEquivalence() {
                return Equivalences.identity();
            }
        };

        /* access modifiers changed from: package-private */
        public abstract Equivalence<Object> defaultEquivalence();

        /* access modifiers changed from: package-private */
        public abstract <K, V> ValueReference<K, V> referenceValue(ReferenceEntry<K, V> referenceEntry, V v);
    }

    interface ValueReference<K, V> {
        void clear();

        ValueReference<K, V> copyFor(ReferenceEntry<K, V> referenceEntry);

        V get();

        boolean isComputingReference();

        void notifyValueReclaimed();

        V waitForValue() throws InterruptedException;
    }

    private static int rehash(int i) {
        int i2 = i + ((i << 15) ^ -12931);
        int i3 = i2 ^ (i2 >>> 10);
        int i4 = i3 + (i3 << 3);
        int i5 = i4 ^ (i4 >>> 6);
        int i6 = i5 + (i5 << 2) + (i5 << 14);
        return i6 ^ (i6 >>> 16);
    }

    CustomConcurrentHashMap(MapMaker mapMaker) {
        this.concurrencyLevel = Math.min(mapMaker.getConcurrencyLevel(), 65536);
        this.keyStrength = mapMaker.getKeyStrength();
        this.valueStrength = mapMaker.getValueStrength();
        this.keyEquivalence = mapMaker.getKeyEquivalence();
        this.valueEquivalence = mapMaker.getValueEquivalence();
        this.maximumSize = mapMaker.maximumSize;
        this.expireAfterAccessNanos = mapMaker.getExpireAfterAccessNanos();
        this.expireAfterWriteNanos = mapMaker.getExpireAfterWriteNanos();
        this.cleanupExecutor = mapMaker.getCleanupExecutor();
        this.ticker = mapMaker.getTicker();
        MapEvictionListener<? super K, ? super V> evictionListener2 = mapMaker.getEvictionListener();
        this.evictionListener = evictionListener2;
        this.evictionNotificationQueue = evictionListener2 == MapMaker.NullListener.INSTANCE ? discardingQueue() : new ConcurrentLinkedQueue<>();
        int min = Math.min(mapMaker.getInitialCapacity(), 1073741824);
        min = evictsBySize() ? Math.min(min, this.maximumSize) : min;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i3 < this.concurrencyLevel && (!evictsBySize() || (i3 << 1) <= this.maximumSize)) {
            i2++;
            i3 <<= 1;
        }
        this.segmentShift = 32 - i2;
        this.segmentMask = i3 - 1;
        this.segments = newSegmentArray(i3);
        int i4 = min / i3;
        i4 = i4 * i3 < min ? i4 + 1 : i4;
        int i5 = 1;
        while (i5 < i4) {
            i5 <<= 1;
        }
        if (evictsBySize()) {
            int i6 = this.maximumSize;
            int i7 = (i6 / i3) + 1;
            while (i < this.segments.length) {
                if (i == i6 % i3) {
                    i7--;
                }
                this.segments[i] = createSegment(i5, i7);
                i++;
            }
            return;
        }
        while (true) {
            CustomConcurrentHashMap<K, V>.Segment[] segmentArr = this.segments;
            if (i < segmentArr.length) {
                segmentArr[i] = createSegment(i5, -1);
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean evictsBySize() {
        return this.maximumSize != -1;
    }

    /* access modifiers changed from: package-private */
    public boolean expires() {
        return expiresAfterWrite() || expiresAfterAccess();
    }

    /* access modifiers changed from: package-private */
    public boolean expiresAfterWrite() {
        return this.expireAfterWriteNanos > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean expiresAfterAccess() {
        return this.expireAfterAccessNanos > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean isInlineCleanup() {
        return this.cleanupExecutor == MapMaker.DEFAULT_CLEANUP_EXECUTOR;
    }

    enum EntryFactory {
        STRONG {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongEntry(customConcurrentHashMap, k, i, referenceEntry);
            }
        },
        STRONG_EXPIRABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongExpirableEntry(customConcurrentHashMap, k, i, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = super.copyEntry(customConcurrentHashMap, referenceEntry, referenceEntry2);
                copyExpirableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        STRONG_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongEvictableEntry(customConcurrentHashMap, k, i, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = super.copyEntry(customConcurrentHashMap, referenceEntry, referenceEntry2);
                copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        STRONG_EXPIRABLE_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new StrongExpirableEvictableEntry(customConcurrentHashMap, k, i, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = super.copyEntry(customConcurrentHashMap, referenceEntry, referenceEntry2);
                copyExpirableEntry(referenceEntry, copyEntry);
                copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        SOFT {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new SoftEntry(customConcurrentHashMap, k, i, referenceEntry);
            }
        },
        SOFT_EXPIRABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new SoftExpirableEntry(customConcurrentHashMap, k, i, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = super.copyEntry(customConcurrentHashMap, referenceEntry, referenceEntry2);
                copyExpirableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        SOFT_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new SoftEvictableEntry(customConcurrentHashMap, k, i, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = super.copyEntry(customConcurrentHashMap, referenceEntry, referenceEntry2);
                copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        SOFT_EXPIRABLE_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new SoftExpirableEvictableEntry(customConcurrentHashMap, k, i, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = super.copyEntry(customConcurrentHashMap, referenceEntry, referenceEntry2);
                copyExpirableEntry(referenceEntry, copyEntry);
                copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        WEAK {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakEntry(customConcurrentHashMap, k, i, referenceEntry);
            }
        },
        WEAK_EXPIRABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakExpirableEntry(customConcurrentHashMap, k, i, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = super.copyEntry(customConcurrentHashMap, referenceEntry, referenceEntry2);
                copyExpirableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        WEAK_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakEvictableEntry(customConcurrentHashMap, k, i, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = super.copyEntry(customConcurrentHashMap, referenceEntry, referenceEntry2);
                copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        },
        WEAK_EXPIRABLE_EVICTABLE {
            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
                return new WeakExpirableEvictableEntry(customConcurrentHashMap, k, i, referenceEntry);
            }

            /* access modifiers changed from: package-private */
            public final <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
                ReferenceEntry<K, V> copyEntry = super.copyEntry(customConcurrentHashMap, referenceEntry, referenceEntry2);
                copyExpirableEntry(referenceEntry, copyEntry);
                copyEvictableEntry(referenceEntry, copyEntry);
                return copyEntry;
            }
        };
        
        static final int EVICTABLE_MASK = 2;
        static final int EXPIRABLE_MASK = 1;
        static final EntryFactory[][] factories = null;

        /* access modifiers changed from: package-private */
        public abstract <K, V> ReferenceEntry<K, V> newEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry);

        static {
            C768812 r0;
            EntryFactory entryFactory;
            EntryFactory entryFactory2;
            EntryFactory entryFactory3;
            EntryFactory entryFactory4;
            EntryFactory entryFactory5;
            EntryFactory entryFactory6;
            EntryFactory entryFactory7;
            EntryFactory entryFactory8;
            EntryFactory entryFactory9;
            EntryFactory entryFactory10;
            EntryFactory entryFactory11;
            factories = new EntryFactory[][]{new EntryFactory[]{entryFactory, entryFactory2, entryFactory3, entryFactory4}, new EntryFactory[]{entryFactory5, entryFactory6, entryFactory7, entryFactory8}, new EntryFactory[]{entryFactory9, entryFactory10, entryFactory11, r0}};
        }

        static EntryFactory getFactory(Strength strength, boolean z, boolean z2) {
            return factories[strength.ordinal()][z | (z2 ? (char) 2 : 0)];
        }

        /* access modifiers changed from: package-private */
        public <K, V> ReferenceEntry<K, V> copyEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            return newEntry(customConcurrentHashMap, referenceEntry.getKey(), referenceEntry.getHash(), referenceEntry2);
        }

        /* access modifiers changed from: package-private */
        public <K, V> void copyExpirableEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            referenceEntry2.setExpirationTime(referenceEntry.getExpirationTime());
            CustomConcurrentHashMap.connectExpirables(referenceEntry.getPreviousExpirable(), referenceEntry2);
            CustomConcurrentHashMap.connectExpirables(referenceEntry2, referenceEntry.getNextExpirable());
            CustomConcurrentHashMap.nullifyExpirable(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        public <K, V> void copyEvictableEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            CustomConcurrentHashMap.connectEvictables(referenceEntry.getPreviousEvictable(), referenceEntry2);
            CustomConcurrentHashMap.connectEvictables(referenceEntry2, referenceEntry.getNextEvictable());
            CustomConcurrentHashMap.nullifyEvictable(referenceEntry);
        }
    }

    static <K, V> ValueReference<K, V> unset() {
        return UNSET;
    }

    static class QueueHolder {
        static final FinalizableReferenceQueue queue = new FinalizableReferenceQueue();

        private QueueHolder() {
        }
    }

    static <K, V> ReferenceEntry<K, V> nullEntry() {
        return NullEntry.INSTANCE;
    }

    static <E> Queue<E> discardingQueue() {
        return DISCARDING_QUEUE;
    }

    static class StrongEntry<K, V> implements ReferenceEntry<K, V> {
        final int hash;
        final K key;
        final CustomConcurrentHashMap<K, V> map;
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference = CustomConcurrentHashMap.unset();

        public void notifyKeyReclaimed() {
        }

        StrongEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            this.map = customConcurrentHashMap;
            this.key = k;
            this.hash = i;
            this.next = referenceEntry;
        }

        public K getKey() {
            return this.key;
        }

        public long getExpirationTime() {
            throw new UnsupportedOperationException();
        }

        public void setExpirationTime(long j) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        public void setValueReference(ValueReference<K, V> valueReference2) {
            ValueReference<K, V> valueReference3 = this.valueReference;
            this.valueReference = valueReference2;
            valueReference3.clear();
        }

        public void notifyValueReclaimed(ValueReference<K, V> valueReference2) {
            this.map.reclaimValue(this, valueReference2);
        }

        public int getHash() {
            return this.hash;
        }

        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }
    }

    static class StrongExpirableEntry<K, V> extends StrongEntry<K, V> implements ReferenceEntry<K, V> {
        ReferenceEntry<K, V> nextExpirable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousExpirable = CustomConcurrentHashMap.nullEntry();
        volatile long time = Long.MAX_VALUE;

        StrongExpirableEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(customConcurrentHashMap, k, i, referenceEntry);
        }

        public long getExpirationTime() {
            return this.time;
        }

        public void setExpirationTime(long j) {
            this.time = j;
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }
    }

    static class StrongEvictableEntry<K, V> extends StrongEntry<K, V> implements ReferenceEntry<K, V> {
        ReferenceEntry<K, V> nextEvictable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousEvictable = CustomConcurrentHashMap.nullEntry();

        StrongEvictableEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(customConcurrentHashMap, k, i, referenceEntry);
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }
    }

    static class StrongExpirableEvictableEntry<K, V> extends StrongEntry<K, V> implements ReferenceEntry<K, V> {
        ReferenceEntry<K, V> nextEvictable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> nextExpirable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousEvictable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousExpirable = CustomConcurrentHashMap.nullEntry();
        volatile long time = Long.MAX_VALUE;

        StrongExpirableEvictableEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(customConcurrentHashMap, k, i, referenceEntry);
        }

        public long getExpirationTime() {
            return this.time;
        }

        public void setExpirationTime(long j) {
            this.time = j;
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }
    }

    static class SoftEntry<K, V> extends FinalizableSoftReference<K> implements ReferenceEntry<K, V> {
        final int hash;
        final CustomConcurrentHashMap<K, V> map;
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference = CustomConcurrentHashMap.unset();

        SoftEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, QueueHolder.queue);
            this.map = customConcurrentHashMap;
            this.hash = i;
            this.next = referenceEntry;
        }

        public K getKey() {
            return get();
        }

        public void finalizeReferent() {
            notifyKeyReclaimed();
        }

        public void notifyKeyReclaimed() {
            this.map.reclaimKey(this);
        }

        public long getExpirationTime() {
            throw new UnsupportedOperationException();
        }

        public void setExpirationTime(long j) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        public void setValueReference(ValueReference<K, V> valueReference2) {
            ValueReference<K, V> valueReference3 = this.valueReference;
            this.valueReference = valueReference2;
            valueReference3.clear();
        }

        public void notifyValueReclaimed(ValueReference<K, V> valueReference2) {
            this.map.reclaimValue(this, valueReference2);
        }

        public int getHash() {
            return this.hash;
        }

        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }
    }

    static class SoftExpirableEntry<K, V> extends SoftEntry<K, V> implements ReferenceEntry<K, V> {
        ReferenceEntry<K, V> nextExpirable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousExpirable = CustomConcurrentHashMap.nullEntry();
        volatile long time = Long.MAX_VALUE;

        SoftExpirableEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(customConcurrentHashMap, k, i, referenceEntry);
        }

        public long getExpirationTime() {
            return this.time;
        }

        public void setExpirationTime(long j) {
            this.time = j;
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }
    }

    static class SoftEvictableEntry<K, V> extends SoftEntry<K, V> implements ReferenceEntry<K, V> {
        ReferenceEntry<K, V> nextEvictable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousEvictable = CustomConcurrentHashMap.nullEntry();

        SoftEvictableEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(customConcurrentHashMap, k, i, referenceEntry);
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }
    }

    static class SoftExpirableEvictableEntry<K, V> extends SoftEntry<K, V> implements ReferenceEntry<K, V> {
        ReferenceEntry<K, V> nextEvictable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> nextExpirable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousEvictable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousExpirable = CustomConcurrentHashMap.nullEntry();
        volatile long time = Long.MAX_VALUE;

        SoftExpirableEvictableEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(customConcurrentHashMap, k, i, referenceEntry);
        }

        public long getExpirationTime() {
            return this.time;
        }

        public void setExpirationTime(long j) {
            this.time = j;
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }
    }

    static class WeakEntry<K, V> extends FinalizableWeakReference<K> implements ReferenceEntry<K, V> {
        final int hash;
        final CustomConcurrentHashMap<K, V> map;
        final ReferenceEntry<K, V> next;
        volatile ValueReference<K, V> valueReference = CustomConcurrentHashMap.unset();

        WeakEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(k, QueueHolder.queue);
            this.map = customConcurrentHashMap;
            this.hash = i;
            this.next = referenceEntry;
        }

        public K getKey() {
            return get();
        }

        public void finalizeReferent() {
            notifyKeyReclaimed();
        }

        public void notifyKeyReclaimed() {
            this.map.reclaimKey(this);
        }

        public long getExpirationTime() {
            throw new UnsupportedOperationException();
        }

        public void setExpirationTime(long j) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            throw new UnsupportedOperationException();
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            throw new UnsupportedOperationException();
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            throw new UnsupportedOperationException();
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            throw new UnsupportedOperationException();
        }

        public ValueReference<K, V> getValueReference() {
            return this.valueReference;
        }

        public void setValueReference(ValueReference<K, V> valueReference2) {
            ValueReference<K, V> valueReference3 = this.valueReference;
            this.valueReference = valueReference2;
            valueReference3.clear();
        }

        public void notifyValueReclaimed(ValueReference<K, V> valueReference2) {
            this.map.reclaimValue(this, valueReference2);
        }

        public int getHash() {
            return this.hash;
        }

        public ReferenceEntry<K, V> getNext() {
            return this.next;
        }
    }

    static class WeakExpirableEntry<K, V> extends WeakEntry<K, V> implements ReferenceEntry<K, V> {
        ReferenceEntry<K, V> nextExpirable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousExpirable = CustomConcurrentHashMap.nullEntry();
        volatile long time = Long.MAX_VALUE;

        WeakExpirableEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(customConcurrentHashMap, k, i, referenceEntry);
        }

        public long getExpirationTime() {
            return this.time;
        }

        public void setExpirationTime(long j) {
            this.time = j;
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }
    }

    static class WeakEvictableEntry<K, V> extends WeakEntry<K, V> implements ReferenceEntry<K, V> {
        ReferenceEntry<K, V> nextEvictable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousEvictable = CustomConcurrentHashMap.nullEntry();

        WeakEvictableEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(customConcurrentHashMap, k, i, referenceEntry);
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }
    }

    static class WeakExpirableEvictableEntry<K, V> extends WeakEntry<K, V> implements ReferenceEntry<K, V> {
        ReferenceEntry<K, V> nextEvictable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> nextExpirable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousEvictable = CustomConcurrentHashMap.nullEntry();
        ReferenceEntry<K, V> previousExpirable = CustomConcurrentHashMap.nullEntry();
        volatile long time = Long.MAX_VALUE;

        WeakExpirableEvictableEntry(CustomConcurrentHashMap<K, V> customConcurrentHashMap, K k, int i, ReferenceEntry<K, V> referenceEntry) {
            super(customConcurrentHashMap, k, i, referenceEntry);
        }

        public long getExpirationTime() {
            return this.time;
        }

        public void setExpirationTime(long j) {
            this.time = j;
        }

        public ReferenceEntry<K, V> getNextExpirable() {
            return this.nextExpirable;
        }

        public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.nextExpirable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousExpirable() {
            return this.previousExpirable;
        }

        public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
            this.previousExpirable = referenceEntry;
        }

        public ReferenceEntry<K, V> getNextEvictable() {
            return this.nextEvictable;
        }

        public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.nextEvictable = referenceEntry;
        }

        public ReferenceEntry<K, V> getPreviousEvictable() {
            return this.previousEvictable;
        }

        public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
            this.previousEvictable = referenceEntry;
        }
    }

    static class WeakValueReference<K, V> extends FinalizableWeakReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        public boolean isComputingReference() {
            return false;
        }

        WeakValueReference(V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, QueueHolder.queue);
            this.entry = referenceEntry;
        }

        public void notifyValueReclaimed() {
            finalizeReferent();
        }

        public void finalizeReferent() {
            this.entry.notifyValueReclaimed(this);
        }

        public ValueReference<K, V> copyFor(ReferenceEntry<K, V> referenceEntry) {
            return new WeakValueReference(get(), referenceEntry);
        }

        public V waitForValue() {
            return get();
        }
    }

    static class SoftValueReference<K, V> extends FinalizableSoftReference<V> implements ValueReference<K, V> {
        final ReferenceEntry<K, V> entry;

        public boolean isComputingReference() {
            return false;
        }

        SoftValueReference(V v, ReferenceEntry<K, V> referenceEntry) {
            super(v, QueueHolder.queue);
            this.entry = referenceEntry;
        }

        public void notifyValueReclaimed() {
            finalizeReferent();
        }

        public void finalizeReferent() {
            this.entry.notifyValueReclaimed(this);
        }

        public ValueReference<K, V> copyFor(ReferenceEntry<K, V> referenceEntry) {
            return new SoftValueReference(get(), referenceEntry);
        }

        public V waitForValue() {
            return get();
        }
    }

    static class StrongValueReference<K, V> implements ValueReference<K, V> {
        final V referent;

        public void clear() {
        }

        public ValueReference<K, V> copyFor(ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public boolean isComputingReference() {
            return false;
        }

        public void notifyValueReclaimed() {
        }

        StrongValueReference(V v) {
            this.referent = v;
        }

        public V get() {
            return this.referent;
        }

        public V waitForValue() {
            return get();
        }
    }

    /* access modifiers changed from: package-private */
    public ReferenceEntry<K, V> newEntry(K k, int i, ReferenceEntry<K, V> referenceEntry) {
        return this.entryFactory.newEntry(this, k, i, referenceEntry);
    }

    /* access modifiers changed from: package-private */
    public ReferenceEntry<K, V> copyEntry(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        ValueReference<K, V> valueReference = referenceEntry.getValueReference();
        ReferenceEntry<K, V> copyEntry = this.entryFactory.copyEntry(this, referenceEntry, referenceEntry2);
        copyEntry.setValueReference(valueReference.copyFor(copyEntry));
        return copyEntry;
    }

    /* access modifiers changed from: package-private */
    public ValueReference<K, V> newValueReference(ReferenceEntry<K, V> referenceEntry, V v) {
        return this.valueStrength.referenceValue(referenceEntry, v);
    }

    /* access modifiers changed from: package-private */
    public int hash(Object obj) {
        return rehash(this.keyEquivalence.hash(Preconditions.checkNotNull(obj)));
    }

    /* access modifiers changed from: package-private */
    public void reclaimValue(ReferenceEntry<K, V> referenceEntry, ValueReference<K, V> valueReference) {
        int hash = referenceEntry.getHash();
        CustomConcurrentHashMap<K, V>.Segment segmentFor = segmentFor(hash);
        segmentFor.unsetValue(referenceEntry.getKey(), hash, valueReference);
        if (!segmentFor.isHeldByCurrentThread()) {
            segmentFor.postWriteCleanup();
        }
    }

    /* access modifiers changed from: package-private */
    public void reclaimKey(ReferenceEntry<K, V> referenceEntry) {
        int hash = referenceEntry.getHash();
        segmentFor(hash).unsetKey(referenceEntry, hash);
    }

    /* access modifiers changed from: package-private */
    public boolean isLive(ReferenceEntry<K, V> referenceEntry) {
        return segmentFor(referenceEntry.getHash()).getLiveValue(referenceEntry) != null;
    }

    /* access modifiers changed from: package-private */
    public boolean isExpired(ReferenceEntry<K, V> referenceEntry) {
        return isExpired(referenceEntry, this.ticker.read());
    }

    /* access modifiers changed from: package-private */
    public boolean isExpired(ReferenceEntry<K, V> referenceEntry, long j) {
        return j - referenceEntry.getExpirationTime() > 0;
    }

    /* access modifiers changed from: package-private */
    public boolean isCollected(ReferenceEntry<K, V> referenceEntry) {
        if (referenceEntry.getKey() == null) {
            return true;
        }
        ValueReference<K, V> valueReference = referenceEntry.getValueReference();
        if (valueReference.isComputingReference()) {
            return false;
        }
        if (valueReference.get() != null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isUnset(ReferenceEntry<K, V> referenceEntry) {
        return isUnset(referenceEntry.getValueReference());
    }

    /* access modifiers changed from: package-private */
    public boolean isUnset(ValueReference<K, V> valueReference) {
        return valueReference == UNSET;
    }

    static <K, V> void connectExpirables(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextExpirable(referenceEntry2);
        referenceEntry2.setPreviousExpirable(referenceEntry);
    }

    static <K, V> void nullifyExpirable(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry nullEntry = nullEntry();
        referenceEntry.setNextExpirable(nullEntry);
        referenceEntry.setPreviousExpirable(nullEntry);
    }

    /* access modifiers changed from: package-private */
    public void enqueueNotification(K k, int i, ValueReference<K, V> valueReference) {
        if (this.evictionNotificationQueue != DISCARDING_QUEUE) {
            ReferenceEntry newEntry = newEntry(k, i, (ReferenceEntry) null);
            newEntry.setValueReference(valueReference.copyFor(newEntry));
            this.evictionNotificationQueue.offer(newEntry);
        }
    }

    /* access modifiers changed from: package-private */
    public void processPendingNotifications() {
        while (true) {
            ReferenceEntry poll = this.evictionNotificationQueue.poll();
            if (poll != null) {
                this.evictionListener.onEviction(poll.getKey(), poll.getValueReference().get());
            } else {
                return;
            }
        }
    }

    static <K, V> void connectEvictables(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
        referenceEntry.setNextEvictable(referenceEntry2);
        referenceEntry2.setPreviousEvictable(referenceEntry);
    }

    static <K, V> void nullifyEvictable(ReferenceEntry<K, V> referenceEntry) {
        ReferenceEntry nullEntry = nullEntry();
        referenceEntry.setNextEvictable(nullEntry);
        referenceEntry.setPreviousEvictable(nullEntry);
    }

    /* access modifiers changed from: package-private */
    public final CustomConcurrentHashMap<K, V>.Segment[] newSegmentArray(int i) {
        return new Segment[i];
    }

    /* access modifiers changed from: package-private */
    public CustomConcurrentHashMap<K, V>.Segment segmentFor(int i) {
        return this.segments[(i >>> this.segmentShift) & this.segmentMask];
    }

    /* access modifiers changed from: package-private */
    public CustomConcurrentHashMap<K, V>.Segment createSegment(int i, int i2) {
        return new Segment(i, i2);
    }

    class Segment extends ReentrantLock {
        final Queue<ReferenceEntry<K, V>> cleanupQueue = new ConcurrentLinkedQueue();
        final Runnable cleanupRunnable = new Runnable() {
            public void run() {
                Segment.this.runCleanup();
            }
        };
        volatile int count;
        final Queue<ReferenceEntry<K, V>> evictionQueue;
        final Queue<ReferenceEntry<K, V>> expirationQueue;
        final int maxSegmentSize;
        int modCount;
        final AtomicInteger readCount = new AtomicInteger();
        final Queue<ReferenceEntry<K, V>> recencyQueue;
        volatile AtomicReferenceArray<ReferenceEntry<K, V>> table;
        int threshold;

        Segment(int i, int i2) {
            this.maxSegmentSize = i2;
            initTable(newEntryArray(i));
            this.recencyQueue = (CustomConcurrentHashMap.this.evictsBySize() || CustomConcurrentHashMap.this.expiresAfterAccess()) ? new ConcurrentLinkedQueue<>() : CustomConcurrentHashMap.discardingQueue();
            this.evictionQueue = CustomConcurrentHashMap.this.evictsBySize() ? new EvictionQueue() : CustomConcurrentHashMap.discardingQueue();
            this.expirationQueue = CustomConcurrentHashMap.this.expires() ? new ExpirationQueue() : CustomConcurrentHashMap.discardingQueue();
        }

        /* access modifiers changed from: package-private */
        public AtomicReferenceArray<ReferenceEntry<K, V>> newEntryArray(int i) {
            return new AtomicReferenceArray<>(i);
        }

        /* access modifiers changed from: package-private */
        public void initTable(AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray) {
            int length = (atomicReferenceArray.length() * 3) / 4;
            this.threshold = length;
            if (length == this.maxSegmentSize) {
                this.threshold = length + 1;
            }
            this.table = atomicReferenceArray;
        }

        /* access modifiers changed from: package-private */
        public void setValue(ReferenceEntry<K, V> referenceEntry, V v) {
            recordWrite(referenceEntry);
            referenceEntry.setValueReference(CustomConcurrentHashMap.this.newValueReference(referenceEntry, v));
        }

        /* access modifiers changed from: package-private */
        public void recordRead(ReferenceEntry<K, V> referenceEntry) {
            if (CustomConcurrentHashMap.this.expiresAfterAccess()) {
                recordExpirationTime(referenceEntry, CustomConcurrentHashMap.this.expireAfterAccessNanos);
            }
            this.recencyQueue.add(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        public void recordLockedRead(ReferenceEntry<K, V> referenceEntry) {
            this.evictionQueue.add(referenceEntry);
            if (CustomConcurrentHashMap.this.expiresAfterAccess()) {
                recordExpirationTime(referenceEntry, CustomConcurrentHashMap.this.expireAfterAccessNanos);
                this.expirationQueue.add(referenceEntry);
            }
        }

        /* access modifiers changed from: package-private */
        public void recordWrite(ReferenceEntry<K, V> referenceEntry) {
            drainRecencyQueue();
            this.evictionQueue.add(referenceEntry);
            if (CustomConcurrentHashMap.this.expires()) {
                recordExpirationTime(referenceEntry, CustomConcurrentHashMap.this.expiresAfterAccess() ? CustomConcurrentHashMap.this.expireAfterAccessNanos : CustomConcurrentHashMap.this.expireAfterWriteNanos);
                this.expirationQueue.add(referenceEntry);
            }
        }

        /* access modifiers changed from: package-private */
        public void drainRecencyQueue() {
            while (true) {
                ReferenceEntry poll = this.recencyQueue.poll();
                if (poll != null) {
                    if (this.evictionQueue.contains(poll)) {
                        this.evictionQueue.add(poll);
                    }
                    if (CustomConcurrentHashMap.this.expiresAfterAccess() && this.expirationQueue.contains(poll)) {
                        this.expirationQueue.add(poll);
                    }
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void recordExpirationTime(ReferenceEntry<K, V> referenceEntry, long j) {
            referenceEntry.setExpirationTime(CustomConcurrentHashMap.this.ticker.read() + j);
        }

        /* access modifiers changed from: package-private */
        public void tryExpireEntries() {
            if (tryLock()) {
                try {
                    expireEntries();
                } finally {
                    unlock();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void expireEntries() {
            ReferenceEntry peek;
            drainRecencyQueue();
            if (!this.expirationQueue.isEmpty()) {
                long read = CustomConcurrentHashMap.this.ticker.read();
                do {
                    peek = this.expirationQueue.peek();
                    if (peek == null || !CustomConcurrentHashMap.this.isExpired(peek, read)) {
                        return;
                    }
                } while (unsetEntry(peek, peek.getHash()));
                throw new AssertionError();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean evictEntries() {
            if (!CustomConcurrentHashMap.this.evictsBySize() || this.count < this.maxSegmentSize) {
                return false;
            }
            drainRecencyQueue();
            ReferenceEntry remove = this.evictionQueue.remove();
            if (unsetEntry(remove, remove.getHash())) {
                return true;
            }
            throw new AssertionError();
        }

        /* access modifiers changed from: package-private */
        public ReferenceEntry<K, V> getFirst(int i) {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            return atomicReferenceArray.get(i & (atomicReferenceArray.length() - 1));
        }

        /* access modifiers changed from: package-private */
        public ReferenceEntry<K, V> getEntry(Object obj, int i) {
            K key;
            for (ReferenceEntry<K, V> first = getFirst(i); first != null; first = first.getNext()) {
                if (first.getHash() == i && (key = first.getKey()) != null && CustomConcurrentHashMap.this.keyEquivalence.equivalent(obj, key)) {
                    return first;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public V get(Object obj, int i) {
            try {
                if (this.count != 0) {
                    for (ReferenceEntry first = getFirst(i); first != null; first = first.getNext()) {
                        if (first.getHash() == i) {
                            Object key = first.getKey();
                            if (key != null && CustomConcurrentHashMap.this.keyEquivalence.equivalent(obj, key)) {
                                V liveValue = getLiveValue(first);
                                if (liveValue != null) {
                                    recordRead(first);
                                }
                                return liveValue;
                            }
                        }
                    }
                }
                postReadCleanup();
                return null;
            } finally {
                postReadCleanup();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean containsKey(Object obj, int i) {
            Object key;
            if (this.count != 0) {
                ReferenceEntry first = getFirst(i);
                while (first != null) {
                    if (first.getHash() != i || (key = first.getKey()) == null || !CustomConcurrentHashMap.this.keyEquivalence.equivalent(obj, key)) {
                        first = first.getNext();
                    } else if (getLiveValue(first) != null) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean containsValue(Object obj) {
            if (this.count != 0) {
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = atomicReferenceArray.length();
                for (int i = 0; i < length; i++) {
                    for (ReferenceEntry referenceEntry = atomicReferenceArray.get(i); referenceEntry != null; referenceEntry = referenceEntry.getNext()) {
                        Object liveValue = getLiveValue(referenceEntry);
                        if (liveValue != null && CustomConcurrentHashMap.this.valueEquivalence.equivalent(obj, liveValue)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
            if (r4 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
            unsetLiveEntry(r0, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.this$0.valueEquivalence.equivalent(r6, r4) == false) goto L_0x004b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            setValue(r0, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
            unlock();
            postWriteCleanup();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            recordLockedRead(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
            r4 = r0.getValueReference().get();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean replace(K r4, int r5, V r6, V r7) {
            /*
                r3 = this;
                com.google.common.base.Preconditions.checkNotNull(r6)
                com.google.common.base.Preconditions.checkNotNull(r7)
                r3.lock()
                r3.preWriteCleanup()     // Catch:{ all -> 0x005c }
                com.google.common.collect.CustomConcurrentHashMap$ReferenceEntry r0 = r3.getFirst(r5)     // Catch:{ all -> 0x005c }
            L_0x0010:
                if (r0 == 0) goto L_0x0054
                java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x005c }
                int r2 = r0.getHash()     // Catch:{ all -> 0x005c }
                if (r2 != r5) goto L_0x004f
                if (r1 == 0) goto L_0x004f
                com.google.common.collect.CustomConcurrentHashMap r2 = com.google.common.collect.CustomConcurrentHashMap.this     // Catch:{ all -> 0x005c }
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.keyEquivalence     // Catch:{ all -> 0x005c }
                boolean r1 = r2.equivalent(r4, r1)     // Catch:{ all -> 0x005c }
                if (r1 == 0) goto L_0x004f
                com.google.common.collect.CustomConcurrentHashMap$ValueReference r4 = r0.getValueReference()     // Catch:{ all -> 0x005c }
                java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x005c }
                if (r4 != 0) goto L_0x0036
                r3.unsetLiveEntry(r0, r5)     // Catch:{ all -> 0x005c }
                goto L_0x0054
            L_0x0036:
                com.google.common.collect.CustomConcurrentHashMap r5 = com.google.common.collect.CustomConcurrentHashMap.this     // Catch:{ all -> 0x005c }
                com.google.common.base.Equivalence<java.lang.Object> r5 = r5.valueEquivalence     // Catch:{ all -> 0x005c }
                boolean r4 = r5.equivalent(r6, r4)     // Catch:{ all -> 0x005c }
                if (r4 == 0) goto L_0x004b
                r3.setValue(r0, r7)     // Catch:{ all -> 0x005c }
                r3.unlock()
                r3.postWriteCleanup()
                r4 = 1
                return r4
            L_0x004b:
                r3.recordLockedRead(r0)     // Catch:{ all -> 0x005c }
                goto L_0x0054
            L_0x004f:
                com.google.common.collect.CustomConcurrentHashMap$ReferenceEntry r0 = r0.getNext()     // Catch:{ all -> 0x005c }
                goto L_0x0010
            L_0x0054:
                r3.unlock()
                r3.postWriteCleanup()
                r4 = 0
                return r4
            L_0x005c:
                r4 = move-exception
                r3.unlock()
                r3.postWriteCleanup()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CustomConcurrentHashMap.Segment.replace(java.lang.Object, int, java.lang.Object, java.lang.Object):boolean");
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public V replace(K k, int i, V v) {
            Preconditions.checkNotNull(v);
            lock();
            try {
                preWriteCleanup();
                ReferenceEntry first = getFirst(i);
                while (true) {
                    if (first == null) {
                        break;
                    }
                    Object key = first.getKey();
                    if (first.getHash() != i || key == null || !CustomConcurrentHashMap.this.keyEquivalence.equivalent(k, key)) {
                        first = first.getNext();
                    } else {
                        V v2 = first.getValueReference().get();
                        if (v2 == null) {
                            unsetLiveEntry(first, i);
                        } else {
                            setValue(first, v);
                            unlock();
                            postWriteCleanup();
                            return v2;
                        }
                    }
                }
                unlock();
                postWriteCleanup();
                return null;
            } catch (Throwable th) {
                unlock();
                postWriteCleanup();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public V put(K k, int i, V v, boolean z) {
            Preconditions.checkNotNull(v);
            lock();
            try {
                preWriteCleanup();
                int i2 = this.count + 1;
                if (i2 > this.threshold) {
                    expand();
                    i2 = this.count + 1;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (referenceEntry2 != null) {
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() != i || key == null || !CustomConcurrentHashMap.this.keyEquivalence.equivalent(k, key)) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else {
                        ValueReference valueReference = referenceEntry2.getValueReference();
                        V v2 = valueReference.get();
                        if (v2 == null) {
                            this.modCount++;
                            valueReference.notifyValueReclaimed();
                            evictEntries();
                            this.count++;
                        } else if (z) {
                            recordLockedRead(referenceEntry2);
                            return v2;
                        }
                        setValue(referenceEntry2, v);
                        return v2;
                    }
                }
                if (evictEntries()) {
                    i2 = this.count + 1;
                    referenceEntry = atomicReferenceArray.get(length);
                }
                this.modCount++;
                ReferenceEntry newEntry = CustomConcurrentHashMap.this.newEntry(k, i, referenceEntry);
                setValue(newEntry, v);
                atomicReferenceArray.set(length, newEntry);
                this.count = i2;
                unlock();
                postWriteCleanup();
                return null;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        /* access modifiers changed from: package-private */
        public void expand() {
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int length = atomicReferenceArray.length();
            if (length < 1073741824) {
                AtomicReferenceArray<ReferenceEntry<K, V>> newEntryArray = newEntryArray(length << 1);
                this.threshold = (newEntryArray.length() * 3) / 4;
                int length2 = newEntryArray.length() - 1;
                for (int i = 0; i < length; i++) {
                    ReferenceEntry referenceEntry = atomicReferenceArray.get(i);
                    if (referenceEntry != null) {
                        ReferenceEntry next = referenceEntry.getNext();
                        int hash = referenceEntry.getHash() & length2;
                        if (next == null) {
                            newEntryArray.set(hash, referenceEntry);
                        } else {
                            ReferenceEntry referenceEntry2 = referenceEntry;
                            while (next != null) {
                                int hash2 = next.getHash() & length2;
                                if (hash2 != hash) {
                                    referenceEntry2 = next;
                                    hash = hash2;
                                }
                                next = next.getNext();
                            }
                            newEntryArray.set(hash, referenceEntry2);
                            while (referenceEntry != referenceEntry2) {
                                if (CustomConcurrentHashMap.this.isCollected(referenceEntry)) {
                                    unsetLiveEntry(referenceEntry, referenceEntry.getHash());
                                } else {
                                    int hash3 = referenceEntry.getHash() & length2;
                                    newEntryArray.set(hash3, CustomConcurrentHashMap.this.copyEntry(referenceEntry, newEntryArray.get(hash3)));
                                }
                                referenceEntry = referenceEntry.getNext();
                            }
                        }
                    }
                }
                this.table = newEntryArray;
            }
        }

        /* access modifiers changed from: package-private */
        public V remove(Object obj, int i) {
            V v;
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        v = null;
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() != i || key == null || !CustomConcurrentHashMap.this.keyEquivalence.equivalent(obj, key)) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else {
                        v = referenceEntry2.getValueReference().get();
                        if (v == null) {
                            unsetLiveEntry(referenceEntry2, i);
                        } else {
                            this.modCount++;
                            ReferenceEntry removeFromChain = removeFromChain(referenceEntry, referenceEntry2);
                            int i2 = this.count;
                            atomicReferenceArray.set(length, removeFromChain);
                            this.count = i2 - 1;
                        }
                    }
                }
                return v;
            } finally {
                unlock();
                postWriteCleanup();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public boolean remove(Object obj, int i, Object obj2) {
            Preconditions.checkNotNull(obj2);
            lock();
            try {
                preWriteCleanup();
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                int length = (atomicReferenceArray.length() - 1) & i;
                ReferenceEntry referenceEntry = atomicReferenceArray.get(length);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    }
                    Object key = referenceEntry2.getKey();
                    if (referenceEntry2.getHash() != i || key == null || !CustomConcurrentHashMap.this.keyEquivalence.equivalent(obj, key)) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else {
                        Object obj3 = referenceEntry2.getValueReference().get();
                        if (obj3 == null) {
                            unsetLiveEntry(referenceEntry2, i);
                        } else if (CustomConcurrentHashMap.this.valueEquivalence.equivalent(obj2, obj3)) {
                            this.modCount++;
                            ReferenceEntry removeFromChain = removeFromChain(referenceEntry, referenceEntry2);
                            int i2 = this.count;
                            atomicReferenceArray.set(length, removeFromChain);
                            this.count = i2 - 1;
                            unlock();
                            postWriteCleanup();
                            return true;
                        }
                    }
                }
                unlock();
                postWriteCleanup();
                return false;
            } catch (Throwable th) {
                unlock();
                postWriteCleanup();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public ReferenceEntry<K, V> removeFromChain(ReferenceEntry<K, V> referenceEntry, ReferenceEntry<K, V> referenceEntry2) {
            this.evictionQueue.remove(referenceEntry2);
            this.expirationQueue.remove(referenceEntry2);
            ReferenceEntry<K, V> next = referenceEntry2.getNext();
            while (referenceEntry != referenceEntry2) {
                if (CustomConcurrentHashMap.this.isCollected(referenceEntry)) {
                    unsetLiveEntry(referenceEntry, referenceEntry.getHash());
                } else {
                    next = CustomConcurrentHashMap.this.copyEntry(referenceEntry, next);
                }
                referenceEntry = referenceEntry.getNext();
            }
            return next;
        }

        /* access modifiers changed from: package-private */
        public boolean unsetKey(ReferenceEntry<K, V> referenceEntry, int i) {
            lock();
            try {
                int i2 = this.count;
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                for (ReferenceEntry<K, V> referenceEntry2 = atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); referenceEntry2 != null; referenceEntry2 = referenceEntry2.getNext()) {
                    if (referenceEntry2 == referenceEntry) {
                        this.modCount++;
                        CustomConcurrentHashMap.this.enqueueNotification(referenceEntry2.getKey(), i, referenceEntry2.getValueReference());
                        enqueueCleanup(referenceEntry2);
                        this.count = i2 - 1;
                        return true;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean unsetValue(K k, int i, ValueReference<K, V> valueReference) {
            lock();
            try {
                int i2 = this.count;
                ReferenceEntry first = getFirst(i);
                while (first != null) {
                    Object key = first.getKey();
                    if (first.getHash() != i || key == null || !CustomConcurrentHashMap.this.keyEquivalence.equivalent(k, key)) {
                        first = first.getNext();
                    } else if (first.getValueReference() == valueReference) {
                        this.modCount++;
                        CustomConcurrentHashMap.this.enqueueNotification(k, i, valueReference);
                        enqueueCleanup(first);
                        this.count = i2 - 1;
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } finally {
                unlock();
            }
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: package-private */
        public boolean clearValue(K k, int i, ValueReference<K, V> valueReference) {
            lock();
            try {
                ReferenceEntry first = getFirst(i);
                while (first != null) {
                    Object key = first.getKey();
                    if (first.getHash() != i || key == null || !CustomConcurrentHashMap.this.keyEquivalence.equivalent(k, key)) {
                        first = first.getNext();
                    } else if (first.getValueReference() == valueReference) {
                        enqueueCleanup(first);
                        unlock();
                        return true;
                    } else {
                        unlock();
                        return false;
                    }
                }
                unlock();
                return false;
            } catch (Throwable th) {
                unlock();
                throw th;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean unsetEntry(ReferenceEntry<K, V> referenceEntry, int i) {
            for (ReferenceEntry<K, V> first = getFirst(i); first != null; first = first.getNext()) {
                if (first == referenceEntry) {
                    return unsetLiveEntry(referenceEntry, i);
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean unsetLiveEntry(ReferenceEntry<K, V> referenceEntry, int i) {
            if (CustomConcurrentHashMap.this.isUnset(referenceEntry)) {
                return false;
            }
            int i2 = this.count;
            this.modCount++;
            ValueReference<K, V> valueReference = referenceEntry.getValueReference();
            if (valueReference.isComputingReference()) {
                return false;
            }
            CustomConcurrentHashMap.this.enqueueNotification(referenceEntry.getKey(), i, valueReference);
            enqueueCleanup(referenceEntry);
            this.count = i2 - 1;
            return true;
        }

        /* access modifiers changed from: package-private */
        public void enqueueCleanup(ReferenceEntry<K, V> referenceEntry) {
            referenceEntry.setValueReference(CustomConcurrentHashMap.unset());
            this.cleanupQueue.offer(referenceEntry);
            this.evictionQueue.remove(referenceEntry);
            this.expirationQueue.remove(referenceEntry);
        }

        /* access modifiers changed from: package-private */
        public V getLiveValue(ReferenceEntry<K, V> referenceEntry) {
            V v;
            if (referenceEntry.getKey() == null || (v = referenceEntry.getValueReference().get()) == null) {
                return null;
            }
            if (!CustomConcurrentHashMap.this.expires() || !CustomConcurrentHashMap.this.isExpired(referenceEntry)) {
                return v;
            }
            tryExpireEntries();
            return null;
        }

        /* access modifiers changed from: package-private */
        public void processPendingCleanup() {
            ReferenceEntry poll;
            AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
            int i = 0;
            while (i < 16 && (poll = this.cleanupQueue.poll()) != null) {
                int hash = poll.getHash() & (atomicReferenceArray.length() - 1);
                ReferenceEntry referenceEntry = atomicReferenceArray.get(hash);
                ReferenceEntry referenceEntry2 = referenceEntry;
                while (true) {
                    if (referenceEntry2 == null) {
                        break;
                    } else if (referenceEntry2 != poll) {
                        referenceEntry2 = referenceEntry2.getNext();
                    } else if (CustomConcurrentHashMap.this.isUnset(referenceEntry2)) {
                        atomicReferenceArray.set(hash, removeFromChain(referenceEntry, referenceEntry2));
                        i++;
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void postReadCleanup() {
            if ((this.readCount.incrementAndGet() & 63) != 0) {
                return;
            }
            if (CustomConcurrentHashMap.this.isInlineCleanup()) {
                runCleanup();
            } else if (!isHeldByCurrentThread()) {
                CustomConcurrentHashMap.this.cleanupExecutor.execute(this.cleanupRunnable);
            }
        }

        /* access modifiers changed from: package-private */
        public void preWriteCleanup() {
            if (CustomConcurrentHashMap.this.isInlineCleanup()) {
                runLockedCleanup();
            } else {
                expireEntries();
            }
        }

        /* access modifiers changed from: package-private */
        public void postWriteCleanup() {
            if (CustomConcurrentHashMap.this.isInlineCleanup()) {
                if (isHeldByCurrentThread()) {
                    runLockedCleanup();
                } else {
                    runUnlockedCleanup();
                }
            } else if (!isHeldByCurrentThread()) {
                CustomConcurrentHashMap.this.cleanupExecutor.execute(this.cleanupRunnable);
            }
        }

        /* access modifiers changed from: package-private */
        public void runCleanup() {
            runLockedCleanup();
            runUnlockedCleanup();
        }

        /* access modifiers changed from: package-private */
        public void runUnlockedCleanup() {
            CustomConcurrentHashMap.this.processPendingNotifications();
        }

        /* access modifiers changed from: package-private */
        public void runLockedCleanup() {
            lock();
            try {
                expireEntries();
                processPendingCleanup();
                this.readCount.set(0);
            } finally {
                unlock();
            }
        }

        /* access modifiers changed from: package-private */
        public void clear() {
            if (this.count != 0) {
                lock();
                try {
                    AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.table;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        atomicReferenceArray.set(i, (Object) null);
                    }
                    this.evictionQueue.clear();
                    this.expirationQueue.clear();
                    this.readCount.set(0);
                    this.modCount++;
                    this.count = 0;
                } finally {
                    unlock();
                }
            }
        }

        class EvictionQueue extends AbstractQueue<ReferenceEntry<K, V>> {
            final ReferenceEntry<K, V> head = new ReferenceEntry<K, V>() {
                ReferenceEntry<K, V> nextEvictable = this;
                ReferenceEntry<K, V> previousEvictable = this;

                public void notifyKeyReclaimed() {
                }

                public ReferenceEntry<K, V> getNextEvictable() {
                    return this.nextEvictable;
                }

                public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
                    this.nextEvictable = referenceEntry;
                }

                public ReferenceEntry<K, V> getPreviousEvictable() {
                    return this.previousEvictable;
                }

                public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
                    this.previousEvictable = referenceEntry;
                }

                public ValueReference<K, V> getValueReference() {
                    throw new UnsupportedOperationException();
                }

                public void setValueReference(ValueReference<K, V> valueReference) {
                    throw new UnsupportedOperationException();
                }

                public void notifyValueReclaimed(ValueReference<K, V> valueReference) {
                    throw new UnsupportedOperationException();
                }

                public ReferenceEntry<K, V> getNext() {
                    throw new UnsupportedOperationException();
                }

                public int getHash() {
                    throw new UnsupportedOperationException();
                }

                public K getKey() {
                    throw new UnsupportedOperationException();
                }

                public long getExpirationTime() {
                    throw new UnsupportedOperationException();
                }

                public void setExpirationTime(long j) {
                    throw new UnsupportedOperationException();
                }

                public ReferenceEntry<K, V> getNextExpirable() {
                    throw new UnsupportedOperationException();
                }

                public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
                    throw new UnsupportedOperationException();
                }

                public ReferenceEntry<K, V> getPreviousExpirable() {
                    throw new UnsupportedOperationException();
                }

                public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
                    throw new UnsupportedOperationException();
                }
            };

            EvictionQueue() {
            }

            public boolean offer(ReferenceEntry<K, V> referenceEntry) {
                CustomConcurrentHashMap.connectEvictables(referenceEntry.getPreviousEvictable(), referenceEntry.getNextEvictable());
                CustomConcurrentHashMap.connectEvictables(this.head.getPreviousEvictable(), referenceEntry);
                CustomConcurrentHashMap.connectEvictables(referenceEntry, this.head);
                return true;
            }

            public ReferenceEntry<K, V> peek() {
                ReferenceEntry<K, V> nextEvictable = this.head.getNextEvictable();
                if (nextEvictable == this.head) {
                    return null;
                }
                return nextEvictable;
            }

            public ReferenceEntry<K, V> poll() {
                ReferenceEntry<K, V> nextEvictable = this.head.getNextEvictable();
                if (nextEvictable == this.head) {
                    return null;
                }
                remove(nextEvictable);
                return nextEvictable;
            }

            public boolean remove(Object obj) {
                ReferenceEntry referenceEntry = (ReferenceEntry) obj;
                ReferenceEntry previousEvictable = referenceEntry.getPreviousEvictable();
                ReferenceEntry nextEvictable = referenceEntry.getNextEvictable();
                CustomConcurrentHashMap.connectEvictables(previousEvictable, nextEvictable);
                CustomConcurrentHashMap.nullifyEvictable(referenceEntry);
                return nextEvictable != NullEntry.INSTANCE;
            }

            public boolean contains(Object obj) {
                return ((ReferenceEntry) obj).getNextEvictable() != NullEntry.INSTANCE;
            }

            public boolean isEmpty() {
                return this.head.getNextEvictable() == this.head;
            }

            public int size() {
                int i = 0;
                for (ReferenceEntry<K, V> nextEvictable = this.head.getNextEvictable(); nextEvictable != this.head; nextEvictable = nextEvictable.getNextEvictable()) {
                    i++;
                }
                return i;
            }

            public void clear() {
                ReferenceEntry<K, V> nextEvictable = this.head.getNextEvictable();
                while (true) {
                    ReferenceEntry<K, V> referenceEntry = this.head;
                    if (nextEvictable != referenceEntry) {
                        ReferenceEntry<K, V> nextEvictable2 = nextEvictable.getNextEvictable();
                        CustomConcurrentHashMap.nullifyEvictable(nextEvictable);
                        nextEvictable = nextEvictable2;
                    } else {
                        referenceEntry.setNextEvictable(referenceEntry);
                        ReferenceEntry<K, V> referenceEntry2 = this.head;
                        referenceEntry2.setPreviousEvictable(referenceEntry2);
                        return;
                    }
                }
            }

            public Iterator<ReferenceEntry<K, V>> iterator() {
                return new AbstractLinkedIterator<ReferenceEntry<K, V>>(peek()) {
                    /* access modifiers changed from: protected */
                    public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                        ReferenceEntry<K, V> nextEvictable = referenceEntry.getNextEvictable();
                        if (nextEvictable == EvictionQueue.this.head) {
                            return null;
                        }
                        return nextEvictable;
                    }
                };
            }
        }

        class ExpirationQueue extends AbstractQueue<ReferenceEntry<K, V>> {
            final ReferenceEntry<K, V> head = new ReferenceEntry<K, V>() {
                ReferenceEntry<K, V> nextExpirable = this;
                ReferenceEntry<K, V> previousExpirable = this;

                public long getExpirationTime() {
                    return Long.MAX_VALUE;
                }

                public void notifyKeyReclaimed() {
                }

                public void setExpirationTime(long j) {
                }

                public ReferenceEntry<K, V> getNextExpirable() {
                    return this.nextExpirable;
                }

                public void setNextExpirable(ReferenceEntry<K, V> referenceEntry) {
                    this.nextExpirable = referenceEntry;
                }

                public ReferenceEntry<K, V> getPreviousExpirable() {
                    return this.previousExpirable;
                }

                public void setPreviousExpirable(ReferenceEntry<K, V> referenceEntry) {
                    this.previousExpirable = referenceEntry;
                }

                public ValueReference<K, V> getValueReference() {
                    throw new UnsupportedOperationException();
                }

                public void setValueReference(ValueReference<K, V> valueReference) {
                    throw new UnsupportedOperationException();
                }

                public void notifyValueReclaimed(ValueReference<K, V> valueReference) {
                    throw new UnsupportedOperationException();
                }

                public ReferenceEntry<K, V> getNext() {
                    throw new UnsupportedOperationException();
                }

                public int getHash() {
                    throw new UnsupportedOperationException();
                }

                public K getKey() {
                    throw new UnsupportedOperationException();
                }

                public ReferenceEntry<K, V> getNextEvictable() {
                    throw new UnsupportedOperationException();
                }

                public void setNextEvictable(ReferenceEntry<K, V> referenceEntry) {
                    throw new UnsupportedOperationException();
                }

                public ReferenceEntry<K, V> getPreviousEvictable() {
                    throw new UnsupportedOperationException();
                }

                public void setPreviousEvictable(ReferenceEntry<K, V> referenceEntry) {
                    throw new UnsupportedOperationException();
                }
            };

            ExpirationQueue() {
            }

            public boolean offer(ReferenceEntry<K, V> referenceEntry) {
                CustomConcurrentHashMap.connectExpirables(referenceEntry.getPreviousExpirable(), referenceEntry.getNextExpirable());
                CustomConcurrentHashMap.connectExpirables(this.head.getPreviousExpirable(), referenceEntry);
                CustomConcurrentHashMap.connectExpirables(referenceEntry, this.head);
                return true;
            }

            public ReferenceEntry<K, V> peek() {
                ReferenceEntry<K, V> nextExpirable = this.head.getNextExpirable();
                if (nextExpirable == this.head) {
                    return null;
                }
                return nextExpirable;
            }

            public ReferenceEntry<K, V> poll() {
                ReferenceEntry<K, V> nextExpirable = this.head.getNextExpirable();
                if (nextExpirable == this.head) {
                    return null;
                }
                remove(nextExpirable);
                return nextExpirable;
            }

            public boolean remove(Object obj) {
                ReferenceEntry referenceEntry = (ReferenceEntry) obj;
                ReferenceEntry previousExpirable = referenceEntry.getPreviousExpirable();
                ReferenceEntry nextExpirable = referenceEntry.getNextExpirable();
                CustomConcurrentHashMap.connectExpirables(previousExpirable, nextExpirable);
                CustomConcurrentHashMap.nullifyExpirable(referenceEntry);
                return nextExpirable != NullEntry.INSTANCE;
            }

            public boolean contains(Object obj) {
                return ((ReferenceEntry) obj).getNextExpirable() != NullEntry.INSTANCE;
            }

            public boolean isEmpty() {
                return this.head.getNextExpirable() == this.head;
            }

            public int size() {
                int i = 0;
                for (ReferenceEntry<K, V> nextExpirable = this.head.getNextExpirable(); nextExpirable != this.head; nextExpirable = nextExpirable.getNextExpirable()) {
                    i++;
                }
                return i;
            }

            public void clear() {
                ReferenceEntry<K, V> nextExpirable = this.head.getNextExpirable();
                while (true) {
                    ReferenceEntry<K, V> referenceEntry = this.head;
                    if (nextExpirable != referenceEntry) {
                        ReferenceEntry<K, V> nextExpirable2 = nextExpirable.getNextExpirable();
                        CustomConcurrentHashMap.nullifyExpirable(nextExpirable);
                        nextExpirable = nextExpirable2;
                    } else {
                        referenceEntry.setNextExpirable(referenceEntry);
                        ReferenceEntry<K, V> referenceEntry2 = this.head;
                        referenceEntry2.setPreviousExpirable(referenceEntry2);
                        return;
                    }
                }
            }

            public Iterator<ReferenceEntry<K, V>> iterator() {
                return new AbstractLinkedIterator<ReferenceEntry<K, V>>(peek()) {
                    /* access modifiers changed from: protected */
                    public ReferenceEntry<K, V> computeNext(ReferenceEntry<K, V> referenceEntry) {
                        ReferenceEntry<K, V> nextExpirable = referenceEntry.getNextExpirable();
                        if (nextExpirable == ExpirationQueue.this.head) {
                            return null;
                        }
                        return nextExpirable;
                    }
                };
            }
        }
    }

    public boolean isEmpty() {
        CustomConcurrentHashMap<K, V>.Segment[] segmentArr = this.segments;
        int[] iArr = new int[segmentArr.length];
        int i = 0;
        for (int i2 = 0; i2 < segmentArr.length; i2++) {
            if (segmentArr[i2].count != 0) {
                return false;
            }
            int i3 = segmentArr[i2].modCount;
            iArr[i2] = i3;
            i += i3;
        }
        if (i == 0) {
            return true;
        }
        for (int i4 = 0; i4 < segmentArr.length; i4++) {
            if (segmentArr[i4].count != 0 || iArr[i4] != segmentArr[i4].modCount) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        CustomConcurrentHashMap<K, V>.Segment[] segmentArr = this.segments;
        long j = 0;
        for (CustomConcurrentHashMap<K, V>.Segment segment : segmentArr) {
            j += (long) segment.count;
        }
        return Ints.saturatedCast(j);
    }

    public V get(Object obj) {
        int hash = hash(obj);
        return segmentFor(hash).get(obj, hash);
    }

    /* access modifiers changed from: package-private */
    public ReferenceEntry<K, V> getEntry(Object obj) {
        int hash = hash(obj);
        return segmentFor(hash).getEntry(obj, hash);
    }

    public boolean containsKey(Object obj) {
        int hash = hash(obj);
        return segmentFor(hash).containsKey(obj, hash);
    }

    public boolean containsValue(Object obj) {
        Preconditions.checkNotNull(obj);
        CustomConcurrentHashMap<K, V>.Segment[] segmentArr = this.segments;
        for (int i = 0; i < segmentArr.length; i++) {
            int i2 = segmentArr[i].count;
            if (segmentArr[i].containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    public V put(K k, V v) {
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, false);
    }

    public V putIfAbsent(K k, V v) {
        int hash = hash(k);
        return segmentFor(hash).put(k, hash, v, true);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public V remove(Object obj) {
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash);
    }

    public boolean remove(Object obj, Object obj2) {
        int hash = hash(obj);
        return segmentFor(hash).remove(obj, hash, obj2);
    }

    public boolean replace(K k, V v, V v2) {
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v, v2);
    }

    public V replace(K k, V v) {
        int hash = hash(k);
        return segmentFor(hash).replace(k, hash, v);
    }

    public void clear() {
        for (CustomConcurrentHashMap<K, V>.Segment clear : this.segments) {
            clear.clear();
        }
    }

    public Set<K> keySet() {
        Set<K> set = this.keySet;
        if (set != null) {
            return set;
        }
        KeySet keySet2 = new KeySet();
        this.keySet = keySet2;
        return keySet2;
    }

    public Collection<V> values() {
        Collection<V> collection = this.values;
        if (collection != null) {
            return collection;
        }
        Values values2 = new Values();
        this.values = values2;
        return values2;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.entrySet;
        if (set != null) {
            return set;
        }
        EntrySet entrySet2 = new EntrySet();
        this.entrySet = entrySet2;
        return entrySet2;
    }

    abstract class HashIterator {
        AtomicReferenceArray<ReferenceEntry<K, V>> currentTable;
        CustomConcurrentHashMap<K, V>.WriteThroughEntry lastReturned;
        ReferenceEntry<K, V> nextEntry;
        CustomConcurrentHashMap<K, V>.WriteThroughEntry nextExternal;
        int nextSegmentIndex;
        int nextTableIndex = -1;

        HashIterator() {
            this.nextSegmentIndex = CustomConcurrentHashMap.this.segments.length - 1;
            advance();
        }

        /* access modifiers changed from: package-private */
        public final void advance() {
            this.nextExternal = null;
            if (!nextInChain() && !nextInTable()) {
                while (this.nextSegmentIndex >= 0) {
                    CustomConcurrentHashMap<K, V>.Segment[] segmentArr = CustomConcurrentHashMap.this.segments;
                    int i = this.nextSegmentIndex;
                    this.nextSegmentIndex = i - 1;
                    CustomConcurrentHashMap<K, V>.Segment segment = segmentArr[i];
                    if (segment.count != 0) {
                        AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = segment.table;
                        this.currentTable = atomicReferenceArray;
                        this.nextTableIndex = atomicReferenceArray.length() - 1;
                        if (nextInTable()) {
                            return;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean nextInChain() {
            ReferenceEntry<K, V> referenceEntry = this.nextEntry;
            if (referenceEntry == null) {
                return false;
            }
            this.nextEntry = referenceEntry.getNext();
            while (true) {
                ReferenceEntry<K, V> referenceEntry2 = this.nextEntry;
                if (referenceEntry2 == null) {
                    return false;
                }
                if (advanceTo(referenceEntry2)) {
                    return true;
                }
                this.nextEntry = this.nextEntry.getNext();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean nextInTable() {
            while (true) {
                int i = this.nextTableIndex;
                if (i < 0) {
                    return false;
                }
                AtomicReferenceArray<ReferenceEntry<K, V>> atomicReferenceArray = this.currentTable;
                this.nextTableIndex = i - 1;
                ReferenceEntry<K, V> referenceEntry = atomicReferenceArray.get(i);
                this.nextEntry = referenceEntry;
                if (referenceEntry != null && (advanceTo(referenceEntry) || nextInChain())) {
                    return true;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean advanceTo(ReferenceEntry<K, V> referenceEntry) {
            K key = referenceEntry.getKey();
            V v = referenceEntry.getValueReference().get();
            if (key == null || v == null) {
                return false;
            }
            if (CustomConcurrentHashMap.this.expires() && CustomConcurrentHashMap.this.isExpired(referenceEntry)) {
                return false;
            }
            this.nextExternal = new WriteThroughEntry(key, v);
            return true;
        }

        public boolean hasNext() {
            return this.nextExternal != null;
        }

        /* access modifiers changed from: package-private */
        public CustomConcurrentHashMap<K, V>.WriteThroughEntry nextEntry() {
            CustomConcurrentHashMap<K, V>.WriteThroughEntry writeThroughEntry = this.nextExternal;
            if (writeThroughEntry != null) {
                this.lastReturned = writeThroughEntry;
                advance();
                return this.lastReturned;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            Preconditions.checkState(this.lastReturned != null);
            CustomConcurrentHashMap.this.remove(this.lastReturned.getKey());
            this.lastReturned = null;
        }
    }

    final class KeyIterator extends CustomConcurrentHashMap<K, V>.HashIterator implements Iterator<K> {
        KeyIterator() {
            super();
        }

        public final K next() {
            return nextEntry().getKey();
        }
    }

    final class ValueIterator extends CustomConcurrentHashMap<K, V>.HashIterator implements Iterator<V> {
        ValueIterator() {
            super();
        }

        public final V next() {
            return nextEntry().getValue();
        }
    }

    final class WriteThroughEntry extends AbstractMapEntry<K, V> {
        final K key;
        V value;

        WriteThroughEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        public final K getKey() {
            return this.key;
        }

        public final V getValue() {
            return this.value;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!this.key.equals(entry.getKey()) || !this.value.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.key.hashCode() ^ this.value.hashCode();
        }

        public final V setValue(V v) {
            V put = CustomConcurrentHashMap.this.put(this.key, v);
            this.value = v;
            return put;
        }
    }

    final class EntryIterator extends CustomConcurrentHashMap<K, V>.HashIterator implements Iterator<Map.Entry<K, V>> {
        EntryIterator() {
            super();
        }

        public final Map.Entry<K, V> next() {
            return nextEntry();
        }
    }

    final class KeySet extends AbstractSet<K> {
        KeySet() {
        }

        public final Iterator<K> iterator() {
            return new KeyIterator();
        }

        public final int size() {
            return CustomConcurrentHashMap.this.size();
        }

        public final boolean isEmpty() {
            return CustomConcurrentHashMap.this.isEmpty();
        }

        public final boolean contains(Object obj) {
            return CustomConcurrentHashMap.this.containsKey(obj);
        }

        public final boolean remove(Object obj) {
            return CustomConcurrentHashMap.this.remove(obj) != null;
        }

        public final void clear() {
            CustomConcurrentHashMap.this.clear();
        }
    }

    final class Values extends AbstractCollection<V> {
        Values() {
        }

        public final Iterator<V> iterator() {
            return new ValueIterator();
        }

        public final int size() {
            return CustomConcurrentHashMap.this.size();
        }

        public final boolean isEmpty() {
            return CustomConcurrentHashMap.this.isEmpty();
        }

        public final boolean contains(Object obj) {
            return CustomConcurrentHashMap.this.containsValue(obj);
        }

        public final void clear() {
            CustomConcurrentHashMap.this.clear();
        }
    }

    final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean contains(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x000f
                return r1
            L_0x000f:
                com.google.common.collect.CustomConcurrentHashMap r2 = com.google.common.collect.CustomConcurrentHashMap.this
                java.lang.Object r0 = r2.get(r0)
                if (r0 == 0) goto L_0x0026
                com.google.common.collect.CustomConcurrentHashMap r2 = com.google.common.collect.CustomConcurrentHashMap.this
                com.google.common.base.Equivalence<java.lang.Object> r2 = r2.valueEquivalence
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.equivalent(r4, r0)
                if (r4 == 0) goto L_0x0026
                r1 = 1
            L_0x0026:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CustomConcurrentHashMap.EntrySet.contains(java.lang.Object):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
            r4 = (java.util.Map.Entry) r4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean remove(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r4.getKey()
                if (r0 == 0) goto L_0x001b
                com.google.common.collect.CustomConcurrentHashMap r2 = com.google.common.collect.CustomConcurrentHashMap.this
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r2.remove(r0, r4)
                if (r4 == 0) goto L_0x001b
                r1 = 1
            L_0x001b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CustomConcurrentHashMap.EntrySet.remove(java.lang.Object):boolean");
        }

        public final int size() {
            return CustomConcurrentHashMap.this.size();
        }

        public final boolean isEmpty() {
            return CustomConcurrentHashMap.this.isEmpty();
        }

        public final void clear() {
            CustomConcurrentHashMap.this.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new SerializationProxy(this.keyStrength, this.valueStrength, this.keyEquivalence, this.valueEquivalence, this.expireAfterWriteNanos, this.expireAfterAccessNanos, this.maximumSize, this.concurrencyLevel, this.evictionListener, this);
    }

    static abstract class AbstractSerializationProxy<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 2;
        final int concurrencyLevel;
        transient ConcurrentMap<K, V> delegate;
        final MapEvictionListener<? super K, ? super V> evictionListener;
        final long expireAfterAccessNanos;
        final long expireAfterWriteNanos;
        final Equivalence<Object> keyEquivalence;
        final Strength keyStrength;
        final int maximumSize;
        final Equivalence<Object> valueEquivalence;
        final Strength valueStrength;

        AbstractSerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, int i, int i2, MapEvictionListener<? super K, ? super V> mapEvictionListener, ConcurrentMap<K, V> concurrentMap) {
            this.keyStrength = strength;
            this.valueStrength = strength2;
            this.keyEquivalence = equivalence;
            this.valueEquivalence = equivalence2;
            this.expireAfterWriteNanos = j;
            this.expireAfterAccessNanos = j2;
            this.maximumSize = i;
            this.concurrencyLevel = i2;
            this.evictionListener = mapEvictionListener;
            this.delegate = concurrentMap;
        }

        /* access modifiers changed from: protected */
        public ConcurrentMap<K, V> delegate() {
            return this.delegate;
        }

        /* access modifiers changed from: package-private */
        public void writeMapTo(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeInt(this.delegate.size());
            for (Map.Entry entry : this.delegate.entrySet()) {
                objectOutputStream.writeObject(entry.getKey());
                objectOutputStream.writeObject(entry.getValue());
            }
            objectOutputStream.writeObject((Object) null);
        }

        /* access modifiers changed from: package-private */
        public MapMaker readMapMaker(ObjectInputStream objectInputStream) throws IOException {
            MapMaker concurrencyLevel2 = new MapMaker().initialCapacity(objectInputStream.readInt()).setKeyStrength(this.keyStrength).setValueStrength(this.valueStrength).privateKeyEquivalence(this.keyEquivalence).privateValueEquivalence(this.valueEquivalence).concurrencyLevel(this.concurrencyLevel);
            concurrencyLevel2.evictionListener(this.evictionListener);
            long j = this.expireAfterWriteNanos;
            if (j > 0) {
                concurrencyLevel2.expireAfterWrite(j, TimeUnit.NANOSECONDS);
            }
            long j2 = this.expireAfterAccessNanos;
            if (j2 > 0) {
                concurrencyLevel2.expireAfterAccess(j2, TimeUnit.NANOSECONDS);
            }
            int i = this.maximumSize;
            if (i != -1) {
                concurrencyLevel2.maximumSize(i);
            }
            return concurrencyLevel2;
        }

        /* access modifiers changed from: package-private */
        public void readEntries(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            while (true) {
                Object readObject = objectInputStream.readObject();
                if (readObject != null) {
                    this.delegate.put(readObject, objectInputStream.readObject());
                } else {
                    return;
                }
            }
        }
    }

    static class SerializationProxy<K, V> extends AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 2;

        SerializationProxy(Strength strength, Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, int i, int i2, MapEvictionListener<? super K, ? super V> mapEvictionListener, ConcurrentMap<K, V> concurrentMap) {
            super(strength, strength2, equivalence, equivalence2, j, j2, i, i2, mapEvictionListener, concurrentMap);
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.delegate = readMapMaker(objectInputStream).makeMap();
            readEntries(objectInputStream);
        }

        private Object readResolve() {
            return this.delegate;
        }
    }
}
