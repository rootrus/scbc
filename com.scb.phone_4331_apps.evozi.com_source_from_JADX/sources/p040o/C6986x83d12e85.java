package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.PayNowTransactionsDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6986x83d12e85 implements DebitCardRequestInputActivity {
    private DebitCardRequestInputActivity IconCompatParcelizer;
    private AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$ItemReceiver;

    C6986x83d12e85(AtomicReference<BulkTransferDeepLinkActivity> atomicReference, DebitCardRequestInputActivity debitCardRequestInputActivity) {
        this.MediaBrowserCompat$ItemReceiver = atomicReference;
        this.IconCompatParcelizer = debitCardRequestInputActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity);
    }

    public final void onComplete() {
        this.IconCompatParcelizer.onComplete();
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.onError(th);
    }
}
