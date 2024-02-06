package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.PartnerService;

/* renamed from: o.getApplicableScopes */
public final class getApplicableScopes implements OPRStatusRewardsLandingActivity_ViewBinding<PartnerService> {
    private final HmlReviewDocumentActivity<zaaa> read;
    private final ServiceModule write;

    private getApplicableScopes(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static getApplicableScopes MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getApplicableScopes(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PartnerService AbsActionBarView = this.write.AbsActionBarView(this.read.get());
        if (AbsActionBarView != null) {
            return AbsActionBarView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
