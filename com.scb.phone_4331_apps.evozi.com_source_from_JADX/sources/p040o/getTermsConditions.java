package p040o;

import com.scb.phone.view.fragment.debitcard.DebitCardActivationInputFragment;

/* renamed from: o.getTermsConditions */
public final class getTermsConditions implements MileageQuantitySelectionActivity<DebitCardActivationInputFragment> {
    public static void write(DebitCardActivationInputFragment debitCardActivationInputFragment, nativeGetRows nativegetrows) {
        debitCardActivationInputFragment.presenter = nativegetrows;
    }
}
