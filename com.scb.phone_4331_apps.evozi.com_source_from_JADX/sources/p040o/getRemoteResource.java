package p040o;

/* renamed from: o.getRemoteResource */
public final class getRemoteResource implements OPRStatusRewardsLandingActivity_ViewBinding<getRemoteContext> {
    private final HmlReviewDocumentActivity<enableUsingApkIndependentContext> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<String> read;

    private getRemoteResource(HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
    }

    public static getRemoteResource IconCompatParcelizer(HmlReviewDocumentActivity<enableUsingApkIndependentContext> hmlReviewDocumentActivity, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity2) {
        return new getRemoteResource(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new getRemoteContext(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
    }
}
