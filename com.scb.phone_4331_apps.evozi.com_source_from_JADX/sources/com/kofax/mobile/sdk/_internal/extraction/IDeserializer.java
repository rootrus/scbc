package com.kofax.mobile.sdk._internal.extraction;

public interface IDeserializer<T> {
    T deserialize(String str);
}
