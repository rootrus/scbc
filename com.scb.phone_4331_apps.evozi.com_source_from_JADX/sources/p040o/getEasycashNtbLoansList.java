package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.PaybackPeriodAdapter;

/* renamed from: o.getEasycashNtbLoansList */
public final /* synthetic */ class getEasycashNtbLoansList implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ PaybackPeriodAdapter write;

    public /* synthetic */ getEasycashNtbLoansList(PaybackPeriodAdapter paybackPeriodAdapter, int i) {
        this.write = paybackPeriodAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        PaybackPeriodAdapter paybackPeriodAdapter = this.write;
        int i = this.IconCompatParcelizer;
        if (paybackPeriodAdapter.write != i) {
            paybackPeriodAdapter.write = i;
            paybackPeriodAdapter.IconCompatParcelizer.write();
            paybackPeriodAdapter.read.read(i);
        }
    }
}
