package p040o;

import android.view.View;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment;

/* renamed from: o.ActivityBuilder_EasycashCreditPowerInformationActivity */
public final /* synthetic */ class ActivityBuilder_EasycashCreditPowerInformationActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ BillPaymentBillerSelectedFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_EasycashCreditPowerInformationActivity(BillPaymentBillerSelectedFragment billPaymentBillerSelectedFragment) {
        this.MediaBrowserCompat$ItemReceiver = billPaymentBillerSelectedFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(z);
    }
}
