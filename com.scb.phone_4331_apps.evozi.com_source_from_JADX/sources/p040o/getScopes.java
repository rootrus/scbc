package p040o;

/* renamed from: o.getScopes */
public final class getScopes implements OPRStatusRewardsLandingActivity_ViewBinding<zah> {
    private final HmlReviewDocumentActivity<GoogleSignInClient> MediaBrowserCompat$CustomActionResultReceiver;

    private getScopes(HmlReviewDocumentActivity<GoogleSignInClient> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getScopes MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<GoogleSignInClient> hmlReviewDocumentActivity) {
        return new getScopes(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new zah(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
