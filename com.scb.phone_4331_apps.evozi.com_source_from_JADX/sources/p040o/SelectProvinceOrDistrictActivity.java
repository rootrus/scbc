package p040o;

import java.util.Iterator;
import p040o.AlertController$RecycleListView;

/* renamed from: o.SelectProvinceOrDistrictActivity */
public final class SelectProvinceOrDistrictActivity<T, U, V> extends DebitCardResetOtpActivity<V> {
    private DebitCardResetOtpActivity<? extends T> IconCompatParcelizer;
    private Iterable<U> MediaBrowserCompat$ItemReceiver;
    private ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends V> read;

    public SelectProvinceOrDistrictActivity(DebitCardResetOtpActivity<? extends T> debitCardResetOtpActivity, Iterable<U> iterable, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends V> chequeManagementDeepLinkActivity) {
        this.IconCompatParcelizer = debitCardResetOtpActivity;
        this.MediaBrowserCompat$ItemReceiver = iterable;
        this.read = chequeManagementDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity) {
        try {
            Iterator it = (Iterator) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$ItemReceiver.iterator(), "The iterator returned by other is null");
            try {
                if (!it.hasNext()) {
                    HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
                } else {
                    this.IconCompatParcelizer.subscribe(new write(bankingAgentTransactionsDeepLinkActivity, it, this.read));
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
            }
        } catch (Throwable th2) {
            AlertController$RecycleListView.read.write(th2);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th2, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }

    /* renamed from: o.SelectProvinceOrDistrictActivity$write */
    static final class write<T, U, V> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends V> IconCompatParcelizer;
        private Iterator<U> MediaBrowserCompat$CustomActionResultReceiver;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super V> read;
        private boolean write;

        write(BankingAgentTransactionsDeepLinkActivity<? super V> bankingAgentTransactionsDeepLinkActivity, Iterator<U> it, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends V> chequeManagementDeepLinkActivity) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = it;
            this.IconCompatParcelizer = chequeManagementDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
                this.read.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$ItemReceiver.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.write) {
                try {
                    try {
                        this.read.onNext(HmlLatestPersonalInformationDeepLinkActivity.write(this.IconCompatParcelizer.read(t, HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                        try {
                            if (!this.MediaBrowserCompat$CustomActionResultReceiver.hasNext()) {
                                this.write = true;
                                this.MediaBrowserCompat$ItemReceiver.dispose();
                                this.read.onComplete();
                            }
                        } catch (Throwable th) {
                            AlertController$RecycleListView.read.write(th);
                            this.write = true;
                            this.MediaBrowserCompat$ItemReceiver.dispose();
                            this.read.onError(th);
                        }
                    } catch (Throwable th2) {
                        AlertController$RecycleListView.read.write(th2);
                        this.write = true;
                        this.MediaBrowserCompat$ItemReceiver.dispose();
                        this.read.onError(th2);
                    }
                } catch (Throwable th3) {
                    AlertController$RecycleListView.read.write(th3);
                    this.write = true;
                    this.MediaBrowserCompat$ItemReceiver.dispose();
                    this.read.onError(th3);
                }
            }
        }

        public final void onError(Throwable th) {
            if (this.write) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.write = true;
            this.read.onError(th);
        }

        public final void onComplete() {
            if (!this.write) {
                this.write = true;
                this.read.onComplete();
            }
        }
    }
}
