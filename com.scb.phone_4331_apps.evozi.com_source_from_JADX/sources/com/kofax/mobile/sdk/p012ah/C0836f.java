package com.kofax.mobile.sdk.p012ah;

import android.content.Context;
import android.view.WindowManager;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.f */
public final class C0836f implements OPRStatusRewardsLandingActivity_ViewBinding<WindowManager> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f2032X;

    /* renamed from: Yd */
    private final C0810a f2033Yd;

    public C0836f(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f2033Yd = aVar;
        this.f2032X = hmlReviewDocumentActivity;
    }

    /* renamed from: su */
    public final WindowManager get() {
        WindowManager q = this.f2033Yd.mo12018q(this.f2032X.get());
        if (q != null) {
            return q;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: e */
    public static C0836f m2089e(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C0836f(aVar, hmlReviewDocumentActivity);
    }

    /* renamed from: e */
    public static WindowManager m2088e(C0810a aVar, Context context) {
        WindowManager q = aVar.mo12018q(context);
        if (q != null) {
            return q;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
