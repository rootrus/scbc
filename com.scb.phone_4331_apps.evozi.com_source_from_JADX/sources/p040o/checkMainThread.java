package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.BondTermsAndConditionsService;

/* renamed from: o.checkMainThread */
public final class checkMainThread implements OPRStatusRewardsLandingActivity_ViewBinding<BondTermsAndConditionsService> {
    private final HmlReviewDocumentActivity<zaaa> read;
    private final ServiceModule write;

    private checkMainThread(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static checkMainThread IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new checkMainThread(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        BondTermsAndConditionsService IconCompatParcelizer = this.write.IconCompatParcelizer(this.read.get());
        if (IconCompatParcelizer != null) {
            return IconCompatParcelizer;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
