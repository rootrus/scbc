package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.MobileNumberService;

/* renamed from: o.getErrorTitle */
public final class getErrorTitle implements OPRStatusRewardsLandingActivity_ViewBinding<MobileNumberService> {
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> write;

    private getErrorTitle(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static getErrorTitle MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getErrorTitle(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        MobileNumberService overflowIcon = this.MediaBrowserCompat$CustomActionResultReceiver.setOverflowIcon(this.write.get());
        if (overflowIcon != null) {
            return overflowIcon;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
