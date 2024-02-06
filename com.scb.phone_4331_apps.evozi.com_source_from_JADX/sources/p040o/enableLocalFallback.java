package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.EDonationService;

/* renamed from: o.enableLocalFallback */
public final class enableLocalFallback implements OPRStatusRewardsLandingActivity_ViewBinding<EDonationService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$ItemReceiver;

    private enableLocalFallback(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static enableLocalFallback MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new enableLocalFallback(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        EDonationService MediaSessionCompat$Token = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token(this.IconCompatParcelizer.get());
        if (MediaSessionCompat$Token != null) {
            return MediaSessionCompat$Token;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
