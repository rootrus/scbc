package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p083w.C8531c;
import com.kofax.mobile.sdk.p084x.C8611c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bg */
public final class C8062bg implements OPRStatusRewardsLandingActivity_ViewBinding<C8531c.C8533a> {

    /* renamed from: LV */
    private final C0705ah f3947LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8611c> f3948ad;

    public C8062bg(C0705ah ahVar, HmlReviewDocumentActivity<C8611c> hmlReviewDocumentActivity) {
        this.f3947LV = ahVar;
        this.f3948ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nv */
    public final C8531c.C8533a get() {
        C8531c.C8533a a = this.f3947LV.mo11725a(this.f3948ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: p */
    public static C8062bg m4112p(C0705ah ahVar, HmlReviewDocumentActivity<C8611c> hmlReviewDocumentActivity) {
        return new C8062bg(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8531c.C8533a m4111a(C0705ah ahVar, C8611c cVar) {
        C8531c.C8533a a = ahVar.mo11725a(cVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
