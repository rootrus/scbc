package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.mobile.sdk._internal.IBus;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.l */
public final class C7934l implements OPRStatusRewardsLandingActivity_ViewBinding<FocusStatistics> {

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f3675wu;

    public C7934l(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity) {
        this.f3675wu = hmlReviewDocumentActivity;
    }

    /* renamed from: kD */
    public final FocusStatistics get() {
        return new FocusStatistics(this.f3675wu.get());
    }

    /* renamed from: x */
    public static C7934l m3891x(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity) {
        return new C7934l(hmlReviewDocumentActivity);
    }
}
