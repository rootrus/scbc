package p040o;

import java.util.concurrent.CountDownLatch;
import p040o.AlertController$RecycleListView;

/* renamed from: o.LoanDeepLinkActivity */
public final class LoanDeepLinkActivity<T> extends CountDownLatch implements ActivateChequeDeepLinkActivity<T>, DebitCardRequestInputActivity, BaseChangePinWithMaxActivity_ViewBinding<T> {
    private T IconCompatParcelizer;
    private volatile boolean MediaBrowserCompat$ItemReceiver;
    private Throwable read;
    private BulkTransferDeepLinkActivity write;

    public LoanDeepLinkActivity() {
        super(1);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.write = bulkTransferDeepLinkActivity;
        if (this.MediaBrowserCompat$ItemReceiver) {
            bulkTransferDeepLinkActivity.dispose();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        this.IconCompatParcelizer = t;
        countDown();
    }

    public final void onError(Throwable th) {
        this.read = th;
        countDown();
    }

    public final void onComplete() {
        countDown();
    }

    public final T MediaBrowserCompat$ItemReceiver() {
        if (getCount() != 0) {
            try {
                boolean z = AlertController$RecycleListView.read.read;
                await();
            } catch (InterruptedException e) {
                this.MediaBrowserCompat$ItemReceiver = true;
                BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.write;
                if (bulkTransferDeepLinkActivity != null) {
                    bulkTransferDeepLinkActivity.dispose();
                }
                throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(e);
            }
        }
        Throwable th = this.read;
        if (th == null) {
            return this.IconCompatParcelizer;
        }
        throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
    }
}
