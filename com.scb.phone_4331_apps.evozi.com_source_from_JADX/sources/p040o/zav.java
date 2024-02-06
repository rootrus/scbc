package p040o;

import com.scb.phone.data.network.service.CCContentService;
import com.scb.phone.view.activity.hml.HmlBaseConsentActivity;

/* renamed from: o.zav */
public final class zav implements OPRStatusRewardsLandingActivity_ViewBinding<HmlBaseConsentActivity.read> {
    private final HmlReviewDocumentActivity<CCContentService> MediaBrowserCompat$ItemReceiver;

    private zav(HmlReviewDocumentActivity<CCContentService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zav MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<CCContentService> hmlReviewDocumentActivity) {
        return new zav(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new HmlBaseConsentActivity.read(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
