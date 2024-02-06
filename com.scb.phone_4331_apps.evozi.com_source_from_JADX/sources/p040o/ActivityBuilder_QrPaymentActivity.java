package p040o;

import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.fragment.transferandpay.cardlessatm.CardlessWithdrawAmountFragment;

/* renamed from: o.ActivityBuilder_QrPaymentActivity */
public final /* synthetic */ class ActivityBuilder_QrPaymentActivity implements AmountEditText.IconCompatParcelizer {
    private final /* synthetic */ double MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CardlessWithdrawAmountFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ double read;

    public /* synthetic */ ActivityBuilder_QrPaymentActivity(CardlessWithdrawAmountFragment cardlessWithdrawAmountFragment, double d, double d2) {
        this.MediaBrowserCompat$ItemReceiver = cardlessWithdrawAmountFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.read = d2;
    }

    public final void IconCompatParcelizer() {
        CardlessWithdrawAmountFragment cardlessWithdrawAmountFragment = this.MediaBrowserCompat$ItemReceiver;
        cardlessWithdrawAmountFragment.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
        cardlessWithdrawAmountFragment.PlaybackStateCompat$CustomAction();
    }
}
