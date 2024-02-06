package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ForgotPinPersonalInfoActivity$MediaBrowserCompat$ItemReceiver */
final class ForgotPinPersonalInfoActivity$MediaBrowserCompat$ItemReceiver<T> extends AtomicInteger implements ActivateChequeDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private ActivateChequeDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private DataPrivacyManagementDeepLinkActivity read;
    private BulkTransferDeepLinkActivity write;

    ForgotPinPersonalInfoActivity$MediaBrowserCompat$ItemReceiver(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = activateChequeDeepLinkActivity;
        this.read = dataPrivacyManagementDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
            this.write = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(t);
        if (compareAndSet(0, 1)) {
            try {
                this.read.read();
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read(th);
            }
        }
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        if (compareAndSet(0, 1)) {
            try {
                this.read.read();
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                AlertController$RecycleListView.read.read(th2);
            }
        }
    }

    public final void dispose() {
        this.write.dispose();
        if (compareAndSet(0, 1)) {
            try {
                this.read.read();
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read(th);
            }
        }
    }

    public final boolean isDisposed() {
        return this.write.isDisposed();
    }
}
