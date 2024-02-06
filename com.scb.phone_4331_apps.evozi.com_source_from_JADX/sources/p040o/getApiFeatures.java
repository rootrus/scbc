package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.FundDiscoverService;

/* renamed from: o.getApiFeatures */
public final class getApiFeatures implements OPRStatusRewardsLandingActivity_ViewBinding<FundDiscoverService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule write;

    private getApiFeatures(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static getApiFeatures MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getApiFeatures(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        FundDiscoverService AppCompatDelegateImpl$ListMenuDecorView = this.write.AppCompatDelegateImpl$ListMenuDecorView(this.MediaBrowserCompat$ItemReceiver.get());
        if (AppCompatDelegateImpl$ListMenuDecorView != null) {
            return AppCompatDelegateImpl$ListMenuDecorView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
