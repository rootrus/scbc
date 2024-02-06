package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.BillerAdapter;

/* renamed from: o.deleteIssuer */
public final /* synthetic */ class deleteIssuer implements View.OnClickListener {
    private final /* synthetic */ int read;
    private final /* synthetic */ BillerAdapter write;

    public /* synthetic */ deleteIssuer(BillerAdapter billerAdapter, int i) {
        this.write = billerAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        BillerAdapter billerAdapter = this.write;
        int i = this.read;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment = billerAdapter.MediaDescriptionCompat;
        if (fragmentBuilder_BindCcSofBillPaymentOnlyFragment != null) {
            fragmentBuilder_BindCcSofBillPaymentOnlyFragment.read(i);
        }
    }
}
