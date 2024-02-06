package p040o;

import p040o.nativeIsGuidanceAvailable;

/* renamed from: o.ApiException */
public final class ApiException implements OPRStatusRewardsLandingActivity_ViewBinding<nativeIsGuidanceAvailable.read> {
    private final HmlReviewDocumentActivity<onSearchButtonClick$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$ItemReceiver;

    private ApiException(HmlReviewDocumentActivity<onSearchButtonClick$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static ApiException IconCompatParcelizer(HmlReviewDocumentActivity<onSearchButtonClick$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity) {
        return new ApiException(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new nativeIsGuidanceAvailable.read(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
