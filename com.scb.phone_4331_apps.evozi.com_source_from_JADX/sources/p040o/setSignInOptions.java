package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.EBillSubscriptionService;

/* renamed from: o.setSignInOptions */
public final class setSignInOptions implements OPRStatusRewardsLandingActivity_ViewBinding<EBillSubscriptionService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;

    private setSignInOptions(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static setSignInOptions read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new setSignInOptions(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EBillSubscriptionService logo = this.IconCompatParcelizer.setLogo(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (logo != null) {
            return logo;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
