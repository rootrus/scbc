package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.DonationsService;

/* renamed from: o.addAllRequiredScopes */
public final class addAllRequiredScopes implements OPRStatusRewardsLandingActivity_ViewBinding<DonationsService> {
    private final ServiceModule read;
    private final HmlReviewDocumentActivity<zaaa> write;

    private addAllRequiredScopes(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static addAllRequiredScopes IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new addAllRequiredScopes(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        DonationsService overlayMode = this.read.setOverlayMode(this.write.get());
        if (overlayMode != null) {
            return overlayMode;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
