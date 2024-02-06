package p040o;

import p040o.GoogleSignInOptions;

/* renamed from: o.onLoaderReset */
public final class onLoaderReset implements OPRStatusRewardsLandingActivity_ViewBinding<GoogleAnalytics> {
    private final HmlReviewDocumentActivity<GoogleSignInOptions.Builder> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<requestEmail> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<getExtensions> read;
    private final HmlReviewDocumentActivity<requestServerAuthCode> write;

    private onLoaderReset(HmlReviewDocumentActivity<requestEmail> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GoogleSignInOptions.Builder> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getExtensions> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<requestServerAuthCode> hmlReviewDocumentActivity4) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
        this.IconCompatParcelizer = hmlReviewDocumentActivity2;
        this.read = hmlReviewDocumentActivity3;
        this.write = hmlReviewDocumentActivity4;
    }

    public static onLoaderReset IconCompatParcelizer(HmlReviewDocumentActivity<requestEmail> hmlReviewDocumentActivity, HmlReviewDocumentActivity<GoogleSignInOptions.Builder> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getExtensions> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<requestServerAuthCode> hmlReviewDocumentActivity4) {
        return new onLoaderReset(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
    }

    public final /* synthetic */ Object get() {
        return new GoogleAnalytics(this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.read.get(), this.write.get());
    }
}
