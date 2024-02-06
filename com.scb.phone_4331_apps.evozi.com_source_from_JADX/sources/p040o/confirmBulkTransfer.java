package p040o;

import android.view.View;
import com.scb.phone.view.adapter.help.HelpAdapter;

/* renamed from: o.confirmBulkTransfer */
public final /* synthetic */ class confirmBulkTransfer implements View.OnClickListener {
    private final /* synthetic */ HelpAdapter read;
    private final /* synthetic */ int write;

    public /* synthetic */ confirmBulkTransfer(HelpAdapter helpAdapter, int i) {
        this.read = helpAdapter;
        this.write = i;
    }

    public final void onClick(View view) {
        HelpAdapter helpAdapter = this.read;
        int i = this.write;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment = helpAdapter.write;
        if (fragmentBuilder_BindCcSofBillPaymentOnlyFragment != null) {
            fragmentBuilder_BindCcSofBillPaymentOnlyFragment.read(i);
        }
    }
}
