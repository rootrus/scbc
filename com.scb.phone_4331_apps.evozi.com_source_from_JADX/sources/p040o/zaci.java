package p040o;

import com.scb.phone.data.network.service.LimitService;
import p040o.C5080ny;

/* renamed from: o.zaci */
public final class zaci implements OPRStatusRewardsLandingActivity_ViewBinding<C5080ny.write> {
    private final HmlReviewDocumentActivity<LimitService> MediaBrowserCompat$CustomActionResultReceiver;

    private zaci(HmlReviewDocumentActivity<LimitService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static zaci MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<LimitService> hmlReviewDocumentActivity) {
        return new zaci(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C5080ny.write(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
