package com.kofax.mobile.sdk.extract.p018id;

import android.net.ConnectivityManager;
import com.kofax.mobile.sdk.extract.p018id.bundle.IBundleCacheProvider;
import p040o.HmlReviewDocumentActivity;
import p040o.MileageQuantitySelectionActivity;

/* renamed from: com.kofax.mobile.sdk.extract.id.ServerProjectProvider_MembersInjector */
public final class ServerProjectProvider_MembersInjector implements MileageQuantitySelectionActivity<ServerProjectProvider> {
    private final HmlReviewDocumentActivity<IBundleCacheProvider> aem;
    private final HmlReviewDocumentActivity<ConnectivityManager> afF;

    public ServerProjectProvider_MembersInjector(HmlReviewDocumentActivity<ConnectivityManager> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBundleCacheProvider> hmlReviewDocumentActivity2) {
        this.afF = hmlReviewDocumentActivity;
        this.aem = hmlReviewDocumentActivity2;
    }

    public static MileageQuantitySelectionActivity<ServerProjectProvider> create(HmlReviewDocumentActivity<ConnectivityManager> hmlReviewDocumentActivity, HmlReviewDocumentActivity<IBundleCacheProvider> hmlReviewDocumentActivity2) {
        return new ServerProjectProvider_MembersInjector(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final void injectMembers(ServerProjectProvider serverProjectProvider) {
        inject_connectivityManager(serverProjectProvider, this.afF.get());
        inject_cacheProvider(serverProjectProvider, this.aem.get());
    }

    public static void inject_connectivityManager(ServerProjectProvider serverProjectProvider, ConnectivityManager connectivityManager) {
        serverProjectProvider.afj = connectivityManager;
    }

    public static void inject_cacheProvider(ServerProjectProvider serverProjectProvider, IBundleCacheProvider iBundleCacheProvider) {
        serverProjectProvider.aec = iBundleCacheProvider;
    }
}
