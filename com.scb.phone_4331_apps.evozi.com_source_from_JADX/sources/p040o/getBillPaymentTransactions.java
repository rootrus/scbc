package p040o;

import android.view.View;
import com.scb.phone.view.adapter.loan.SmeLoanDetailPnItemAdapter;

/* renamed from: o.getBillPaymentTransactions */
public final /* synthetic */ class getBillPaymentTransactions implements View.OnClickListener {
    private final /* synthetic */ SmeLoanDetailPnItemAdapter IconCompatParcelizer;

    public /* synthetic */ getBillPaymentTransactions(SmeLoanDetailPnItemAdapter smeLoanDetailPnItemAdapter) {
        this.IconCompatParcelizer = smeLoanDetailPnItemAdapter;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(view);
    }
}
