package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.CustomerService;

/* renamed from: o.getPolicyAction */
public final class getPolicyAction implements OPRStatusRewardsLandingActivity_ViewBinding<CustomerService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private getPolicyAction(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static getPolicyAction MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getPolicyAction(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        CustomerService MediaBrowserCompat$SearchResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(this.read.get());
        if (MediaBrowserCompat$SearchResultReceiver != null) {
            return MediaBrowserCompat$SearchResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
