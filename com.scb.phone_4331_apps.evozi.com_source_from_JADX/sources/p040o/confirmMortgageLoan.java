package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.AccountSourceAdapter;

/* renamed from: o.confirmMortgageLoan */
public final /* synthetic */ class confirmMortgageLoan implements View.OnClickListener {
    private final /* synthetic */ AccountSourceAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ confirmMortgageLoan(AccountSourceAdapter accountSourceAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = accountSourceAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        AccountSourceAdapter accountSourceAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment = accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindCcSofBillPaymentOnlyFragment != null) {
            fragmentBuilder_BindCcSofBillPaymentOnlyFragment.read(i);
        }
    }
}
