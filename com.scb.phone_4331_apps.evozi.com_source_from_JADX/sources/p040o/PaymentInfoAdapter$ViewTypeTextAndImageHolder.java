package p040o;

import java.io.Serializable;

/* renamed from: o.PaymentInfoAdapter$ViewTypeTextAndImageHolder */
public final class PaymentInfoAdapter$ViewTypeTextAndImageHolder implements VerifyIdentityActivity, Cloneable, Serializable {
    private final int IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private final ReviewAccountsActivity write;

    public PaymentInfoAdapter$ViewTypeTextAndImageHolder(ReviewAccountsActivity reviewAccountsActivity, int i, String str) {
        this.write = (ReviewAccountsActivity) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(reviewAccountsActivity, "Version");
        this.IconCompatParcelizer = DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Status code");
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final ReviewAccountsActivity write() {
        return this.write;
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        PaymentInfoAdapter$ViewTypeMiniQrHolder paymentInfoAdapter$ViewTypeMiniQrHolder = PaymentInfoAdapter$ViewTypeMiniQrHolder.MediaBrowserCompat$CustomActionResultReceiver;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(this, "Status line");
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(64);
        int length = write().MediaBrowserCompat$ItemReceiver.length() + 4 + 1 + 3 + 1;
        String IconCompatParcelizer2 = IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            length += IconCompatParcelizer2.length();
        }
        if (length > 0) {
            int length2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write.length;
            int i = depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer;
            if (length > length2 - i) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer(i + length);
            }
        }
        PaymentInfoAdapter$ViewTypeMiniQrHolder.read(depositTransactionAdapter$ChildViewHolder_ViewBinding, write());
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(' ');
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(Integer.toString(MediaBrowserCompat$CustomActionResultReceiver()));
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(' ');
        if (IconCompatParcelizer2 != null) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(IconCompatParcelizer2);
        }
        return depositTransactionAdapter$ChildViewHolder_ViewBinding.toString();
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
