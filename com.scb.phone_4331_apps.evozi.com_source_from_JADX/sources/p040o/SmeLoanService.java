package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.chequemanagement.ChequeSuccessFragment;

/* renamed from: o.SmeLoanService */
public final class SmeLoanService {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$ItemReceiver(ChequeSuccessFragment chequeSuccessFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(chequeSuccessFragment.requireActivity(), MediaBrowserCompat$CustomActionResultReceiver)) {
            chequeSuccessFragment.MediaBrowserCompat$SearchResultReceiver();
        } else if (ProxySourceAdapter$ItemViewHolder.write(chequeSuccessFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
            SmeLoanService$MediaBrowserCompat$ItemReceiver smeLoanService$MediaBrowserCompat$ItemReceiver = new SmeLoanService$MediaBrowserCompat$ItemReceiver(chequeSuccessFragment, (byte) 0);
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(chequeSuccessFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new setMaritalStatus(smeLoanService$MediaBrowserCompat$ItemReceiver));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new registerMobileNumber(smeLoanService$MediaBrowserCompat$ItemReceiver)).show();
        } else {
            chequeSuccessFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 10);
        }
    }

    public static void IconCompatParcelizer(ChequeSuccessFragment chequeSuccessFragment, int i, int[] iArr) {
        if (i != 10) {
            return;
        }
        if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            chequeSuccessFragment.MediaBrowserCompat$SearchResultReceiver();
        } else if (!ProxySourceAdapter$ItemViewHolder.write(chequeSuccessFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
            ChequeSuccessFragment.IconCompatParcelizer();
        } else {
            ChequeSuccessFragment.MediaBrowserCompat$MediaItem();
        }
    }
}
