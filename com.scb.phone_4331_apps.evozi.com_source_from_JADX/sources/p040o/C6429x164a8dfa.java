package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.DepositExportStatementActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C6429x164a8dfa<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements onOkClick<T>, BulkTransferDeepLinkActivity {
    private BankingAgentTransactionsDeepLinkActivity<? super T> read;

    C6429x164a8dfa(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        if (t == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            if (!MediaBrowserCompat$ItemReceiver((Throwable) nullPointerException)) {
                AlertController$RecycleListView.read.read((Throwable) nullPointerException);
            }
        } else if (!isDisposed()) {
            this.read.onNext(t);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        if (!MediaBrowserCompat$ItemReceiver(th)) {
            AlertController$RecycleListView.read.read(th);
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean MediaBrowserCompat$ItemReceiver(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (isDisposed()) {
            return false;
        }
        try {
            this.read.onError(th);
            dispose();
            return true;
        } catch (Throwable th2) {
            dispose();
            throw th2;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (!isDisposed()) {
            try {
                this.read.onComplete();
            } finally {
                dispose();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.write(this, bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$ItemReceiver(DeepLinkActivity deepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.write(this, new GiftBoxDeepLinkActivity(deepLinkActivity));
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }

    public final String toString() {
        return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
    }
}
