package p040o;

import com.scb.phone.data.network.service.prepaid.PrepaidTravelService;

/* renamed from: o.zzks */
public final class zzks implements OPRStatusRewardsLandingActivity_ViewBinding<zzkt> {
    private final HmlReviewDocumentActivity<PrepaidTravelService> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<onSuccess> MediaBrowserCompat$CustomActionResultReceiver;

    private zzks(HmlReviewDocumentActivity<PrepaidTravelService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<onSuccess> hmlReviewDocumentActivity2) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
    }

    public static zzks write(HmlReviewDocumentActivity<PrepaidTravelService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<onSuccess> hmlReviewDocumentActivity2) {
        return new zzks(hmlReviewDocumentActivity, hmlReviewDocumentActivity2);
    }

    public final /* synthetic */ Object get() {
        return new zzkt(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
