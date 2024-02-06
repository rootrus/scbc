package p040o;

import java.util.NoSuchElementException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashAdditionalDocumentTypeActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class C6441x8d7233fd<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private long MediaBrowserCompat$ItemReceiver;
    private long MediaMetadataCompat;
    private BulkTransferDeepLinkActivity RatingCompat;
    private BankingAgentTransactionsDeepLinkActivity<? super T> read;
    private T write;

    C6441x8d7233fd(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, T t, boolean z) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
        this.MediaMetadataCompat = j;
        this.write = t;
        this.IconCompatParcelizer = z;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.RatingCompat, bulkTransferDeepLinkActivity)) {
            this.RatingCompat = bulkTransferDeepLinkActivity;
            this.read.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.RatingCompat.dispose();
    }

    public final boolean isDisposed() {
        return this.RatingCompat.isDisposed();
    }

    public final void onNext(T t) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            long j = this.MediaBrowserCompat$ItemReceiver;
            if (j == this.MediaMetadataCompat) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                this.RatingCompat.dispose();
                this.read.onNext(t);
                this.read.onComplete();
                return;
            }
            this.MediaBrowserCompat$ItemReceiver = j + 1;
        }
    }

    public final void onError(Throwable th) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        this.read.onError(th);
    }

    public final void onComplete() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            T t = this.write;
            if (t != null || !this.IconCompatParcelizer) {
                if (t != null) {
                    this.read.onNext(t);
                }
                this.read.onComplete();
                return;
            }
            this.read.onError(new NoSuchElementException());
        }
    }
}
