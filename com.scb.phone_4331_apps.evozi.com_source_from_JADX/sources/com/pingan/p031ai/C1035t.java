package com.pingan.p031ai;

/* renamed from: com.pingan.ai.t */
public class C1035t<T> extends C1034s<T> {

    /* renamed from: c */
    public final Object f2522c = new Object();

    public C1035t(int i) {
        super(i);
    }

    /* renamed from: a */
    public boolean mo12653a(T t) {
        boolean a;
        synchronized (this.f2522c) {
            a = super.mo12653a(t);
        }
        return a;
    }

    /* renamed from: b */
    public T mo12654b() {
        T b;
        synchronized (this.f2522c) {
            b = super.mo12654b();
        }
        return b;
    }
}
