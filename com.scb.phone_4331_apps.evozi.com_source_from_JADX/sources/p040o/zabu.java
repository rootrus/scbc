package p040o;

import com.scb.phone.data.network.service.DonationsService;
import p040o.getNotNullImages;

/* renamed from: o.zabu */
public final class zabu implements OPRStatusRewardsLandingActivity_ViewBinding<getNotNullImages.write> {
    private final HmlReviewDocumentActivity<DonationsService> MediaBrowserCompat$ItemReceiver;

    private zabu(HmlReviewDocumentActivity<DonationsService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zabu MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<DonationsService> hmlReviewDocumentActivity) {
        return new zabu(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new getNotNullImages.write(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
