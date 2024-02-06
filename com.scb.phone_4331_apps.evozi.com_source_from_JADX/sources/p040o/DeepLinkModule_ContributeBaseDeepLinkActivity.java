package p040o;

import com.scb.phone.view.custom.easycash.CustomDeltaSlider;
import com.scb.phone.view.fragment.easycash.loaninformation.BaseFeaturesLoanInformationFragment;

/* renamed from: o.DeepLinkModule_ContributeBaseDeepLinkActivity */
public final class DeepLinkModule_ContributeBaseDeepLinkActivity<T extends CustomDeltaSlider> implements MileageQuantitySelectionActivity<BaseFeaturesLoanInformationFragment<T>> {
    public static <T extends CustomDeltaSlider> void write(BaseFeaturesLoanInformationFragment<T> baseFeaturesLoanInformationFragment, forEachClear foreachclear) {
        baseFeaturesLoanInformationFragment.tracker = foreachclear;
    }
}
