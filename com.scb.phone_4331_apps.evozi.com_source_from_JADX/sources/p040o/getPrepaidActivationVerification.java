package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.easycash.EasycashSuccessFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.getPrepaidActivationVerification */
public final class getPrepaidActivationVerification {
    /* access modifiers changed from: private */
    public static final String[] IconCompatParcelizer = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static HistoryAdapter$GroupFooterViewHolder MediaBrowserCompat$ItemReceiver;

    public static void MediaBrowserCompat$ItemReceiver(EasycashSuccessFragment easycashSuccessFragment, boolean z) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(easycashSuccessFragment.requireActivity(), IconCompatParcelizer)) {
            easycashSuccessFragment.MediaBrowserCompat$ItemReceiver(z);
            return;
        }
        MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer(easycashSuccessFragment, z, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.write(easycashSuccessFragment, IconCompatParcelizer)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$ItemReceiver;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(easycashSuccessFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new otpSubmission(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new offerCalculation(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        easycashSuccessFragment.requestPermissions(IconCompatParcelizer, 15);
    }

    public static void MediaBrowserCompat$ItemReceiver(EasycashSuccessFragment easycashSuccessFragment, int i, int[] iArr) {
        if (i == 15) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = MediaBrowserCompat$ItemReceiver;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(easycashSuccessFragment, IconCompatParcelizer)) {
                EasycashSuccessFragment.write();
            } else {
                EasycashSuccessFragment.MediaBrowserCompat$ItemReceiver();
            }
            MediaBrowserCompat$ItemReceiver = null;
        }
    }

    /* renamed from: o.getPrepaidActivationVerification$IconCompatParcelizer */
    static final class IconCompatParcelizer implements HistoryAdapter$GroupFooterViewHolder {
        private final boolean read;
        private final WeakReference<EasycashSuccessFragment> write;

        /* synthetic */ IconCompatParcelizer(EasycashSuccessFragment easycashSuccessFragment, boolean z, byte b) {
            this(easycashSuccessFragment, z);
        }

        private IconCompatParcelizer(EasycashSuccessFragment easycashSuccessFragment, boolean z) {
            this.write = new WeakReference<>(easycashSuccessFragment);
            this.read = z;
        }

        public final void write() {
            EasycashSuccessFragment easycashSuccessFragment = this.write.get();
            if (easycashSuccessFragment != null) {
                easycashSuccessFragment.requestPermissions(getPrepaidActivationVerification.IconCompatParcelizer, 15);
            }
        }

        public final void read() {
            if (this.write.get() != null) {
                EasycashSuccessFragment.MediaBrowserCompat$ItemReceiver();
            }
        }

        public final void IconCompatParcelizer() {
            EasycashSuccessFragment easycashSuccessFragment = this.write.get();
            if (easycashSuccessFragment != null) {
                easycashSuccessFragment.MediaBrowserCompat$ItemReceiver(this.read);
            }
        }
    }
}
