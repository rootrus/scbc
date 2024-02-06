package p040o;

/* renamed from: o.TransferToOthersStep1Adapter$LocalViewHolder */
public final class TransferToOthersStep1Adapter$LocalViewHolder<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
    private final onOkClick<T> read;

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
    }

    public TransferToOthersStep1Adapter$LocalViewHolder(onOkClick<T> onokclick) {
        this.read = onokclick;
    }

    public final void onNext(T t) {
        if (!this.read.isDisposed()) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(t);
        }
    }

    public final void onError(Throwable th) {
        if (!this.read.isDisposed()) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(th);
        }
    }

    public final void onComplete() {
        if (!this.read.isDisposed()) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
