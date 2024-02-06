package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.AppConfigService;

/* renamed from: o.setClientSessionId */
public final class setClientSessionId implements OPRStatusRewardsLandingActivity_ViewBinding<AppConfigService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> read;

    private setClientSessionId(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static setClientSessionId MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new setClientSessionId(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        AppConfigService ActionBarContextView = this.MediaBrowserCompat$ItemReceiver.ActionBarContextView(this.read.get());
        if (ActionBarContextView != null) {
            return ActionBarContextView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
