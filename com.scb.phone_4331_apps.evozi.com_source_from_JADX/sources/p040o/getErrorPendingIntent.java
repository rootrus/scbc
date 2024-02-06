package p040o;

/* renamed from: o.getErrorPendingIntent */
public final class getErrorPendingIntent implements OPRStatusRewardsLandingActivity_ViewBinding<GooglePlayServicesUtilLight> {
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<enableUsingApkIndependentContext> MediaBrowserCompat$ItemReceiver;

    private getErrorPendingIntent(HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static getErrorPendingIntent MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        return new getErrorPendingIntent(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new GooglePlayServicesUtilLight(this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
