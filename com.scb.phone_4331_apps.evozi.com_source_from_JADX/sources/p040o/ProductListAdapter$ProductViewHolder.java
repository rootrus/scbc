package p040o;

/* renamed from: o.ProductListAdapter$ProductViewHolder */
public final class ProductListAdapter$ProductViewHolder {
    public static final ProductListAdapter$ProductViewHolder MediaBrowserCompat$CustomActionResultReceiver = new ProductListAdapter$ProductViewHolder();

    public final DepositTransactionAdapter$ChildViewHolder_ViewBinding write(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, AddAccountsActivity addAccountsActivity, boolean z) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(addAccountsActivity, "Name / value pair");
        int read = read(addAccountsActivity);
        if (depositTransactionAdapter$ChildViewHolder_ViewBinding == null) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(read);
        } else if (read > 0) {
            int length = depositTransactionAdapter$ChildViewHolder_ViewBinding.write.length;
            int i = depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer;
            if (read > length - i) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer(i + read);
            }
        }
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(addAccountsActivity.IconCompatParcelizer());
        String MediaBrowserCompat$ItemReceiver = addAccountsActivity.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver != null) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read('=');
            MediaBrowserCompat$CustomActionResultReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, MediaBrowserCompat$ItemReceiver, z);
        }
        return depositTransactionAdapter$ChildViewHolder_ViewBinding;
    }

    public static int read(AddAccountsActivity addAccountsActivity) {
        if (addAccountsActivity == null) {
            return 0;
        }
        int length = addAccountsActivity.IconCompatParcelizer().length();
        String MediaBrowserCompat$ItemReceiver = addAccountsActivity.MediaBrowserCompat$ItemReceiver();
        return MediaBrowserCompat$ItemReceiver != null ? length + MediaBrowserCompat$ItemReceiver.length() + 3 : length;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, String str, boolean z) {
        if (!z) {
            for (int i = 0; i < str.length() && !z; i++) {
                z = " ;,:@()<>\\\"/[]?={}\t".indexOf(str.charAt(i)) >= 0;
            }
        }
        if (z) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read('\"');
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if ("\"\\".indexOf(charAt) >= 0) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read('\\');
            }
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(charAt);
        }
        if (z) {
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read('\"');
        }
    }
}
