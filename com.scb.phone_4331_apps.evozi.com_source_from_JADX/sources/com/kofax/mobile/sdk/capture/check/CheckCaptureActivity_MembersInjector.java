package com.kofax.mobile.sdk.capture.check;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.CaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.p013ai.C0854b;
import com.kofax.mobile.sdk.p024l.C8424a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class CheckCaptureActivity_MembersInjector implements MileageQuantitySelectionActivity<CheckCaptureActivity> {

    /* renamed from: Ud */
    private final HmlReviewDocumentActivity<C0854b> f4644Ud;

    /* renamed from: YE */
    private final HmlReviewDocumentActivity<IImageStorage> f4645YE;

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4646YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4647YG;

    /* renamed from: YH */
    private final HmlReviewDocumentActivity<C7921h> f4648YH;

    /* renamed from: Zp */
    private final HmlReviewDocumentActivity<IOverlayView> f4649Zp;

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f4650mR;

    /* renamed from: mT */
    private final HmlReviewDocumentActivity<C8424a> f4651mT;

    public CheckCaptureActivity_MembersInjector(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C8424a> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IOverlayView> hmlReviewDocumentActivity8) {
        this.f4644Ud = hmlReviewDocumentActivity;
        this.f4645YE = hmlReviewDocumentActivity2;
        this.f4646YF = hmlReviewDocumentActivity3;
        this.f4650mR = hmlReviewDocumentActivity4;
        this.f4647YG = hmlReviewDocumentActivity5;
        this.f4648YH = hmlReviewDocumentActivity6;
        this.f4651mT = hmlReviewDocumentActivity7;
        this.f4649Zp = hmlReviewDocumentActivity8;
    }

    public static MileageQuantitySelectionActivity<CheckCaptureActivity> create(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C8424a> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IOverlayView> hmlReviewDocumentActivity8) {
        return new CheckCaptureActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final void injectMembers(CheckCaptureActivity checkCaptureActivity) {
        CaptureActivity_MembersInjector.inject_permissionChecker(checkCaptureActivity, this.f4644Ud.get());
        CaptureActivity_MembersInjector.inject_imageStorage(checkCaptureActivity, this.f4645YE.get());
        CaptureActivity_MembersInjector.inject_imageParamsStore(checkCaptureActivity, this.f4646YF.get());
        CaptureActivity_MembersInjector.inject_captureController(checkCaptureActivity, this.f4650mR.get());
        CaptureActivity_MembersInjector.inject_buttonsBarView(checkCaptureActivity, this.f4647YG.get());
        CaptureActivity_MembersInjector.inject_stringIdGenerator(checkCaptureActivity, this.f4648YH.get());
        inject_adapter(checkCaptureActivity, this.f4651mT.get());
        inject_frameView(checkCaptureActivity, this.f4649Zp.get());
        inject_imageStorage(checkCaptureActivity, this.f4645YE.get());
    }

    public static void inject_adapter(CheckCaptureActivity checkCaptureActivity, C8424a aVar) {
        checkCaptureActivity.f4643mO = aVar;
    }

    public static void inject_frameView(CheckCaptureActivity checkCaptureActivity, IOverlayView iOverlayView) {
        checkCaptureActivity.f4642Zo = iOverlayView;
    }

    public static void inject_imageStorage(CheckCaptureActivity checkCaptureActivity, IImageStorage iImageStorage) {
        checkCaptureActivity.f4641Yw = iImageStorage;
    }
}
