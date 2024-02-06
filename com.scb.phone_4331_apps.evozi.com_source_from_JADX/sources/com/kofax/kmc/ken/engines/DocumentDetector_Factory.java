package com.kofax.kmc.ken.engines;

import android.content.Context;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class DocumentDetector_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<DocumentDetector> {

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f3309X;

    public DocumentDetector_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f3309X = hmlReviewDocumentActivity;
    }

    public final DocumentDetector get() {
        return new DocumentDetector(this.f3309X.get());
    }

    public static DocumentDetector_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new DocumentDetector_Factory(hmlReviewDocumentActivity);
    }
}
