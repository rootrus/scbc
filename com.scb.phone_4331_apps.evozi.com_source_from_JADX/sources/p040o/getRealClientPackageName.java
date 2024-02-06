package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.AddressService;

/* renamed from: o.getRealClientPackageName */
public final class getRealClientPackageName implements OPRStatusRewardsLandingActivity_ViewBinding<AddressService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> write;

    private getRealClientPackageName(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static getRealClientPackageName MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getRealClientPackageName(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AddressService subtitle = this.IconCompatParcelizer.setSubtitle(this.write.get());
        if (subtitle != null) {
            return subtitle;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
