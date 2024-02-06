package p040o;

import com.scb.phone.data.network.p034di.prepaid.PrepaidServiceModule;
import com.scb.phone.data.network.service.prepaid.cashout.PrepaidCashOutService;

/* renamed from: o.efmt */
public final class efmt implements OPRStatusRewardsLandingActivity_ViewBinding<PrepaidCashOutService> {
    private final PrepaidServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private efmt(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = prepaidServiceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static efmt MediaBrowserCompat$CustomActionResultReceiver(PrepaidServiceModule prepaidServiceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new efmt(prepaidServiceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PrepaidCashOutService IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.read.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
