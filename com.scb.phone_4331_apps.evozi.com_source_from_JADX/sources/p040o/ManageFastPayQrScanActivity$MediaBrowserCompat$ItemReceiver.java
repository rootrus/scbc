package p040o;

import p040o.ManageFastPayQrScanActivity;

/* renamed from: o.ManageFastPayQrScanActivity$MediaBrowserCompat$ItemReceiver */
final class ManageFastPayQrScanActivity$MediaBrowserCompat$ItemReceiver implements BankingAgentTransactionsDeepLinkActivity<U> {
    private final ManageFastPayQrScanActivity.IconCompatParcelizer<T, U, R> MediaBrowserCompat$ItemReceiver;

    public final void onComplete() {
    }

    ManageFastPayQrScanActivity$MediaBrowserCompat$ItemReceiver(ManageFastPayQrScanActivity.IconCompatParcelizer<T, U, R> iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.read, bulkTransferDeepLinkActivity);
    }

    public final void onNext(U u) {
        this.MediaBrowserCompat$ItemReceiver.lazySet(u);
    }

    public final void onError(Throwable th) {
        ManageFastPayQrScanActivity.IconCompatParcelizer<T, U, R> iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        iconCompatParcelizer.IconCompatParcelizer.onError(th);
    }
}
