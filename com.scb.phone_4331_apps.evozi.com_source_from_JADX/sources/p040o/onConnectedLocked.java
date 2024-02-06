package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.FundOnboardingService;

/* renamed from: o.onConnectedLocked */
public final class onConnectedLocked implements OPRStatusRewardsLandingActivity_ViewBinding<FundOnboardingService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> read;

    private onConnectedLocked(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static onConnectedLocked IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new onConnectedLocked(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        FundOnboardingService backgroundResource = this.IconCompatParcelizer.setBackgroundResource(this.read.get());
        if (backgroundResource != null) {
            return backgroundResource;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
