package com.kofax.mobile.sdk.capture.p017id;

import com.kofax.mobile.sdk._internal.C7898e;
import com.kofax.mobile.sdk._internal.C7921h;
import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk._internal.view.C8234b;
import com.kofax.mobile.sdk.capture.CaptureActivity_MembersInjector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.p013ai.C0854b;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdCaptureBackActivity_MembersInjector */
public final class IdCaptureBackActivity_MembersInjector implements MileageQuantitySelectionActivity<IdCaptureBackActivity> {

    /* renamed from: Ud */
    private final HmlReviewDocumentActivity<C0854b> f4736Ud;

    /* renamed from: YE */
    private final HmlReviewDocumentActivity<IImageStorage> f4737YE;

    /* renamed from: YF */
    private final HmlReviewDocumentActivity<C7898e> f4738YF;

    /* renamed from: YG */
    private final HmlReviewDocumentActivity<C8234b> f4739YG;

    /* renamed from: YH */
    private final HmlReviewDocumentActivity<C7921h> f4740YH;

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f4741mR;

    public IdCaptureBackActivity_MembersInjector(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6) {
        this.f4736Ud = hmlReviewDocumentActivity;
        this.f4737YE = hmlReviewDocumentActivity2;
        this.f4738YF = hmlReviewDocumentActivity3;
        this.f4741mR = hmlReviewDocumentActivity4;
        this.f4739YG = hmlReviewDocumentActivity5;
        this.f4740YH = hmlReviewDocumentActivity6;
    }

    public static MileageQuantitySelectionActivity<IdCaptureBackActivity> create(HmlReviewDocumentActivity<C0854b> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IImageStorage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7898e> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C8234b> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<C7921h> hmlReviewDocumentActivity6) {
        return new IdCaptureBackActivity_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6);
    }

    public final void injectMembers(IdCaptureBackActivity idCaptureBackActivity) {
        CaptureActivity_MembersInjector.inject_permissionChecker(idCaptureBackActivity, this.f4736Ud.get());
        CaptureActivity_MembersInjector.inject_imageStorage(idCaptureBackActivity, this.f4737YE.get());
        CaptureActivity_MembersInjector.inject_imageParamsStore(idCaptureBackActivity, this.f4738YF.get());
        CaptureActivity_MembersInjector.inject_captureController(idCaptureBackActivity, this.f4741mR.get());
        CaptureActivity_MembersInjector.inject_buttonsBarView(idCaptureBackActivity, this.f4739YG.get());
        CaptureActivity_MembersInjector.inject_stringIdGenerator(idCaptureBackActivity, this.f4740YH.get());
        inject_stringIdGenerator(idCaptureBackActivity, this.f4740YH.get());
        inject_imageStorage(idCaptureBackActivity, this.f4737YE.get());
        inject_imageParamsStore(idCaptureBackActivity, this.f4738YF.get());
    }

    public static void inject_stringIdGenerator(IdCaptureBackActivity idCaptureBackActivity, C7921h hVar) {
        idCaptureBackActivity.f4735Yz = hVar;
    }

    public static void inject_imageStorage(IdCaptureBackActivity idCaptureBackActivity, IImageStorage iImageStorage) {
        idCaptureBackActivity.f4733Yw = iImageStorage;
    }

    public static void inject_imageParamsStore(IdCaptureBackActivity idCaptureBackActivity, C7898e eVar) {
        idCaptureBackActivity.f4734Yx = eVar;
    }
}
