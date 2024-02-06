package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.fastpay.FastPaySuccessFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.DeepLinkModule_ContributeRemittanceRetryDeepLinkActivity */
public final class DeepLinkModule_ContributeRemittanceRetryDeepLinkActivity {
    private static HistoryAdapter$GroupFooterViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public static final String[] write = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$CustomActionResultReceiver(FastPaySuccessFragment fastPaySuccessFragment, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(fastPaySuccessFragment.requireActivity(), write)) {
            fastPaySuccessFragment.read(z);
            return;
        }
        MediaBrowserCompat$CustomActionResultReceiver = new read(fastPaySuccessFragment, z, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.write(fastPaySuccessFragment, write)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$CustomActionResultReceiver;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(fastPaySuccessFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.permission_allow), new DeepLinkModule_ContributePartnerLoginDeepLinkActivity(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.permission_deny), new DeepLinkModule_ContributePurchasesPaymentDeepLinkActivity(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        fastPaySuccessFragment.requestPermissions(write, 20);
    }

    public static void MediaBrowserCompat$ItemReceiver(FastPaySuccessFragment fastPaySuccessFragment, int i, int[] iArr) {
        if (i == 20) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$CustomActionResultReceiver;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(fastPaySuccessFragment, write)) {
                FastPaySuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
            } else {
                FastPaySuccessFragment.MediaBrowserCompat$ItemReceiver();
            }
            MediaBrowserCompat$CustomActionResultReceiver = null;
        }
    }

    /* renamed from: o.DeepLinkModule_ContributeRemittanceRetryDeepLinkActivity$read */
    static final class read implements HistoryAdapter$GroupFooterViewHolder {
        private final WeakReference<FastPaySuccessFragment> MediaBrowserCompat$ItemReceiver;
        private final boolean write;

        /* synthetic */ read(FastPaySuccessFragment fastPaySuccessFragment, boolean z, byte b) {
            this(fastPaySuccessFragment, z);
        }

        private read(FastPaySuccessFragment fastPaySuccessFragment, boolean z) {
            this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(fastPaySuccessFragment);
            this.write = z;
        }

        public final void write() {
            FastPaySuccessFragment fastPaySuccessFragment = this.MediaBrowserCompat$ItemReceiver.get();
            if (fastPaySuccessFragment != null) {
                fastPaySuccessFragment.requestPermissions(DeepLinkModule_ContributeRemittanceRetryDeepLinkActivity.write, 20);
            }
        }

        public final void read() {
            if (this.MediaBrowserCompat$ItemReceiver.get() != null) {
                FastPaySuccessFragment.MediaBrowserCompat$ItemReceiver();
            }
        }

        public final void IconCompatParcelizer() {
            FastPaySuccessFragment fastPaySuccessFragment = this.MediaBrowserCompat$ItemReceiver.get();
            if (fastPaySuccessFragment != null) {
                fastPaySuccessFragment.read(this.write);
            }
        }
    }
}
