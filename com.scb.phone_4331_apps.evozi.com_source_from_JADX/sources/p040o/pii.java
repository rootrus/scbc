package p040o;

import com.scb.phone.data.network.p034di.prepaid.PrepaidServiceModule;
import com.scb.phone.data.network.service.prepaid.PrepaidActivationService;

/* renamed from: o.pii */
public final class pii implements OPRStatusRewardsLandingActivity_ViewBinding<PrepaidActivationService> {
    private final PrepaidServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    private pii(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = prepaidServiceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static pii IconCompatParcelizer(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new pii(prepaidServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PrepaidActivationService write = this.IconCompatParcelizer.write(this.MediaBrowserCompat$ItemReceiver.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
