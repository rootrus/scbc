package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk.capture.processing.IImageProcessor;
import com.kofax.mobile.sdk.p009ae.C8247b;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.ak */
public final class C8259ak implements OPRStatusRewardsLandingActivity_ViewBinding<IImageProcessor> {

    /* renamed from: Yi */
    private final C0844o f4413Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8247b> f4414ad;

    public C8259ak(C0844o oVar, HmlReviewDocumentActivity<C8247b> hmlReviewDocumentActivity) {
        this.f4413Yi = oVar;
        this.f4414ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sS */
    public final IImageProcessor get() {
        IImageProcessor a = this.f4413Yi.mo12094a(this.f4414ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: u */
    public static C8259ak m4586u(C0844o oVar, HmlReviewDocumentActivity<C8247b> hmlReviewDocumentActivity) {
        return new C8259ak(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IImageProcessor m4585a(C0844o oVar, C8247b bVar) {
        IImageProcessor a = oVar.mo12094a(bVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
