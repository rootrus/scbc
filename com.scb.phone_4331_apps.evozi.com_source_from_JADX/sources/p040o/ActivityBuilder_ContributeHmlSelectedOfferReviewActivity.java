package p040o;

import com.scb.phone.view.fragment.prepaid.request.PrepaidRequestSuccessFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlSelectedOfferReviewActivity */
public final class ActivityBuilder_ContributeHmlSelectedOfferReviewActivity implements MileageQuantitySelectionActivity<PrepaidRequestSuccessFragment> {
    public static void write(PrepaidRequestSuccessFragment prepaidRequestSuccessFragment, onExtractionComplete onextractioncomplete) {
        prepaidRequestSuccessFragment.successPresenter = onextractioncomplete;
    }
}
