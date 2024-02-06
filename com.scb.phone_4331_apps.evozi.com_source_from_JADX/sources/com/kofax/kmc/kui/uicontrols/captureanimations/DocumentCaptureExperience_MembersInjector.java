package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.capture.C0513a;
import com.kofax.mobile.sdk.p024l.C0967f;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class DocumentCaptureExperience_MembersInjector implements MileageQuantitySelectionActivity<DocumentCaptureExperience> {

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f698mR;

    /* renamed from: mS */
    private final HmlReviewDocumentActivity<IDocumentBaseOverlayView> f699mS;

    /* renamed from: mT */
    private final HmlReviewDocumentActivity<C0967f> f700mT;

    public DocumentCaptureExperience_MembersInjector(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0967f> hmlReviewDocumentActivity3) {
        this.f698mR = hmlReviewDocumentActivity;
        this.f699mS = hmlReviewDocumentActivity2;
        this.f700mT = hmlReviewDocumentActivity3;
    }

    public static MileageQuantitySelectionActivity<DocumentCaptureExperience> create(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C0967f> hmlReviewDocumentActivity3) {
        return new DocumentCaptureExperience_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final void injectMembers(DocumentCaptureExperience documentCaptureExperience) {
        DocumentBaseCaptureExperience_MembersInjector.inject_captureController(documentCaptureExperience, this.f698mR.get());
        DocumentBaseCaptureExperience_MembersInjector.inject_overlayViewInternal(documentCaptureExperience, this.f699mS.get());
        inject_adapter(documentCaptureExperience, this.f700mT.get());
    }

    public static void inject_adapter(DocumentCaptureExperience documentCaptureExperience, C0967f fVar) {
        documentCaptureExperience.f696ne = fVar;
    }
}
