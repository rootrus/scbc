package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.DealsService;

/* renamed from: o.setOauthPolicy */
public final class setOauthPolicy implements OPRStatusRewardsLandingActivity_ViewBinding<DealsService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule write;

    private setOauthPolicy(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static setOauthPolicy MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new setOauthPolicy(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        DealsService MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = this.write.mo13256x50fd9e4a(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver != null) {
            return MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
