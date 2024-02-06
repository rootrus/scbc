package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.remittance.RemittanceService;

/* renamed from: o.getClientSessionId */
public final class getClientSessionId implements OPRStatusRewardsLandingActivity_ViewBinding<RemittanceService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;

    private getClientSessionId(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getClientSessionId IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getClientSessionId(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        RemittanceService ActionBarContainer = this.MediaBrowserCompat$CustomActionResultReceiver.ActionBarContainer(this.IconCompatParcelizer.get());
        if (ActionBarContainer != null) {
            return ActionBarContainer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
