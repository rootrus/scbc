package p040o;

import com.scb.phone.view.fragment.otppin.MobileListFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlNTBDocumentInstructionsActivity */
public final class ActivityBuilder_ContributeHmlNTBDocumentInstructionsActivity implements MileageQuantitySelectionActivity<MobileListFragment> {
    public static void IconCompatParcelizer(MobileListFragment mobileListFragment, AppStatsState appStatsState) {
        mobileListFragment.mobileNumberPresenter = appStatsState;
    }

    public static void write(MobileListFragment mobileListFragment, countIn countin) {
        mobileListFragment.appConfigUseCase = countin;
    }
}
