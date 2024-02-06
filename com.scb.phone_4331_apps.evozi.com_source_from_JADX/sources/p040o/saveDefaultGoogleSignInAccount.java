package p040o;

/* renamed from: o.saveDefaultGoogleSignInAccount */
public final class saveDefaultGoogleSignInAccount implements OPRStatusRewardsLandingActivity_ViewBinding<onLoadFinished> {
    private final HmlReviewDocumentActivity<requestServerAuthCode> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<hasResolution> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<requestEmail> MediaBrowserCompat$ItemReceiver;

    private saveDefaultGoogleSignInAccount(HmlReviewDocumentActivity<requestServerAuthCode> hmlReviewDocumentActivity, HmlReviewDocumentActivity<requestEmail> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<hasResolution> hmlReviewDocumentActivity3) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
    }

    public static saveDefaultGoogleSignInAccount MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<requestServerAuthCode> hmlReviewDocumentActivity, HmlReviewDocumentActivity<requestEmail> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<hasResolution> hmlReviewDocumentActivity3) {
        return new saveDefaultGoogleSignInAccount(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new onLoadFinished(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
