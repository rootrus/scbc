package com.google.common.collect;

import java.util.concurrent.Executor;

public final class EvictionListeners {
    private EvictionListeners() {
    }

    public static <K, V> MapEvictionListener<K, V> asynchronous(final MapEvictionListener<K, V> mapEvictionListener, final Executor executor) {
        return new MapEvictionListener<K, V>() {
            public final void onEviction(final K k, final V v) {
                executor.execute(new Runnable() {
                    public void run() {
                        mapEvictionListener.onEviction(k, v);
                    }
                });
            }
        };
    }
}
