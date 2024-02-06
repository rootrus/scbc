package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.p029y.C8653r;
import com.kofax.mobile.sdk.p073c.C8299c;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ca */
public final class C8080ca implements OPRStatusRewardsLandingActivity_ViewBinding<C8299c> {

    /* renamed from: LV */
    private final C0705ah f3991LV;

    /* renamed from: Me */
    private final HmlReviewDocumentActivity<C8653r> f3992Me;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8299c> f3993ad;

    public C8080ca(C0705ah ahVar, HmlReviewDocumentActivity<C8653r> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8299c> hmlReviewDocumentActivity2) {
        this.f3991LV = ahVar;
        this.f3992Me = hmlReviewDocumentActivity;
        this.f3993ad = hmlReviewDocumentActivity2;
    }

    /* renamed from: nO */
    public final C8299c get() {
        C8299c a = this.f3991LV.mo11674a(this.f3992Me.get(), this.f3993ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: o */
    public static C8080ca m4167o(C0705ah ahVar, HmlReviewDocumentActivity<C8653r> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8299c> hmlReviewDocumentActivity2) {
        return new C8080ca(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C8299c m4166a(C0705ah ahVar, C8653r rVar, C8299c cVar) {
        C8299c a = ahVar.mo11674a(rVar, cVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
