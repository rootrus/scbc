package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ScanCameraDeepLinkActivity */
public final class ScanCameraDeepLinkActivity extends DebitCardCoachMarkActivity {
    private DebitCardProductCatalogActivity MediaBrowserCompat$ItemReceiver;
    private BankingAgentDeepLinkActivity read;

    public ScanCameraDeepLinkActivity(DebitCardProductCatalogActivity debitCardProductCatalogActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = debitCardProductCatalogActivity;
        this.read = bankingAgentDeepLinkActivity;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        write write2 = new write(debitCardRequestInputActivity, this.MediaBrowserCompat$ItemReceiver);
        debitCardRequestInputActivity.onSubscribe(write2);
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(write2.MediaBrowserCompat$ItemReceiver, this.read.MediaBrowserCompat$CustomActionResultReceiver(write2));
    }

    /* renamed from: o.ScanCameraDeepLinkActivity$write */
    static final class write extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardRequestInputActivity, BulkTransferDeepLinkActivity, Runnable {
        private DebitCardProductCatalogActivity IconCompatParcelizer;
        private DebitCardRequestInputActivity MediaBrowserCompat$CustomActionResultReceiver;
        final HmlBusinessOwnerSuccessfulDeepLinkActivity MediaBrowserCompat$ItemReceiver = new HmlBusinessOwnerSuccessfulDeepLinkActivity();

        write(DebitCardRequestInputActivity debitCardRequestInputActivity, DebitCardProductCatalogActivity debitCardProductCatalogActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = debitCardRequestInputActivity;
            this.IconCompatParcelizer = debitCardProductCatalogActivity;
        }

        public final void run() {
            this.IconCompatParcelizer.IconCompatParcelizer(this);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }

        public final void onComplete() {
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }
    }
}
