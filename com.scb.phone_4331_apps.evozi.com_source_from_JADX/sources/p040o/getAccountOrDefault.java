package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.paynow.PayNowService;

/* renamed from: o.getAccountOrDefault */
public final class getAccountOrDefault implements OPRStatusRewardsLandingActivity_ViewBinding<PayNowService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> read;

    private getAccountOrDefault(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static getAccountOrDefault read(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new getAccountOrDefault(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        PayNowService MenuItemImpl = this.IconCompatParcelizer.MenuItemImpl(this.read.get());
        if (MenuItemImpl != null) {
            return MenuItemImpl;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
