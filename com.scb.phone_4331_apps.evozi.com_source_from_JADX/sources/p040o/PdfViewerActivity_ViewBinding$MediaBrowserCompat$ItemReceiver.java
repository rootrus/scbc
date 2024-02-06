package p040o;

import java.util.Collection;

/* renamed from: o.PdfViewerActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class PdfViewerActivity_ViewBinding$MediaBrowserCompat$ItemReceiver<T, U extends Collection<? super T>> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private U MediaBrowserCompat$CustomActionResultReceiver;
    private ActivateChequeDeepLinkActivity<? super U> read;
    private BulkTransferDeepLinkActivity write;

    PdfViewerActivity_ViewBinding$MediaBrowserCompat$ItemReceiver(ActivateChequeDeepLinkActivity<? super U> activateChequeDeepLinkActivity, U u) {
        this.read = activateChequeDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = u;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
            this.write = bulkTransferDeepLinkActivity;
            this.read.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.write.dispose();
    }

    public final boolean isDisposed() {
        return this.write.isDisposed();
    }

    public final void onNext(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver.add(t);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.read.onError(th);
    }

    public final void onComplete() {
        U u = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.read.MediaBrowserCompat$CustomActionResultReceiver(u);
    }
}
