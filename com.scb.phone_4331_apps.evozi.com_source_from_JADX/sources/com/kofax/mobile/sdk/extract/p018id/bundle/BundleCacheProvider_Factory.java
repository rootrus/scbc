package com.kofax.mobile.sdk.extract.p018id.bundle;

import java.io.File;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.extract.id.bundle.BundleCacheProvider_Factory */
public final class BundleCacheProvider_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<BundleCacheProvider> {

    /* renamed from: zE */
    private final HmlReviewDocumentActivity<File> f4894zE;

    public BundleCacheProvider_Factory(HmlReviewDocumentActivity<File> hmlReviewDocumentActivity) {
        this.f4894zE = hmlReviewDocumentActivity;
    }

    public final BundleCacheProvider get() {
        return new BundleCacheProvider(this.f4894zE.get());
    }

    public static BundleCacheProvider_Factory create(HmlReviewDocumentActivity<File> hmlReviewDocumentActivity) {
        return new BundleCacheProvider_Factory(hmlReviewDocumentActivity);
    }
}
