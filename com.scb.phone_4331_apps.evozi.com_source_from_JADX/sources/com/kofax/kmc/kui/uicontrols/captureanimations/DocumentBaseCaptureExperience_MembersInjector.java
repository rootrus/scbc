package com.kofax.kmc.kui.uicontrols.captureanimations;

import com.kofax.mobile.sdk._internal.capture.C0513a;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

public final class DocumentBaseCaptureExperience_MembersInjector implements MileageQuantitySelectionActivity<DocumentBaseCaptureExperience> {

    /* renamed from: mR */
    private final HmlReviewDocumentActivity<C0513a> f685mR;

    /* renamed from: mS */
    private final HmlReviewDocumentActivity<IDocumentBaseOverlayView> f686mS;

    public DocumentBaseCaptureExperience_MembersInjector(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2) {
        this.f685mR = hmlReviewDocumentActivity;
        this.f686mS = hmlReviewDocumentActivity2;
    }

    public static MileageQuantitySelectionActivity<DocumentBaseCaptureExperience> create(HmlReviewDocumentActivity<C0513a> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IDocumentBaseOverlayView> hmlReviewDocumentActivity2) {
        return new DocumentBaseCaptureExperience_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final void injectMembers(DocumentBaseCaptureExperience documentBaseCaptureExperience) {
        inject_captureController(documentBaseCaptureExperience, this.f685mR.get());
        inject_overlayViewInternal(documentBaseCaptureExperience, this.f686mS.get());
    }

    public static void inject_captureController(DocumentBaseCaptureExperience documentBaseCaptureExperience, C0513a aVar) {
        documentBaseCaptureExperience._captureController = aVar;
    }

    public static void inject_overlayViewInternal(DocumentBaseCaptureExperience documentBaseCaptureExperience, IDocumentBaseOverlayView iDocumentBaseOverlayView) {
        documentBaseCaptureExperience._overlayViewInternal = iDocumentBaseOverlayView;
    }
}
