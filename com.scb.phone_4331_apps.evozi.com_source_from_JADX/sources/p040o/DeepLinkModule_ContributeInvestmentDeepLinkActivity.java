package p040o;

import com.scb.phone.presentation.presenter.emailverification.EmailOtpPresenter;
import com.scb.phone.view.fragment.emailverification.ManageEmailVerificationFragment;

/* renamed from: o.DeepLinkModule_ContributeInvestmentDeepLinkActivity */
public final class DeepLinkModule_ContributeInvestmentDeepLinkActivity implements MileageQuantitySelectionActivity<ManageEmailVerificationFragment> {
    public static void write(ManageEmailVerificationFragment manageEmailVerificationFragment, EmailOtpPresenter emailOtpPresenter) {
        manageEmailVerificationFragment.emailOtpPresenter = emailOtpPresenter;
    }
}
