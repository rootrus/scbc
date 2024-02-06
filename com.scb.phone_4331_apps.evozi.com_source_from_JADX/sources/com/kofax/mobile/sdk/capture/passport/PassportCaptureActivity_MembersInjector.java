package com.kofax.mobile.sdk.capture.passport;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.CaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.p013ai.C0854b;
import com.kofax.mobile.sdk.p024l.C8430i;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class PassportCaptureActivity_MembersInjector implements MileageQuantitySelectionActivity<PassportCaptureActivity> {

    /* renamed from: Ud */
    private final HmlReviewDocumentActivity<C0854b> f4805Ud;

    /* renamed from: YE */
    private final HmlReviewDocumentActivity<IImageStorage> f4806YE;

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4807YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4808YG;

    /* renamed from: YH */
    private final HmlReviewDocumentActivity<C7921h> f4809YH;

    /* renamed from: Zp */
    private final HmlReviewDocumentActivity<IOverlayView> f4810Zp;

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f4811mR;

    /* renamed from: mT */
    private final HmlReviewDocumentActivity<C8430i> f4812mT;

    public PassportCaptureActivity_MembersInjector(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C8430i> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IOverlayView> hmlReviewDocumentActivity8) {
        this.f4805Ud = hmlReviewDocumentActivity;
        this.f4806YE = hmlReviewDocumentActivity2;
        this.f4807YF = hmlReviewDocumentActivity3;
        this.f4811mR = hmlReviewDocumentActivity4;
        this.f4808YG = hmlReviewDocumentActivity5;
        this.f4809YH = hmlReviewDocumentActivity6;
        this.f4812mT = hmlReviewDocumentActivity7;
        this.f4810Zp = hmlReviewDocumentActivity8;
    }

    public static MileageQuantitySelectionActivity<PassportCaptureActivity> create(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C8430i> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IOverlayView> hmlReviewDocumentActivity8) {
        return new PassportCaptureActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final void injectMembers(PassportCaptureActivity passportCaptureActivity) {
        CaptureActivity_MembersInjector.inject_permissionChecker(passportCaptureActivity, this.f4805Ud.get());
        CaptureActivity_MembersInjector.inject_imageStorage(passportCaptureActivity, this.f4806YE.get());
        CaptureActivity_MembersInjector.inject_imageParamsStore(passportCaptureActivity, this.f4807YF.get());
        CaptureActivity_MembersInjector.inject_captureController(passportCaptureActivity, this.f4811mR.get());
        CaptureActivity_MembersInjector.inject_buttonsBarView(passportCaptureActivity, this.f4808YG.get());
        CaptureActivity_MembersInjector.inject_stringIdGenerator(passportCaptureActivity, this.f4809YH.get());
        inject_adapter(passportCaptureActivity, this.f4812mT.get());
        inject_frameView(passportCaptureActivity, this.f4810Zp.get());
    }

    public static void inject_adapter(PassportCaptureActivity passportCaptureActivity, C8430i iVar) {
        passportCaptureActivity.f4804nj = iVar;
    }

    public static void inject_frameView(PassportCaptureActivity passportCaptureActivity, IOverlayView iOverlayView) {
        passportCaptureActivity.f4803Zo = iOverlayView;
    }
}
