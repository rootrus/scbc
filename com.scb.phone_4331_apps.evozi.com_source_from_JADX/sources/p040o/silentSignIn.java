package p040o;

/* renamed from: o.silentSignIn */
public final class silentSignIn implements OPRStatusRewardsLandingActivity_ViewBinding<GoogleSignInClient> {
    private final HmlReviewDocumentActivity<zai> write;

    private silentSignIn(HmlReviewDocumentActivity<zai> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static silentSignIn MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<zai> hmlReviewDocumentActivity) {
        return new silentSignIn(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new GoogleSignInClient(this.write.get());
    }
}
