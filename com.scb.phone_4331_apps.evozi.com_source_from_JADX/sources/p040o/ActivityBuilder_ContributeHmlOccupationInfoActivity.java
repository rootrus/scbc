package p040o;

import com.scb.phone.view.fragment.prepaid.cashout.PrepaidCashOutSuccessFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlOccupationInfoActivity */
public final class ActivityBuilder_ContributeHmlOccupationInfoActivity implements MileageQuantitySelectionActivity<PrepaidCashOutSuccessFragment> {
    public static void read(PrepaidCashOutSuccessFragment prepaidCashOutSuccessFragment, IFaceDetectionResult iFaceDetectionResult) {
        prepaidCashOutSuccessFragment.successPresenter = iFaceDetectionResult;
    }
}
