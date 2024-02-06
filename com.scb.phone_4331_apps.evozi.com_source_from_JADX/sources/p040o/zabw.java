package p040o;

import com.scb.phone.data.network.service.EDonationService;
import p040o.IExtractionServer;

/* renamed from: o.zabw */
public final class zabw implements OPRStatusRewardsLandingActivity_ViewBinding<IExtractionServer.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<EDonationService> write;

    private zabw(HmlReviewDocumentActivity<EDonationService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static zabw IconCompatParcelizer(HmlReviewDocumentActivity<EDonationService> hmlReviewDocumentActivity) {
        return new zabw(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new IExtractionServer.IconCompatParcelizer(this.write.get());
    }
}
