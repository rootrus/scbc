package p040o;

import com.scb.phone.data.network.api.remittance.RemittanceApi;
import com.scb.phone.data.network.service.remittance.RemittanceService;

/* renamed from: o.freezeAndClose */
public final class freezeAndClose implements OPRStatusRewardsLandingActivity_ViewBinding<RemittanceApi> {
    private final HmlReviewDocumentActivity<RemittanceService> write;

    private freezeAndClose(HmlReviewDocumentActivity<RemittanceService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static freezeAndClose MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<RemittanceService> hmlReviewDocumentActivity) {
        return new freezeAndClose(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new RemittanceApi(this.write.get());
    }
}
