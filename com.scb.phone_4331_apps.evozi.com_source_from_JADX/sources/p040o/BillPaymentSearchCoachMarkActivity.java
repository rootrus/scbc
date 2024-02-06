package p040o;

/* renamed from: o.BillPaymentSearchCoachMarkActivity */
public final class BillPaymentSearchCoachMarkActivity implements LinkAndUnlinkPromptPayActivity, PromptPayQRActivity {
    private final boolean MediaBrowserCompat$ItemReceiver;
    private final boolean read;

    private BillPaymentSearchCoachMarkActivity(byte b) {
        this.MediaBrowserCompat$ItemReceiver = true;
        this.read = true;
    }

    public BillPaymentSearchCoachMarkActivity() {
        this((byte) 0);
    }

    public final ManagePromptpayLandingActivity IconCompatParcelizer() {
        return new BillPaymentSuccessActivity(true, true);
    }

    public final ManagePromptpayLandingActivity write(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        return new BillPaymentSuccessActivity(true, true);
    }
}
