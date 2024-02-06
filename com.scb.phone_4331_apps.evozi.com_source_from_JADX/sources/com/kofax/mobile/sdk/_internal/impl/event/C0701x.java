package com.kofax.mobile.sdk._internal.impl.event;

import com.kofax.mobile.sdk._internal.C0767k;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.x */
public abstract class C0701x<T> implements C0679ag {

    /* renamed from: IB */
    private static final String f1634IB = "KMC_EXCEPTION";

    /* renamed from: IC */
    protected final T f1635IC;

    /* renamed from: IE */
    protected final Class<T> f1636IE;

    public C0701x(T t, Class<T> cls) {
        if (t != null) {
            this.f1635IC = t;
            this.f1636IE = cls;
            return;
        }
        throw new NullPointerException("listener parameter is null");
    }

    /* renamed from: mo */
    public Object mo11618mo() {
        return this.f1635IC;
    }

    /* renamed from: mp */
    public Class<?> mo11619mp() {
        return this.f1636IE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo11635c(Exception exc) {
        C0767k.m1821e(f1634IB, exc.getMessage(), (Throwable) exc);
    }
}
