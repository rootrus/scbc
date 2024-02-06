package p040o;

import com.scb.phone.data.network.service.SecuritiesService;
import com.scb.phone.view.activity.deeplink.C5587xcce9efa1;

/* renamed from: o.zap */
public final class zap implements OPRStatusRewardsLandingActivity_ViewBinding<C5587xcce9efa1> {
    private final HmlReviewDocumentActivity<SecuritiesService> read;

    private zap(HmlReviewDocumentActivity<SecuritiesService> hmlReviewDocumentActivity) {
        this.read = hmlReviewDocumentActivity;
    }

    public static zap read(HmlReviewDocumentActivity<SecuritiesService> hmlReviewDocumentActivity) {
        return new zap(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new C5587xcce9efa1(this.read.get());
    }
}
