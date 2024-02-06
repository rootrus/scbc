package p040o;

import com.scb.phone.data.network.api.juristic.JuristicApi;
import com.scb.phone.data.network.service.juristic.JuristicService;

/* renamed from: o.addValue */
public final class addValue implements OPRStatusRewardsLandingActivity_ViewBinding<JuristicApi> {
    private final HmlReviewDocumentActivity<JuristicService> IconCompatParcelizer;

    private addValue(HmlReviewDocumentActivity<JuristicService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static addValue IconCompatParcelizer(HmlReviewDocumentActivity<JuristicService> hmlReviewDocumentActivity) {
        return new addValue(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new JuristicApi(this.IconCompatParcelizer.get());
    }
}
