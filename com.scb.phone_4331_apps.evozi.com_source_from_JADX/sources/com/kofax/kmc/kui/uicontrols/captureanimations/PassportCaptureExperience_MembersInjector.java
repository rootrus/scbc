package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk.p024l.C8430i;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class PassportCaptureExperience_MembersInjector implements MileageQuantitySelectionActivity<PassportCaptureExperience> {

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f3577mR;

    /* renamed from: mS */
    private final HmlReviewDocumentActivity<IDocumentBaseOverlayView> f3578mS;

    /* renamed from: mT */
    private final HmlReviewDocumentActivity<C8430i> f3579mT;

    public PassportCaptureExperience_MembersInjector(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8430i> hmlReviewDocumentActivity3) {
        this.f3577mR = hmlReviewDocumentActivity;
        this.f3578mS = hmlReviewDocumentActivity2;
        this.f3579mT = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<PassportCaptureExperience> create(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8430i> hmlReviewDocumentActivity3) {
        return new PassportCaptureExperience_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(PassportCaptureExperience passportCaptureExperience) {
        DocumentBaseCaptureExperience_MembersInjector.inject_captureController(passportCaptureExperience, this.f3577mR.get());
        DocumentBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(passportCaptureExperience, this.f3578mS.get());
        inject_adapter(passportCaptureExperience, this.f3579mT.get());
    }

    public static void inject_adapter(PassportCaptureExperience passportCaptureExperience, C8430i iVar) {
        passportCaptureExperience.f3574nj = iVar;
    }
}
