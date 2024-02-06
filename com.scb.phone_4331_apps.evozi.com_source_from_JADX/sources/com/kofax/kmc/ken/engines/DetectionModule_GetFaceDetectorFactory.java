package com.kofax.kmc.ken.engines;

import com.kofax.mobile.sdk._internal.detection.IFaceDetector;
import com.kofax.mobile.sdk._internal.impl.detection.C7944e;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class DetectionModule_GetFaceDetectorFactory implements OPRStatusRewardsLandingActivity_ViewBinding<IFaceDetector> {

    /* renamed from: B */
    private final DetectionModule f3305B;

    /* renamed from: C */
    private final HmlReviewDocumentActivity<C7944e> f3306C;

    public DetectionModule_GetFaceDetectorFactory(DetectionModule detectionModule, HmlReviewDocumentActivity<C7944e> hmlReviewDocumentActivity) {
        this.f3305B = detectionModule;
        this.f3306C = hmlReviewDocumentActivity;
    }

    public final IFaceDetector get() {
        IFaceDetector a = this.f3305B.mo10029a(this.f3306C.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static DetectionModule_GetFaceDetectorFactory create(DetectionModule detectionModule, HmlReviewDocumentActivity<C7944e> hmlReviewDocumentActivity) {
        return new DetectionModule_GetFaceDetectorFactory(detectionModule, hmlReviewDocumentActivity);
    }

    public static IFaceDetector proxyGetFaceDetector(DetectionModule detectionModule, C7944e eVar) {
        IFaceDetector a = detectionModule.mo10029a(eVar);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
