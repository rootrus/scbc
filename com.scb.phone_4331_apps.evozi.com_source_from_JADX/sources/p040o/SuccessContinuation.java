package p040o;

/* renamed from: o.SuccessContinuation */
public final class SuccessContinuation implements OPRStatusRewardsLandingActivity_ViewBinding<addOnCompleteListener> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<fromDataField> MediaBrowserCompat$ItemReceiver;

    private SuccessContinuation(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<fromDataField> hmlReviewDocumentActivity3) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
    }

    public static SuccessContinuation IconCompatParcelizer(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<fromDataField> hmlReviewDocumentActivity3) {
        return new SuccessContinuation(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new addOnCompleteListener(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}
