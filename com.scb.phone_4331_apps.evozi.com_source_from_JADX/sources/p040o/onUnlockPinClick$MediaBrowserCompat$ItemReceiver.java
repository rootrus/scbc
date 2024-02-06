package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.onUnlockPinClick$MediaBrowserCompat$ItemReceiver */
final class onUnlockPinClick$MediaBrowserCompat$ItemReceiver<T> implements ActivateChequeDeepLinkActivity<T> {
    private ActivateChequeDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> read;
    private boolean write;

    onUnlockPinClick$MediaBrowserCompat$ItemReceiver(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super BulkTransferDeepLinkActivity> debitCardMarketConductDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = activateChequeDeepLinkActivity;
        this.read = debitCardMarketConductDeepLinkActivity;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        try {
            this.read.IconCompatParcelizer(bulkTransferDeepLinkActivity);
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(bulkTransferDeepLinkActivity);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            this.write = true;
            bulkTransferDeepLinkActivity.dispose();
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write(th, this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        if (!this.write) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(t);
        }
    }

    public final void onError(Throwable th) {
        if (this.write) {
            AlertController$RecycleListView.read.read(th);
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }
    }
}
