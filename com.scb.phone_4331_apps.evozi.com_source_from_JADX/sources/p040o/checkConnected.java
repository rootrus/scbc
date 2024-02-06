package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.ETBService;

/* renamed from: o.checkConnected */
public final class checkConnected implements OPRStatusRewardsLandingActivity_ViewBinding<ETBService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule write;

    private checkConnected(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static checkConnected write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new checkConnected(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ETBService hasDecor = this.write.setHasDecor(this.MediaBrowserCompat$ItemReceiver.get());
        if (hasDecor != null) {
            return hasDecor;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
