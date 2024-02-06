package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.extract.p018id.IIdExtractor;
import com.kofax.mobile.sdk.extract.p018id.OnDeviceIdExtractor;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.du */
public final class C8122du implements OPRStatusRewardsLandingActivity_ViewBinding<IIdExtractor> {

    /* renamed from: LV */
    private final C0705ah f4096LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<OnDeviceIdExtractor> f4097ad;

    public C8122du(C0705ah ahVar, HmlReviewDocumentActivity<OnDeviceIdExtractor> hmlReviewDocumentActivity) {
        this.f4096LV = ahVar;
        this.f4097ad = hmlReviewDocumentActivity;
    }

    /* renamed from: hp */
    public final IIdExtractor get() {
        IIdExtractor b = this.f4096LV.mo11729b(this.f4097ad.get());
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: ag */
    public static C8122du m4292ag(C0705ah ahVar, HmlReviewDocumentActivity<OnDeviceIdExtractor> hmlReviewDocumentActivity) {
        return new C8122du(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IIdExtractor m4291a(C0705ah ahVar, OnDeviceIdExtractor onDeviceIdExtractor) {
        IIdExtractor b = ahVar.mo11729b(onDeviceIdExtractor);
        if (b != null) {
            return b;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
