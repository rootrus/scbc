package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk.p024l.C8426d;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class FixedAspectRatioCaptureExperience_MembersInjector implements MileageQuantitySelectionActivity<FixedAspectRatioCaptureExperience> {

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f3555mR;

    /* renamed from: mS */
    private final HmlReviewDocumentActivity<IDocumentBaseOverlayView> f3556mS;

    /* renamed from: mT */
    private final HmlReviewDocumentActivity<C8426d> f3557mT;

    public FixedAspectRatioCaptureExperience_MembersInjector(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8426d> hmlReviewDocumentActivity3) {
        this.f3555mR = hmlReviewDocumentActivity;
        this.f3556mS = hmlReviewDocumentActivity2;
        this.f3557mT = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<FixedAspectRatioCaptureExperience> create(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C8426d> hmlReviewDocumentActivity3) {
        return new FixedAspectRatioCaptureExperience_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(FixedAspectRatioCaptureExperience fixedAspectRatioCaptureExperience) {
        DocumentBaseCaptureExperience_MembersInjector.inject_captureController(fixedAspectRatioCaptureExperience, this.f3555mR.get());
        DocumentBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(fixedAspectRatioCaptureExperience, this.f3556mS.get());
        inject_adapter(fixedAspectRatioCaptureExperience, this.f3557mT.get());
    }

    public static void inject_adapter(FixedAspectRatioCaptureExperience fixedAspectRatioCaptureExperience, C8426d dVar) {
        fixedAspectRatioCaptureExperience.f3554nh = dVar;
    }
}
