package p040o;

import android.view.View;
import com.scb.phone.view.adapter.chequemanagement.ManageChequeAdapter;

/* renamed from: o.postMailingAddressGoodToKnow */
public final /* synthetic */ class postMailingAddressGoodToKnow implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ ManageChequeAdapter MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ postMailingAddressGoodToKnow(ManageChequeAdapter manageChequeAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = manageChequeAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        ManageChequeAdapter manageChequeAdapter = this.MediaBrowserCompat$ItemReceiver;
        int i = this.IconCompatParcelizer;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment = manageChequeAdapter.read;
        if (fragmentBuilder_BindCcSofBillPaymentOnlyFragment != null) {
            fragmentBuilder_BindCcSofBillPaymentOnlyFragment.read(i);
        }
    }
}
