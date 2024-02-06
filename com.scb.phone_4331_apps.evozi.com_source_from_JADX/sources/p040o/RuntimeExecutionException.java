package p040o;

/* renamed from: o.RuntimeExecutionException */
public final class RuntimeExecutionException implements OPRStatusRewardsLandingActivity_ViewBinding<OnCompleteListener> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<C7514tY> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<fromDataField> read;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> write;

    private RuntimeExecutionException(HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity, HmlReviewDocumentActivity<fromDataField> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.IconCompatParcelizer = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
    }

    public static RuntimeExecutionException read(HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity, HmlReviewDocumentActivity<fromDataField> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity4) {
        return new RuntimeExecutionException(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        return new OnCompleteListener(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.IconCompatParcelizer.get(), this.write.get());
    }
}
