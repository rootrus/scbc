package p040o;

import com.scb.phone.data.network.api.paynow.PayNowApi;
import com.scb.phone.data.network.service.paynow.PayNowService;

/* renamed from: o.isDataValid */
public final class isDataValid implements OPRStatusRewardsLandingActivity_ViewBinding<PayNowApi> {
    private final HmlReviewDocumentActivity<PayNowService> MediaBrowserCompat$ItemReceiver;

    private isDataValid(HmlReviewDocumentActivity<PayNowService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static isDataValid read(HmlReviewDocumentActivity<PayNowService> hmlReviewDocumentActivity) {
        return new isDataValid(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new PayNowApi(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
