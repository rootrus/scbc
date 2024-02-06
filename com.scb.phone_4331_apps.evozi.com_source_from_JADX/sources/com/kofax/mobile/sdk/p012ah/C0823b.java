package com.kofax.mobile.sdk.p012ah;

import android.content.Context;
import android.content.res.AssetManager;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.b */
public final class C0823b implements OPRStatusRewardsLandingActivity_ViewBinding<AssetManager> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f2010X;

    /* renamed from: Yd */
    private final C0810a f2011Yd;

    public C0823b(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f2011Yd = aVar;
        this.f2010X = hmlReviewDocumentActivity;
    }

    /* renamed from: sq */
    public final AssetManager get() {
        AssetManager r = this.f2011Yd.mo12019r(this.f2010X.get());
        if (r != null) {
            return r;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0823b m2049a(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C0823b(aVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static AssetManager m2048a(C0810a aVar, Context context) {
        AssetManager r = aVar.mo12019r(context);
        if (r != null) {
            return r;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
