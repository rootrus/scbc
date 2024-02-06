package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.NdidService;

/* renamed from: o.getUnparcelClientVersion */
public final class getUnparcelClientVersion implements OPRStatusRewardsLandingActivity_ViewBinding<NdidService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
    private final ServiceModule read;

    private getUnparcelClientVersion(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getUnparcelClientVersion write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getUnparcelClientVersion(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        NdidService ActivityChooserView = this.read.ActivityChooserView(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (ActivityChooserView != null) {
            return ActivityChooserView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
