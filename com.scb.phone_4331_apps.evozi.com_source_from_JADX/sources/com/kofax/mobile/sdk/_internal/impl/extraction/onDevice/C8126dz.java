package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.content.Context;
import com.kofax.mobile.sdk._internal.impl.extraction.onDevice.C0705ah;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.dz */
public final class C8126dz implements OPRStatusRewardsLandingActivity_ViewBinding<C0705ah.C0706a> {

    /* renamed from: ws */
    private final HmlReviewDocumentActivity<Context> f4105ws;

    public C8126dz(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f4105ws = hmlReviewDocumentActivity;
    }

    /* renamed from: ob */
    public final C0705ah.C0706a get() {
        return new C0705ah.C0706a(this.f4105ws.get());
    }

    /* renamed from: S */
    public static C8126dz m4303S(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C8126dz(hmlReviewDocumentActivity);
    }

    /* renamed from: g */
    public static C0705ah.C0706a m4304g(Context context) {
        return new C0705ah.C0706a(context);
    }
}
