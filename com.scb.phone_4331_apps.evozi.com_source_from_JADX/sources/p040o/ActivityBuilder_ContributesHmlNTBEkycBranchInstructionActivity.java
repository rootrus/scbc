package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.transferandpay.SuccessFragment;

/* renamed from: o.ActivityBuilder_ContributesHmlNTBEkycBranchInstructionActivity */
public final class ActivityBuilder_ContributesHmlNTBEkycBranchInstructionActivity {
    private static HistoryAdapter$GroupFooterViewHolder MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public static final String[] write = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void write(SuccessFragment successFragment, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(successFragment.requireActivity(), write)) {
            successFragment.IconCompatParcelizer(z);
            return;
        }
        MediaBrowserCompat$ItemReceiver = new C6325x147f1e7f(successFragment, z, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.write(successFragment, write)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$ItemReceiver;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(successFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new ActivityBuilder_ContributeTouchPointWebViewActivity(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new ActivityBuilder_ContributeTouchPointWifiSettingsActivity(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        successFragment.requestPermissions(write, 61);
    }

    public static void read(SuccessFragment successFragment, int i, int[] iArr) {
        if (i == 61) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$ItemReceiver;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(successFragment, write)) {
                SuccessFragment.MediaBrowserCompat$ItemReceiver();
            } else {
                SuccessFragment.IconCompatParcelizer();
            }
            MediaBrowserCompat$ItemReceiver = null;
        }
    }
}
