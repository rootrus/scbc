package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.EkycService;

/* renamed from: o.setRealClientPackageName */
public final class setRealClientPackageName implements OPRStatusRewardsLandingActivity_ViewBinding<EkycService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$ItemReceiver;
    private final ServiceModule write;

    private setRealClientPackageName(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
    }

    public static setRealClientPackageName MediaBrowserCompat$ItemReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new setRealClientPackageName(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EkycService showingForActionMode = this.write.setShowingForActionMode(this.MediaBrowserCompat$ItemReceiver.get());
        if (showingForActionMode != null) {
            return showingForActionMode;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
