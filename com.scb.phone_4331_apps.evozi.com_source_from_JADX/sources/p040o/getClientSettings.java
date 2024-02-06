package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.ScheduleService;

/* renamed from: o.getClientSettings */
public final class getClientSettings implements OPRStatusRewardsLandingActivity_ViewBinding<ScheduleService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule read;

    private getClientSettings(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getClientSettings MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getClientSettings(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ScheduleService onDismissListener = this.read.setOnDismissListener(this.MediaBrowserCompat$ItemReceiver.get());
        if (onDismissListener != null) {
            return onDismissListener;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
