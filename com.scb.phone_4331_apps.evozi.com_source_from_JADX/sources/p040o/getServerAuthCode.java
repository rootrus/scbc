package p040o;

/* renamed from: o.getServerAuthCode */
public final class getServerAuthCode implements OPRStatusRewardsLandingActivity_ViewBinding<getRequestedScopes> {
    private final HmlReviewDocumentActivity<SignInCredential> IconCompatParcelizer;

    private getServerAuthCode(HmlReviewDocumentActivity<SignInCredential> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getServerAuthCode MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<SignInCredential> hmlReviewDocumentActivity) {
        return new getServerAuthCode(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new getRequestedScopes(this.IconCompatParcelizer.get());
    }
}
