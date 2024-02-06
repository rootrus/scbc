package p040o;

/* renamed from: o.ChequeDetailListAdapter$ChequeItemHolder_ViewBinding */
public final class ChequeDetailListAdapter$ChequeItemHolder_ViewBinding extends ChequeDetailListAdapter$ChequeItemHolder implements PrivacyConsentActivity {
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private ManageNotificationsActivity write;

    public ChequeDetailListAdapter$ChequeItemHolder_ViewBinding(String str, String str2, ReviewAccountsActivity reviewAccountsActivity) {
        this(new PaymentInfoAdapter$ViewTypeTextHolder(str, str2, reviewAccountsActivity));
    }

    private ChequeDetailListAdapter$ChequeItemHolder_ViewBinding(ManageNotificationsActivity manageNotificationsActivity) {
        this.write = (ManageNotificationsActivity) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(manageNotificationsActivity, "Request line");
        this.IconCompatParcelizer = manageNotificationsActivity.MediaBrowserCompat$ItemReceiver();
        this.MediaBrowserCompat$ItemReceiver = manageNotificationsActivity.read();
    }

    public final ReviewAccountsActivity MediaBrowserCompat$ItemReceiver() {
        return MediaBrowserCompat$MediaItem().MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final ManageNotificationsActivity MediaBrowserCompat$MediaItem() {
        if (this.write == null) {
            this.write = new PaymentInfoAdapter$ViewTypeTextHolder(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, ManageAccountInboundActivity.IconCompatParcelizer);
        }
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append(' ');
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(' ');
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        return sb.toString();
    }
}
