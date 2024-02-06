package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.ChubbService;

/* renamed from: o.checkState */
public final class checkState implements OPRStatusRewardsLandingActivity_ViewBinding<ChubbService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule write;

    private checkState(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static checkState MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new checkState(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ChubbService MediaDescriptionCompat = this.write.MediaDescriptionCompat(this.MediaBrowserCompat$ItemReceiver.get());
        if (MediaDescriptionCompat != null) {
            return MediaDescriptionCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
