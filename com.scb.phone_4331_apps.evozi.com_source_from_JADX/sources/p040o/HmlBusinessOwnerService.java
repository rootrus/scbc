package p040o;

import com.scb.phone.view.fragment.debitcard.DebitCardSuccessfulActivationFragment;

/* renamed from: o.HmlBusinessOwnerService */
public final class HmlBusinessOwnerService implements MileageQuantitySelectionActivity<DebitCardSuccessfulActivationFragment> {
    public static void read(DebitCardSuccessfulActivationFragment debitCardSuccessfulActivationFragment, CaptureGuidance captureGuidance) {
        debitCardSuccessfulActivationFragment.debitCardSuccessfulActivationPresenter = captureGuidance;
    }
}
