package p040o;

/* renamed from: o.PaymentInfoAdapter$ViewTypeMiniQrHolder */
public final class PaymentInfoAdapter$ViewTypeMiniQrHolder implements AmountDetailsAdapter$DetailViewHolder {
    public static final PaymentInfoAdapter$ViewTypeMiniQrHolder MediaBrowserCompat$CustomActionResultReceiver = new PaymentInfoAdapter$ViewTypeMiniQrHolder();

    static DepositTransactionAdapter$ChildViewHolder_ViewBinding read(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, ReviewAccountsActivity reviewAccountsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(reviewAccountsActivity, "Protocol version");
        int length = reviewAccountsActivity.MediaBrowserCompat$ItemReceiver.length() + 4;
        if (depositTransactionAdapter$ChildViewHolder_ViewBinding == null) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(length);
        } else if (length > 0) {
            int length2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write.length;
            int i = depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer;
            if (length > length2 - i) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer(i + length);
            }
        }
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(reviewAccountsActivity.MediaBrowserCompat$ItemReceiver);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read('/');
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(Integer.toString(reviewAccountsActivity.IconCompatParcelizer()));
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read('.');
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(Integer.toString(reviewAccountsActivity.MediaBrowserCompat$ItemReceiver()));
        return depositTransactionAdapter$ChildViewHolder_ViewBinding;
    }

    public final DepositTransactionAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, ManageNotificationsActivity manageNotificationsActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(manageNotificationsActivity, "Request line");
        if (depositTransactionAdapter$ChildViewHolder_ViewBinding != null) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer = 0;
        } else {
            depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(64);
        }
        String MediaBrowserCompat$ItemReceiver = manageNotificationsActivity.MediaBrowserCompat$ItemReceiver();
        String read = manageNotificationsActivity.read();
        int length = MediaBrowserCompat$ItemReceiver.length();
        int length2 = length + 1 + read.length() + 1 + manageNotificationsActivity.MediaBrowserCompat$CustomActionResultReceiver().MediaBrowserCompat$ItemReceiver.length() + 4;
        if (length2 > 0) {
            int length3 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write.length;
            int i = depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer;
            if (length2 > length3 - i) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer(i + length2);
            }
        }
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(MediaBrowserCompat$ItemReceiver);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(' ');
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(read);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(' ');
        read(depositTransactionAdapter$ChildViewHolder_ViewBinding, manageNotificationsActivity.MediaBrowserCompat$CustomActionResultReceiver());
        return depositTransactionAdapter$ChildViewHolder_ViewBinding;
    }

    public final DepositTransactionAdapter$ChildViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidRequestMarketConductActivity, "Header");
        if (prepaidRequestMarketConductActivity instanceof PrepaidRequestLandingActivity) {
            return ((PrepaidRequestLandingActivity) prepaidRequestMarketConductActivity).read();
        }
        if (depositTransactionAdapter$ChildViewHolder_ViewBinding != null) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer = 0;
        } else {
            depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(64);
        }
        String IconCompatParcelizer = prepaidRequestMarketConductActivity.IconCompatParcelizer();
        String MediaBrowserCompat$ItemReceiver = prepaidRequestMarketConductActivity.MediaBrowserCompat$ItemReceiver();
        int length = IconCompatParcelizer.length() + 2;
        if (MediaBrowserCompat$ItemReceiver != null) {
            length += MediaBrowserCompat$ItemReceiver.length();
        }
        if (length > 0) {
            int length2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write.length;
            int i = depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer;
            if (length > length2 - i) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer(i + length);
            }
        }
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(IconCompatParcelizer);
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(": ");
        if (MediaBrowserCompat$ItemReceiver == null) {
            return depositTransactionAdapter$ChildViewHolder_ViewBinding;
        }
        int length3 = depositTransactionAdapter$ChildViewHolder_ViewBinding.length() + MediaBrowserCompat$ItemReceiver.length();
        if (length3 > 0) {
            int length4 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write.length;
            int i2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer;
            if (length3 > length4 - i2) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer(i2 + length3);
            }
        }
        for (int i3 = 0; i3 < MediaBrowserCompat$ItemReceiver.length(); i3++) {
            char charAt = MediaBrowserCompat$ItemReceiver.charAt(i3);
            if (charAt == 13 || charAt == 10 || charAt == 12 || charAt == 11) {
                charAt = ' ';
            }
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(charAt);
        }
        return depositTransactionAdapter$ChildViewHolder_ViewBinding;
    }
}
