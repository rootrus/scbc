package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.b */
public final class C8055b implements OPRStatusRewardsLandingActivity_ViewBinding<C0704a> {

    /* renamed from: ws */
    private final HmlReviewDocumentActivity<Context> f3931ws;

    public C8055b(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f3931ws = hmlReviewDocumentActivity;
    }

    /* renamed from: mQ */
    public final C0704a get() {
        return new C0704a(this.f3931ws.get());
    }

    /* renamed from: N */
    public static C8055b m4091N(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C8055b(hmlReviewDocumentActivity);
    }
}
