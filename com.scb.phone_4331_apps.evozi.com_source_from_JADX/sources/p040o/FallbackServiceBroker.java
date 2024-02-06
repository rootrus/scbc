package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.PurchaseService;

/* renamed from: o.FallbackServiceBroker */
public final class FallbackServiceBroker implements OPRStatusRewardsLandingActivity_ViewBinding<PurchaseService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$ItemReceiver;

    private FallbackServiceBroker(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static FallbackServiceBroker MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new FallbackServiceBroker(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PurchaseService expandActivityOverflowButtonContentDescription = this.MediaBrowserCompat$ItemReceiver.setExpandActivityOverflowButtonContentDescription(this.IconCompatParcelizer.get());
        if (expandActivityOverflowButtonContentDescription != null) {
            return expandActivityOverflowButtonContentDescription;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
