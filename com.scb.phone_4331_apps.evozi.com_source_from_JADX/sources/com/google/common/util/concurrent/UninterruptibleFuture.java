package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public interface UninterruptibleFuture<V> extends Future<V> {
    V get() throws ExecutionException;

    V get(long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException;
}
