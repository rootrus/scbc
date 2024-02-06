package p040o;

import com.scb.phone.data.network.service.RequestToPayService;
import com.scb.phone.view.activity.deeplink.C5586x287d9eb4;

/* renamed from: o.initialValue */
public final class initialValue implements OPRStatusRewardsLandingActivity_ViewBinding<C5586x287d9eb4> {
    private final HmlReviewDocumentActivity<RequestToPayService> write;

    private initialValue(HmlReviewDocumentActivity<RequestToPayService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static initialValue write(HmlReviewDocumentActivity<RequestToPayService> hmlReviewDocumentActivity) {
        return new initialValue(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C5586x287d9eb4(this.write.get());
    }
}
