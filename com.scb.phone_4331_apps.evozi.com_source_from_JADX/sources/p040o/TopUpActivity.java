package p040o;

/* renamed from: o.TopUpActivity */
public final class TopUpActivity implements LinkAndUnlinkPromptPayActivity, PromptPayQRActivity {
    private final boolean IconCompatParcelizer;
    private final boolean write;

    private TopUpActivity(byte b) {
        this.write = true;
        this.IconCompatParcelizer = true;
    }

    public TopUpActivity() {
        this((byte) 0);
    }

    public final ManagePromptpayLandingActivity IconCompatParcelizer() {
        return new CardlessATMReviewActivity(true, true);
    }

    public final ManagePromptpayLandingActivity write(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        return new CardlessATMReviewActivity(true, true);
    }
}
