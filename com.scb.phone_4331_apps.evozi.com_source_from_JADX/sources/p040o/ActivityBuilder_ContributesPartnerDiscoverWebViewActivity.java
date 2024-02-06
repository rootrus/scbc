package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.transferandpay.billpayment.BillPaymentSuccessFragment;

/* renamed from: o.ActivityBuilder_ContributesPartnerDiscoverWebViewActivity */
public final class ActivityBuilder_ContributesPartnerDiscoverWebViewActivity {
    private static HistoryAdapter$GroupFooterViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public static final String[] write = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$CustomActionResultReceiver(BillPaymentSuccessFragment billPaymentSuccessFragment, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(billPaymentSuccessFragment.requireActivity(), write)) {
            billPaymentSuccessFragment.IconCompatParcelizer(z);
            return;
        }
        MediaBrowserCompat$CustomActionResultReceiver = new C6327xab7aa57(billPaymentSuccessFragment, z, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.write(billPaymentSuccessFragment, write)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$CustomActionResultReceiver;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(billPaymentSuccessFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new ActivityBuilder_ContributesHmlNationalIdHelpActivity(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new ActivityBuilder_ContributesHmlSetNTBPinSuccessActivity(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        billPaymentSuccessFragment.requestPermissions(write, 6);
    }

    public static void read(BillPaymentSuccessFragment billPaymentSuccessFragment, int i, int[] iArr) {
        if (i == 6) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$CustomActionResultReceiver;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(billPaymentSuccessFragment, write)) {
                BillPaymentSuccessFragment.RatingCompat();
            } else {
                BillPaymentSuccessFragment.MediaBrowserCompat$MediaItem();
            }
            MediaBrowserCompat$CustomActionResultReceiver = null;
        }
    }
}
