package p040o;

import com.scb.phone.data.network.service.DealsService;
import p040o.C4750hg;

/* renamed from: o.zabt */
public final class zabt implements OPRStatusRewardsLandingActivity_ViewBinding<C4750hg.write> {
    private final HmlReviewDocumentActivity<DealsService> write;

    private zabt(HmlReviewDocumentActivity<DealsService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static zabt write(HmlReviewDocumentActivity<DealsService> hmlReviewDocumentActivity) {
        return new zabt(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C4750hg.write(this.write.get());
    }
}
