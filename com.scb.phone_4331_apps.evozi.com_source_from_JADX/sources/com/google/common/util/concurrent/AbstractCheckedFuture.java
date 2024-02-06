package com.google.common.util.concurrent;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class AbstractCheckedFuture<V, X extends Exception> implements CheckedFuture<V, X> {
    protected final ListenableFuture<V> delegate;

    /* access modifiers changed from: protected */
    public abstract X mapException(Exception exc);

    protected AbstractCheckedFuture(ListenableFuture<V> listenableFuture) {
        this.delegate = listenableFuture;
    }

    public V checkedGet() throws Exception {
        try {
            return get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw mapException(e);
        } catch (CancellationException e2) {
            throw mapException(e2);
        } catch (ExecutionException e3) {
            throw mapException(e3);
        }
    }

    public V checkedGet(long j, TimeUnit timeUnit) throws TimeoutException, Exception {
        try {
            return get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw mapException(e);
        } catch (CancellationException e2) {
            throw mapException(e2);
        } catch (ExecutionException e3) {
            throw mapException(e3);
        }
    }

    public boolean cancel(boolean z) {
        return this.delegate.cancel(z);
    }

    public boolean isCancelled() {
        return this.delegate.isCancelled();
    }

    public boolean isDone() {
        return this.delegate.isDone();
    }

    public V get() throws InterruptedException, ExecutionException {
        return this.delegate.get();
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.delegate.get(j, timeUnit);
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.delegate.addListener(runnable, executor);
    }
}
