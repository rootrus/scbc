package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.EtbActivity */
public final class EtbActivity<T> extends NtbUserInfoActivity<T, T> {
    private long read;

    public EtbActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = j;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.read));
    }

    /* renamed from: o.EtbActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
        private long MediaBrowserCompat$CustomActionResultReceiver;
        private boolean read;
        private BulkTransferDeepLinkActivity write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = j;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
                this.write = bulkTransferDeepLinkActivity;
                if (this.MediaBrowserCompat$CustomActionResultReceiver == 0) {
                    this.read = true;
                    bulkTransferDeepLinkActivity.dispose();
                    HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) this.IconCompatParcelizer);
                    return;
                }
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.read) {
                long j = this.MediaBrowserCompat$CustomActionResultReceiver;
                long j2 = j - 1;
                this.MediaBrowserCompat$CustomActionResultReceiver = j2;
                if (j > 0) {
                    boolean z = j2 == 0;
                    this.IconCompatParcelizer.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.read) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.read = true;
            this.write.dispose();
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            if (!this.read) {
                this.read = true;
                this.write.dispose();
                this.IconCompatParcelizer.onComplete();
            }
        }

        public final void dispose() {
            this.write.dispose();
        }

        public final boolean isDisposed() {
            return this.write.isDisposed();
        }
    }
}
