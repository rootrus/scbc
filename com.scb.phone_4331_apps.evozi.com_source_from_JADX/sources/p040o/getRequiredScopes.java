package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.BillPaymentService;

/* renamed from: o.getRequiredScopes */
public final class getRequiredScopes implements OPRStatusRewardsLandingActivity_ViewBinding<BillPaymentService> {
    private final ServiceModule read;
    private final HmlReviewDocumentActivity<zaaa> write;

    private getRequiredScopes(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static getRequiredScopes MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getRequiredScopes(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        BillPaymentService titleOptional = this.read.setTitleOptional(this.write.get());
        if (titleOptional != null) {
            return titleOptional;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
