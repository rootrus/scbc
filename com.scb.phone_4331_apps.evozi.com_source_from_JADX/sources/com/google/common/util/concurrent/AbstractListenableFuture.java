package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

public abstract class AbstractListenableFuture<V> extends AbstractFuture<V> implements ListenableFuture<V> {
    private final ExecutionList executionList = new ExecutionList();

    public void addListener(Runnable runnable, Executor executor) {
        this.executionList.add(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void done() {
        this.executionList.run();
    }
}
