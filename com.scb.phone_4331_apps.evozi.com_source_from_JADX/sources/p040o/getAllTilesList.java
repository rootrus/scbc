package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.chubb.ChubbPaySuccessFragment;

/* renamed from: o.getAllTilesList */
public final class getAllTilesList {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static HistoryAdapter$GroupFooterViewHolder MediaBrowserCompat$ItemReceiver;

    public static void MediaBrowserCompat$ItemReceiver(ChubbPaySuccessFragment chubbPaySuccessFragment, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(chubbPaySuccessFragment.requireActivity(), MediaBrowserCompat$CustomActionResultReceiver)) {
            chubbPaySuccessFragment.MediaBrowserCompat$CustomActionResultReceiver(z);
            return;
        }
        MediaBrowserCompat$ItemReceiver = new getAllTilesList$MediaBrowserCompat$ItemReceiver(chubbPaySuccessFragment, z, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.write(chubbPaySuccessFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$ItemReceiver;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(chubbPaySuccessFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new getMutualFundTermsAndConditions(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new getTravelCardTermsAndConditions(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        chubbPaySuccessFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 11);
    }

    public static void MediaBrowserCompat$ItemReceiver(ChubbPaySuccessFragment chubbPaySuccessFragment, int i, int[] iArr) {
        if (i == 11) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$ItemReceiver;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(chubbPaySuccessFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
                ChubbPaySuccessFragment.MediaBrowserCompat$MediaItem();
            } else {
                ChubbPaySuccessFragment.MediaMetadataCompat();
            }
            MediaBrowserCompat$ItemReceiver = null;
        }
    }
}
