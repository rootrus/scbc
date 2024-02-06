package p040o;

/* renamed from: o.Beta */
public final class Beta implements OPRStatusRewardsLandingActivity_ViewBinding<setUnknownKeys> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<removeIfEmpty> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<keys> write;

    private Beta(HmlReviewDocumentActivity<removeIfEmpty> hmlReviewDocumentActivity, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
    }

    public static Beta read(HmlReviewDocumentActivity<removeIfEmpty> hmlReviewDocumentActivity, HmlReviewDocumentActivity<keys> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity4) {
        return new Beta(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        return new setUnknownKeys(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.write.get(), this.read.get(), this.IconCompatParcelizer.get());
    }
}
