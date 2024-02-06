package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.DeepLinkService;

/* renamed from: o.addRequiredScope */
public final class addRequiredScope implements OPRStatusRewardsLandingActivity_ViewBinding<DeepLinkService> {
    private final ServiceModule read;
    private final HmlReviewDocumentActivity<zaaa> write;

    private addRequiredScope(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static addRequiredScope IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new addRequiredScope(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        DeepLinkService actionBarVisibilityCallback = this.read.setActionBarVisibilityCallback(this.write.get());
        if (actionBarVisibilityCallback != null) {
            return actionBarVisibilityCallback;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
