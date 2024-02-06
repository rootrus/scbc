package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

public class Response<T extends Result> {
    private T zzbb;

    public Response() {
    }

    protected Response(T t) {
        this.zzbb = t;
    }

    /* access modifiers changed from: protected */
    public T getResult() {
        return this.zzbb;
    }

    public void setResult(T t) {
        this.zzbb = t;
    }
}
