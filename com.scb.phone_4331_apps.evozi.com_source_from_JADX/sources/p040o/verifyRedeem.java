package p040o;

import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.ScreenShotFragment;
import java.lang.ref.WeakReference;
import p040o.ForwardingCheckedFuture;

/* renamed from: o.verifyRedeem */
public final class verifyRedeem {
    private static HistoryAdapter$GroupFooterViewHolder IconCompatParcelizer;
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static <T extends ForwardingCheckedFuture.SimpleForwardingCheckedFuture> void read(ScreenShotFragment<T> screenShotFragment, T t, boolean z, boolean z2) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(screenShotFragment.requireActivity(), MediaBrowserCompat$CustomActionResultReceiver)) {
            screenShotFragment.write(t, false, z2);
            return;
        }
        IconCompatParcelizer = new IconCompatParcelizer(screenShotFragment, t, false, z2, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.write(screenShotFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
            HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = IconCompatParcelizer;
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onShowRationale", new Object[0]);
            CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(screenShotFragment.getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.permission_storage_title).IconCompatParcelizer((int) R.string.permission_storage);
            CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.permission_allow), new getRiskAssessment(historyAdapter$GroupFooterViewHolder));
            IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.permission_deny), new getPurchaseSearchFunds(historyAdapter$GroupFooterViewHolder)).show();
            return;
        }
        screenShotFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 58);
    }

    public static <T extends ForwardingCheckedFuture.SimpleForwardingCheckedFuture> void MediaBrowserCompat$CustomActionResultReceiver(ScreenShotFragment<T> screenShotFragment, int i, int[] iArr) {
        if (i == 58) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = IconCompatParcelizer;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(screenShotFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
                ScreenShotFragment.m3376x50fd9e4a();
            } else {
                ScreenShotFragment.MediaSessionCompat$Token();
            }
            IconCompatParcelizer = null;
        }
    }

    /* renamed from: o.verifyRedeem$IconCompatParcelizer */
    static final class IconCompatParcelizer<T extends ForwardingCheckedFuture.SimpleForwardingCheckedFuture> implements HistoryAdapter$GroupFooterViewHolder {
        private final boolean IconCompatParcelizer;
        private final T MediaBrowserCompat$CustomActionResultReceiver;
        private final boolean MediaBrowserCompat$ItemReceiver;
        private final WeakReference<ScreenShotFragment<T>> read;

        /* synthetic */ IconCompatParcelizer(ScreenShotFragment screenShotFragment, ForwardingCheckedFuture.SimpleForwardingCheckedFuture simpleForwardingCheckedFuture, boolean z, boolean z2, byte b) {
            this(screenShotFragment, simpleForwardingCheckedFuture, z, z2);
        }

        private IconCompatParcelizer(ScreenShotFragment<T> screenShotFragment, T t, boolean z, boolean z2) {
            this.read = new WeakReference<>(screenShotFragment);
            this.MediaBrowserCompat$CustomActionResultReceiver = t;
            this.IconCompatParcelizer = z;
            this.MediaBrowserCompat$ItemReceiver = z2;
        }

        public final void write() {
            ScreenShotFragment screenShotFragment = this.read.get();
            if (screenShotFragment != null) {
                screenShotFragment.requestPermissions(verifyRedeem.MediaBrowserCompat$CustomActionResultReceiver, 58);
            }
        }

        public final void read() {
            if (this.read.get() != null) {
                ScreenShotFragment.MediaSessionCompat$Token();
            }
        }

        public final void IconCompatParcelizer() {
            ScreenShotFragment screenShotFragment = this.read.get();
            if (screenShotFragment != null) {
                screenShotFragment.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }
}
