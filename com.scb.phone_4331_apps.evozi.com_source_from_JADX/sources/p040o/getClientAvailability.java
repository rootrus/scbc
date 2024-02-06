package p040o;

import com.scb.phone.data.network.p034di.prepaid.PrepaidServiceModule;
import com.scb.phone.data.network.service.prepaid.PrepaidService;

/* renamed from: o.getClientAvailability */
public final class getClientAvailability implements OPRStatusRewardsLandingActivity_ViewBinding<PrepaidService> {
    private final PrepaidServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    private getClientAvailability(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = prepaidServiceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getClientAvailability IconCompatParcelizer(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getClientAvailability(prepaidServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PrepaidService read = this.IconCompatParcelizer.read(this.MediaBrowserCompat$ItemReceiver.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
