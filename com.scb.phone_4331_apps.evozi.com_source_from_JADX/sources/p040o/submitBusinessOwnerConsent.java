package p040o;

import com.scb.phone.view.fragment.directdebit.DirectDebitInputBillerListFragment;

/* renamed from: o.submitBusinessOwnerConsent */
public final class submitBusinessOwnerConsent implements MileageQuantitySelectionActivity<DirectDebitInputBillerListFragment> {
    public static void write(DirectDebitInputBillerListFragment directDebitInputBillerListFragment, XVrsPhaseDetector xVrsPhaseDetector) {
        directDebitInputBillerListFragment.presenter = xVrsPhaseDetector;
    }
}
