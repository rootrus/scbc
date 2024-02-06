package com.kofax.mobile.sdk._internal.impl.event;

/* renamed from: com.kofax.mobile.sdk._internal.impl.event.aj */
public final class C0682aj {

    /* renamed from: IQ */
    public final C0683a f1620IQ;

    /* renamed from: IR */
    public final Throwable f1621IR;
    public final String message;
    public final String tag;

    /* renamed from: com.kofax.mobile.sdk._internal.impl.event.aj$a */
    public enum C0683a {
        DEBUG,
        ERROR,
        VERBOSE
    }

    public C0682aj(String str, C0683a aVar, String str2) {
        this(str, aVar, str2, (Throwable) null);
    }

    public C0682aj(String str, C0683a aVar, String str2, Throwable th) {
        this.tag = str;
        this.f1620IQ = aVar;
        this.message = str2;
        this.f1621IR = th;
    }
}
