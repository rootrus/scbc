package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.friends.FriendsService;

/* renamed from: o.getUseDynamicLookup */
public final class getUseDynamicLookup implements OPRStatusRewardsLandingActivity_ViewBinding<FriendsService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
    private final ServiceModule MediaBrowserCompat$ItemReceiver;

    private getUseDynamicLookup(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static getUseDynamicLookup read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getUseDynamicLookup(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        FriendsService Keep = this.MediaBrowserCompat$ItemReceiver.Keep(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (Keep != null) {
            return Keep;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
