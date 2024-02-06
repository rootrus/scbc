package p040o;

import com.scb.phone.presentation.presenter.investment.accountdetail.ScbsAccountDetailPresenter;
import com.scb.phone.view.fragment.investment.scbs.ScbsAccountDetailFragment;

/* renamed from: o.ActivityBuilder_BindSMELandingPageActivity */
public final class ActivityBuilder_BindSMELandingPageActivity implements MileageQuantitySelectionActivity<ScbsAccountDetailFragment> {
    public static void read(ScbsAccountDetailFragment scbsAccountDetailFragment, ScbsAccountDetailPresenter scbsAccountDetailPresenter) {
        scbsAccountDetailFragment.scbsAccountDetailPresenter = scbsAccountDetailPresenter;
    }
}
