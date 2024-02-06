package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.MediaImageService;

/* renamed from: o.DowngradeableSafeParcel */
public final class DowngradeableSafeParcel implements OPRStatusRewardsLandingActivity_ViewBinding<MediaImageService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> write;

    private DowngradeableSafeParcel(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static DowngradeableSafeParcel MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new DowngradeableSafeParcel(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        MediaImageService onMenuItemClickListener = this.IconCompatParcelizer.setOnMenuItemClickListener(this.write.get());
        if (onMenuItemClickListener != null) {
            return onMenuItemClickListener;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
