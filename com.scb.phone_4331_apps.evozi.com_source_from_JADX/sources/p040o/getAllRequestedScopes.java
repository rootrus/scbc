package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.privacymanagement.PrivacyManagementService;

/* renamed from: o.getAllRequestedScopes */
public final class getAllRequestedScopes implements OPRStatusRewardsLandingActivity_ViewBinding<PrivacyManagementService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    private getAllRequestedScopes(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getAllRequestedScopes write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getAllRequestedScopes(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PrivacyManagementService visibility = this.IconCompatParcelizer.setVisibility(this.MediaBrowserCompat$ItemReceiver.get());
        if (visibility != null) {
            return visibility;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
