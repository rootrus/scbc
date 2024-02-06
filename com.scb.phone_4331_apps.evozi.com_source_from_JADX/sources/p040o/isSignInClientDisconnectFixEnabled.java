package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.BulkTransferService;

/* renamed from: o.isSignInClientDisconnectFixEnabled */
public final class isSignInClientDisconnectFixEnabled implements OPRStatusRewardsLandingActivity_ViewBinding<BulkTransferService> {
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> write;

    private isSignInClientDisconnectFixEnabled(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static isSignInClientDisconnectFixEnabled read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new isSignInClientDisconnectFixEnabled(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        BulkTransferService customView = this.MediaBrowserCompat$CustomActionResultReceiver.setCustomView(this.write.get());
        if (customView != null) {
            return customView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
