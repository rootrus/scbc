package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0579a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.m */
public final class C8278m implements OPRStatusRewardsLandingActivity_ViewBinding<C0503i> {

    /* renamed from: Yf */
    private final C0837g f4451Yf;

    /* renamed from: Yg */
    private final HmlReviewDocumentActivity<C0503i> f4452Yg;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0579a> f4453ad;

    public C8278m(C0837g gVar, HmlReviewDocumentActivity<C0579a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity2) {
        this.f4451Yf = gVar;
        this.f4453ad = hmlReviewDocumentActivity;
        this.f4452Yg = hmlReviewDocumentActivity2;
    }

    /* renamed from: sy */
    public final C0503i get() {
        C0503i a = this.f4451Yf.mo12053a(this.f4453ad.get(), this.f4452Yg.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C8278m m4643b(C0837g gVar, HmlReviewDocumentActivity<C0579a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0503i> hmlReviewDocumentActivity2) {
        return new C8278m(gVar, hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: b */
    public static C0503i m4642b(C0837g gVar, C0579a aVar, C0503i iVar) {
        C0503i a = gVar.mo12053a(aVar, iVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
