package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ManageFastPayQrScanActivity */
public final class ManageFastPayQrScanActivity<T, U, R> extends NtbUserInfoActivity<T, R> {
    private ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends U> write;

    public ManageFastPayQrScanActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends U> debitCardResetPinSuccessActivity_ViewBinding2) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = chequeManagementDeepLinkActivity;
        this.write = debitCardResetPinSuccessActivity_ViewBinding2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        HmlDocumentUploadGuidelineActivity hmlDocumentUploadGuidelineActivity = new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(hmlDocumentUploadGuidelineActivity, this.MediaBrowserCompat$CustomActionResultReceiver);
        hmlDocumentUploadGuidelineActivity.onSubscribe(iconCompatParcelizer);
        this.write.subscribe(new ManageFastPayQrScanActivity$MediaBrowserCompat$ItemReceiver(iconCompatParcelizer));
        this.IconCompatParcelizer.subscribe(iconCompatParcelizer);
    }

    /* renamed from: o.ManageFastPayQrScanActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, U, R> extends AtomicReference<U> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        final BankingAgentTransactionsDeepLinkActivity<? super R> IconCompatParcelizer;
        final AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();
        final AtomicReference<BulkTransferDeepLinkActivity> read = new AtomicReference<>();
        private ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, ChequeManagementDeepLinkActivity<? super T, ? super U, ? extends R> chequeManagementDeepLinkActivity) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
            this.write = chequeManagementDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    this.IconCompatParcelizer.onNext(HmlLatestPersonalInformationDeepLinkActivity.write(this.write.read(t, obj), "The combiner returned a null value"));
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    dispose();
                    this.IconCompatParcelizer.onError(th);
                }
            }
        }

        public final void onError(Throwable th) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.read);
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.read);
            this.IconCompatParcelizer.onComplete();
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.read);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get());
        }
    }
}
