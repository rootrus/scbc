package p040o;

import android.content.Context;
import com.scb.phone.view.fragment.bulktransfer.BulkTransferSuccessFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.getVerifyStatus$MediaBrowserCompat$ItemReceiver */
final class getVerifyStatus$MediaBrowserCompat$ItemReceiver implements HistoryAdapter$GroupFooterViewHolder {
    private final WeakReference<BulkTransferSuccessFragment> IconCompatParcelizer;
    private final boolean MediaBrowserCompat$CustomActionResultReceiver;

    /* synthetic */ getVerifyStatus$MediaBrowserCompat$ItemReceiver(BulkTransferSuccessFragment bulkTransferSuccessFragment, boolean z, byte b) {
        this(bulkTransferSuccessFragment, true);
    }

    private getVerifyStatus$MediaBrowserCompat$ItemReceiver(BulkTransferSuccessFragment bulkTransferSuccessFragment, boolean z) {
        this.IconCompatParcelizer = new WeakReference<>(bulkTransferSuccessFragment);
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void write() {
        BulkTransferSuccessFragment bulkTransferSuccessFragment = this.IconCompatParcelizer.get();
        if (bulkTransferSuccessFragment != null) {
            bulkTransferSuccessFragment.requestPermissions(getVerifyStatus.MediaBrowserCompat$CustomActionResultReceiver, 7);
        }
    }

    public final void read() {
        if (this.IconCompatParcelizer.get() != null) {
            BulkTransferSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void IconCompatParcelizer() {
        BulkTransferSuccessFragment bulkTransferSuccessFragment = this.IconCompatParcelizer.get();
        if (bulkTransferSuccessFragment != null) {
            boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
            Context context = bulkTransferSuccessFragment.getContext();
            if (!bulkTransferSuccessFragment.isDetached() && context != null) {
                bulkTransferSuccessFragment.bulkTransferSuccessPresenter.write(z);
            }
        }
    }
}
