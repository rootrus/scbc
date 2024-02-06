package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.FastPaySuccessActivity$MediaBrowserCompat$ItemReceiver */
final class FastPaySuccessActivity$MediaBrowserCompat$ItemReceiver<T, D> extends AtomicBoolean implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
    private D MediaBrowserCompat$CustomActionResultReceiver;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private boolean read;
    private DebitCardMarketConductDeepLinkActivity<? super D> write;

    FastPaySuccessActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, D d, DebitCardMarketConductDeepLinkActivity<? super D> debitCardMarketConductDeepLinkActivity, boolean z) {
        this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = d;
        this.write = debitCardMarketConductDeepLinkActivity;
        this.read = z;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity)) {
            this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
            this.IconCompatParcelizer.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        this.IconCompatParcelizer.onNext(t);
    }

    public final void onError(Throwable th) {
        if (this.read) {
            if (compareAndSet(false, true)) {
                try {
                    this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.MediaBrowserCompat$ItemReceiver.dispose();
            this.IconCompatParcelizer.onError(th);
            return;
        }
        this.IconCompatParcelizer.onError(th);
        this.MediaBrowserCompat$ItemReceiver.dispose();
        MediaBrowserCompat$ItemReceiver();
    }

    public final void onComplete() {
        if (this.read) {
            if (compareAndSet(false, true)) {
                try {
                    this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.IconCompatParcelizer.onError(th);
                    return;
                }
            }
            this.MediaBrowserCompat$ItemReceiver.dispose();
            this.IconCompatParcelizer.onComplete();
            return;
        }
        this.IconCompatParcelizer.onComplete();
        this.MediaBrowserCompat$ItemReceiver.dispose();
        MediaBrowserCompat$ItemReceiver();
    }

    public final void dispose() {
        MediaBrowserCompat$ItemReceiver();
        this.MediaBrowserCompat$ItemReceiver.dispose();
    }

    public final boolean isDisposed() {
        return get();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        if (compareAndSet(false, true)) {
            try {
                this.write.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                AlertController$RecycleListView.read.read(th);
            }
        }
    }
}
