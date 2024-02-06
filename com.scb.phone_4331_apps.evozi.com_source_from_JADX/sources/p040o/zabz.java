package p040o;

import com.scb.phone.data.network.api.ForgotPinApi;
import com.scb.phone.data.network.service.ForgotPinService;

/* renamed from: o.zabz */
public final class zabz implements OPRStatusRewardsLandingActivity_ViewBinding<ForgotPinApi> {
    private final HmlReviewDocumentActivity<ForgotPinService> write;

    private zabz(HmlReviewDocumentActivity<ForgotPinService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static zabz MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<ForgotPinService> hmlReviewDocumentActivity) {
        return new zabz(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new ForgotPinApi(this.write.get());
    }
}
