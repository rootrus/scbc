package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.LoginService;

/* renamed from: o.getErrorNotificationTitle */
public final class getErrorNotificationTitle implements OPRStatusRewardsLandingActivity_ViewBinding<LoginService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
    private final ServiceModule write;

    private getErrorNotificationTitle(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getErrorNotificationTitle MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getErrorNotificationTitle(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        LoginService expandedActionViewsExclusive = this.write.setExpandedActionViewsExclusive(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (expandedActionViewsExclusive != null) {
            return expandedActionViewsExclusive;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
