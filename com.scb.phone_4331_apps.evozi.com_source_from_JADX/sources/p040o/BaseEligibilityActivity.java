package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.BaseEligibilityActivity */
public final class BaseEligibilityActivity<T, R> extends NtbUserInfoActivity<T, R> {
    private ChequeManagementDeepLinkActivity<R, ? super T, R> read;
    private Callable<R> write;

    public BaseEligibilityActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, Callable<R> callable, ChequeManagementDeepLinkActivity<R, ? super T, R> chequeManagementDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = chequeManagementDeepLinkActivity;
        this.write = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        try {
            this.IconCompatParcelizer.subscribe(new write(bankingAgentTransactionsDeepLinkActivity, this.read, HmlLatestPersonalInformationDeepLinkActivity.write(this.write.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }

    /* renamed from: o.BaseEligibilityActivity$write */
    static final class write<T, R> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private boolean IconCompatParcelizer;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$ItemReceiver;
        private ChequeManagementDeepLinkActivity<R, ? super T, R> read;
        private R write;

        write(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, ChequeManagementDeepLinkActivity<R, ? super T, R> chequeManagementDeepLinkActivity, R r) {
            this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.read = chequeManagementDeepLinkActivity;
            this.write = r;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
                this.MediaBrowserCompat$ItemReceiver.onNext(this.write);
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.IconCompatParcelizer) {
                try {
                    R write2 = HmlLatestPersonalInformationDeepLinkActivity.write(this.read.read(this.write, t), "The accumulator returned a null value");
                    this.write = write2;
                    this.MediaBrowserCompat$ItemReceiver.onNext(write2);
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
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
            this.MediaBrowserCompat$ItemReceiver.onError(th);
        }

        public final void onComplete() {
            if (!this.IconCompatParcelizer) {
                this.IconCompatParcelizer = true;
                this.MediaBrowserCompat$ItemReceiver.onComplete();
            }
        }
    }
}
