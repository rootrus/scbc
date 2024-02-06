package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.ExportStatementSuccessfulActivity */
public final class ExportStatementSuccessfulActivity<T> extends NtbUserInfoActivity<T, T> {
    private BaseChangePinWithMaxActivity<? extends T> MediaBrowserCompat$ItemReceiver;

    public ExportStatementSuccessfulActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, BaseChangePinWithMaxActivity<? extends T> baseChangePinWithMaxActivity) {
        super(debitCardResetOtpActivity);
        this.MediaBrowserCompat$ItemReceiver = baseChangePinWithMaxActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.ExportStatementSuccessfulActivity$read */
    static final class read<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BaseChangePinWithMaxActivity_ViewBinding<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private BaseChangePinWithMaxActivity<? extends T> MediaBrowserCompat$ItemReceiver;
        private boolean write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, BaseChangePinWithMaxActivity<? extends T> baseChangePinWithMaxActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = baseChangePinWithMaxActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity) && !this.write) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }

        public final void onComplete() {
            if (this.write) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
                return;
            }
            this.write = true;
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, (BulkTransferDeepLinkActivity) null);
            BaseChangePinWithMaxActivity<? extends T> baseChangePinWithMaxActivity = this.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = null;
            baseChangePinWithMaxActivity.read(this);
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }
    }
}
