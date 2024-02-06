package com.kofax.kmc.ken.engines;

import com.kofax.kmc.ken.engines.data.DocumentDetectionResult;
import com.kofax.kmc.ken.engines.data.DocumentDetectionSettings;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class IsgDetectionModule_GetForcedDocumentDetectorFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult>> {

    /* renamed from: ac */
    private final HmlReviewDocumentActivity<C0441e> f146ac;

    /* renamed from: bH */
    private final IsgDetectionModule f147bH;

    public IsgDetectionModule_GetForcedDocumentDetectorFactory(IsgDetectionModule isgDetectionModule, HmlReviewDocumentActivity<C0441e> hmlReviewDocumentActivity) {
        this.f147bH = isgDetectionModule;
        this.f146ac = hmlReviewDocumentActivity;
    }

    public final IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> get() {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = this.f147bH.mo10103a(this.f146ac.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static IsgDetectionModule_GetForcedDocumentDetectorFactory create(IsgDetectionModule isgDetectionModule, HmlReviewDocumentActivity<C0441e> hmlReviewDocumentActivity) {
        return new IsgDetectionModule_GetForcedDocumentDetectorFactory(isgDetectionModule, hmlReviewDocumentActivity);
    }

    public static IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> proxyGetForcedDocumentDetector(IsgDetectionModule isgDetectionModule, Object obj) {
        IDocumentDetector<DocumentDetectionSettings, DocumentDetectionResult> a = isgDetectionModule.mo10103a((C0441e) obj);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
