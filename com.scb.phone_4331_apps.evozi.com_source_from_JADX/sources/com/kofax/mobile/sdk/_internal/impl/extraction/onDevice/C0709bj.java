package com.kofax.mobile.sdk._internal.impl.extraction.onDevice;

import com.kofax.mobile.sdk.extract.p018id.bundle.BundleCacheProvider;
import com.kofax.mobile.sdk.extract.p018id.bundle.IBundleCacheProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk._internal.impl.extraction.onDevice.bj */
public final class C0709bj implements OPRStatusRewardsLandingActivity_ViewBinding<IBundleCacheProvider> {

    /* renamed from: LV */
    private final C0705ah f1645LV;

    /* renamed from: ad */
    private final HmlReviewDocumentActivity<BundleCacheProvider> f1646ad;

    public C0709bj(C0705ah ahVar, HmlReviewDocumentActivity<BundleCacheProvider> hmlReviewDocumentActivity) {
        this.f1645LV = ahVar;
        this.f1646ad = hmlReviewDocumentActivity;
    }

    /* renamed from: ny */
    public final IBundleCacheProvider get() {
        IBundleCacheProvider a = this.f1645LV.mo11721a(this.f1646ad.get());
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: s */
    public static C0709bj m1594s(C0705ah ahVar, HmlReviewDocumentActivity<BundleCacheProvider> hmlReviewDocumentActivity) {
        return new C0709bj(ahVar, hmlReviewDocumentActivity);
    }

    /* renamed from: a */
    public static IBundleCacheProvider m1593a(C0705ah ahVar, BundleCacheProvider bundleCacheProvider) {
        IBundleCacheProvider a = ahVar.mo11721a(bundleCacheProvider);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
