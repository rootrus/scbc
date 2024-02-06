package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.lambda$showFloatingButton$1$NTBBankingServiceActivity */
public final class lambda$showFloatingButton$1$NTBBankingServiceActivity<R> extends DebitCardResetOtpActivity<R> {
    private DebitCardProductCatalogActivity MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends R> MediaBrowserCompat$ItemReceiver;

    public lambda$showFloatingButton$1$NTBBankingServiceActivity(DebitCardProductCatalogActivity debitCardProductCatalogActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends R> debitCardResetPinSuccessActivity_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardProductCatalogActivity;
        this.MediaBrowserCompat$ItemReceiver = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(iconCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(iconCompatParcelizer);
    }

    /* renamed from: o.lambda$showFloatingButton$1$NTBBankingServiceActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<R> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<R>, DebitCardRequestInputActivity, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super R> IconCompatParcelizer;
        private DebitCardResetPinSuccessActivity_ViewBinding<? extends R> read;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends R> debitCardResetPinSuccessActivity_ViewBinding) {
            this.read = debitCardResetPinSuccessActivity_ViewBinding;
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onNext(R r) {
            this.IconCompatParcelizer.onNext(r);
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            DebitCardResetPinSuccessActivity_ViewBinding<? extends R> debitCardResetPinSuccessActivity_ViewBinding = this.read;
            if (debitCardResetPinSuccessActivity_ViewBinding == null) {
                this.IconCompatParcelizer.onComplete();
                return;
            }
            this.read = null;
            debitCardResetPinSuccessActivity_ViewBinding.subscribe(this);
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, bulkTransferDeepLinkActivity);
        }
    }
}
