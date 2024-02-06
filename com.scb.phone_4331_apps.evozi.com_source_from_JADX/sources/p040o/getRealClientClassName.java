package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.SecuritiesService;

/* renamed from: o.getRealClientClassName */
public final class getRealClientClassName implements OPRStatusRewardsLandingActivity_ViewBinding<SecuritiesService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> read;

    private getRealClientClassName(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static getRealClientClassName MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getRealClientClassName(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        SecuritiesService splitBackground = this.IconCompatParcelizer.setSplitBackground(this.read.get());
        if (splitBackground != null) {
            return splitBackground;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
