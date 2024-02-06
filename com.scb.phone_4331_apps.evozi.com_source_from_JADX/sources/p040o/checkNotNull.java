package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.csent.CSentService;

/* renamed from: o.checkNotNull */
public final class checkNotNull implements OPRStatusRewardsLandingActivity_ViewBinding<CSentService> {
    private final ServiceModule read;
    private final HmlReviewDocumentActivity<zaaa> write;

    private checkNotNull(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.read = serviceModule;
        this.write = hmlReviewDocumentActivity;
    }

    public static checkNotNull write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new checkNotNull(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        CSentService MediaMetadataCompat = this.read.MediaMetadataCompat(this.write.get());
        if (MediaMetadataCompat != null) {
            return MediaMetadataCompat;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
