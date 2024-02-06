package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk.p024l.C8424a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class CheckCaptureExperience_MembersInjector implements MileageQuantitySelectionActivity<CheckCaptureExperience> {

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f3543mR;

    /* renamed from: mS */
    private final HmlReviewDocumentActivity<IDocumentBaseOverlayView> f3544mS;

    /* renamed from: mT */
    private final HmlReviewDocumentActivity<C8424a> f3545mT;

    public CheckCaptureExperience_MembersInjector(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8424a> hmlReviewDocumentActivity3) {
        this.f3543mR = hmlReviewDocumentActivity;
        this.f3544mS = hmlReviewDocumentActivity2;
        this.f3545mT = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<CheckCaptureExperience> create(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8424a> hmlReviewDocumentActivity3) {
        return new CheckCaptureExperience_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(CheckCaptureExperience checkCaptureExperience) {
        DocumentBaseCaptureExperience_MembersInjector.inject_captureController(checkCaptureExperience, this.f3543mR.get());
        DocumentBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(checkCaptureExperience, this.f3544mS.get());
        inject_adapter(checkCaptureExperience, this.f3545mT.get());
    }

    public static void inject_adapter(CheckCaptureExperience checkCaptureExperience, C8424a aVar) {
        checkCaptureExperience.f3540mO = aVar;
    }
}
