package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.BaseHmlPersonalInfoActivity$MediaBrowserCompat$ItemReceiver */
final class BaseHmlPersonalInfoActivity$MediaBrowserCompat$ItemReceiver<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<T>, BulkTransferDeepLinkActivity, Runnable {
    private BillerDeepLinkActivity<? extends T> IconCompatParcelizer;
    final HmlBusinessOwnerSuccessfulDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
    private ActivateChequeDeepLinkActivity<? super T> read;

    BaseHmlPersonalInfoActivity$MediaBrowserCompat$ItemReceiver(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity, BillerDeepLinkActivity<? extends T> billerDeepLinkActivity) {
        this.read = activateChequeDeepLinkActivity;
        this.IconCompatParcelizer = billerDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(t);
    }

    public final void onError(Throwable th) {
        this.read.onError(th);
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
    }

    public final void run() {
        this.IconCompatParcelizer.IconCompatParcelizer(this);
    }
}
