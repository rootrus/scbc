package p040o;

import com.scb.phone.view.adapter.deposit.DepositTransactionAdapter;
import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;

/* renamed from: o.getBusinessOwnerDocumentResubmissionList */
public final /* synthetic */ class getBusinessOwnerDocumentResubmissionList implements Runnable {
    private final /* synthetic */ DepositTransactionAdapter IconCompatParcelizer;
    private final /* synthetic */ DepositDetailTransactionFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getBusinessOwnerDocumentResubmissionList(DepositDetailTransactionFragment depositDetailTransactionFragment, DepositTransactionAdapter depositTransactionAdapter) {
        this.MediaBrowserCompat$ItemReceiver = depositDetailTransactionFragment;
        this.IconCompatParcelizer = depositTransactionAdapter;
    }

    public final void run() {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(true, (DepositTransactionAdapter.read) new getContactInfo(this.MediaBrowserCompat$ItemReceiver));
    }
}
