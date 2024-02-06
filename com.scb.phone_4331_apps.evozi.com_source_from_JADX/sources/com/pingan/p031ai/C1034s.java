package com.pingan.p031ai;

/* renamed from: com.pingan.ai.s */
public class C1034s<T> implements C1033r<T> {

    /* renamed from: a */
    public final Object[] f2520a;

    /* renamed from: b */
    public int f2521b;

    public C1034s(int i) {
        if (i > 0) {
            this.f2520a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: a */
    public boolean mo12653a(T t) {
        if (!mo12655b(t)) {
            int i = this.f2521b;
            Object[] objArr = this.f2520a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f2521b = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public T mo12654b() {
        int i = this.f2521b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T[] tArr = this.f2520a;
        T t = tArr[i2];
        tArr[i2] = null;
        this.f2521b = i2;
        return t;
    }

    /* renamed from: b */
    public final boolean mo12655b(T t) {
        for (int i = 0; i < this.f2521b; i++) {
            if (this.f2520a[i] == t) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo12652a() {
        int i = 0;
        while (true) {
            Object[] objArr = this.f2520a;
            if (i < objArr.length) {
                objArr[i] = null;
                this.f2521b--;
                i++;
            } else {
                return;
            }
        }
    }
}
