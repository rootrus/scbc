package p040o;

import com.scb.phone.view.fragment.loan.SmeLoanDetailFragment;

/* renamed from: o.ActivityBuilder_ContributeETBSaleSheetSubAccountActivity */
public final class ActivityBuilder_ContributeETBSaleSheetSubAccountActivity implements MileageQuantitySelectionActivity<SmeLoanDetailFragment> {
    public static void read(SmeLoanDetailFragment smeLoanDetailFragment, logAppStats logappstats) {
        smeLoanDetailFragment.mPresenter = logappstats;
    }
}
