package p040o;

import com.scb.phone.data.network.api.justforyou.JustForYouApi;
import com.scb.phone.data.network.service.justforyou.JustForYouService;

/* renamed from: o.buildDataHolder */
public final class buildDataHolder implements OPRStatusRewardsLandingActivity_ViewBinding<JustForYouApi> {
    private final HmlReviewDocumentActivity<JustForYouService> write;

    private buildDataHolder(HmlReviewDocumentActivity<JustForYouService> hmlReviewDocumentActivity) {
        this.write = hmlReviewDocumentActivity;
    }

    public static buildDataHolder write(HmlReviewDocumentActivity<JustForYouService> hmlReviewDocumentActivity) {
        return new buildDataHolder(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new JustForYouApi(this.write.get());
    }
}
