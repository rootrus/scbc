package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.capture.C7895f;
import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import com.kofax.mobile.sdk._internal.view.C8238n;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class SelfieCaptureExperience_MembersInjector implements MileageQuantitySelectionActivity<SelfieCaptureExperience> {

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C7895f> f3588mR;

    /* renamed from: mS */
    private final HmlReviewDocumentActivity<C8238n> f3589mS;

    /* renamed from: nr */
    private final HmlReviewDocumentActivity<IFaceDetector> f3590nr;

    public SelfieCaptureExperience_MembersInjector(HmlReviewDocumentActivity<C7895f> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8238n> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IFaceDetector> hmlReviewDocumentActivity3) {
        this.f3588mR = hmlReviewDocumentActivity;
        this.f3589mS = hmlReviewDocumentActivity2;
        this.f3590nr = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<SelfieCaptureExperience> create(HmlReviewDocumentActivity<C7895f> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C8238n> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<IFaceDetector> hmlReviewDocumentActivity3) {
        return new SelfieCaptureExperience_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(SelfieCaptureExperience selfieCaptureExperience) {
        SelfieBaseCaptureExperience_MembersInjector.inject_captureController(selfieCaptureExperience, this.f3588mR.get());
        SelfieBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(selfieCaptureExperience, this.f3589mS.get());
        inject_detector(selfieCaptureExperience, this.f3590nr.get());
    }

    public static void inject_detector(SelfieCaptureExperience selfieCaptureExperience, IFaceDetector iFaceDetector) {
        selfieCaptureExperience.f3585np = iFaceDetector;
    }
}
