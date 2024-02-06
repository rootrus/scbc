package com.kofax.mobile.sdk.p083w;

import bolts.CancellationToken;
import com.kofax.mobile.sdk.p073c.C8297a;
import com.kofax.mobile.sdk.p075e.C8340a;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.w.c */
public class C8531c extends C8500ae {

    /* renamed from: Px */
    private final C8533a f5200Px;

    /* renamed from: com.kofax.mobile.sdk.w.c$a */
    public interface C8533a {
        /* renamed from: a */
        void mo55437a(C8340a aVar, C8297a aVar2);

        /* renamed from: d */
        boolean mo55438d(C8340a aVar);
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo55143a(Object obj, CancellationToken cancellationToken) {
        super.mo55143a(obj, cancellationToken);
    }

    @HmlPinActivity
    public C8531c(C8533a aVar) {
        this.f5200Px = aVar;
    }

    /* renamed from: a */
    public void mo55390a(C8340a aVar) {
        if (this.f5200Px.mo55438d(aVar)) {
            this.f5200Px.mo55437a(aVar, new C8297a() {
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
