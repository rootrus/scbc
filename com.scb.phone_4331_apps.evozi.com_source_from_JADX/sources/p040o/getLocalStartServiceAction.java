package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.EligibilityService;

/* renamed from: o.getLocalStartServiceAction */
public final class getLocalStartServiceAction implements OPRStatusRewardsLandingActivity_ViewBinding<EligibilityService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
    private final ServiceModule read;

    private getLocalStartServiceAction(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getLocalStartServiceAction read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getLocalStartServiceAction(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EligibilityService AlertController$RecycleListView = this.read.AlertController$RecycleListView(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (AlertController$RecycleListView != null) {
            return AlertController$RecycleListView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
