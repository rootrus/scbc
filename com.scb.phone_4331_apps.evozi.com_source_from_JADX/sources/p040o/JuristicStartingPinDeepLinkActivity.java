package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.JuristicStartingPinDeepLinkActivity */
public abstract class JuristicStartingPinDeepLinkActivity<T, R> implements BankingAgentTransactionsDeepLinkActivity<T>, HmlLoanOfferStatusDeepLinkActivity<R> {
    public HmlLoanOfferStatusDeepLinkActivity<T> IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public final BankingAgentTransactionsDeepLinkActivity<? super R> read;
    private BulkTransferDeepLinkActivity write;

    public JuristicStartingPinDeepLinkActivity(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
            this.write = bulkTransferDeepLinkActivity;
            if (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity) {
                this.IconCompatParcelizer = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
            }
            this.read.onSubscribe(this);
        }
    }

    public void onError(Throwable th) {
        if (this.MediaBrowserCompat$ItemReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaBrowserCompat$ItemReceiver = true;
        this.read.onError(th);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(Throwable th) {
        AlertController$RecycleListView.read.write(th);
        this.write.dispose();
        onError(th);
    }

    public void onComplete() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.read.onComplete();
        }
    }

    /* access modifiers changed from: protected */
    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        HmlLoanOfferStatusDeepLinkActivity<T> hmlLoanOfferStatusDeepLinkActivity = this.IconCompatParcelizer;
        if (hmlLoanOfferStatusDeepLinkActivity == null || (i & 4) != 0) {
            return 0;
        }
        int write2 = hmlLoanOfferStatusDeepLinkActivity.write(i);
        if (write2 != 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = write2;
        }
        return write2;
    }

    public void dispose() {
        this.write.dispose();
    }

    public boolean isDisposed() {
        return this.write.isDisposed();
    }

    public final boolean write() {
        return this.IconCompatParcelizer.write();
    }

    public void MediaBrowserCompat$ItemReceiver() {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
    }

    public final boolean IconCompatParcelizer(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
