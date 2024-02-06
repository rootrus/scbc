package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.investment.FundActionsSuccessFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_BindLoanPaymentReviewActivity */
public final class ActivityBuilder_BindLoanPaymentReviewActivity {
    private static HistoryAdapter$GroupFooterViewHolder IconCompatParcelizer;
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void IconCompatParcelizer(FundActionsSuccessFragment fundActionsSuccessFragment, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(fundActionsSuccessFragment.requireActivity(), MediaBrowserCompat$ItemReceiver)) {
            fundActionsSuccessFragment.read(z);
            return;
        }
        IconCompatParcelizer = new read(fundActionsSuccessFragment, z, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.write(fundActionsSuccessFragment, MediaBrowserCompat$ItemReceiver)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = IconCompatParcelizer;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(fundActionsSuccessFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new ActivityBuilder_BindGroupBillerActivity(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new ActivityBuilder_BindGroupFavoriteActivity(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        fundActionsSuccessFragment.requestPermissions(MediaBrowserCompat$ItemReceiver, 24);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(FundActionsSuccessFragment fundActionsSuccessFragment, int i, int[] iArr) {
        if (i == 24) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = IconCompatParcelizer;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(fundActionsSuccessFragment, MediaBrowserCompat$ItemReceiver)) {
                FundActionsSuccessFragment.MediaBrowserCompat$SearchResultReceiver();
            } else {
                FundActionsSuccessFragment.MediaMetadataCompat();
            }
            IconCompatParcelizer = null;
        }
    }

    /* renamed from: o.ActivityBuilder_BindLoanPaymentReviewActivity$read */
    static final class read implements HistoryAdapter$GroupFooterViewHolder {
        private final WeakReference<FundActionsSuccessFragment> MediaBrowserCompat$CustomActionResultReceiver;
        private final boolean read;

        /* synthetic */ read(FundActionsSuccessFragment fundActionsSuccessFragment, boolean z, byte b) {
            this(fundActionsSuccessFragment, z);
        }

        private read(FundActionsSuccessFragment fundActionsSuccessFragment, boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(fundActionsSuccessFragment);
            this.read = z;
        }

        public final void write() {
            FundActionsSuccessFragment fundActionsSuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (fundActionsSuccessFragment != null) {
                fundActionsSuccessFragment.requestPermissions(ActivityBuilder_BindLoanPaymentReviewActivity.MediaBrowserCompat$ItemReceiver, 24);
            }
        }

        public final void read() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) {
                FundActionsSuccessFragment.MediaMetadataCompat();
            }
        }

        public final void IconCompatParcelizer() {
            FundActionsSuccessFragment fundActionsSuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (fundActionsSuccessFragment != null) {
                fundActionsSuccessFragment.read(this.read);
            }
        }
    }
}
