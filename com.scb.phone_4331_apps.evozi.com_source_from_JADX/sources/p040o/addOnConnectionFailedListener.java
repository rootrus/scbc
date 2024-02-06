package p040o;

/* renamed from: o.addOnConnectionFailedListener */
public final class addOnConnectionFailedListener implements OPRStatusRewardsLandingActivity_ViewBinding<addScope> {
    private final HmlReviewDocumentActivity<registerConnectionCallbacks> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<setHandler> read;
    private final HmlReviewDocumentActivity<stopAutoManage> write;

    private addOnConnectionFailedListener(HmlReviewDocumentActivity<registerConnectionCallbacks> hmlReviewDocumentActivity, HmlReviewDocumentActivity<stopAutoManage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setHandler> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static addOnConnectionFailedListener read(HmlReviewDocumentActivity<registerConnectionCallbacks> hmlReviewDocumentActivity, HmlReviewDocumentActivity<stopAutoManage> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<setHandler> hmlReviewDocumentActivity3) {
        return new addOnConnectionFailedListener(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new addScope(this.IconCompatParcelizer.get(), this.write.get(), this.read.get());
    }
}
