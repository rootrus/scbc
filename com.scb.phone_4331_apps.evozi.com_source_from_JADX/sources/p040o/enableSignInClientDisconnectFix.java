package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.DeviceService;

/* renamed from: o.enableSignInClientDisconnectFix */
public final class enableSignInClientDisconnectFix implements OPRStatusRewardsLandingActivity_ViewBinding<DeviceService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$ItemReceiver;

    private enableSignInClientDisconnectFix(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static enableSignInClientDisconnectFix write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new enableSignInClientDisconnectFix(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        DeviceService ActionBarOverlayLayout = this.MediaBrowserCompat$ItemReceiver.ActionBarOverlayLayout(this.IconCompatParcelizer.get());
        if (ActionBarOverlayLayout != null) {
            return ActionBarOverlayLayout;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
