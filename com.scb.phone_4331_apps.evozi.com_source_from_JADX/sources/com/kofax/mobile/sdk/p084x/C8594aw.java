package com.kofax.mobile.sdk.p084x;

import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import com.kofax.mobile.sdk.p083w.C8501af;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.x.aw */
public class C8594aw implements C8501af.C8503b {

    /* renamed from: Rt */
    private final C8572ac f5275Rt;

    /* renamed from: Ru */
    private final C8617i f5276Ru;

    @HmlPinActivity
    public C8594aw(C8572ac acVar, C8617i iVar) {
        this.f5275Rt = acVar;
        this.f5276Ru = iVar;
    }

    /* renamed from: hv */
    public C8297a mo55408hv() {
        return this.f5275Rt.mo55512pu();
    }

    /* renamed from: hw */
    public C8297a mo55409hw() {
        return this.f5276Ru.mo55512pu();
    }

    /* renamed from: oQ */
    public Exception mo55410oQ() {
        return this.f5275Rt.getException();
    }

    /* renamed from: oR */
    public Exception mo55411oR() {
        return this.f5276Ru.getException();
    }

    /* renamed from: d */
    public void mo55407d(C8340a aVar, C8297a aVar2) {
        aVar.mo55095a(aVar2);
    }

    /* renamed from: a */
    public void mo55404a(C8340a aVar, C8297a aVar2) {
        aVar.mo55099b(aVar2);
    }

    /* renamed from: b */
    public void mo55405b(C8340a aVar, Exception exc) {
        aVar.mo55098a(exc);
    }

    /* renamed from: c */
    public void mo55406c(C8340a aVar, Exception exc) {
        aVar.mo55102b(exc);
    }
}
