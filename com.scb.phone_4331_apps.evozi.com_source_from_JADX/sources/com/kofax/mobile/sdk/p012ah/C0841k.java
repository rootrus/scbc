package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0584d;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.k */
public final class C0841k implements OPRStatusRewardsLandingActivity_ViewBinding<C0503i> {

    /* renamed from: Yf */
    private final C0837g f2041Yf;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0584d> f2042ad;

    public C0841k(C0837g gVar, HmlReviewDocumentActivity<C0584d> hmlReviewDocumentActivity) {
        this.f2041Yf = gVar;
        this.f2042ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sy */
    public final C0503i get() {
        C0503i a = this.f2041Yf.mo12054a(this.f2042ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C0841k m2108b(C0837g gVar, HmlReviewDocumentActivity<C0584d> hmlReviewDocumentActivity) {
        return new C0841k(gVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0503i m2107a(C0837g gVar, C0584d dVar) {
        C0503i a = gVar.mo12054a(dVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
