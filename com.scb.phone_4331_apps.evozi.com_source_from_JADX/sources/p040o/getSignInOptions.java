package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.CardlessATMService;

/* renamed from: o.getSignInOptions */
public final class getSignInOptions implements OPRStatusRewardsLandingActivity_ViewBinding<CardlessATMService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> write;

    private getSignInOptions(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static getSignInOptions MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getSignInOptions(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        CardlessATMService hasNonEmbeddedTabs = this.MediaBrowserCompat$ItemReceiver.setHasNonEmbeddedTabs(this.write.get());
        if (hasNonEmbeddedTabs != null) {
            return hasNonEmbeddedTabs;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
