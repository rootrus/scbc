package com.kofax.mobile.sdk.p012ah;

import android.content.Context;
import android.hardware.SensorManager;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.ah.e */
public final class C0835e implements OPRStatusRewardsLandingActivity_ViewBinding<SensorManager> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f2030X;

    /* renamed from: Yd */
    private final C0810a f2031Yd;

    public C0835e(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f2031Yd = aVar;
        this.f2030X = hmlReviewDocumentActivity;
    }

    /* renamed from: st */
    public final SensorManager get() {
        SensorManager s = this.f2031Yd.mo12020s(this.f2030X.get());
        if (s != null) {
            return s;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: d */
    public static C0835e m2086d(C0810a aVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C0835e(aVar, hmlReviewDocumentActivity);
    }

    /* renamed from: d */
    public static SensorManager m2085d(C0810a aVar, Context context) {
        SensorManager s = aVar.mo12020s(context);
        if (s != null) {
            return s;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
