package com.kofax.mobile.sdk.p012ah;

import android.content.Context;
import android.net.ConnectivityManager;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.c */
public final class C8277c implements OPRStatusRewardsLandingActivity_ViewBinding<ConnectivityManager> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4449X;

    /* renamed from: Yd */
    private final C0810a f4450Yd;

    public C8277c(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f4450Yd = aVar;
        this.f4449X = hmlReviewDocumentActivity;
    }

    /* renamed from: sr */
    public final ConnectivityManager get() {
        ConnectivityManager u = this.f4450Yd.mo12022u(this.f4449X.get());
        if (u != null) {
            return u;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public static C8277c m4640b(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C8277c(aVar, hmlReviewDocumentActivity);
    }

    /* renamed from: b */
    public static ConnectivityManager m4639b(C0810a aVar, Context context) {
        ConnectivityManager u = aVar.mo12022u(context);
        if (u != null) {
            return u;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
