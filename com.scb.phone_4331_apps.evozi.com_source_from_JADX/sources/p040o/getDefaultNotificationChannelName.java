package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.ISprintService;

/* renamed from: o.getDefaultNotificationChannelName */
public final class getDefaultNotificationChannelName implements OPRStatusRewardsLandingActivity_ViewBinding<ISprintService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> read;

    private getDefaultNotificationChannelName(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static getDefaultNotificationChannelName IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getDefaultNotificationChannelName(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ISprintService uiOptions = this.IconCompatParcelizer.setUiOptions(this.read.get());
        if (uiOptions != null) {
            return uiOptions;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
