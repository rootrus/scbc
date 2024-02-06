package p040o;

import com.scb.phone.data.network.api.insurance.InsuranceApi;
import com.scb.phone.data.network.service.insurance.InsuranceService;

/* renamed from: o.onDataRangeRemoved */
public final class onDataRangeRemoved implements OPRStatusRewardsLandingActivity_ViewBinding<InsuranceApi> {
    private final HmlReviewDocumentActivity<InsuranceService> MediaBrowserCompat$CustomActionResultReceiver;

    private onDataRangeRemoved(HmlReviewDocumentActivity<InsuranceService> hmlReviewDocumentActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
    }

    public static onDataRangeRemoved read(HmlReviewDocumentActivity<InsuranceService> hmlReviewDocumentActivity) {
        return new onDataRangeRemoved(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new InsuranceApi(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
