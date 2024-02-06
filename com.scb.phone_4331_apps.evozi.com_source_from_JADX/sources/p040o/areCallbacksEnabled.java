package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.TopUpService;

/* renamed from: o.areCallbacksEnabled */
public final class areCallbacksEnabled implements OPRStatusRewardsLandingActivity_ViewBinding<TopUpService> {
    private final ServiceModule MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<zaaa> write;

    private areCallbacksEnabled(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static areCallbacksEnabled read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new areCallbacksEnabled(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        TopUpService ActivityChooserView$InnerLayout = this.MediaBrowserCompat$ItemReceiver.ActivityChooserView$InnerLayout(this.write.get());
        if (ActivityChooserView$InnerLayout != null) {
            return ActivityChooserView$InnerLayout;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
