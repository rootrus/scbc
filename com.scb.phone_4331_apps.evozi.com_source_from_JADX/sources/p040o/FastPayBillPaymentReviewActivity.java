package p040o;

import java.util.Collection;
import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.FastPayBillPaymentReviewActivity */
public final class FastPayBillPaymentReviewActivity<T, U extends Collection<? super T>> extends NtbUserInfoActivity<T, U> {
    private Callable<U> read;

    public FastPayBillPaymentReviewActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(16);
    }

    public FastPayBillPaymentReviewActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, Callable<U> callable) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        try {
            this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.read.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }

    /* renamed from: o.FastPayBillPaymentReviewActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, U extends Collection<? super T>> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private U IconCompatParcelizer;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super U> write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, U u) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.IconCompatParcelizer = u;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.write.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
        }

        public final void onNext(T t) {
            this.IconCompatParcelizer.add(t);
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer = null;
            this.write.onError(th);
        }

        public final void onComplete() {
            U u = this.IconCompatParcelizer;
            this.IconCompatParcelizer = null;
            this.write.onNext(u);
            this.write.onComplete();
        }
    }
}
