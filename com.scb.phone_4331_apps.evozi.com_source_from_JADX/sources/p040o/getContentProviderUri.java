package p040o;

/* renamed from: o.getContentProviderUri */
public final class getContentProviderUri implements OPRStatusRewardsLandingActivity_ViewBinding<getDefaultCipherSuites> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<getProject> write;

    private getContentProviderUri(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getProject> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static getContentProviderUri MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getProject> hmlReviewDocumentActivity3) {
        return new getContentProviderUri(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new getDefaultCipherSuites(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.write.get());
    }
}
