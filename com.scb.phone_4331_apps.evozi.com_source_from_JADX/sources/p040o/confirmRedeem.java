package p040o;

import android.view.View;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;

/* renamed from: o.confirmRedeem */
public final /* synthetic */ class confirmRedeem implements View.OnClickListener {
    private final /* synthetic */ CustomTransferAndPayBiller MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ confirmRedeem(CustomTransferAndPayBiller customTransferAndPayBiller) {
        this.MediaBrowserCompat$ItemReceiver = customTransferAndPayBiller;
    }

    public final void onClick(View view) {
        FragmentBuilder_BindBillPaymentTabFragment fragmentBuilder_BindBillPaymentTabFragment = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        if (fragmentBuilder_BindBillPaymentTabFragment != null) {
            fragmentBuilder_BindBillPaymentTabFragment.aD_();
        }
    }
}
