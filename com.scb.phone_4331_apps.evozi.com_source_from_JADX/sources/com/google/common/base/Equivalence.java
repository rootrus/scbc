package com.google.common.base;

public interface Equivalence<T> {
    boolean equivalent(T t, T t2);

    int hash(T t);
}
