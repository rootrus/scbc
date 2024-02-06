package p040o;

import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashActivity_ViewBinding */
public final class EasycashActivity_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
    private DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardMarketConductDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
    private DebitCardMarketConductDeepLinkActivity<? super Throwable> read;
    private DataPrivacyManagementDeepLinkActivity write;

    public EasycashActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity2) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = debitCardMarketConductDeepLinkActivity;
        this.read = debitCardMarketConductDeepLinkActivity2;
        this.write = dataPrivacyManagementDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = dataPrivacyManagementDeepLinkActivity2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, this.read, this.write, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* renamed from: o.EasycashActivity_ViewBinding$read */
    static final class read<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private boolean IconCompatParcelizer;
        private DebitCardMarketConductDeepLinkActivity<? super Throwable> MediaBrowserCompat$CustomActionResultReceiver;
        private DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private DebitCardMarketConductDeepLinkActivity<? super T> MediaDescriptionCompat;
        private BulkTransferDeepLinkActivity RatingCompat;
        private BankingAgentTransactionsDeepLinkActivity<? super T> read;
        private DataPrivacyManagementDeepLinkActivity write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity2) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
            this.MediaDescriptionCompat = debitCardMarketConductDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = debitCardMarketConductDeepLinkActivity2;
            this.write = dataPrivacyManagementDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = dataPrivacyManagementDeepLinkActivity2;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.RatingCompat, bulkTransferDeepLinkActivity)) {
                this.RatingCompat = bulkTransferDeepLinkActivity;
                this.read.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.RatingCompat.dispose();
        }

        public final boolean isDisposed() {
            return this.RatingCompat.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.IconCompatParcelizer) {
                try {
                    this.MediaDescriptionCompat.IconCompatParcelizer(t);
                    this.read.onNext(t);
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.RatingCompat.dispose();
                    onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.IconCompatParcelizer) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.IconCompatParcelizer = true;
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(th);
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                th = new CompositeException(th, th2);
            }
            this.read.onError(th);
            try {
                this.MediaBrowserCompat$ItemReceiver.read();
            } catch (Throwable th3) {
                AlertController$RecycleListView.read.write(th3);
                AlertController$RecycleListView.read.read(th3);
            }
        }

        public final void onComplete() {
            if (!this.IconCompatParcelizer) {
                try {
                    this.write.read();
                    this.IconCompatParcelizer = true;
                    this.read.onComplete();
                    try {
                        this.MediaBrowserCompat$ItemReceiver.read();
                    } catch (Throwable th) {
                        AlertController$RecycleListView.read.write(th);
                        AlertController$RecycleListView.read.read(th);
                    }
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    onError(th2);
                }
            }
        }
    }
}
