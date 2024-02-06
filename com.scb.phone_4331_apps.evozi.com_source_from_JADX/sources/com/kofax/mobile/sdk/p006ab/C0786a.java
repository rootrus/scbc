package com.kofax.mobile.sdk.p006ab;

import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk.p013ai.C0853a;
import com.kofax.mobile.sdk.p013ai.C0854b;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk.ab.a */
public class C0786a implements C0854b {

    /* renamed from: TL */
    private final C0853a f1891TL;

    @HmlPinActivity
    public C0786a(C0853a aVar) {
        this.f1891TL = aVar;
    }

    /* renamed from: a */
    public boolean mo11933a(String... strArr) {
        for (String aF : strArr) {
            if (!m1860aF(aF)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: aF */
    private boolean m1860aF(String str) {
        return this.f1891TL.mo11935aF(str);
    }
}
