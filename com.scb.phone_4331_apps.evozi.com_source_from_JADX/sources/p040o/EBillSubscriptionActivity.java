package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EBillSubscriptionActivity */
public final class EBillSubscriptionActivity<T, R> extends NtbUserInfoActivity<T, R> {
    private DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> MediaBrowserCompat$ItemReceiver;

    public EBillSubscriptionActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<T>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<R>> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        HmlETBPersonalInfoActivity MediaBrowserCompat$CustomActionResultReceiver = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        try {
            DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$ItemReceiver.write(MediaBrowserCompat$CustomActionResultReceiver), "The selector returned a null ObservableSource");
            write write2 = new write(bankingAgentTransactionsDeepLinkActivity);
            debitCardResetPinSuccessActivity_ViewBinding.subscribe(write2);
            this.IconCompatParcelizer.subscribe(new EBillSubscriptionActivity$MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver, write2));
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }

    /* renamed from: o.EBillSubscriptionActivity$write */
    static final class write<T, R> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<R>, BulkTransferDeepLinkActivity {
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super R> write;

        write(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.write.onSubscribe(this);
            }
        }

        public final void onNext(R r) {
            this.write.onNext(r);
        }

        public final void onError(Throwable th) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
            this.write.onError(th);
        }

        public final void onComplete() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
            this.write.onComplete();
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
        }
    }
}
