package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.NTBTileService;

/* renamed from: o.onPostInitComplete */
public final class onPostInitComplete implements OPRStatusRewardsLandingActivity_ViewBinding<NTBTileService> {
    private final HmlReviewDocumentActivity<zaaa> read;
    private final ServiceModule write;

    private onPostInitComplete(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static onPostInitComplete read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new onPostInitComplete(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        NTBTileService itemInvoker = this.write.setItemInvoker(this.read.get());
        if (itemInvoker != null) {
            return itemInvoker;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
