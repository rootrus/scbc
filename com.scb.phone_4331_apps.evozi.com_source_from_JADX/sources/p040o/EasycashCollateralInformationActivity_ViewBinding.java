package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashCollateralInformationActivity_ViewBinding */
public final class EasycashCollateralInformationActivity_ViewBinding<T, R> extends NtbUserInfoActivity<T, R> {
    private DirectDebitDeepLinkActivity<? super T, ? extends Iterable<? extends R>> write;

    public EasycashCollateralInformationActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends Iterable<? extends R>> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.write));
    }

    /* renamed from: o.EasycashCollateralInformationActivity_ViewBinding$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$CustomActionResultReceiver;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private DirectDebitDeepLinkActivity<? super T, ? extends Iterable<? extends R>> read;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends Iterable<? extends R>> directDebitDeepLinkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.read = directDebitDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            if (this.MediaBrowserCompat$ItemReceiver != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                try {
                    BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                    for (Object write : (Iterable) this.read.write(t)) {
                        try {
                            try {
                                bankingAgentTransactionsDeepLinkActivity.onNext(HmlLatestPersonalInformationDeepLinkActivity.write(write, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                AlertController$RecycleListView.read.write(th);
                                this.MediaBrowserCompat$ItemReceiver.dispose();
                                onError(th);
                                return;
                            }
                        } catch (Throwable th2) {
                            AlertController$RecycleListView.read.write(th2);
                            this.MediaBrowserCompat$ItemReceiver.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    AlertController$RecycleListView.read.write(th3);
                    this.MediaBrowserCompat$ItemReceiver.dispose();
                    onError(th3);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$ItemReceiver == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.MediaBrowserCompat$ItemReceiver = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }

        public final void onComplete() {
            if (this.MediaBrowserCompat$ItemReceiver != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                this.MediaBrowserCompat$ItemReceiver = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
                this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
            }
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$ItemReceiver.isDisposed();
        }

        public final void dispose() {
            this.MediaBrowserCompat$ItemReceiver.dispose();
            this.MediaBrowserCompat$ItemReceiver = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        }
    }
}
