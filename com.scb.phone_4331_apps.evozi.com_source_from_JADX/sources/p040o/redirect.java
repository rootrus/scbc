package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.LogoutService;

/* renamed from: o.redirect */
public final class redirect implements OPRStatusRewardsLandingActivity_ViewBinding<LogoutService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private redirect(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static redirect IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new redirect(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        LogoutService overflowReserved = this.MediaBrowserCompat$ItemReceiver.setOverflowReserved(this.read.get());
        if (overflowReserved != null) {
            return overflowReserved;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
