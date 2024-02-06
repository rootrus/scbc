package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {
    private final ExecutionList executionList = new ExecutionList();

    public ListenableFutureTask(Callable<V> callable) {
        super(callable);
    }

    public ListenableFutureTask(Runnable runnable, V v) {
        super(runnable, v);
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.executionList.add(runnable, executor);
    }

    /* access modifiers changed from: protected */
    public void done() {
        this.executionList.run();
    }
}
