package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p075e.C8342c;
import com.kofax.mobile.sdk.p082v.C8483a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.aq */
public final class C8045aq implements OPRStatusRewardsLandingActivity_ViewBinding<C8342c> {

    /* renamed from: LV */
    private final C0705ah f3906LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8483a> f3907ad;

    public C8045aq(C0705ah ahVar, HmlReviewDocumentActivity<C8483a> hmlReviewDocumentActivity) {
        this.f3906LV = ahVar;
        this.f3907ad = hmlReviewDocumentActivity;
    }

    /* renamed from: nr */
    public final C8342c get() {
        C8342c a = this.f3906LV.mo11694a(this.f3907ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: e */
    public static C8045aq m4062e(C0705ah ahVar, HmlReviewDocumentActivity<C8483a> hmlReviewDocumentActivity) {
        return new C8045aq(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C8342c m4061a(C0705ah ahVar, C8483a aVar) {
        C8342c a = ahVar.mo11694a(aVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
