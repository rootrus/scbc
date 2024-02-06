package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.GiftingService;

/* renamed from: o.ConnectionErrorMessages */
public final class ConnectionErrorMessages implements OPRStatusRewardsLandingActivity_ViewBinding<GiftingService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;

    private ConnectionErrorMessages(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static ConnectionErrorMessages write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new ConnectionErrorMessages(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        GiftingService ActionMenuView = this.IconCompatParcelizer.ActionMenuView(this.MediaBrowserCompat$ItemReceiver.get());
        if (ActionMenuView != null) {
            return ActionMenuView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
