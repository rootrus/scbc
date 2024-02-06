package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0586f;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.l */
public final class C0842l implements OPRStatusRewardsLandingActivity_ViewBinding<C0503i> {

    /* renamed from: Yf */
    private final C0837g f2043Yf;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0586f> f2044ad;

    public C0842l(C0837g gVar, HmlReviewDocumentActivity<C0586f> hmlReviewDocumentActivity) {
        this.f2043Yf = gVar;
        this.f2044ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sy */
    public final C0503i get() {
        C0503i i = this.f2043Yf.mo12058i(this.f2044ad.get());
        if (i != null) {
            return i;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static C0842l m2111c(C0837g gVar, HmlReviewDocumentActivity<C0586f> hmlReviewDocumentActivity) {
        return new C0842l(gVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0503i m2110a(C0837g gVar, C0586f fVar) {
        C0503i i = gVar.mo12058i(fVar);
        if (i != null) {
            return i;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
