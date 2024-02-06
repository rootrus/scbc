package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.DepositService;

/* renamed from: o.setOptionalApiSettingsMap */
public final class setOptionalApiSettingsMap implements OPRStatusRewardsLandingActivity_ViewBinding<DepositService> {
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> write;

    private setOptionalApiSettingsMap(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static setOptionalApiSettingsMap MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new setOptionalApiSettingsMap(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        DepositService hideOnContentScrollEnabled = this.MediaBrowserCompat$CustomActionResultReceiver.setHideOnContentScrollEnabled(this.write.get());
        if (hideOnContentScrollEnabled != null) {
            return hideOnContentScrollEnabled;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
