package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.CustomConcurrentHashMap;
import com.google.common.collect.MapMaker;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.ConcurrentMap;

class ComputingConcurrentHashMap<K, V> extends CustomConcurrentHashMap<K, V> implements MapMaker.Cache<K, V> {
    private static final long serialVersionUID = 2;
    final Function<? super K, ? extends V> computingFunction;

    public ConcurrentMap<K, V> asMap() {
        return this;
    }

    ComputingConcurrentHashMap(MapMaker mapMaker, Function<? super K, ? extends V> function) {
        super(mapMaker);
        this.computingFunction = (Function) Preconditions.checkNotNull(function);
    }

    /* access modifiers changed from: package-private */
    public CustomConcurrentHashMap<K, V>.Segment createSegment(int i, int i2) {
        return new ComputingSegment(i, i2);
    }

    /* access modifiers changed from: package-private */
    public ComputingConcurrentHashMap<K, V>.ComputingSegment segmentFor(int i) {
        return (ComputingSegment) super.segmentFor(i);
    }

    public V apply(K k) {
        int hash = hash(k);
        return segmentFor(hash).compute(k, hash);
    }

    class ComputingSegment extends CustomConcurrentHashMap.Segment {
        ComputingSegment(int i, int i2) {
            super(i, i2);
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
            if (r5.getValueReference().isComputingReference() != false) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
            r0 = getLiveValue(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
            if (r0 == null) goto L_0x0050;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
            recordLockedRead(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
            unlock();
            postWriteCleanup();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            unsetLiveEntry(r5, r11);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public V compute(K r10, int r11) {
            /*
                r9 = this;
            L_0x0000:
                java.lang.Object r0 = r9.get(r10, r11)
                if (r0 == 0) goto L_0x0007
                return r0
            L_0x0007:
                r9.lock()
                r9.preWriteCleanup()     // Catch:{ all -> 0x00d8 }
                java.util.concurrent.atomic.AtomicReferenceArray<com.google.common.collect.CustomConcurrentHashMap$ReferenceEntry<K, V>> r1 = r9.table     // Catch:{ all -> 0x00d8 }
                int r2 = r1.length()     // Catch:{ all -> 0x00d8 }
                r3 = 1
                int r2 = r2 - r3
                r2 = r2 & r11
                java.lang.Object r4 = r1.get(r2)     // Catch:{ all -> 0x00d8 }
                com.google.common.collect.CustomConcurrentHashMap$ReferenceEntry r4 = (com.google.common.collect.CustomConcurrentHashMap.ReferenceEntry) r4     // Catch:{ all -> 0x00d8 }
                r5 = r4
            L_0x001d:
                r6 = 0
                if (r5 == 0) goto L_0x0059
                java.lang.Object r7 = r5.getKey()     // Catch:{ all -> 0x00d8 }
                int r8 = r5.getHash()     // Catch:{ all -> 0x00d8 }
                if (r8 != r11) goto L_0x0054
                if (r7 == 0) goto L_0x0054
                com.google.common.collect.ComputingConcurrentHashMap r8 = com.google.common.collect.ComputingConcurrentHashMap.this     // Catch:{ all -> 0x00d8 }
                com.google.common.base.Equivalence<java.lang.Object> r8 = r8.keyEquivalence     // Catch:{ all -> 0x00d8 }
                boolean r7 = r8.equivalent(r10, r7)     // Catch:{ all -> 0x00d8 }
                if (r7 == 0) goto L_0x0054
                com.google.common.collect.CustomConcurrentHashMap$ValueReference r7 = r5.getValueReference()     // Catch:{ all -> 0x00d8 }
                boolean r7 = r7.isComputingReference()     // Catch:{ all -> 0x00d8 }
                if (r7 != 0) goto L_0x005a
                java.lang.Object r0 = r9.getLiveValue(r5)     // Catch:{ all -> 0x00d8 }
                if (r0 == 0) goto L_0x0050
                r9.recordLockedRead(r5)     // Catch:{ all -> 0x00d8 }
                r9.unlock()
                r9.postWriteCleanup()
                return r0
            L_0x0050:
                r9.unsetLiveEntry(r5, r11)     // Catch:{ all -> 0x00d8 }
                goto L_0x005a
            L_0x0054:
                com.google.common.collect.CustomConcurrentHashMap$ReferenceEntry r5 = r5.getNext()     // Catch:{ all -> 0x00d8 }
                goto L_0x001d
            L_0x0059:
                r5 = r6
            L_0x005a:
                if (r5 == 0) goto L_0x0064
                com.google.common.collect.ComputingConcurrentHashMap r7 = com.google.common.collect.ComputingConcurrentHashMap.this     // Catch:{ all -> 0x00d8 }
                boolean r7 = r7.isUnset(r5)     // Catch:{ all -> 0x00d8 }
                if (r7 == 0) goto L_0x007b
            L_0x0064:
                com.google.common.collect.ComputingConcurrentHashMap$ComputingValueReference r7 = new com.google.common.collect.ComputingConcurrentHashMap$ComputingValueReference     // Catch:{ all -> 0x00d8 }
                com.google.common.collect.ComputingConcurrentHashMap r8 = com.google.common.collect.ComputingConcurrentHashMap.this     // Catch:{ all -> 0x00d8 }
                r7.<init>()     // Catch:{ all -> 0x00d8 }
                if (r5 != 0) goto L_0x0077
                com.google.common.collect.ComputingConcurrentHashMap r5 = com.google.common.collect.ComputingConcurrentHashMap.this     // Catch:{ all -> 0x00d8 }
                com.google.common.collect.CustomConcurrentHashMap$ReferenceEntry r4 = r5.newEntry(r10, r11, r4)     // Catch:{ all -> 0x00d8 }
                r1.set(r2, r4)     // Catch:{ all -> 0x00d8 }
                r5 = r4
            L_0x0077:
                r5.setValueReference(r7)     // Catch:{ all -> 0x00d8 }
                r6 = r7
            L_0x007b:
                r9.unlock()
                r9.postWriteCleanup()
                if (r6 == 0) goto L_0x009e
                monitor-enter(r5)     // Catch:{ all -> 0x0097 }
                java.lang.Object r0 = r6.compute(r10, r11)     // Catch:{ all -> 0x0094 }
                monitor-exit(r5)
                java.lang.String r1 = "compute() returned null unexpectedly"
                com.google.common.base.Preconditions.checkNotNull(r0, r1)     // Catch:{ all -> 0x0097 }
                if (r0 != 0) goto L_0x0093
                r9.clearValue(r10, r11, r6)
            L_0x0093:
                return r0
            L_0x0094:
                r1 = move-exception
                monitor-exit(r5)
                throw r1     // Catch:{ all -> 0x0097 }
            L_0x0097:
                r1 = move-exception
                if (r0 != 0) goto L_0x009d
                r9.clearValue(r10, r11, r6)
            L_0x009d:
                throw r1
            L_0x009e:
                r0 = 0
            L_0x009f:
                boolean r1 = java.lang.Thread.holdsLock(r5)     // Catch:{ InterruptedException -> 0x00d6, all -> 0x00cb }
                r1 = r1 ^ r3
                java.lang.String r2 = "Recursive computation"
                com.google.common.base.Preconditions.checkState(r1, r2)     // Catch:{ InterruptedException -> 0x00d6, all -> 0x00cb }
                com.google.common.collect.CustomConcurrentHashMap$ValueReference r1 = r5.getValueReference()     // Catch:{ InterruptedException -> 0x00d6, all -> 0x00cb }
                java.lang.Object r1 = r1.waitForValue()     // Catch:{ InterruptedException -> 0x00d6, all -> 0x00cb }
                if (r1 == 0) goto L_0x00c0
                r9.recordRead(r5)     // Catch:{ InterruptedException -> 0x00d6, all -> 0x00cb }
                if (r0 == 0) goto L_0x00bf
                java.lang.Thread r10 = java.lang.Thread.currentThread()
                r10.interrupt()
            L_0x00bf:
                return r1
            L_0x00c0:
                if (r0 == 0) goto L_0x0000
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L_0x0000
            L_0x00cb:
                r10 = move-exception
                if (r0 == 0) goto L_0x00d5
                java.lang.Thread r11 = java.lang.Thread.currentThread()
                r11.interrupt()
            L_0x00d5:
                throw r10
            L_0x00d6:
                r0 = r3
                goto L_0x009f
            L_0x00d8:
                r10 = move-exception
                r9.unlock()
                r9.postWriteCleanup()
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ComputingConcurrentHashMap.ComputingSegment.compute(java.lang.Object, int):java.lang.Object");
        }
    }

    static class NullPointerExceptionReference<K, V> implements CustomConcurrentHashMap.ValueReference<K, V> {
        final String message;

        public void clear() {
        }

        public CustomConcurrentHashMap.ValueReference<K, V> copyFor(CustomConcurrentHashMap.ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public V get() {
            return null;
        }

        public boolean isComputingReference() {
            return false;
        }

        public void notifyValueReclaimed() {
        }

        NullPointerExceptionReference(String str) {
            this.message = str;
        }

        public V waitForValue() {
            throw new NullPointerException(this.message);
        }
    }

    static class ComputationExceptionReference<K, V> implements CustomConcurrentHashMap.ValueReference<K, V> {

        /* renamed from: t */
        final Throwable f3266t;

        public void clear() {
        }

        public CustomConcurrentHashMap.ValueReference<K, V> copyFor(CustomConcurrentHashMap.ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public V get() {
            return null;
        }

        public boolean isComputingReference() {
            return false;
        }

        public void notifyValueReclaimed() {
        }

        ComputationExceptionReference(Throwable th) {
            this.f3266t = th;
        }

        public V waitForValue() {
            throw new AsynchronousComputationException(this.f3266t);
        }
    }

    static class ComputedReference<K, V> implements CustomConcurrentHashMap.ValueReference<K, V> {
        final V value;

        public void clear() {
        }

        public CustomConcurrentHashMap.ValueReference<K, V> copyFor(CustomConcurrentHashMap.ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public boolean isComputingReference() {
            return false;
        }

        public void notifyValueReclaimed() {
        }

        ComputedReference(V v) {
            this.value = v;
        }

        public V get() {
            return this.value;
        }

        public V waitForValue() {
            return get();
        }
    }

    class ComputingValueReference implements CustomConcurrentHashMap.ValueReference<K, V> {
        CustomConcurrentHashMap.ValueReference<K, V> computedReference;

        public CustomConcurrentHashMap.ValueReference<K, V> copyFor(CustomConcurrentHashMap.ReferenceEntry<K, V> referenceEntry) {
            return this;
        }

        public V get() {
            return null;
        }

        public boolean isComputingReference() {
            return true;
        }

        public void notifyValueReclaimed() {
        }

        private ComputingValueReference() {
            this.computedReference = CustomConcurrentHashMap.unset();
        }

        public V waitForValue() throws InterruptedException {
            if (this.computedReference == CustomConcurrentHashMap.UNSET) {
                synchronized (this) {
                    if (this.computedReference == CustomConcurrentHashMap.UNSET) {
                        wait();
                    }
                }
            }
            return this.computedReference.waitForValue();
        }

        public void clear() {
            setValueReference(new ComputedReference(null));
        }

        /* access modifiers changed from: package-private */
        public V compute(K k, int i) {
            try {
                V apply = ComputingConcurrentHashMap.this.computingFunction.apply(k);
                if (apply != null) {
                    setValueReference(new ComputedReference(apply));
                    ComputingConcurrentHashMap.this.segmentFor(i).put(k, i, apply, true);
                    return apply;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(ComputingConcurrentHashMap.this.computingFunction);
                sb.append(" returned null for key ");
                sb.append(k);
                sb.append(".");
                String obj = sb.toString();
                setValueReference(new NullPointerExceptionReference(obj));
                throw new NullPointerException(obj);
            } catch (ComputationException e) {
                setValueReference(new ComputationExceptionReference(e.getCause()));
                throw e;
            } catch (Throwable th) {
                setValueReference(new ComputationExceptionReference(th));
                throw new ComputationException(th);
            }
        }

        /* access modifiers changed from: package-private */
        public void setValueReference(CustomConcurrentHashMap.ValueReference<K, V> valueReference) {
            synchronized (this) {
                if (this.computedReference == CustomConcurrentHashMap.UNSET) {
                    this.computedReference = valueReference;
                    notifyAll();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new ComputingSerializationProxy(this.keyStrength, this.valueStrength, this.keyEquivalence, this.valueEquivalence, this.expireAfterWriteNanos, this.expireAfterAccessNanos, this.maximumSize, this.concurrencyLevel, this.evictionListener, this, this.computingFunction);
    }

    static class ComputingSerializationProxy<K, V> extends CustomConcurrentHashMap.AbstractSerializationProxy<K, V> {
        private static final long serialVersionUID = 2;
        transient MapMaker.Cache<K, V> cache;
        final Function<? super K, ? extends V> computingFunction;

        ComputingSerializationProxy(CustomConcurrentHashMap.Strength strength, CustomConcurrentHashMap.Strength strength2, Equivalence<Object> equivalence, Equivalence<Object> equivalence2, long j, long j2, int i, int i2, MapEvictionListener<? super K, ? super V> mapEvictionListener, ConcurrentMap<K, V> concurrentMap, Function<? super K, ? extends V> function) {
            super(strength, strength2, equivalence, equivalence2, j, j2, i, i2, mapEvictionListener, concurrentMap);
            this.computingFunction = function;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            writeMapTo(objectOutputStream);
        }

        private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            MapMaker.Cache<K, V> makeCache = readMapMaker(objectInputStream).makeCache(this.computingFunction);
            this.cache = makeCache;
            this.delegate = makeCache.asMap();
            readEntries(objectInputStream);
        }

        /* access modifiers changed from: package-private */
        public Object readResolve() {
            return this.cache;
        }

        public ConcurrentMap<K, V> asMap() {
            return this.delegate;
        }

        public V apply(K k) {
            return this.cache.apply(k);
        }
    }
}
