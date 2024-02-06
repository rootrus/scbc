package com.google.common.collect;

import com.google.common.base.Function;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public abstract class GenericMapMaker<K0, V0> {
    MapEvictionListener<K0, V0> evictionListener;

    public abstract GenericMapMaker<K0, V0> concurrencyLevel(int i);

    public abstract GenericMapMaker<K0, V0> expiration(long j, TimeUnit timeUnit);

    public abstract GenericMapMaker<K0, V0> expireAfterAccess(long j, TimeUnit timeUnit);

    public abstract GenericMapMaker<K0, V0> expireAfterWrite(long j, TimeUnit timeUnit);

    public abstract GenericMapMaker<K0, V0> initialCapacity(int i);

    public abstract <K extends K0, V extends V0> ConcurrentMap<K, V> makeComputingMap(Function<? super K, ? extends V> function);

    public abstract <K extends K0, V extends V0> ConcurrentMap<K, V> makeMap();

    public abstract GenericMapMaker<K0, V0> maximumSize(int i);

    public abstract GenericMapMaker<K0, V0> softKeys();

    public abstract GenericMapMaker<K0, V0> softValues();

    public abstract GenericMapMaker<K0, V0> weakKeys();

    public abstract GenericMapMaker<K0, V0> weakValues();

    GenericMapMaker() {
    }
}
