package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0602p;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.n */
public final class C0843n implements OPRStatusRewardsLandingActivity_ViewBinding<C0503i> {

    /* renamed from: Yf */
    private final C0837g f2045Yf;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C0602p> f2046ad;

    public C0843n(C0837g gVar, HmlReviewDocumentActivity<C0602p> hmlReviewDocumentActivity) {
        this.f2045Yf = gVar;
        this.f2046ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sy */
    public final C0503i get() {
        C0503i d = this.f2045Yf.mo12057d(this.f2046ad.get());
        if (d != null) {
            return d;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: d */
    public static C0843n m2114d(C0837g gVar, HmlReviewDocumentActivity<C0602p> hmlReviewDocumentActivity) {
        return new C0843n(gVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static C0503i m2113a(C0837g gVar, C0602p pVar) {
        C0503i d = gVar.mo12057d(pVar);
        if (d != null) {
            return d;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
