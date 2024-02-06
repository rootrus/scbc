package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p084x.C8630u;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.au */
public final class C8049au implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3918LV;

    /* renamed from: LX */
    private final HmlReviewDocumentActivity<C8630u> f3919LX;

    public C8049au(C0705ah ahVar, HmlReviewDocumentActivity<C8630u> hmlReviewDocumentActivity) {
        this.f3918LV = ahVar;
        this.f3919LX = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3918LV.mo11718a(this.f3919LX.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: h */
    public static C8049au m4074h(C0705ah ahVar, HmlReviewDocumentActivity<C8630u> hmlReviewDocumentActivity) {
        return new C8049au(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4073a(C0705ah ahVar, C8630u uVar) {
        C8342c a = ahVar.mo11718a(uVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
