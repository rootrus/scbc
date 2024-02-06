package p040o;

import com.scb.phone.view.fragment.chequemanagement.stopcheque.StopChequeHistoryFragment;

/* renamed from: o.getSecuritiesTermsAndConditions */
public final class getSecuritiesTermsAndConditions implements MileageQuantitySelectionActivity<StopChequeHistoryFragment> {
    public static void read(StopChequeHistoryFragment stopChequeHistoryFragment, LazilyParsedNumber lazilyParsedNumber) {
        stopChequeHistoryFragment.presenter = lazilyParsedNumber;
    }
}
