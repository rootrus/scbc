package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.SmeLoanService;

/* renamed from: o.enableCallbacks */
public final class enableCallbacks implements OPRStatusRewardsLandingActivity_ViewBinding<SmeLoanService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;

    private enableCallbacks(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static enableCallbacks MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new enableCallbacks(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        SmeLoanService AlertDialogLayout = this.IconCompatParcelizer.AlertDialogLayout(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (AlertDialogLayout != null) {
            return AlertDialogLayout;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
