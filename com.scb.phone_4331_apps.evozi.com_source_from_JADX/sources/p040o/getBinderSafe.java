package p040o;

import com.scb.phone.data.network.service.RewardRedemptionService;
import com.scb.phone.view.activity.hml.HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.getBinderSafe */
public final class getBinderSafe implements OPRStatusRewardsLandingActivity_ViewBinding<HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver> {
    private final HmlReviewDocumentActivity<RewardRedemptionService> MediaBrowserCompat$CustomActionResultReceiver;

    private getBinderSafe(HmlReviewDocumentActivity<RewardRedemptionService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getBinderSafe read(HmlReviewDocumentActivity<RewardRedemptionService> hmlReviewDocumentActivity) {
        return new getBinderSafe(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new HmlNTBBusinessAddressActivity$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
