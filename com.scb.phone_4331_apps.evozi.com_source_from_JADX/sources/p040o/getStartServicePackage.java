package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.ForgotPinService;

/* renamed from: o.getStartServicePackage */
public final class getStartServicePackage implements OPRStatusRewardsLandingActivity_ViewBinding<ForgotPinService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule read;

    private getStartServicePackage(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getStartServicePackage read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getStartServicePackage(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        ForgotPinService PlaybackStateCompat = this.read.PlaybackStateCompat(this.MediaBrowserCompat$ItemReceiver.get());
        if (PlaybackStateCompat != null) {
            return PlaybackStateCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
