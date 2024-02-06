package p040o;

/* renamed from: o.getSignInCredentialFromIntent */
public final class getSignInCredentialFromIntent implements OPRStatusRewardsLandingActivity_ViewBinding<SignInCredential> {
    private final HmlReviewDocumentActivity<FragmentBuilder_BindVerifyIdentityTipsFragment> read;

    private getSignInCredentialFromIntent(HmlReviewDocumentActivity<FragmentBuilder_BindVerifyIdentityTipsFragment> hmlReviewDocumentActivity) {
        this.read = hmlReviewDocumentActivity;
    }

    public static getSignInCredentialFromIntent MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<FragmentBuilder_BindVerifyIdentityTipsFragment> hmlReviewDocumentActivity) {
        return new getSignInCredentialFromIntent(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new SignInCredential(this.read.get());
    }
}
