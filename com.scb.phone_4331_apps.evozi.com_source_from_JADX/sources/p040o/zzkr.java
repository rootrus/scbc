package p040o;

import com.scb.phone.data.network.service.prepaid.PrepaidTravelService;

/* renamed from: o.zzkr */
public final class zzkr implements OPRStatusRewardsLandingActivity_ViewBinding<zzkv> {
    private final HmlReviewDocumentActivity<getResult> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<PrepaidTravelService> read;

    private zzkr(HmlReviewDocumentActivity<PrepaidTravelService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getResult> hmlReviewDocumentActivity2) {
        this.read = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static zzkr MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<PrepaidTravelService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getResult> hmlReviewDocumentActivity2) {
        return new zzkr(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new zzkv(this.read.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
