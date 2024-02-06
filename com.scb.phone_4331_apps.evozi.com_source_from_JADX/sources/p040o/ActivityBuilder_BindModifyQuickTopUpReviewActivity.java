package p040o;

import com.scb.phone.view.fragment.investment.funddetails.InvestmentFundDetailFragment;

/* renamed from: o.ActivityBuilder_BindModifyQuickTopUpReviewActivity */
public final class ActivityBuilder_BindModifyQuickTopUpReviewActivity implements MileageQuantitySelectionActivity<InvestmentFundDetailFragment> {
    public static void read(InvestmentFundDetailFragment investmentFundDetailFragment, addBarCodeFoundEventListener addbarcodefoundeventlistener) {
        investmentFundDetailFragment.investmentFundDetailsPresenter = addbarcodefoundeventlistener;
    }
}
