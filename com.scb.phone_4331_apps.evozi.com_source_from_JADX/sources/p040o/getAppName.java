package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.LoginService;

/* renamed from: o.getAppName */
public final class getAppName implements OPRStatusRewardsLandingActivity_ViewBinding<LoginService> {
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    private getAppName(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getAppName write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getAppName(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        LoginService windowCallback = this.MediaBrowserCompat$CustomActionResultReceiver.setWindowCallback(this.MediaBrowserCompat$ItemReceiver.get());
        if (windowCallback != null) {
            return windowCallback;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
