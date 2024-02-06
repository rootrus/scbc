package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.ManageChequeService;

/* renamed from: o.Constants */
public final class Constants implements OPRStatusRewardsLandingActivity_ViewBinding<ManageChequeService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$ItemReceiver;

    private Constants(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static Constants IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new Constants(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ManageChequeService menuCallbacks = this.MediaBrowserCompat$ItemReceiver.setMenuCallbacks(this.IconCompatParcelizer.get());
        if (menuCallbacks != null) {
            return menuCallbacks;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
