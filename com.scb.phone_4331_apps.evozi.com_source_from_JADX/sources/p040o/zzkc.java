package p040o;

import p040o.C4997nB;
import p040o.ThirdPartyWebActivity;

/* renamed from: o.zzkc */
public final class zzkc implements OPRStatusRewardsLandingActivity_ViewBinding<ThirdPartyWebActivity.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<C4997nB.read> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<addObject> read;

    private zzkc(HmlReviewDocumentActivity<addObject> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C4997nB.read> hmlReviewDocumentActivity2) {
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
    }

    public static zzkc read(HmlReviewDocumentActivity<addObject> hmlReviewDocumentActivity, HmlReviewDocumentActivity<C4997nB.read> hmlReviewDocumentActivity2) {
        return new zzkc(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new ThirdPartyWebActivity.IconCompatParcelizer(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}
