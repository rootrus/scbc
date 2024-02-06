package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk._internal.view.IOverlayView;
import com.kofax.mobile.sdk.capture.CaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.p013ai.C0854b;
import com.kofax.mobile.sdk.p024l.C8426d;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureActivity_MembersInjector */
public final class IdCaptureActivity_MembersInjector implements MileageQuantitySelectionActivity<IdCaptureActivity> {

    /* renamed from: Ud */
    private final HmlReviewDocumentActivity<C0854b> f4725Ud;

    /* renamed from: YE */
    private final HmlReviewDocumentActivity<IImageStorage> f4726YE;

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4727YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4728YG;

    /* renamed from: YH */
    private final HmlReviewDocumentActivity<C7921h> f4729YH;

    /* renamed from: Zp */
    private final HmlReviewDocumentActivity<IOverlayView> f4730Zp;

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f4731mR;

    /* renamed from: mT */
    private final HmlReviewDocumentActivity<C8426d> f4732mT;

    public IdCaptureActivity_MembersInjector(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C8426d> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IOverlayView> hmlReviewDocumentActivity8) {
        this.f4725Ud = hmlReviewDocumentActivity;
        this.f4726YE = hmlReviewDocumentActivity2;
        this.f4727YF = hmlReviewDocumentActivity3;
        this.f4731mR = hmlReviewDocumentActivity4;
        this.f4728YG = hmlReviewDocumentActivity5;
        this.f4729YH = hmlReviewDocumentActivity6;
        this.f4732mT = hmlReviewDocumentActivity7;
        this.f4730Zp = hmlReviewDocumentActivity8;
    }

    public static MileageQuantitySelectionActivity<IdCaptureActivity> create(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<C8426d> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<IOverlayView> hmlReviewDocumentActivity8) {
        return new IdCaptureActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8);
    }

    public final void injectMembers(IdCaptureActivity idCaptureActivity) {
        CaptureActivity_MembersInjector.inject_permissionChecker(idCaptureActivity, this.f4725Ud.get());
        CaptureActivity_MembersInjector.inject_imageStorage(idCaptureActivity, this.f4726YE.get());
        CaptureActivity_MembersInjector.inject_imageParamsStore(idCaptureActivity, this.f4727YF.get());
        CaptureActivity_MembersInjector.inject_captureController(idCaptureActivity, this.f4731mR.get());
        CaptureActivity_MembersInjector.inject_buttonsBarView(idCaptureActivity, this.f4728YG.get());
        CaptureActivity_MembersInjector.inject_stringIdGenerator(idCaptureActivity, this.f4729YH.get());
        inject_adapter(idCaptureActivity, this.f4732mT.get());
        inject_frameView(idCaptureActivity, this.f4730Zp.get());
    }

    public static void inject_adapter(IdCaptureActivity idCaptureActivity, C8426d dVar) {
        idCaptureActivity.f4724nh = dVar;
    }

    public static void inject_frameView(IdCaptureActivity idCaptureActivity, IOverlayView iOverlayView) {
        idCaptureActivity.f4723Zo = iOverlayView;
    }
}
