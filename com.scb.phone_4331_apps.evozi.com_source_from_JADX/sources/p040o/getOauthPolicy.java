package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.common.SlipPlatformService;

/* renamed from: o.getOauthPolicy */
public final class getOauthPolicy implements OPRStatusRewardsLandingActivity_ViewBinding<SlipPlatformService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$ItemReceiver;

    private getOauthPolicy(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static getOauthPolicy write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getOauthPolicy(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        SlipPlatformService RatingCompat = this.MediaBrowserCompat$ItemReceiver.RatingCompat(this.IconCompatParcelizer.get());
        if (RatingCompat != null) {
            return RatingCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
