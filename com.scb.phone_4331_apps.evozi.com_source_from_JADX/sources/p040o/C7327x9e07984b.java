package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.onPersonalProfileClick$MediaBrowserCompat$CustomActionResultReceiver */
final class C7327x9e07984b<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements AddAccountConsentDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private ActivateChequeDeepLinkActivity<? super T> read;

    C7327x9e07984b(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.read = activateChequeDeepLinkActivity;
    }

    public final void MediaBrowserCompat$ItemReceiver(T t) {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
        if (get() != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED && (bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) getAndSet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED)) != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
            if (t == null) {
                try {
                    this.read.onError(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    if (bulkTransferDeepLinkActivity != null) {
                        bulkTransferDeepLinkActivity.dispose();
                    }
                    throw th;
                }
            } else {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(t);
            }
            if (bulkTransferDeepLinkActivity != null) {
                bulkTransferDeepLinkActivity.dispose();
            }
        }
    }

    public final void IconCompatParcelizer(Throwable th) {
        if (!read(th)) {
            AlertController$RecycleListView.read.read(th);
        }
    }

    public final boolean read(Throwable th) {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED || (bulkTransferDeepLinkActivity = (BulkTransferDeepLinkActivity) getAndSet(HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED)) == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
            return false;
        }
        try {
            this.read.onError(th);
        } finally {
            if (bulkTransferDeepLinkActivity != null) {
                bulkTransferDeepLinkActivity.dispose();
            }
        }
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
