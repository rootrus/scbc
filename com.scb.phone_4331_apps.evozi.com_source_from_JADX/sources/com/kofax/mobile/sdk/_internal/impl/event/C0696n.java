package com.kofax.mobile.sdk._internal.impl.event;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.n */
public final class C0696n {

    /* renamed from: Iu */
    public final long f1631Iu;

    /* renamed from: Iw */
    public final boolean f1632Iw;

    public C0696n() {
        this(false);
    }

    public C0696n(boolean z) {
        this.f1631Iu = System.currentTimeMillis();
        this.f1632Iw = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(".  Stamp: ");
        sb.append(this.f1631Iu);
        return sb.toString();
    }
}
