package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.NotificationsService;

/* renamed from: o.canUnparcelSafely */
public final class canUnparcelSafely implements OPRStatusRewardsLandingActivity_ViewBinding<NotificationsService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> write;

    private canUnparcelSafely(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static canUnparcelSafely MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new canUnparcelSafely(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        NotificationsService ActionMenuView$OnMenuItemClickListener = this.MediaBrowserCompat$ItemReceiver.ActionMenuView$OnMenuItemClickListener(this.write.get());
        if (ActionMenuView$OnMenuItemClickListener != null) {
            return ActionMenuView$OnMenuItemClickListener;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
