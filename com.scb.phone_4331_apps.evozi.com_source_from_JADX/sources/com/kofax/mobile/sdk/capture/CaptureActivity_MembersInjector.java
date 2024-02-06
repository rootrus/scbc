package com.kofax.mobile.sdk.capture;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk.p013ai.C0854b;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class CaptureActivity_MembersInjector implements MileageQuantitySelectionActivity<CaptureActivity> {

    /* renamed from: Ud */
    private final HmlReviewDocumentActivity<C0854b> f4489Ud;

    /* renamed from: YE */
    private final HmlReviewDocumentActivity<IImageStorage> f4490YE;

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4491YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4492YG;

    /* renamed from: YH */
    private final HmlReviewDocumentActivity<C7921h> f4493YH;

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f4494mR;

    public CaptureActivity_MembersInjector(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6) {
        this.f4489Ud = hmlReviewDocumentActivity;
        this.f4490YE = hmlReviewDocumentActivity2;
        this.f4491YF = hmlReviewDocumentActivity3;
        this.f4494mR = hmlReviewDocumentActivity4;
        this.f4492YG = hmlReviewDocumentActivity5;
        this.f4493YH = hmlReviewDocumentActivity6;
    }

    public static MileageQuantitySelectionActivity<CaptureActivity> create(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6) {
        return new CaptureActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final void injectMembers(CaptureActivity captureActivity) {
        inject_permissionChecker(captureActivity, this.f4489Ud.get());
        inject_imageStorage(captureActivity, this.f4490YE.get());
        inject_imageParamsStore(captureActivity, this.f4491YF.get());
        inject_captureController(captureActivity, this.f4494mR.get());
        inject_buttonsBarView(captureActivity, this.f4492YG.get());
        inject_stringIdGenerator(captureActivity, this.f4493YH.get());
    }

    public static void inject_permissionChecker(CaptureActivity captureActivity, C0854b bVar) {
        captureActivity.f4479Ub = bVar;
    }

    public static void inject_imageStorage(CaptureActivity captureActivity, IImageStorage iImageStorage) {
        captureActivity.f4482Yw = iImageStorage;
    }

    public static void inject_imageParamsStore(CaptureActivity captureActivity, C7898e eVar) {
        captureActivity.f4483Yx = eVar;
    }

    public static void inject_captureController(CaptureActivity captureActivity, C0513a aVar) {
        captureActivity._captureController = aVar;
    }

    public static void inject_buttonsBarView(CaptureActivity captureActivity, C8234b bVar) {
        captureActivity.f4484Yy = bVar;
    }

    public static void inject_stringIdGenerator(CaptureActivity captureActivity, C7921h hVar) {
        captureActivity.f4485Yz = hVar;
    }
}
