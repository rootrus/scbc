package p040o;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.onBtnCancelClicked */
public final class onBtnCancelClicked<T> extends NtbUserInfoActivity<T, T> {
    private long read;

    public onBtnCancelClicked(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, long j) {
        super(debitCardResetOtpActivity);
        this.read = j;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(hmlBusinessOwnerSuccessfulDeepLinkActivity);
        long j = this.read;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        new read(bankingAgentTransactionsDeepLinkActivity, j2, hmlBusinessOwnerSuccessfulDeepLinkActivity, this.IconCompatParcelizer).IconCompatParcelizer();
    }

    /* renamed from: o.onBtnCancelClicked$read */
    static final class read<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T> {
        private long MediaBrowserCompat$CustomActionResultReceiver;
        private HmlBusinessOwnerSuccessfulDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> read;
        private BankingAgentTransactionsDeepLinkActivity<? super T> write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = hmlBusinessOwnerSuccessfulDeepLinkActivity;
            this.read = debitCardResetPinSuccessActivity_ViewBinding;
            this.MediaBrowserCompat$CustomActionResultReceiver = j;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            this.write.onNext(t);
        }

        public final void onError(Throwable th) {
            this.write.onError(th);
        }

        public final void onComplete() {
            long j = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (j != Long.MAX_VALUE) {
                this.MediaBrowserCompat$CustomActionResultReceiver = j - 1;
            }
            if (j != 0) {
                IconCompatParcelizer();
            } else {
                this.write.onComplete();
            }
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.MediaBrowserCompat$ItemReceiver.isDisposed()) {
                    this.read.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
