package p040o;

/* renamed from: o.getProfilePictureUri */
public final class getProfilePictureUri implements OPRStatusRewardsLandingActivity_ViewBinding<verifyGooglePlayServicesIsAvailable> {
    private final HmlReviewDocumentActivity<BatchResult> MediaBrowserCompat$CustomActionResultReceiver;

    private getProfilePictureUri(HmlReviewDocumentActivity<BatchResult> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getProfilePictureUri MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<BatchResult> hmlReviewDocumentActivity) {
        return new getProfilePictureUri(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new verifyGooglePlayServicesIsAvailable(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
