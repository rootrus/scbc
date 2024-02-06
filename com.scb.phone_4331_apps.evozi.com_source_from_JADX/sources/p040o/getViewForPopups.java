package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.CardManagementService;

/* renamed from: o.getViewForPopups */
public final class getViewForPopups implements OPRStatusRewardsLandingActivity_ViewBinding<CardManagementService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> read;

    private getViewForPopups(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static getViewForPopups read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getViewForPopups(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        CardManagementService transitioning = this.IconCompatParcelizer.setTransitioning(this.read.get());
        if (transitioning != null) {
            return transitioning;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
