package p040o;

import com.scb.phone.view.adapter.transferandpay.EBillAdapter;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.EBillPaymentBillerListFragment;
import java.util.List;

/* renamed from: o.ActivityBuilder_ExportStatementSuccessfulActivity */
public final /* synthetic */ class ActivityBuilder_ExportStatementSuccessfulActivity implements Runnable {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ EBillPaymentBillerListFragment read;

    public /* synthetic */ ActivityBuilder_ExportStatementSuccessfulActivity(EBillPaymentBillerListFragment eBillPaymentBillerListFragment, List list) {
        this.read = eBillPaymentBillerListFragment;
        this.IconCompatParcelizer = list;
    }

    public final void run() {
        EBillPaymentBillerListFragment eBillPaymentBillerListFragment = this.read;
        List list = this.IconCompatParcelizer;
        EBillAdapter eBillAdapter = eBillPaymentBillerListFragment.IconCompatParcelizer;
        eBillAdapter.MediaBrowserCompat$ItemReceiver.addAll(list);
        eBillAdapter.IconCompatParcelizer.write();
    }
}
