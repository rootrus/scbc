package p040o;

import com.scb.phone.view.fragment.ebillsubscription.EbillSubscriptionReviewFragment;

/* renamed from: o.DeepLinkModule_ContributeHmlBusinessOwnerSummaryDeepLinkActivity */
public final class DeepLinkModule_ContributeHmlBusinessOwnerSummaryDeepLinkActivity implements MileageQuantitySelectionActivity<EbillSubscriptionReviewFragment> {
    public static void read(EbillSubscriptionReviewFragment ebillSubscriptionReviewFragment, PassportDetectionSettings passportDetectionSettings) {
        ebillSubscriptionReviewFragment.eBillSubscriptionReviewPresenter = passportDetectionSettings;
    }
}
