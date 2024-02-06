package p040o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.onSaveButtonClicked */
public final class onSaveButtonClicked<T> extends NtbUserInfoActivity<T, HmlETBLoanReviewActivity<T>> {
    private BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;
    private TimeUnit read;

    public onSaveButtonClicked(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
        this.read = timeUnit;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super HmlETBLoanReviewActivity<T>> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.read, this.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.onSaveButtonClicked$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private TimeUnit IconCompatParcelizer;
        private long MediaBrowserCompat$ItemReceiver;
        private BulkTransferDeepLinkActivity read;
        private BankingAgentTransactionsDeepLinkActivity<? super HmlETBLoanReviewActivity<T>> write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super HmlETBLoanReviewActivity<T>> bankingAgentTransactionsDeepLinkActivity, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.IconCompatParcelizer = timeUnit;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
                this.read = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$ItemReceiver = BankingAgentDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer);
                this.write.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.read.dispose();
        }

        public final boolean isDisposed() {
            return this.read.isDisposed();
        }

        public final void onNext(T t) {
            long IconCompatParcelizer2 = BankingAgentDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer);
            long j = this.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
            this.write.onNext(new HmlETBLoanReviewActivity(t, IconCompatParcelizer2 - j, this.IconCompatParcelizer));
        }

        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        public final void onComplete() {
            this.write.onComplete();
        }
    }
}
