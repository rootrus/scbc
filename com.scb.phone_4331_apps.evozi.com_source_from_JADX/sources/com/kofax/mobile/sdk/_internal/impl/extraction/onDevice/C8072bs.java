package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk._internal.extraction.p004id.C7912h;
import com.kofax.mobile.sdk.p029y.C8644h;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bs */
public final class C8072bs implements OPRStatusRewardsLandingActivity_ViewBinding<C7912h> {

    /* renamed from: LV */
    private final C0705ah f3969LV;

    /* renamed from: Me */
    private final HmlReviewDocumentActivity<C8644h> f3970Me;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7912h> f3971ad;

    public C8072bs(C0705ah ahVar, HmlReviewDocumentActivity<C8644h> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7912h> hmlReviewDocumentActivity2) {
        this.f3969LV = ahVar;
        this.f3970Me = hmlReviewDocumentActivity;
        this.f3971ad = hmlReviewDocumentActivity2;
    }

    /* renamed from: nH */
    public final C7912h get() {
        C7912h a = this.f3969LV.mo11652a(this.f3970Me.get(), this.f3971ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: j */
    public static C8072bs m4142j(C0705ah ahVar, HmlReviewDocumentActivity<C8644h> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C7912h> hmlReviewDocumentActivity2) {
        return new C8072bs(ahVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C7912h m4141a(C0705ah ahVar, C8644h hVar, C7912h hVar2) {
        C7912h a = ahVar.mo11652a(hVar, hVar2);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
