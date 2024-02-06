package p040o;

/* renamed from: o.getLastSignedInAccount */
public final class getLastSignedInAccount implements OPRStatusRewardsLandingActivity_ViewBinding<hasPermissions> {
    private final HmlReviewDocumentActivity<getAccountForScopes> IconCompatParcelizer;

    private getLastSignedInAccount(HmlReviewDocumentActivity<getAccountForScopes> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getLastSignedInAccount IconCompatParcelizer(HmlReviewDocumentActivity<getAccountForScopes> hmlReviewDocumentActivity) {
        return new getLastSignedInAccount(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new hasPermissions(this.IconCompatParcelizer.get());
    }
}
