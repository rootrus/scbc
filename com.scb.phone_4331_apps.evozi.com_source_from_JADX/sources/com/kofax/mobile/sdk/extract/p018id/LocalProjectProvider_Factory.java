package com.kofax.mobile.sdk.extract.p018id;

import android.content.Context;
import com.kofax.mobile.sdk.extract.p018id.bundle.IBundleCacheProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

/* renamed from: com.kofax.mobile.sdk.extract.id.LocalProjectProvider_Factory */
public final class LocalProjectProvider_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<LocalProjectProvider> {
    private final HmlReviewDocumentActivity<IBundleCacheProvider> aem;

    /* renamed from: ws */
    private final HmlReviewDocumentActivity<Context> f4882ws;

    public LocalProjectProvider_Factory(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBundleCacheProvider> hmlReviewDocumentActivity2) {
        this.f4882ws = hmlReviewDocumentActivity;
        this.aem = hmlReviewDocumentActivity2;
    }

    public final LocalProjectProvider get() {
        LocalProjectProvider localProjectProvider = new LocalProjectProvider(this.f4882ws.get());
        LocalProjectProvider_MembersInjector.inject_cacheProvider(localProjectProvider, this.aem.get());
        return localProjectProvider;
    }

    public static LocalProjectProvider_Factory create(HmlReviewDocumentActivity<Context> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBundleCacheProvider> hmlReviewDocumentActivity2) {
        return new LocalProjectProvider_Factory(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public static LocalProjectProvider newLocalProjectProvider(Context context) {
        return new LocalProjectProvider(context);
    }
}
