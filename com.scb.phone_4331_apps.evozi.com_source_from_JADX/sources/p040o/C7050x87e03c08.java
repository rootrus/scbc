package p040o;

/* renamed from: o.ScbsOnboardDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C7050x87e03c08<T> implements BankingAgentTransactionsDeepLinkActivity<T>, SelectProvinceOrDistrictAdapter$ViewHolder {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> read;

    public final void write(long j) {
    }

    C7050x87e03c08(DepositDetailRecyclerViewAdapter$DepositViewHolder<? super T> depositDetailRecyclerViewAdapter$DepositViewHolder) {
        this.read = depositDetailRecyclerViewAdapter$DepositViewHolder;
    }

    public final void onComplete() {
        this.read.onComplete();
    }

    public final void onError(Throwable th) {
        this.read.onError(th);
    }

    public final void onNext(T t) {
        this.read.onNext(t);
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
        this.read.read(this);
    }

    public final void aQ_() {
        this.MediaBrowserCompat$ItemReceiver.dispose();
    }
}
