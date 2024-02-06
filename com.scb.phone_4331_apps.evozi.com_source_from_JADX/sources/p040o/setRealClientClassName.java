package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.FindUsService;

/* renamed from: o.setRealClientClassName */
public final class setRealClientClassName implements OPRStatusRewardsLandingActivity_ViewBinding<FindUsService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> write;

    private setRealClientClassName(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static setRealClientClassName MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new setRealClientClassName(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        FindUsService menu = this.IconCompatParcelizer.setMenu(this.write.get());
        if (menu != null) {
            return menu;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
