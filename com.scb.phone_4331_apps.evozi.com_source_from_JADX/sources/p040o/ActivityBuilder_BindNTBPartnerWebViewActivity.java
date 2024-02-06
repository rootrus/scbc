package p040o;

import com.scb.phone.view.fragment.investment.fundswitch.FundSwitchReviewFragment;

/* renamed from: o.ActivityBuilder_BindNTBPartnerWebViewActivity */
public final class ActivityBuilder_BindNTBPartnerWebViewActivity implements MileageQuantitySelectionActivity<FundSwitchReviewFragment> {
    public static void write(FundSwitchReviewFragment fundSwitchReviewFragment, setSearchDirection setsearchdirection) {
        fundSwitchReviewFragment.switchReviewPresenter = setsearchdirection;
    }
}
