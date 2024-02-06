package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0509q;
import com.kofax.mobile.sdk._internal.impl.camera.C0543aa;
import com.kofax.mobile.sdk._internal.impl.camera.C0562ak;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ay */
public final class C0822ay implements OPRStatusRewardsLandingActivity_ViewBinding<C0509q> {

    /* renamed from: Yi */
    private final C0844o f2007Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0543aa> f2008ad;

    /* renamed from: uN */
    private final HmlReviewDocumentActivity<C0562ak> f2009uN;

    public C0822ay(C0844o oVar, HmlReviewDocumentActivity<C0543aa> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0562ak> hmlReviewDocumentActivity2) {
        this.f2007Yi = oVar;
        this.f2008ad = hmlReviewDocumentActivity;
        this.f2009uN = hmlReviewDocumentActivity2;
    }

    /* renamed from: tg */
    public final C0509q get() {
        C0509q a = this.f2007Yi.mo12074a(this.f2008ad.get(), this.f2009uN.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C0822ay m2046b(C0844o oVar, HmlReviewDocumentActivity<C0543aa> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0562ak> hmlReviewDocumentActivity2) {
        return new C0822ay(oVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C0509q m2045a(C0844o oVar, C0543aa aaVar, C0562ak akVar) {
        C0509q a = oVar.mo12074a(aaVar, akVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
