package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.OtpService;

/* renamed from: o.prepareForClientVersion */
public final class prepareForClientVersion implements OPRStatusRewardsLandingActivity_ViewBinding<OtpService> {
    private final HmlReviewDocumentActivity<zaaa> MediaBrowserCompat$CustomActionResultReceiver;
    private final ServiceModule write;

    private prepareForClientVersion(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static prepareForClientVersion IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new prepareForClientVersion(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        OtpService presenter = this.write.setPresenter(this.MediaBrowserCompat$CustomActionResultReceiver.get());
        if (presenter != null) {
            return presenter;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
