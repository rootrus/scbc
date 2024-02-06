package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.CCContentService;

/* renamed from: o.checkNotMainThread */
public final class checkNotMainThread implements OPRStatusRewardsLandingActivity_ViewBinding<CCContentService> {
    private final HmlReviewDocumentActivity<zaaa> IconCompatParcelizer;
    private final ServiceModule write;

    private checkNotMainThread(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.write = serviceModule;
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static checkNotMainThread write(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new checkNotMainThread(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        CCContentService read = this.write.read(this.IconCompatParcelizer.get());
        if (read != null) {
            return read;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
