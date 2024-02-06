package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.hml.HmlDocumentUploadService;

/* renamed from: o.onPostInitHandler */
public final class onPostInitHandler implements OPRStatusRewardsLandingActivity_ViewBinding<HmlDocumentUploadService> {
    private final HmlReviewDocumentActivity<zaaa> read;
    private final ServiceModule write;

    private onPostInitHandler(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static onPostInitHandler MediaBrowserCompat$CustomActionResultReceiver(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new onPostInitHandler(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        HmlDocumentUploadService checked = this.write.setChecked(this.read.get());
        if (checked != null) {
            return checked;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
