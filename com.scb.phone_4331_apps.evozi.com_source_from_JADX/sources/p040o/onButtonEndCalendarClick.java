package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.onButtonEndCalendarClick */
public final class onButtonEndCalendarClick<T> extends NtbUserInfoActivity<T, T> {
    private DebitCardProductCatalogActivity read;

    public onButtonEndCalendarClick(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DebitCardProductCatalogActivity debitCardProductCatalogActivity) {
        super(debitCardResetOtpActivity);
        this.read = debitCardProductCatalogActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.read));
    }

    /* renamed from: o.onButtonEndCalendarClick$read */
    static final class read<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, DebitCardRequestInputActivity, BulkTransferDeepLinkActivity {
        private DebitCardProductCatalogActivity IconCompatParcelizer;
        private boolean MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super T> write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DebitCardProductCatalogActivity debitCardProductCatalogActivity) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.IconCompatParcelizer = debitCardProductCatalogActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity) && !this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.write.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.write.onNext(t);
        }

        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        public final void onComplete() {
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.write.onComplete();
                return;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, (BulkTransferDeepLinkActivity) null);
            DebitCardProductCatalogActivity debitCardProductCatalogActivity = this.IconCompatParcelizer;
            this.IconCompatParcelizer = null;
            debitCardProductCatalogActivity.IconCompatParcelizer(this);
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }
    }
}
