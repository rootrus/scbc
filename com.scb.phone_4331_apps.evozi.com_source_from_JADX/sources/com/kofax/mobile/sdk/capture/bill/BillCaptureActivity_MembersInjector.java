package com.kofax.mobile.sdk.capture.bill;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.CaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.p013ai.C0854b;
import com.kofax.mobile.sdk.p024l.C0967f;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class BillCaptureActivity_MembersInjector implements MileageQuantitySelectionActivity<BillCaptureActivity> {

    /* renamed from: Ud */
    private final HmlReviewDocumentActivity<C0854b> f4552Ud;

    /* renamed from: YE */
    private final HmlReviewDocumentActivity<IImageStorage> f4553YE;

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4554YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4555YG;

    /* renamed from: YH */
    private final HmlReviewDocumentActivity<C7921h> f4556YH;

    /* renamed from: Zp */
    private final HmlReviewDocumentActivity<IOverlayView> f4557Zp;

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f4558mR;

    /* renamed from: mT */
    private final HmlReviewDocumentActivity<C0967f> f4559mT;

    public BillCaptureActivity_MembersInjector(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0967f> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IOverlayView> hmlReviewDocumentActivity8) {
        this.f4552Ud = hmlReviewDocumentActivity;
        this.f4553YE = hmlReviewDocumentActivity2;
        this.f4554YF = hmlReviewDocumentActivity3;
        this.f4558mR = hmlReviewDocumentActivity4;
        this.f4555YG = hmlReviewDocumentActivity5;
        this.f4556YH = hmlReviewDocumentActivity6;
        this.f4559mT = hmlReviewDocumentActivity7;
        this.f4557Zp = hmlReviewDocumentActivity8;
    }

    public static MileageQuantitySelectionActivity<BillCaptureActivity> create(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C0967f> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IOverlayView> hmlReviewDocumentActivity8) {
        return new BillCaptureActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final void injectMembers(BillCaptureActivity billCaptureActivity) {
        CaptureActivity_MembersInjector.inject_permissionChecker(billCaptureActivity, this.f4552Ud.get());
        CaptureActivity_MembersInjector.inject_imageStorage(billCaptureActivity, this.f4553YE.get());
        CaptureActivity_MembersInjector.inject_imageParamsStore(billCaptureActivity, this.f4554YF.get());
        CaptureActivity_MembersInjector.inject_captureController(billCaptureActivity, this.f4558mR.get());
        CaptureActivity_MembersInjector.inject_buttonsBarView(billCaptureActivity, this.f4555YG.get());
        CaptureActivity_MembersInjector.inject_stringIdGenerator(billCaptureActivity, this.f4556YH.get());
        inject_adapter(billCaptureActivity, this.f4559mT.get());
        inject_frameView(billCaptureActivity, this.f4557Zp.get());
    }

    public static void inject_adapter(BillCaptureActivity billCaptureActivity, C0967f fVar) {
        billCaptureActivity.f4551ne = fVar;
    }

    public static void inject_frameView(BillCaptureActivity billCaptureActivity, IOverlayView iOverlayView) {
        billCaptureActivity.f4550Zo = iOverlayView;
    }
}
