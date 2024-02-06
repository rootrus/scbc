package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.ProfileService;

/* renamed from: o.shouldDowngrade */
public final class shouldDowngrade implements OPRStatusRewardsLandingActivity_ViewBinding<ProfileService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule read;

    private shouldDowngrade(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static shouldDowngrade IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new shouldDowngrade(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ProfileService initialActivityCount = this.read.setInitialActivityCount(this.MediaBrowserCompat$ItemReceiver.get());
        if (initialActivityCount != null) {
            return initialActivityCount;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
