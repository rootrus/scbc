package p040o;

import com.scb.phone.data.network.service.easycash.EasycashCommercialInfoService;
import com.scb.phone.view.activity.hml.businessowner.HmlNTBBusinessIndustrySelectionActivity;

/* renamed from: o.override */
public final class override implements OPRStatusRewardsLandingActivity_ViewBinding<HmlNTBBusinessIndustrySelectionActivity.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<EasycashCommercialInfoService> read;

    private override(HmlReviewDocumentActivity<EasycashCommercialInfoService> hmlReviewDocumentActivity) {
        this.read = hmlReviewDocumentActivity;
    }

    public static override MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<EasycashCommercialInfoService> hmlReviewDocumentActivity) {
        return new override(hmlReviewDocumentActivity);
    }

    public final /* synthetic */ Object get() {
        return new HmlNTBBusinessIndustrySelectionActivity.IconCompatParcelizer(this.read.get());
    }
}
