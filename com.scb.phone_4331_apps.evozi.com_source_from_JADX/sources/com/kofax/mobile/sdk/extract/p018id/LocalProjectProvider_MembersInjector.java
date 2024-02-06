package com.kofax.mobile.sdk.extract.p018id;

import com.kofax.mobile.sdk.extract.p018id.bundle.IBundleCacheProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.extract.id.LocalProjectProvider_MembersInjector */
public final class LocalProjectProvider_MembersInjector implements MileageQuantitySelectionActivity<LocalProjectProvider> {
    private final HmlReviewDocumentActivity<IBundleCacheProvider> aem;

    public LocalProjectProvider_MembersInjector(HmlReviewDocumentActivity<IBundleCacheProvider> hmlReviewDocumentActivity) {
        this.aem = hmlReviewDocumentActivity;
    }

    public static MileageQuantitySelectionActivity<LocalProjectProvider> create(HmlReviewDocumentActivity<IBundleCacheProvider> hmlReviewDocumentActivity) {
        return new LocalProjectProvider_MembersInjector(hmlReviewDocumentActivity);
    }

    public final void injectMembers(LocalProjectProvider localProjectProvider) {
        inject_cacheProvider(localProjectProvider, this.aem.get());
    }

    public static void inject_cacheProvider(LocalProjectProvider localProjectProvider, IBundleCacheProvider iBundleCacheProvider) {
        localProjectProvider.aec = iBundleCacheProvider;
    }
}
