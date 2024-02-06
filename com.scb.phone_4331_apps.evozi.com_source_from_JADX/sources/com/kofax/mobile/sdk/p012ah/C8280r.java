package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.impl.C7942d;
import com.kofax.mobile.sdk._internal.impl.IBase64ImageDecoder;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.r */
public final class C8280r implements OPRStatusRewardsLandingActivity_ViewBinding<IBase64ImageDecoder> {

    /* renamed from: Yi */
    private final C0844o f4456Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C7942d> f4457ad;

    public C8280r(C0844o oVar, HmlReviewDocumentActivity<C7942d> hmlReviewDocumentActivity) {
        this.f4456Yi = oVar;
        this.f4457ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sC */
    public final IBase64ImageDecoder get() {
        IBase64ImageDecoder a = this.f4456Yi.mo12082a(this.f4457ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static C8280r m4649c(C0844o oVar, HmlReviewDocumentActivity<C7942d> hmlReviewDocumentActivity) {
        return new C8280r(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IBase64ImageDecoder m4648a(C0844o oVar, C7942d dVar) {
        IBase64ImageDecoder a = oVar.mo12082a(dVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
