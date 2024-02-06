package p040o;

import com.scb.phone.data.network.service.DebitCardService;

/* renamed from: o.zabs */
public final class zabs implements OPRStatusRewardsLandingActivity_ViewBinding<hn$MediaBrowserCompat$ItemReceiver> {
    private final HmlReviewDocumentActivity<DebitCardService> MediaBrowserCompat$CustomActionResultReceiver;

    private zabs(HmlReviewDocumentActivity<DebitCardService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static zabs MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<DebitCardService> hmlReviewDocumentActivity) {
        return new zabs(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new hn$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
