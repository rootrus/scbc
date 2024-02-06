package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.BondService;

/* renamed from: o.checkNull */
public final class checkNull implements OPRStatusRewardsLandingActivity_ViewBinding<BondService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule read;

    private checkNull(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static checkNull IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new checkNull(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        BondService write = this.read.write(this.MediaBrowserCompat$ItemReceiver.get());
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
