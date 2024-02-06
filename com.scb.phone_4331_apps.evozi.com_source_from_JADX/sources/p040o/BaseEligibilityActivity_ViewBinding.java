package p040o;

import java.util.ArrayDeque;

/* renamed from: o.BaseEligibilityActivity_ViewBinding */
public final class BaseEligibilityActivity_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
    private int read;

    public BaseEligibilityActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, int i) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = i;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.read));
    }

    /* renamed from: o.BaseEligibilityActivity_ViewBinding$read */
    static final class read<T> extends ArrayDeque<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private int IconCompatParcelizer;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super T> read;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, int i) {
            super(i);
            this.read = bankingAgentTransactionsDeepLinkActivity;
            this.IconCompatParcelizer = i;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.read.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
        }

        public final void onNext(T t) {
            if (this.IconCompatParcelizer == size()) {
                this.read.onNext(poll());
            }
            offer(t);
        }

        public final void onError(Throwable th) {
            this.read.onError(th);
        }

        public final void onComplete() {
            this.read.onComplete();
        }
    }
}
