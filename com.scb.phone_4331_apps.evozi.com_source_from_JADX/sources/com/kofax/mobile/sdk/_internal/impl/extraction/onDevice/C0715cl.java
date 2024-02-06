package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import android.content.Context;
import com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.cl */
public final class C0715cl implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider> {

    /* renamed from: LV */
    private final C0705ah f1659LV;

    /* renamed from: X */
    private final HmlReviewDocumentActivity<Context> f1660X;

    public C0715cl(C0705ah ahVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        this.f1659LV = ahVar;
        this.f1660X = hmlReviewDocumentActivity;
    }

    public final LocalProjectProvider get() {
        LocalProjectProvider e = this.f1659LV.mo11731e(this.f1660X.get());
        if (e != null) {
            return e;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: K */
    public static C0715cl m1611K(C0705ah ahVar, HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity) {
        return new C0715cl(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: b */
    public static LocalProjectProvider m1612b(C0705ah ahVar, Context context) {
        LocalProjectProvider e = ahVar.mo11731e(context);
        if (e != null) {
            return e;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
