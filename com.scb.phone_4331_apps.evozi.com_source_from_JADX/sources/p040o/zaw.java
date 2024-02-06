package p040o;

import com.scb.phone.data.network.service.TileService;
import com.scb.phone.view.activity.easycash.CommercialReferralNCBConsentActivity;

/* renamed from: o.zaw */
public final class zaw implements OPRStatusRewardsLandingActivity_ViewBinding<CommercialReferralNCBConsentActivity.read> {
    private final HmlReviewDocumentActivity<TileService> MediaBrowserCompat$ItemReceiver;

    private zaw(HmlReviewDocumentActivity<TileService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zaw MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<TileService> hmlReviewDocumentActivity) {
        return new zaw(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new CommercialReferralNCBConsentActivity.read(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
