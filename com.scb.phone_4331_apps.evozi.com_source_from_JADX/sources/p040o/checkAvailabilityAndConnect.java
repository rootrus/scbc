package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.DebitCardATMService;

/* renamed from: o.checkAvailabilityAndConnect */
public final class checkAvailabilityAndConnect implements OPRStatusRewardsLandingActivity_ViewBinding<DebitCardATMService> {
    private final ServiceModule MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<zaaa> write;

    private checkAvailabilityAndConnect(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static checkAvailabilityAndConnect IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new checkAvailabilityAndConnect(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        DebitCardATMService ParcelableVolumeInfo = this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo(this.write.get());
        if (ParcelableVolumeInfo != null) {
            return ParcelableVolumeInfo;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
