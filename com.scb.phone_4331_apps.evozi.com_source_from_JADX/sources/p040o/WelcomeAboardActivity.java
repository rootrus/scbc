package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.WelcomeAboardActivity */
public final class WelcomeAboardActivity<T> extends NtbUserInfoActivity<T, Boolean> {
    private HmlBaseDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;

    public WelcomeAboardActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = hmlBaseDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Boolean> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver));
    }

    /* renamed from: o.WelcomeAboardActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private HmlBaseDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$ItemReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super Boolean> read;
        private BulkTransferDeepLinkActivity write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super Boolean> bankingAgentTransactionsDeepLinkActivity, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
                this.write = bulkTransferDeepLinkActivity;
                this.read.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                try {
                    if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(t)) {
                        this.MediaBrowserCompat$ItemReceiver = true;
                        this.write.dispose();
                        this.read.onNext(Boolean.TRUE);
                        this.read.onComplete();
                    }
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.write.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.MediaBrowserCompat$ItemReceiver = true;
            this.read.onError(th);
        }

        public final void onComplete() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                this.read.onNext(Boolean.FALSE);
                this.read.onComplete();
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
