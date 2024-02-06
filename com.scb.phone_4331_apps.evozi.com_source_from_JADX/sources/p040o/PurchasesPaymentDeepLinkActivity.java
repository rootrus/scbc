package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.PurchasesPaymentDeepLinkActivity */
public final class PurchasesPaymentDeepLinkActivity extends DebitCardCoachMarkActivity {
    private DebitCardProductCatalogActivity MediaBrowserCompat$CustomActionResultReceiver;
    private BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;

    public PurchasesPaymentDeepLinkActivity(DebitCardProductCatalogActivity debitCardProductCatalogActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardProductCatalogActivity;
        this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(new IconCompatParcelizer(debitCardRequestInputActivity, this.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.PurchasesPaymentDeepLinkActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardRequestInputActivity, BulkTransferDeepLinkActivity, Runnable {
        private DebitCardRequestInputActivity MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private Throwable write;

        IconCompatParcelizer(DebitCardRequestInputActivity debitCardRequestInputActivity, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = debitCardRequestInputActivity;
            this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void onError(Throwable th) {
            this.write = th;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this));
        }

        public final void onComplete() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this));
        }

        public final void run() {
            Throwable th = this.write;
            if (th != null) {
                this.write = null;
                this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
                return;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }
    }
}
