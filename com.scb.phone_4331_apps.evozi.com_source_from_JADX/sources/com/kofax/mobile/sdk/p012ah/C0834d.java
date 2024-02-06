package com.kofax.mobile.sdk.p012ah;

import android.content.Context;
import android.location.LocationManager;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.d */
public final class C0834d implements OPRStatusRewardsLandingActivity_ViewBinding<LocationManager> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f2028X;

    /* renamed from: Yd */
    private final C0810a f2029Yd;

    public C0834d(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f2029Yd = aVar;
        this.f2028X = hmlReviewDocumentActivity;
    }

    /* renamed from: ss */
    public final LocationManager get() {
        LocationManager t = this.f2029Yd.mo12021t(this.f2028X.get());
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public static C0834d m2083c(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C0834d(aVar, hmlReviewDocumentActivity);
    }

    /* renamed from: c */
    public static LocationManager m2082c(C0810a aVar, Context context) {
        LocationManager t = aVar.mo12021t(context);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
