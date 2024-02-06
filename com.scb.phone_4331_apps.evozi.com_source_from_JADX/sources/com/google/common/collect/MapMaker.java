package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Ticker;
import com.google.common.collect.CustomConcurrentHashMap;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class MapMaker extends GenericMapMaker<Object, Object> {
    static final Executor DEFAULT_CLEANUP_EXECUTOR = new Executor() {
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_EXPIRATION_NANOS = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final Ticker DEFAULT_TICKER = new Ticker() {
        public final long read() {
            return System.nanoTime();
        }
    };
    static final int UNSET_INT = -1;
    Executor cleanupExecutor;
    int concurrencyLevel = -1;
    long expireAfterAccessNanos = -1;
    long expireAfterWriteNanos = -1;
    int initialCapacity = -1;
    Equivalence<Object> keyEquivalence;
    CustomConcurrentHashMap.Strength keyStrength;
    int maximumSize = -1;
    Ticker ticker;
    boolean useCustomMap;
    boolean useNullMap;
    Equivalence<Object> valueEquivalence;
    CustomConcurrentHashMap.Strength valueStrength;

    interface Cache<K, V> extends Function<K, V> {
        ConcurrentMap<K, V> asMap();
    }

    enum NullListener implements MapEvictionListener {
        INSTANCE;

        public final void onEviction(Object obj, Object obj2) {
        }
    }

    /* access modifiers changed from: package-private */
    public final MapMaker privateKeyEquivalence(Equivalence<Object> equivalence) {
        Preconditions.checkState(this.keyEquivalence == null, "key equivalence was already set to %s", this.keyEquivalence);
        this.keyEquivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
        this.useCustomMap = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final Equivalence<Object> getKeyEquivalence() {
        return (Equivalence) Objects.firstNonNull(this.keyEquivalence, getKeyStrength().defaultEquivalence());
    }

    /* access modifiers changed from: package-private */
    public final MapMaker privateValueEquivalence(Equivalence<Object> equivalence) {
        Preconditions.checkState(this.valueEquivalence == null, "value equivalence was already set to %s", this.valueEquivalence);
        this.valueEquivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
        this.useCustomMap = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final Equivalence<Object> getValueEquivalence() {
        return (Equivalence) Objects.firstNonNull(this.valueEquivalence, getValueStrength().defaultEquivalence());
    }

    public final MapMaker initialCapacity(int i) {
        boolean z = true;
        Preconditions.checkState(this.initialCapacity == -1, "initial capacity was already set to %s", Integer.valueOf(this.initialCapacity));
        if (i < 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.initialCapacity = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final int getInitialCapacity() {
        int i = this.initialCapacity;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public final MapMaker maximumSize(int i) {
        boolean z = false;
        Preconditions.checkState(this.maximumSize == -1, "maximum size was already set to %s", Integer.valueOf(this.maximumSize));
        Preconditions.checkArgument(i >= 0, "maximum size must not be negative");
        this.maximumSize = i;
        this.useCustomMap = true;
        boolean z2 = this.useNullMap;
        if (i == 0) {
            z = true;
        }
        this.useNullMap = z2 | z;
        return this;
    }

    public final MapMaker concurrencyLevel(int i) {
        boolean z = true;
        Preconditions.checkState(this.concurrencyLevel == -1, "concurrency level was already set to %s", Integer.valueOf(this.concurrencyLevel));
        if (i <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.concurrencyLevel = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final int getConcurrencyLevel() {
        int i = this.concurrencyLevel;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    public final MapMaker weakKeys() {
        return setKeyStrength(CustomConcurrentHashMap.Strength.WEAK);
    }

    public final MapMaker softKeys() {
        return setKeyStrength(CustomConcurrentHashMap.Strength.SOFT);
    }

    /* access modifiers changed from: package-private */
    public final MapMaker setKeyStrength(CustomConcurrentHashMap.Strength strength) {
        Preconditions.checkState(this.keyStrength == null, "Key strength was already set to %s", this.keyStrength);
        this.keyStrength = (CustomConcurrentHashMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != CustomConcurrentHashMap.Strength.STRONG) {
            this.useCustomMap = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final CustomConcurrentHashMap.Strength getKeyStrength() {
        return (CustomConcurrentHashMap.Strength) Objects.firstNonNull(this.keyStrength, CustomConcurrentHashMap.Strength.STRONG);
    }

    public final MapMaker weakValues() {
        return setValueStrength(CustomConcurrentHashMap.Strength.WEAK);
    }

    public final MapMaker softValues() {
        return setValueStrength(CustomConcurrentHashMap.Strength.SOFT);
    }

    /* access modifiers changed from: package-private */
    public final MapMaker setValueStrength(CustomConcurrentHashMap.Strength strength) {
        Preconditions.checkState(this.valueStrength == null, "Value strength was already set to %s", this.valueStrength);
        this.valueStrength = (CustomConcurrentHashMap.Strength) Preconditions.checkNotNull(strength);
        if (strength != CustomConcurrentHashMap.Strength.STRONG) {
            this.useCustomMap = true;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final CustomConcurrentHashMap.Strength getValueStrength() {
        return (CustomConcurrentHashMap.Strength) Objects.firstNonNull(this.valueStrength, CustomConcurrentHashMap.Strength.STRONG);
    }

    @Deprecated
    public final MapMaker expiration(long j, TimeUnit timeUnit) {
        return expireAfterWrite(j, timeUnit);
    }

    public final MapMaker expireAfterWrite(long j, TimeUnit timeUnit) {
        checkExpiration(j, timeUnit);
        this.expireAfterWriteNanos = timeUnit.toNanos(j);
        this.useNullMap = (j == 0) | this.useNullMap;
        this.useCustomMap = true;
        return this;
    }

    private void checkExpiration(long j, TimeUnit timeUnit) {
        Preconditions.checkState(this.expireAfterWriteNanos == -1, "expireAfterWrite was already set to %s ns", Long.valueOf(this.expireAfterWriteNanos));
        Preconditions.checkState(this.expireAfterAccessNanos == -1, "expireAfterAccess was already set to %s ns", Long.valueOf(this.expireAfterAccessNanos));
        Preconditions.checkArgument(j >= 0, "duration cannot be negative: %s %s", Long.valueOf(j), timeUnit);
    }

    /* access modifiers changed from: package-private */
    public final long getExpireAfterWriteNanos() {
        long j = this.expireAfterWriteNanos;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    public final MapMaker expireAfterAccess(long j, TimeUnit timeUnit) {
        checkExpiration(j, timeUnit);
        this.expireAfterAccessNanos = timeUnit.toNanos(j);
        this.useNullMap = (j == 0) | this.useNullMap;
        this.useCustomMap = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final long getExpireAfterAccessNanos() {
        long j = this.expireAfterAccessNanos;
        if (j == -1) {
            return 0;
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    public final Executor getCleanupExecutor() {
        return (Executor) Objects.firstNonNull(this.cleanupExecutor, DEFAULT_CLEANUP_EXECUTOR);
    }

    /* access modifiers changed from: package-private */
    public final Ticker getTicker() {
        return (Ticker) Objects.firstNonNull(this.ticker, DEFAULT_TICKER);
    }

    public final <K, V> GenericMapMaker<K, V> evictionListener(MapEvictionListener<K, V> mapEvictionListener) {
        Preconditions.checkState(this.evictionListener == null);
        this.evictionListener = (MapEvictionListener) Preconditions.checkNotNull(mapEvictionListener);
        this.useCustomMap = true;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final <K, V> MapEvictionListener<K, V> getEvictionListener() {
        return this.evictionListener == null ? NullListener.INSTANCE : this.evictionListener;
    }

    public final <K, V> ConcurrentMap<K, V> makeMap() {
        if (!this.useCustomMap) {
            return new ConcurrentHashMap(getInitialCapacity(), 0.75f, getConcurrencyLevel());
        }
        return this.useNullMap ? new NullConcurrentMap(this) : new CustomConcurrentHashMap(this);
    }

    /* access modifiers changed from: package-private */
    public final <K, V> Cache<K, V> makeCache(Function<? super K, ? extends V> function) {
        return this.useNullMap ? new NullComputingConcurrentMap(this, function) : new ComputingConcurrentHashMap(this, function);
    }

    public final <K, V> ConcurrentMap<K, V> makeComputingMap(Function<? super K, ? extends V> function) {
        return new ComputingMapAdapter(makeCache(function));
    }

    public final String toString() {
        Objects.ToStringHelper stringHelper = Objects.toStringHelper((Object) this);
        int i = this.initialCapacity;
        if (i != -1) {
            stringHelper.add("initialCapacity", Integer.valueOf(i));
        }
        int i2 = this.concurrencyLevel;
        if (i2 != -1) {
            stringHelper.add("concurrencyLevel", Integer.valueOf(i2));
        }
        int i3 = this.maximumSize;
        if (i3 != -1) {
            stringHelper.add("maximumSize", Integer.valueOf(i3));
        }
        if (this.expireAfterWriteNanos != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.expireAfterWriteNanos);
            sb.append("ns");
            stringHelper.add("expireAfterWrite", sb.toString());
        }
        if (this.expireAfterAccessNanos != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.expireAfterAccessNanos);
            sb2.append("ns");
            stringHelper.add("expireAfterAccess", sb2.toString());
        }
        CustomConcurrentHashMap.Strength strength = this.keyStrength;
        if (strength != null) {
            stringHelper.add("keyStrength", Ascii.toLowerCase(strength.toString()));
        }
        CustomConcurrentHashMap.Strength strength2 = this.valueStrength;
        if (strength2 != null) {
            stringHelper.add("valueStrength", Ascii.toLowerCase(strength2.toString()));
        }
        if (this.keyEquivalence != null) {
            stringHelper.addValue("keyEquivalence");
        }
        if (this.valueEquivalence != null) {
            stringHelper.addValue("valueEquivalence");
        }
        if (this.evictionListener != null) {
            stringHelper.addValue("evictionListener");
        }
        if (this.cleanupExecutor != null) {
            stringHelper.addValue("cleanupExecutor");
        }
        return stringHelper.toString();
    }

    static class NullConcurrentMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable {
        private static final long serialVersionUID = 0;
        final MapEvictionListener<K, V> evictionListener;

        NullConcurrentMap(MapMaker mapMaker) {
            this.evictionListener = mapMaker.getEvictionListener();
        }

        public boolean containsKey(Object obj) {
            Preconditions.checkNotNull(obj);
            return false;
        }

        public boolean containsValue(Object obj) {
            Preconditions.checkNotNull(obj);
            return false;
        }

        public V get(Object obj) {
            Preconditions.checkNotNull(obj);
            return null;
        }

        public V put(K k, V v) {
            Preconditions.checkNotNull(k);
            Preconditions.checkNotNull(v);
            this.evictionListener.onEviction(k, v);
            return null;
        }

        public V putIfAbsent(K k, V v) {
            return put(k, v);
        }

        public V remove(Object obj) {
            Preconditions.checkNotNull(obj);
            return null;
        }

        public boolean remove(Object obj, Object obj2) {
            Preconditions.checkNotNull(obj);
            Preconditions.checkNotNull(obj2);
            return false;
        }

        public V replace(K k, V v) {
            Preconditions.checkNotNull(k);
            Preconditions.checkNotNull(v);
            return null;
        }

        public boolean replace(K k, V v, V v2) {
            Preconditions.checkNotNull(k);
            Preconditions.checkNotNull(v);
            Preconditions.checkNotNull(v2);
            return false;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return Collections.emptySet();
        }
    }

    static final class NullComputingConcurrentMap<K, V> extends NullConcurrentMap<K, V> implements Cache<K, V> {
        private static final long serialVersionUID = 0;
        final Function<? super K, ? extends V> computingFunction;

        public final ConcurrentMap<K, V> asMap() {
            return this;
        }

        NullComputingConcurrentMap(MapMaker mapMaker, Function<? super K, ? extends V> function) {
            super(mapMaker);
            this.computingFunction = (Function) Preconditions.checkNotNull(function);
        }

        public final V apply(K k) {
            V compute = compute(k);
            StringBuilder sb = new StringBuilder();
            sb.append(this.computingFunction);
            sb.append(" returned null for key ");
            sb.append(k);
            sb.append(".");
            Preconditions.checkNotNull(compute, sb.toString());
            this.evictionListener.onEviction(k, compute);
            return compute;
        }

        private V compute(K k) {
            Preconditions.checkNotNull(k);
            try {
                return this.computingFunction.apply(k);
            } catch (ComputationException e) {
                throw e;
            } catch (Throwable th) {
                throw new ComputationException(th);
            }
        }
    }

    static class ComputingMapAdapter<K, V> extends ForwardingConcurrentMap<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        final Cache<K, V> cache;

        ComputingMapAdapter(Cache<K, V> cache2) {
            this.cache = cache2;
        }

        /* access modifiers changed from: protected */
        public ConcurrentMap<K, V> delegate() {
            return this.cache.asMap();
        }

        public V get(Object obj) {
            return this.cache.apply(obj);
        }
    }
}
