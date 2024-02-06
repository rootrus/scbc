package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ReviewDeviceActivity$MediaBrowserCompat$CustomActionResultReceiver$MediaBrowserCompat$CustomActionResultReceiver */
final class C7027x10ca69f7<R> implements ActivateChequeDeepLinkActivity<R> {
    private ActivateChequeDeepLinkActivity<? super R> IconCompatParcelizer;
    private AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$CustomActionResultReceiver;

    C7027x10ca69f7(AtomicReference<BulkTransferDeepLinkActivity> atomicReference, ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = atomicReference;
        this.IconCompatParcelizer = activateChequeDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(R r) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(r);
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.onError(th);
    }
}
