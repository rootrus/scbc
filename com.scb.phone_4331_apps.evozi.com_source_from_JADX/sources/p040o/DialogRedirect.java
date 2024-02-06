package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.MutualFundsService;

/* renamed from: o.DialogRedirect */
public final class DialogRedirect implements OPRStatusRewardsLandingActivity_ViewBinding<MutualFundsService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;

    private DialogRedirect(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static DialogRedirect write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new DialogRedirect(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        MutualFundsService onMenuItemClick = this.MediaBrowserCompat$CustomActionResultReceiver.onMenuItemClick(this.IconCompatParcelizer.get());
        if (onMenuItemClick != null) {
            return onMenuItemClick;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
