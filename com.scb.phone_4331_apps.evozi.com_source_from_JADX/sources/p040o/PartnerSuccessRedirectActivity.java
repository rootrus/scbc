package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.PartnerSuccessRedirectActivity */
public final class PartnerSuccessRedirectActivity<T> implements ActivateChequeDeepLinkActivity<T> {
    private ActivateChequeDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private AtomicReference<BulkTransferDeepLinkActivity> read;

    public PartnerSuccessRedirectActivity(AtomicReference<BulkTransferDeepLinkActivity> atomicReference, ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.read = atomicReference;
        this.MediaBrowserCompat$CustomActionResultReceiver = activateChequeDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.read, bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(t);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
    }
}
