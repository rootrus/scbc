package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.PayNowTransactionsDeepLinkActivity */
public final class PayNowTransactionsDeepLinkActivity extends DebitCardCoachMarkActivity {
    private DebitCardProductCatalogActivity IconCompatParcelizer;
    private DebitCardProductCatalogActivity read;

    public PayNowTransactionsDeepLinkActivity(DebitCardProductCatalogActivity debitCardProductCatalogActivity, DebitCardProductCatalogActivity debitCardProductCatalogActivity2) {
        this.IconCompatParcelizer = debitCardProductCatalogActivity;
        this.read = debitCardProductCatalogActivity2;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        this.IconCompatParcelizer.IconCompatParcelizer(new write(debitCardRequestInputActivity, this.read));
    }

    /* renamed from: o.PayNowTransactionsDeepLinkActivity$write */
    static final class write extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardRequestInputActivity, BulkTransferDeepLinkActivity {
        private DebitCardRequestInputActivity IconCompatParcelizer;
        private DebitCardProductCatalogActivity MediaBrowserCompat$CustomActionResultReceiver;

        write(DebitCardRequestInputActivity debitCardRequestInputActivity, DebitCardProductCatalogActivity debitCardProductCatalogActivity) {
            this.IconCompatParcelizer = debitCardRequestInputActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = debitCardProductCatalogActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity)) {
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new C6986x83d12e85(this, this.IconCompatParcelizer));
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }
    }
}
