package p040o;

/* renamed from: o.EasycashReferralSendProductActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6454x2fb70391<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private DebitCardRequestInputActivity MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferDeepLinkActivity write;

    public final void onNext(T t) {
    }

    C6454x2fb70391(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardRequestInputActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.write = bulkTransferDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }

    public final void onComplete() {
        this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
    }

    public final void dispose() {
        this.write.dispose();
    }

    public final boolean isDisposed() {
        return this.write.isDisposed();
    }
}
