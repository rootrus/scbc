package p040o;

import java.util.Collection;
import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.clickLoan$MediaBrowserCompat$ItemReceiver */
final class clickLoan$MediaBrowserCompat$ItemReceiver<T, U extends Collection<? super T>> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private int IconCompatParcelizer;
    private BankingAgentTransactionsDeepLinkActivity<? super U> MediaBrowserCompat$CustomActionResultReceiver;
    private Callable<U> MediaBrowserCompat$ItemReceiver;
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    private int read;
    private U write;

    clickLoan$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, int i, Callable<U> callable) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.read = i;
        this.MediaBrowserCompat$ItemReceiver = callable;
    }

    /* access modifiers changed from: package-private */
    public final boolean write() {
        try {
            this.write = (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$ItemReceiver.call(), "Empty buffer supplied");
            return true;
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            this.write = null;
            BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaMetadataCompat;
            if (bulkTransferDeepLinkActivity == null) {
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) this.MediaBrowserCompat$CustomActionResultReceiver);
                return false;
            }
            bulkTransferDeepLinkActivity.dispose();
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
            return false;
        }
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaMetadataCompat, bulkTransferDeepLinkActivity)) {
            this.MediaMetadataCompat = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
        }
    }

    public final void dispose() {
        this.MediaMetadataCompat.dispose();
    }

    public final boolean isDisposed() {
        return this.MediaMetadataCompat.isDisposed();
    }

    public final void onNext(T t) {
        U u = this.write;
        if (u != null) {
            u.add(t);
            int i = this.IconCompatParcelizer + 1;
            this.IconCompatParcelizer = i;
            if (i >= this.read) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(u);
                this.IconCompatParcelizer = 0;
                write();
            }
        }
    }

    public final void onError(Throwable th) {
        this.write = null;
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }

    public final void onComplete() {
        U u = this.write;
        if (u != null) {
            this.write = null;
            if (!u.isEmpty()) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(u);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }
    }
}
