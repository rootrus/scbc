package p040o;

/* renamed from: o.getSignInIntent */
public final class getSignInIntent implements OPRStatusRewardsLandingActivity_ViewBinding<zac> {
    private final HmlReviewDocumentActivity<isExpired> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<getGrantedScopes> read;
    private final HmlReviewDocumentActivity<GoogleSignInOptions> write;

    private getSignInIntent(HmlReviewDocumentActivity<isExpired> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getGrantedScopes> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<GoogleSignInOptions> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.read = hmlReviewDocumentActivity2;
        this.write = hmlReviewDocumentActivity3;
    }

    public static getSignInIntent read(HmlReviewDocumentActivity<isExpired> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getGrantedScopes> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<GoogleSignInOptions> hmlReviewDocumentActivity3) {
        return new getSignInIntent(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new zac(this.IconCompatParcelizer.get(), this.read.get(), this.write.get());
    }
}
