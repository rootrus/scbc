package com.kofax.mobile.sdk._internal.impl.camera.focus;

import com.kofax.kmc.ken.engines.gpu.GPUStrategyFocusFactorDetection;
import com.kofax.mobile.sdk._internal.IBus;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.focus.j */
public final class C0596j implements OPRStatusRewardsLandingActivity_ViewBinding<C0592i> {

    /* renamed from: Ew */
    private final HmlReviewDocumentActivity<C0597k> f1410Ew;

    /* renamed from: Ex */
    private final HmlReviewDocumentActivity<GPUStrategyFocusFactorDetection> f1411Ex;

    /* renamed from: wu */
    private final HmlReviewDocumentActivity<IBus> f1412wu;

    public C0596j(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0597k> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<GPUStrategyFocusFactorDetection> hmlReviewDocumentActivity3) {
        this.f1412wu = hmlReviewDocumentActivity;
        this.f1410Ew = hmlReviewDocumentActivity2;
        this.f1411Ex = hmlReviewDocumentActivity3;
    }

    /* renamed from: kA */
    public final C0592i get() {
        return new C0592i(this.f1412wu.get(), this.f1410Ew.get(), this.f1411Ex);
    }

    /* renamed from: b */
    public static C0596j m1294b(HmlReviewDocumentActivity<IBus> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C0597k> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<GPUStrategyFocusFactorDetection> hmlReviewDocumentActivity3) {
        return new C0596j(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    /* renamed from: a */
    public static C0592i m1293a(IBus iBus, C0597k kVar, HmlReviewDocumentActivity<GPUStrategyFocusFactorDetection> hmlReviewDocumentActivity) {
        return new C0592i(iBus, kVar, hmlReviewDocumentActivity);
    }
}
