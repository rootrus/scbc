package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.RewardRedemptionService;

/* renamed from: o.getExtraArgs */
public final class getExtraArgs implements OPRStatusRewardsLandingActivity_ViewBinding<RewardRedemptionService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    private getExtraArgs(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getExtraArgs MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getExtraArgs(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        RewardRedemptionService expandActivityOverflowButtonDrawable = this.IconCompatParcelizer.setExpandActivityOverflowButtonDrawable(this.MediaBrowserCompat$ItemReceiver.get());
        if (expandActivityOverflowButtonDrawable != null) {
            return expandActivityOverflowButtonDrawable;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
