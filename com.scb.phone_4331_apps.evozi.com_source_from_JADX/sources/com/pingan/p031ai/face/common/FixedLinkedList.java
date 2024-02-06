package com.pingan.p031ai.face.common;

import java.util.LinkedList;

/* renamed from: com.pingan.ai.face.common.FixedLinkedList */
public class FixedLinkedList<T> extends LinkedList<T> {
    public static final long serialVersionUID = 3292612616231532364L;
    public int capacity;

    public FixedLinkedList(int i) {
        this.capacity = i;
    }

    public native boolean add(T t);

    public native boolean equals(Object obj);

    public native int hashCode();
}
