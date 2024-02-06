package p040o;

/* renamed from: o.firstCharOnlyToUpper */
public final class firstCharOnlyToUpper implements OPRStatusRewardsLandingActivity_ViewBinding<toLowerCase> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<removeIfEmpty> write;

    private firstCharOnlyToUpper(HmlReviewDocumentActivity<removeIfEmpty> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity3) {
        this.write = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static firstCharOnlyToUpper MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<removeIfEmpty> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity3) {
        return new firstCharOnlyToUpper(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new toLowerCase(this.write.get(), this.IconCompatParcelizer.get(), this.read.get());
    }
}
