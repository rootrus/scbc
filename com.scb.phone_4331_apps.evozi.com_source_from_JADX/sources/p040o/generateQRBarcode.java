package p040o;

import android.view.View;
import com.scb.phone.view.adapter.deposit.DepositTransactionAdapter;

/* renamed from: o.generateQRBarcode */
public final /* synthetic */ class generateQRBarcode implements View.OnClickListener {
    private final /* synthetic */ DepositTransactionAdapter read;

    public /* synthetic */ generateQRBarcode(DepositTransactionAdapter depositTransactionAdapter) {
        this.read = depositTransactionAdapter;
    }

    public final void onClick(View view) {
        DepositTransactionAdapter.write(this.read, view);
    }
}
