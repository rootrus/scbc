package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import com.kofax.mobile.sdk._internal.view.C0769a;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.al */
public final class C8212al implements OPRStatusRewardsLandingActivity_ViewBinding<C8211ak> {

    /* renamed from: FD */
    private final HmlReviewDocumentActivity<C0769a> f4315FD;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4316X;

    public C8212al(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity2) {
        this.f4316X = hmlReviewDocumentActivity;
        this.f4315FD = hmlReviewDocumentActivity2;
    }

    /* renamed from: sk */
    public final C8211ak get() {
        C8211ak akVar = new C8211ak(this.f4316X.get());
        C8213am.m4502a(akVar, this.f4315FD.get());
        return akVar;
    }

    /* renamed from: G */
    public static C8212al m4499G(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0769a> hmlReviewDocumentActivity2) {
        return new C8212al(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    /* renamed from: n */
    public static C8211ak m4500n(Context context) {
        return new C8211ak(context);
    }
}
