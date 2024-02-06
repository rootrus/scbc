package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.FastPayOtpActivity;

/* renamed from: o.FastPayOtpActivity$MediaBrowserCompat$ItemReceiver */
final class FastPayOtpActivity$MediaBrowserCompat$ItemReceiver extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<Object>, BulkTransferDeepLinkActivity {
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private FastPayOtpActivity.IconCompatParcelizer read;

    FastPayOtpActivity$MediaBrowserCompat$ItemReceiver(long j, FastPayOtpActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.read = iconCompatParcelizer;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void onNext(Object obj) {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) get();
        if (bulkTransferDeepLinkActivity != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
            bulkTransferDeepLinkActivity.dispose();
            lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
            this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void onError(Throwable th) {
        if (get() != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
            lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
            this.read.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, th);
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        if (get() != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
            lazySet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED);
            this.read.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }
}
