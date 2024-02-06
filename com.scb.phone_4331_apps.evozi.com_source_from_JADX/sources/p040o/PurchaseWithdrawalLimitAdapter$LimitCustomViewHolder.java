package p040o;

import java.nio.charset.Charset;

/* renamed from: o.PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder */
public abstract class PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder implements SelectionAdapter$SelectionHolder_ViewBinding {
    public final CreditCardDetailUnbilledAdapter$ParentViewHolder MediaBrowserCompat$ItemReceiver;

    public PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder(CreditCardDetailUnbilledAdapter$ParentViewHolder creditCardDetailUnbilledAdapter$ParentViewHolder) {
        C6431x12296157.write(creditCardDetailUnbilledAdapter$ParentViewHolder, "Content type");
        this.MediaBrowserCompat$ItemReceiver = creditCardDetailUnbilledAdapter$ParentViewHolder;
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.write;
    }

    public String MediaBrowserCompat$CustomActionResultReceiver() {
        Charset charset = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        if (charset != null) {
            return charset.name();
        }
        return null;
    }
}
