package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.DirectDebitService;

/* renamed from: o.setPolicyAction */
public final class setPolicyAction implements OPRStatusRewardsLandingActivity_ViewBinding<DirectDebitService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule MediaBrowserCompat$ItemReceiver;

    private setPolicyAction(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static setPolicyAction write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new setPolicyAction(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        DirectDebitService MediaSessionCompat$ResultReceiverWrapper = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper(this.IconCompatParcelizer.get());
        if (MediaSessionCompat$ResultReceiverWrapper != null) {
            return MediaSessionCompat$ResultReceiverWrapper;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
