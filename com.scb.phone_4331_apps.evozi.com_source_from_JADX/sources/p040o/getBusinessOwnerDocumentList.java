package p040o;

import com.scb.phone.view.adapter.deposit.DepositTransactionAdapter;
import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;
import java.util.List;

/* renamed from: o.getBusinessOwnerDocumentList */
public final /* synthetic */ class getBusinessOwnerDocumentList implements Runnable {
    private final /* synthetic */ DepositTransactionAdapter read;
    private final /* synthetic */ List write;

    public /* synthetic */ getBusinessOwnerDocumentList(DepositTransactionAdapter depositTransactionAdapter, List list) {
        this.read = depositTransactionAdapter;
        this.write = list;
    }

    public final void run() {
        DepositDetailTransactionFragment.MediaBrowserCompat$ItemReceiver(this.read, this.write);
    }
}
