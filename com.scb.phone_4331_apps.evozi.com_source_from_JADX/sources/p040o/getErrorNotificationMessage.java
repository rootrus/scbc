package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.LoanService;

/* renamed from: o.getErrorNotificationMessage */
public final class getErrorNotificationMessage implements OPRStatusRewardsLandingActivity_ViewBinding<LoanService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
    private final ServiceModule write;

    private getErrorNotificationMessage(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getErrorNotificationMessage read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getErrorNotificationMessage(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        LoanService windowTitle = this.write.setWindowTitle(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (windowTitle != null) {
            return windowTitle;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
