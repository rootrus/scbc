package p040o;

import com.scb.phone.data.network.service.BillPaymentService;

/* renamed from: o.zaax */
public final class zaax implements OPRStatusRewardsLandingActivity_ViewBinding<getEnvLanguage$MediaBrowserCompat$CustomActionResultReceiver> {
    private final HmlReviewDocumentActivity<BillPaymentService> write;

    private zaax(HmlReviewDocumentActivity<BillPaymentService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static zaax read(HmlReviewDocumentActivity<BillPaymentService> hmlReviewDocumentActivity) {
        return new zaax(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new getEnvLanguage$MediaBrowserCompat$CustomActionResultReceiver(this.write.get());
    }
}
