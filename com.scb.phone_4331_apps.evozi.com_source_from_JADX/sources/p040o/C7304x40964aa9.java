package p040o;

import java.util.NoSuchElementException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onCarSequentialSearch$MediaBrowserCompat$CustomActionResultReceiver */
final class C7304x40964aa9<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private ActivateChequeDeepLinkActivity<? super T> IconCompatParcelizer;
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private T MediaBrowserCompat$ItemReceiver;
    private BulkTransferDeepLinkActivity MediaDescriptionCompat;
    private boolean read;
    private long write;

    C7304x40964aa9(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity, long j, T t) {
        this.IconCompatParcelizer = activateChequeDeepLinkActivity;
        this.write = j;
        this.MediaBrowserCompat$ItemReceiver = t;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaDescriptionCompat, bulkTransferDeepLinkActivity)) {
            this.MediaDescriptionCompat = bulkTransferDeepLinkActivity;
            this.IconCompatParcelizer.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.MediaDescriptionCompat.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaDescriptionCompat.isDisposed();
    }

    public final void onNext(T t) {
        if (!this.read) {
            long j = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (j == this.write) {
                this.read = true;
                this.MediaDescriptionCompat.dispose();
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(t);
                return;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = j + 1;
        }
    }

    public final void onError(Throwable th) {
        if (this.read) {
            AlertController$RecycleListView.read.read(th);
            return;
        }
        this.read = true;
        this.IconCompatParcelizer.onError(th);
    }

    public final void onComplete() {
        if (!this.read) {
            this.read = true;
            T t = this.MediaBrowserCompat$ItemReceiver;
            if (t != null) {
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(t);
            } else {
                this.IconCompatParcelizer.onError(new NoSuchElementException());
            }
        }
    }
}
