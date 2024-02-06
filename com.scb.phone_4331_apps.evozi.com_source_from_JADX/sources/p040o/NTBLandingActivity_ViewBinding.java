package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.NTBLandingActivity_ViewBinding */
public final class NTBLandingActivity_ViewBinding<T, R> extends DebitCardResetOtpActivity<R> {
    private BillerDeepLinkActivity<T> IconCompatParcelizer;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> MediaBrowserCompat$CustomActionResultReceiver;

    public NTBLandingActivity_ViewBinding(BillerDeepLinkActivity<T> billerDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
        this.IconCompatParcelizer = billerDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity) {
        read read2 = new read(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$CustomActionResultReceiver);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
        this.IconCompatParcelizer.IconCompatParcelizer(read2);
    }

    /* renamed from: o.NTBLandingActivity_ViewBinding$read */
    static final class read<T, R> extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<R>, ActivateChequeDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super R> MediaBrowserCompat$ItemReceiver;
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> read;

        read(BankingAgentTransactionsDeepLinkActivity<? super R> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity) {
            this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.read = directDebitDeepLinkActivity;
        }

        public final void onNext(R r) {
            this.MediaBrowserCompat$ItemReceiver.onNext(r);
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$ItemReceiver.onError(th);
        }

        public final void onComplete() {
            this.MediaBrowserCompat$ItemReceiver.onComplete();
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver((BulkTransferDeepLinkActivity) get());
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this, bulkTransferDeepLinkActivity);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            try {
                ((DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.read.write(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.MediaBrowserCompat$ItemReceiver.onError(th);
            }
        }
    }
}
