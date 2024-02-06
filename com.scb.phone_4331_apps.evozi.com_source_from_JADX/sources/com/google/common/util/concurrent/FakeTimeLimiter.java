package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public final class FakeTimeLimiter implements TimeLimiter {
    public final <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        return t;
    }

    public final <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
        return callable.call();
    }
}
