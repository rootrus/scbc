package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0579a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.j */
public final class C0840j implements OPRStatusRewardsLandingActivity_ViewBinding<C0503i> {

    /* renamed from: Yf */
    private final C0837g f2038Yf;

    /* renamed from: Yg */
    private final HmlReviewDocumentActivity<C0503i> f2039Yg;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0579a> f2040ad;

    public C0840j(C0837g gVar, HmlReviewDocumentActivity<C0579a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity2) {
        this.f2038Yf = gVar;
        this.f2040ad = hmlReviewDocumentActivity;
        this.f2039Yg = hmlReviewDocumentActivity2;
    }

    /* renamed from: sy */
    public final C0503i get() {
        C0503i b = this.f2038Yf.mo12055b(this.f2040ad.get(), this.f2039Yg.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0840j m2105a(C0837g gVar, HmlReviewDocumentActivity<C0579a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity2) {
        return new C0840j(gVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: a */
    public static C0503i m2104a(C0837g gVar, C0579a aVar, C0503i iVar) {
        C0503i b = gVar.mo12055b(aVar, iVar);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
