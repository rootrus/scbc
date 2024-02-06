package p040o;

import com.scb.phone.data.network.service.ScheduleService;
import com.scb.phone.view.activity.deeplink.PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.zao */
public final class zao implements OPRStatusRewardsLandingActivity_ViewBinding<PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver> {
    private final HmlReviewDocumentActivity<ScheduleService> MediaBrowserCompat$ItemReceiver;

    private zao(HmlReviewDocumentActivity<ScheduleService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static zao read(HmlReviewDocumentActivity<ScheduleService> hmlReviewDocumentActivity) {
        return new zao(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get());
    }
}
