package p040o;

import com.scb.phone.data.network.service.EBillSubscriptionService;

/* renamed from: o.zaby */
public final class zaby implements OPRStatusRewardsLandingActivity_ViewBinding<IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver> {
    private final HmlReviewDocumentActivity<EBillSubscriptionService> MediaBrowserCompat$ItemReceiver;

    private zaby(HmlReviewDocumentActivity<EBillSubscriptionService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zaby MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<EBillSubscriptionService> hmlReviewDocumentActivity) {
        return new zaby(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
