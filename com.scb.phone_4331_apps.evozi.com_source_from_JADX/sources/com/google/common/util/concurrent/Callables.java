package com.google.common.util.concurrent;

import java.util.concurrent.Callable;

public final class Callables {
    private Callables() {
    }

    public static <T> Callable<T> returning(final T t) {
        return new Callable<T>() {
            public final T call() {
                return t;
            }
        };
    }
}
