package p040o;

import java.util.concurrent.CountDownLatch;
import p040o.AlertController$RecycleListView;

/* renamed from: o.JustForYouEntryPointDeepLinkActivity */
public abstract class JustForYouEntryPointDeepLinkActivity<T> extends CountDownLatch implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private volatile boolean IconCompatParcelizer;
    Throwable MediaBrowserCompat$CustomActionResultReceiver;
    T MediaBrowserCompat$ItemReceiver;
    BulkTransferDeepLinkActivity write;

    public JustForYouEntryPointDeepLinkActivity() {
        super(1);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.write = bulkTransferDeepLinkActivity;
        if (this.IconCompatParcelizer) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final void onComplete() {
        countDown();
    }

    public final void dispose() {
        this.IconCompatParcelizer = true;
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.write;
        if (bulkTransferDeepLinkActivity != null) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final boolean isDisposed() {
        return this.IconCompatParcelizer;
    }

    public final T MediaBrowserCompat$CustomActionResultReceiver() {
        if (getCount() != 0) {
            try {
                boolean z = AlertController$RecycleListView.read.read;
                await();
            } catch (InterruptedException e) {
                dispose();
                throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(e);
            }
        }
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (th == null) {
            return this.MediaBrowserCompat$ItemReceiver;
        }
        throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
    }
}
