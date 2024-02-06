package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.TouchPointService;

/* renamed from: o.getOptionalApiSettings */
public final class getOptionalApiSettings implements OPRStatusRewardsLandingActivity_ViewBinding<TouchPointService> {
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    private getOptionalApiSettings(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getOptionalApiSettings write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getOptionalApiSettings(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        TouchPointService stackedBackground = this.MediaBrowserCompat$CustomActionResultReceiver.setStackedBackground(this.MediaBrowserCompat$ItemReceiver.get());
        if (stackedBackground != null) {
            return stackedBackground;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
