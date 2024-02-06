package p040o;

/* renamed from: o.continueWithTask */
public final class continueWithTask implements OPRStatusRewardsLandingActivity_ViewBinding<addOnSuccessListener> {
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<CloseAccountReviewActivity> read;
    private final HmlReviewDocumentActivity<C7514tY> write;

    private continueWithTask(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static continueWithTask read(HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CloseAccountReviewActivity> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<C7514tY> hmlReviewDocumentActivity3) {
        return new continueWithTask(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new addOnSuccessListener(this.IconCompatParcelizer.get(), this.read.get(), this.write.get());
    }
}
