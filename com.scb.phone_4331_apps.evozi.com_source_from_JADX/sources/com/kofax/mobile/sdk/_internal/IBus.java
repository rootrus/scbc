package com.kofax.mobile.sdk._internal;

public interface IBus {
    void post(Object obj);

    void register(Object obj);

    void unregister(Object obj);
}
