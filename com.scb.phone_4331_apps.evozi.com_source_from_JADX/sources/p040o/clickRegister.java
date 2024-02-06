package p040o;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.clickRegister */
public final class clickRegister<T> extends NtbUserInfoActivity<T, T> {
    private BankingAgentDeepLinkActivity MediaBrowserCompat$ItemReceiver;

    public clickRegister(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = bankingAgentDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        read read2 = new read(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(read2, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new IconCompatParcelizer(read2)));
    }

    /* renamed from: o.clickRegister$read */
    static final class read<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
        private BankingAgentTransactionsDeepLinkActivity<? super T> write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            this.write.onNext(t);
        }

        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        public final void onComplete() {
            this.write.onComplete();
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }
    }

    /* renamed from: o.clickRegister$IconCompatParcelizer */
    final class IconCompatParcelizer implements Runnable {
        private final read<T> read;

        IconCompatParcelizer(read<T> read2) {
            this.read = read2;
        }

        public final void run() {
            clickRegister.this.IconCompatParcelizer.subscribe(this.read);
        }
    }
}
