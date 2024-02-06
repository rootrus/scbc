package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.registration.RegistrationService;

/* renamed from: o.ClientIdentity */
public final class ClientIdentity implements OPRStatusRewardsLandingActivity_ViewBinding<RegistrationService> {
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private ClientIdentity(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static ClientIdentity IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new ClientIdentity(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        RegistrationService contentHeight = this.MediaBrowserCompat$CustomActionResultReceiver.setContentHeight(this.read.get());
        if (contentHeight != null) {
            return contentHeight;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
