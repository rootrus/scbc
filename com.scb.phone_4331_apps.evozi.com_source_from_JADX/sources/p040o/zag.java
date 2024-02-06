package p040o;

/* renamed from: o.zag */
public final class zag implements OPRStatusRewardsLandingActivity_ViewBinding<GoogleSignInOptions> {
    private final HmlReviewDocumentActivity<zae> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<requestExtraScopes> read;
    private final HmlReviewDocumentActivity<revokeAccess> write;

    private zag(HmlReviewDocumentActivity<revokeAccess> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zae> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<requestExtraScopes> hmlReviewDocumentActivity3) {
        this.write = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
    }

    public static zag MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<revokeAccess> hmlReviewDocumentActivity, HmlReviewDocumentActivity<zae> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<requestExtraScopes> hmlReviewDocumentActivity3) {
        return new zag(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
    }

    public final /* synthetic */ Object get() {
        return new GoogleSignInOptions(this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.read.get());
    }
}
