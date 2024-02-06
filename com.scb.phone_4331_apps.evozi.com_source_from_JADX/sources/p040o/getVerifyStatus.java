package p040o;

import android.content.Context;
import com.scb.phone.view.fragment.bulktransfer.BulkTransferSuccessFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import p040o.SimpleTimeLimiter;

/* renamed from: o.getVerifyStatus */
public final class getVerifyStatus {
    /* access modifiers changed from: private */
    public static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"android.permission.WRITE_EXTERNAL_STORAGE"};
    private static HistoryAdapter$GroupFooterViewHolder MediaBrowserCompat$ItemReceiver;
    private static HistoryAdapter$GroupFooterViewHolder read;
    /* access modifiers changed from: private */
    public static final String[] write = {"android.permission.WRITE_EXTERNAL_STORAGE"};

    public static void MediaBrowserCompat$ItemReceiver(BulkTransferSuccessFragment bulkTransferSuccessFragment) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(bulkTransferSuccessFragment.requireActivity(), MediaBrowserCompat$CustomActionResultReceiver)) {
            Context context = bulkTransferSuccessFragment.getContext();
            if (!bulkTransferSuccessFragment.isDetached() && context != null) {
                bulkTransferSuccessFragment.bulkTransferSuccessPresenter.write(true);
                return;
            }
            return;
        }
        read = new getVerifyStatus$MediaBrowserCompat$ItemReceiver(bulkTransferSuccessFragment, true, (byte) 0);
        if (ProxySourceAdapter$ItemViewHolder.write(bulkTransferSuccessFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
            bulkTransferSuccessFragment.read(read);
        } else {
            bulkTransferSuccessFragment.requestPermissions(MediaBrowserCompat$CustomActionResultReceiver, 7);
        }
    }

    public static void read(BulkTransferSuccessFragment bulkTransferSuccessFragment, SimpleTimeLimiter.C37891.C37901 r3, List<SettableFuture> list) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(bulkTransferSuccessFragment.requireActivity(), write)) {
            bulkTransferSuccessFragment.read(r3, list);
            return;
        }
        MediaBrowserCompat$ItemReceiver = new read(bulkTransferSuccessFragment, r3, list);
        if (ProxySourceAdapter$ItemViewHolder.write(bulkTransferSuccessFragment, write)) {
            bulkTransferSuccessFragment.read(MediaBrowserCompat$ItemReceiver);
        } else {
            bulkTransferSuccessFragment.requestPermissions(write, 8);
        }
    }

    public static void read(BulkTransferSuccessFragment bulkTransferSuccessFragment, int i, int[] iArr) {
        if (i == 7) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder = read;
                if (historyAdapter$GroupFooterViewHolder != null) {
                    historyAdapter$GroupFooterViewHolder.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(bulkTransferSuccessFragment, MediaBrowserCompat$CustomActionResultReceiver)) {
                BulkTransferSuccessFragment.MediaBrowserCompat$ItemReceiver();
            } else {
                BulkTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
            }
            read = null;
        } else if (i == 8) {
            if (ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                HistoryAdapter$GroupFooterViewHolder historyAdapter$GroupFooterViewHolder2 = MediaBrowserCompat$ItemReceiver;
                if (historyAdapter$GroupFooterViewHolder2 != null) {
                    historyAdapter$GroupFooterViewHolder2.IconCompatParcelizer();
                }
            } else if (!ProxySourceAdapter$ItemViewHolder.write(bulkTransferSuccessFragment, write)) {
                BulkTransferSuccessFragment.MediaBrowserCompat$ItemReceiver();
            } else {
                BulkTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
            }
            MediaBrowserCompat$ItemReceiver = null;
        }
    }

    /* renamed from: o.getVerifyStatus$read */
    static final class read implements HistoryAdapter$GroupFooterViewHolder {
        private final SimpleTimeLimiter.C37891.C37901 IconCompatParcelizer;
        private final WeakReference<BulkTransferSuccessFragment> MediaBrowserCompat$ItemReceiver;
        private final List<SettableFuture> write;

        private read(BulkTransferSuccessFragment bulkTransferSuccessFragment, SimpleTimeLimiter.C37891.C37901 r3, List<SettableFuture> list) {
            this.MediaBrowserCompat$ItemReceiver = new WeakReference<>(bulkTransferSuccessFragment);
            this.IconCompatParcelizer = r3;
            this.write = list;
        }

        public final void write() {
            BulkTransferSuccessFragment bulkTransferSuccessFragment = this.MediaBrowserCompat$ItemReceiver.get();
            if (bulkTransferSuccessFragment != null) {
                bulkTransferSuccessFragment.requestPermissions(getVerifyStatus.write, 8);
            }
        }

        public final void read() {
            if (this.MediaBrowserCompat$ItemReceiver.get() != null) {
                BulkTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void IconCompatParcelizer() {
            BulkTransferSuccessFragment bulkTransferSuccessFragment = this.MediaBrowserCompat$ItemReceiver.get();
            if (bulkTransferSuccessFragment != null) {
                bulkTransferSuccessFragment.read(this.IconCompatParcelizer, this.write);
            }
        }
    }
}
