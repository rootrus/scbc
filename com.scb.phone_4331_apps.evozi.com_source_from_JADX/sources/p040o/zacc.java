package p040o;

import com.scb.phone.data.network.service.FindUsService;
import p040o.getAddress4FieldName;

/* renamed from: o.zacc */
public final class zacc implements OPRStatusRewardsLandingActivity_ViewBinding<getAddress4FieldName.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<FindUsService> IconCompatParcelizer;

    private zacc(HmlReviewDocumentActivity<FindUsService> hmlReviewDocumentActivity) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
    }

    public static zacc read(HmlReviewDocumentActivity<FindUsService> hmlReviewDocumentActivity) {
        return new zacc(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new getAddress4FieldName.IconCompatParcelizer(this.IconCompatParcelizer.get());
    }
}
