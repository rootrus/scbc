package p040o;

import com.scb.phone.data.network.p034di.ServiceModule;
import com.scb.phone.data.network.service.hml.HmlConsentService;

/* renamed from: o.onSetConnectState */
public final class onSetConnectState implements OPRStatusRewardsLandingActivity_ViewBinding<HmlConsentService> {
    private final ServiceModule IconCompatParcelizer;
    private final HmlReviewDocumentActivity<zaaa> read;

    private onSetConnectState(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = serviceModule;
        this.read = hmlReviewDocumentActivity;
    }

    public static onSetConnectState IconCompatParcelizer(ServiceModule serviceModule, HmlReviewDocumentActivity<zaaa> hmlReviewDocumentActivity) {
        return new onSetConnectState(serviceModule, hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        HmlConsentService contentView = this.IconCompatParcelizer.setContentView(this.read.get());
        if (contentView != null) {
            return contentView;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
