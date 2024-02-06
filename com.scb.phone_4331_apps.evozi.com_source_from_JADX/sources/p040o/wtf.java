package p040o;

import com.scb.phone.data.network.p034di.prepaid.PrepaidServiceModule;
import com.scb.phone.data.network.service.prepaid.PrepaidTravelService;

/* renamed from: o.wtf */
public final class wtf implements OPRStatusRewardsLandingActivity_ViewBinding<PrepaidTravelService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final PrepaidServiceModule write;

    private wtf(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = prepaidServiceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static wtf write(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new wtf(prepaidServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PrepaidTravelService MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaBrowserCompat$CustomActionResultReceiver != null) {
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
