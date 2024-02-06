package p040o;

/* renamed from: o.onCreateLoader */
public final class onCreateLoader implements OPRStatusRewardsLandingActivity_ViewBinding<SignInConfiguration> {
    private final HmlReviewDocumentActivity<hash> read;

    private onCreateLoader(HmlReviewDocumentActivity<hash> hmlReviewDocumentActivity) {
        this.read = hmlReviewDocumentActivity;
    }

    public static onCreateLoader write(HmlReviewDocumentActivity<hash> hmlReviewDocumentActivity) {
        return new onCreateLoader(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new SignInConfiguration(this.read.get());
    }
}
