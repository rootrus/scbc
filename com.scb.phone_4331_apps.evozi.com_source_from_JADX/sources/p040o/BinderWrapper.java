package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.NsipPartnerPaymentService;

/* renamed from: o.BinderWrapper */
public final class BinderWrapper implements OPRStatusRewardsLandingActivity_ViewBinding<NsipPartnerPaymentService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule read;

    private BinderWrapper(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static BinderWrapper MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new BinderWrapper(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        NsipPartnerPaymentService forceShowIcon = this.read.setForceShowIcon(this.MediaBrowserCompat$ItemReceiver.get());
        if (forceShowIcon != null) {
            return forceShowIcon;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
