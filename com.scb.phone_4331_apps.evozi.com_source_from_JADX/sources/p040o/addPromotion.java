package p040o;

import p040o.setUserEmailAddress;

/* renamed from: o.addPromotion */
public final class addPromotion implements OPRStatusRewardsLandingActivity_ViewBinding<getLogSessionId> {
    private final HmlReviewDocumentActivity<setProductAction> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<setUserEmailAddress.write> read;

    private addPromotion(HmlReviewDocumentActivity<setUserEmailAddress.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setProductAction> hmlReviewDocumentActivity2) {
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
    }

    public static addPromotion MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<setUserEmailAddress.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<setProductAction> hmlReviewDocumentActivity2) {
        return new addPromotion(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new getLogSessionId(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get());
    }
}
