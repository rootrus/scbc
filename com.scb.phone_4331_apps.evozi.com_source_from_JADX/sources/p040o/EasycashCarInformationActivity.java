package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashCarInformationActivity */
public final class EasycashCarInformationActivity<T> extends NtbUserInfoActivity<T, T> {
    private DataPrivacyManagementDeepLinkActivity write;

    public EasycashCarInformationActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = dataPrivacyManagementDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new write(bankingAgentTransactionsDeepLinkActivity, this.write));
    }

    /* renamed from: o.EasycashCarInformationActivity$write */
    static final class write<T> extends LifestyleDeepLinkActivity<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
        private BulkTransferDeepLinkActivity IconCompatParcelizer;
        private boolean MediaBrowserCompat$CustomActionResultReceiver;
        private DataPrivacyManagementDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private HmlLoanOfferStatusDeepLinkActivity<T> read;
        private BankingAgentTransactionsDeepLinkActivity<? super T> write;

        write(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = dataPrivacyManagementDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
                this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
                if (bulkTransferDeepLinkActivity instanceof HmlLoanOfferStatusDeepLinkActivity) {
                    this.read = (HmlLoanOfferStatusDeepLinkActivity) bulkTransferDeepLinkActivity;
                }
                this.write.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.write.onNext(t);
        }

        public final void onError(Throwable th) {
            this.write.onError(th);
            if (compareAndSet(0, 1)) {
                try {
                    this.MediaBrowserCompat$ItemReceiver.read();
                } catch (Throwable th2) {
                    AlertController$RecycleListView.read.write(th2);
                    AlertController$RecycleListView.read.read(th2);
                }
            }
        }

        public final void onComplete() {
            this.write.onComplete();
            if (compareAndSet(0, 1)) {
                try {
                    this.MediaBrowserCompat$ItemReceiver.read();
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    AlertController$RecycleListView.read.read(th);
                }
            }
        }

        public final void dispose() {
            this.IconCompatParcelizer.dispose();
            if (compareAndSet(0, 1)) {
                try {
                    this.MediaBrowserCompat$ItemReceiver.read();
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    AlertController$RecycleListView.read.read(th);
                }
            }
        }

        public final boolean isDisposed() {
            return this.IconCompatParcelizer.isDisposed();
        }

        public final int write(int i) {
            HmlLoanOfferStatusDeepLinkActivity<T> hmlLoanOfferStatusDeepLinkActivity = this.read;
            boolean z = false;
            if (hmlLoanOfferStatusDeepLinkActivity == null || (i & 4) != 0) {
                return 0;
            }
            int write2 = hmlLoanOfferStatusDeepLinkActivity.write(i);
            if (write2 != 0) {
                if (write2 == 1) {
                    z = true;
                }
                this.MediaBrowserCompat$CustomActionResultReceiver = z;
            }
            return write2;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            this.read.MediaBrowserCompat$ItemReceiver();
        }

        public final boolean write() {
            return this.read.write();
        }

        public final T read() throws Exception {
            T read2 = this.read.read();
            if (read2 == null && this.MediaBrowserCompat$CustomActionResultReceiver && compareAndSet(0, 1)) {
                try {
                    this.MediaBrowserCompat$ItemReceiver.read();
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    AlertController$RecycleListView.read.read(th);
                }
            }
            return read2;
        }
    }
}
