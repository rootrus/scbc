package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.RequestToPayService;

/* renamed from: o.GetServiceRequest */
public final class GetServiceRequest implements OPRStatusRewardsLandingActivity_ViewBinding<RequestToPayService> {
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    private GetServiceRequest(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static GetServiceRequest write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new GetServiceRequest(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        RequestToPayService defaultActionButtonContentDescription = this.MediaBrowserCompat$CustomActionResultReceiver.setDefaultActionButtonContentDescription(this.MediaBrowserCompat$ItemReceiver.get());
        if (defaultActionButtonContentDescription != null) {
            return defaultActionButtonContentDescription;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
