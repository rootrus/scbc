package p040o;

import java.io.Serializable;

/* renamed from: o.PaymentInfoAdapter$ViewTypeTextHolder */
public final class PaymentInfoAdapter$ViewTypeTextHolder implements ManageNotificationsActivity, Cloneable, Serializable {
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;
    private final ReviewAccountsActivity write;

    public PaymentInfoAdapter$ViewTypeTextHolder(String str, String str2, ReviewAccountsActivity reviewAccountsActivity) {
        this.read = (String) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Method");
        this.MediaBrowserCompat$ItemReceiver = (String) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str2, "URI");
        this.write = (ReviewAccountsActivity) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(reviewAccountsActivity, "Version");
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public final ReviewAccountsActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write;
    }

    public final String read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        return PaymentInfoAdapter$ViewTypeMiniQrHolder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((DepositTransactionAdapter$ChildViewHolder_ViewBinding) null, this).toString();
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
