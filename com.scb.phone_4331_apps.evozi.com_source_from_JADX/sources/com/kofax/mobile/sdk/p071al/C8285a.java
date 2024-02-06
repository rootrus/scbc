package com.kofax.mobile.sdk.p071al;

import bolts.Continuation;
import bolts.Task;
import com.kofax.mobile.sdk._internal.C0767k;

/* renamed from: com.kofax.mobile.sdk.al.a */
public class C8285a<T> implements Continuation<T, Task<T>> {
    private final String tag;

    public C8285a(String str) {
        this.tag = str;
    }

    public Task<T> then(Task<T> task) {
        if (task.isFaulted()) {
            C0767k.m1821e(this.tag, "Exception", (Throwable) task.getError());
        }
        return task;
    }
}
