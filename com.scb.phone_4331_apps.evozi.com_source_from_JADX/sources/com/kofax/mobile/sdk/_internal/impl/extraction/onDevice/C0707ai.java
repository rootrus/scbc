package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.android.abc.image_classification.ImageClassifier;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.ai */
public final class C0707ai implements OPRStatusRewardsLandingActivity_ViewBinding<ImageClassifier> {

    /* renamed from: LV */
    private final C0705ah f1642LV;

    public C0707ai(C0705ah ahVar) {
        this.f1642LV = ahVar;
    }

    /* renamed from: no */
    public final ImageClassifier get() {
        ImageClassifier nn = this.f1642LV.mo11733nn();
        if (nn != null) {
            return nn;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public static C0707ai m1587a(C0705ah ahVar) {
        return new C0707ai(ahVar);
    }

    /* renamed from: b */
    public static ImageClassifier m1588b(C0705ah ahVar) {
        ImageClassifier nn = ahVar.mo11733nn();
        if (nn != null) {
            return nn;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
