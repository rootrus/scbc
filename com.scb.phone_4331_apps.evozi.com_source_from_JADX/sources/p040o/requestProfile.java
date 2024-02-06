package p040o;

/* renamed from: o.requestProfile */
public final class requestProfile implements OPRStatusRewardsLandingActivity_ViewBinding<requestIdToken> {
    private final HmlReviewDocumentActivity<isSuccess> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<requestEmail> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<getExtensionType> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<setAccount> read;
    private final HmlReviewDocumentActivity<requestServerAuthCode> write;

    private requestProfile(HmlReviewDocumentActivity<getExtensionType> hmlReviewDocumentActivity, HmlReviewDocumentActivity<requestServerAuthCode> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<requestEmail> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<isSuccess> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setAccount> hmlReviewDocumentActivity5) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.write = hmlReviewDocumentActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
        this.IconCompatParcelizer = hmlReviewDocumentActivity4;
        this.read = hmlReviewDocumentActivity5;
    }

    public static requestProfile MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<getExtensionType> hmlReviewDocumentActivity, HmlReviewDocumentActivity<requestServerAuthCode> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<requestEmail> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<isSuccess> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<setAccount> hmlReviewDocumentActivity5) {
        return new requestProfile(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5);
    }

    public final /* synthetic */ Object get() {
        return new requestIdToken(this.MediaBrowserCompat$ItemReceiver.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.IconCompatParcelizer.get(), this.read.get());
    }
}
