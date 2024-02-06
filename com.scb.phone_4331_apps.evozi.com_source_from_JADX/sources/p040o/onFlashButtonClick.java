package p040o;

import java.nio.charset.Charset;

/* renamed from: o.onFlashButtonClick */
public final class onFlashButtonClick implements LinkAndUnlinkPromptPayActivity, PromptPayQRActivity {
    private final Charset IconCompatParcelizer;

    private onFlashButtonClick(byte b) {
        this.IconCompatParcelizer = null;
    }

    public onFlashButtonClick() {
        this((byte) 0);
    }

    public final ManagePromptpayLandingActivity IconCompatParcelizer() {
        return new BillPaymentActivity();
    }

    public final ManagePromptpayLandingActivity write(CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder) {
        return new BillPaymentActivity((Charset) null);
    }
}
