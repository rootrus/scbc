package com.kofax.mobile.sdk.p012ah;

import android.content.Context;
import com.kofax.mobile.sdk._internal.extraction.IExtractionServer;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.af */
public final class C8255af implements OPRStatusRewardsLandingActivity_ViewBinding<IExtractionServer> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4405X;

    /* renamed from: Yi */
    private final C0844o f4406Yi;

    public C8255af(C0844o oVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f4406Yi = oVar;
        this.f4405X = hmlReviewDocumentActivity;
    }

    public final IExtractionServer get() {
        IExtractionServer v = this.f4406Yi.mo12114v(this.f4405X.get());
        if (v != null) {
            return v;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: p */
    public static C8255af m4575p(C0844o oVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C8255af(oVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IExtractionServer m4574a(C0844o oVar, Context context) {
        IExtractionServer v = oVar.mo12114v(context);
        if (v != null) {
            return v;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
