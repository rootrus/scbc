package p040o;

import com.scb.phone.view.fragment.investment.FundActionsSuccessFragment;

/* renamed from: o.ActivityBuilder_BindLoanInputActivity */
public final class ActivityBuilder_BindLoanInputActivity implements MileageQuantitySelectionActivity<FundActionsSuccessFragment> {
    public static void read(FundActionsSuccessFragment fundActionsSuccessFragment, WscSubmitRequest wscSubmitRequest) {
        fundActionsSuccessFragment.successPresenter = wscSubmitRequest;
    }

    public static void write(FundActionsSuccessFragment fundActionsSuccessFragment, FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment) {
        fundActionsSuccessFragment.successScreenshotHelper = fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment;
    }
}
