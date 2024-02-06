package com.google.common.util.concurrent;

public final class SettableFuture<V> extends AbstractListenableFuture<V> {
    public static <V> SettableFuture<V> create() {
        return new SettableFuture<>();
    }

    private SettableFuture() {
    }

    public final boolean set(V v) {
        return super.set(v);
    }

    public final boolean setException(Throwable th) {
        return super.setException(th);
    }

    public final boolean cancel(boolean z) {
        return super.cancel();
    }
}
