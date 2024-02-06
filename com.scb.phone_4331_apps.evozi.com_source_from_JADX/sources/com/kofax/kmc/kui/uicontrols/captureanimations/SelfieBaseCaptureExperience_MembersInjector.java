package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.capture.C7895f;
import com.kofax.mobile.sdk._internal.view.C8238n;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class SelfieBaseCaptureExperience_MembersInjector implements MileageQuantitySelectionActivity<SelfieBaseCaptureExperience> {

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C7895f> f3583mR;

    /* renamed from: mS */
    private final HmlReviewDocumentActivity<C8238n> f3584mS;

    public SelfieBaseCaptureExperience_MembersInjector(HmlReviewDocumentActivity<C7895f> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8238n> hmlReviewDocumentActivity2) {
        this.f3583mR = hmlReviewDocumentActivity;
        this.f3584mS = hmlReviewDocumentActivity2;
    }

    public static MileageQuantitySelectionActivity<SelfieBaseCaptureExperience> create(HmlReviewDocumentActivity<C7895f> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8238n> hmlReviewDocumentActivity2) {
        return new SelfieBaseCaptureExperience_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final void injectMembers(SelfieBaseCaptureExperience selfieBaseCaptureExperience) {
        inject_captureController(selfieBaseCaptureExperience, this.f3583mR.get());
        inject_overlayViewInternal(selfieBaseCaptureExperience, this.f3584mS.get());
    }

    public static void inject_captureController(SelfieBaseCaptureExperience selfieBaseCaptureExperience, C7895f fVar) {
        selfieBaseCaptureExperience.f3581nn = fVar;
    }

    public static void inject_overlayViewInternal(SelfieBaseCaptureExperience selfieBaseCaptureExperience, C8238n nVar) {
        selfieBaseCaptureExperience.f3582no = nVar;
    }
}
