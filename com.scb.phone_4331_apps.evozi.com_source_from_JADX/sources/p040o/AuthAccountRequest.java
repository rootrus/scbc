package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.CloseAccountService;

/* renamed from: o.AuthAccountRequest */
public final class AuthAccountRequest implements OPRStatusRewardsLandingActivity_ViewBinding<CloseAccountService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;

    private AuthAccountRequest(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static AuthAccountRequest write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new AuthAccountRequest(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        CloseAccountService MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer.get());
        if (MediaBrowserCompat$MediaItem != null) {
            return MediaBrowserCompat$MediaItem;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
