package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerSelectedFragment;

/* renamed from: o.ActivityBuilder_EasycashCreditPowerSummaryActivity */
public final /* synthetic */ class ActivityBuilder_EasycashCreditPowerSummaryActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ BillPaymentBillerSelectedFragment write;

    public /* synthetic */ ActivityBuilder_EasycashCreditPowerSummaryActivity(BillPaymentBillerSelectedFragment billPaymentBillerSelectedFragment, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.write = billPaymentBillerSelectedFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = setuuidfromutf8bytes;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
