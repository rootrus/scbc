package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.EBillSubscriptionActivity$MediaBrowserCompat$ItemReceiver */
final class EBillSubscriptionActivity$MediaBrowserCompat$ItemReceiver<T, R> implements BankingAgentTransactionsDeepLinkActivity<T> {
    private HmlETBPersonalInfoActivity<T> MediaBrowserCompat$CustomActionResultReceiver;
    private AtomicReference<BulkTransferDeepLinkActivity> read;

    EBillSubscriptionActivity$MediaBrowserCompat$ItemReceiver(HmlETBPersonalInfoActivity<T> hmlETBPersonalInfoActivity, AtomicReference<BulkTransferDeepLinkActivity> atomicReference) {
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlETBPersonalInfoActivity;
        this.read = atomicReference;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.read, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }

    public final void onComplete() {
        this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
    }
}
