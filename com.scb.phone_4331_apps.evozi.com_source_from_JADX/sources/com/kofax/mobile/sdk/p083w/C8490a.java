package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.a */
public class C8490a extends C8500ae {

    /* renamed from: Pv */
    private final C8492a f5147Pv;

    /* renamed from: com.kofax.mobile.sdk.w.a$a */
    public interface C8492a {
        /* renamed from: a */
        void mo55391a(C8340a aVar, C8297a aVar2);

        /* renamed from: b */
        boolean mo55392b(C8340a aVar);

        /* renamed from: c */
        boolean mo55393c(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8490a(C8492a aVar) {
        this.f5147Pv = aVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        if (!this.f5147Pv.mo55392b(aVar) && this.f5147Pv.mo55393c(aVar)) {
            this.f5147Pv.mo55391a(aVar, new C8297a() {
                public String getClassId() {
                    return "Unknown";
                }

                public float getConfidence() {
                    return 1.0f;
                }
            });
        }
    }
}
