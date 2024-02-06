package p040o;

import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;

/* renamed from: o.getSetupDetails */
public final class getSetupDetails implements MileageQuantitySelectionActivity<DepositDetailTransactionFragment> {
    public static void MediaBrowserCompat$CustomActionResultReceiver(DepositDetailTransactionFragment depositDetailTransactionFragment, getLastReturnCode getlastreturncode) {
        depositDetailTransactionFragment.mDepositTransactionPresenter = getlastreturncode;
    }
}
