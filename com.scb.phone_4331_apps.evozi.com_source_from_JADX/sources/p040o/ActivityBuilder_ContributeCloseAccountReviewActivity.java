package p040o;

import com.scb.phone.view.fragment.investment.select.SelectInvestmentFragment;

/* renamed from: o.ActivityBuilder_ContributeCloseAccountReviewActivity */
public final class ActivityBuilder_ContributeCloseAccountReviewActivity implements MileageQuantitySelectionActivity<SelectInvestmentFragment> {
    public static void write(SelectInvestmentFragment selectInvestmentFragment, getSteadyMessage getsteadymessage) {
        selectInvestmentFragment.selectInvestmentPresenter = getsteadymessage;
    }
}
