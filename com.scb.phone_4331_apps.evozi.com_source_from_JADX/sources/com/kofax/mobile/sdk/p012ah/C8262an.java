package com.kofax.mobile.sdk.p012ah;

import com.kofax.mobile.sdk._internal.IImageToByteArray;
import com.kofax.mobile.sdk._internal.impl.C8231w;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.an */
public final class C8262an implements OPRStatusRewardsLandingActivity_ViewBinding<IImageToByteArray> {

    /* renamed from: Yi */
    private final C0844o f4419Yi;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<C8231w> f4420ad;

    public C8262an(C0844o oVar, HmlReviewDocumentActivity<C8231w> hmlReviewDocumentActivity) {
        this.f4419Yi = oVar;
        this.f4420ad = hmlReviewDocumentActivity;
    }

    /* renamed from: sV */
    public final IImageToByteArray get() {
        IImageToByteArray a = this.f4419Yi.mo12068a(this.f4420ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: x */
    public static C8262an m4595x(C0844o oVar, HmlReviewDocumentActivity<C8231w> hmlReviewDocumentActivity) {
        return new C8262an(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IImageToByteArray m4594a(C0844o oVar, C8231w wVar) {
        IImageToByteArray a = oVar.mo12068a(wVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
