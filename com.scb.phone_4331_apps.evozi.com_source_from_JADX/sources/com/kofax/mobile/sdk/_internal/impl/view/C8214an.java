package com.kofax.mobile.sdk._internal.impl.view;

import android.content.Context;
import com.kofax.mobile.sdk._internal.view.C0770c;
import com.kofax.mobile.sdk._internal.view.C0772e;
import com.kofax.mobile.sdk._internal.view.C8237m;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.view.an */
public final class C8214an implements OPRStatusRewardsLandingActivity_ViewBinding<SelfieOverlayView> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f4318X;

    /* renamed from: XW */
    private final HmlReviewDocumentActivity<C8237m> f4319XW;

    /* renamed from: mX */
    private final HmlReviewDocumentActivity<C0770c> f4320mX;

    /* renamed from: mZ */
    private final HmlReviewDocumentActivity<C0772e> f4321mZ;

    public C8214an(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8237m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity4) {
        this.f4318X = hmlReviewDocumentActivity;
        this.f4319XW = hmlReviewDocumentActivity2;
        this.f4320mX = hmlReviewDocumentActivity3;
        this.f4321mZ = hmlReviewDocumentActivity4;
    }

    /* renamed from: sl */
    public final SelfieOverlayView get() {
        SelfieOverlayView selfieOverlayView = new SelfieOverlayView(this.f4318X.get());
        C8215ao.m4509a(selfieOverlayView, this.f4319XW.get());
        C8215ao.m4507a(selfieOverlayView, this.f4320mX.get());
        C8215ao.m4508a(selfieOverlayView, this.f4321mZ.get());
        return selfieOverlayView;
    }

    /* renamed from: b */
    public static C8214an m4504b(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8237m> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0770c> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0772e> hmlReviewDocumentActivity4) {
        return new C8214an(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    /* renamed from: o */
    public static SelfieOverlayView m4505o(Context context) {
        return new SelfieOverlayView(context);
    }
}
