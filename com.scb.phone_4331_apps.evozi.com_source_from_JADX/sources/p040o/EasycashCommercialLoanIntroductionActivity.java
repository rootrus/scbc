package p040o;

import java.util.concurrent.Callable;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashCommercialLoanIntroductionActivity */
public final class EasycashCommercialLoanIntroductionActivity<T, R> extends NtbUserInfoActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    private Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> MediaBrowserCompat$ItemReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> write;

    public EasycashCommercialLoanIntroductionActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity2, Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> callable) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity2;
        this.MediaBrowserCompat$CustomActionResultReceiver = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.write, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* renamed from: o.EasycashCommercialLoanIntroductionActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> IconCompatParcelizer;
        private Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> MediaBrowserCompat$CustomActionResultReceiver;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> read;
        private DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity, DirectDebitDeepLinkActivity<? super Throwable, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> directDebitDeepLinkActivity2, Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> callable) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
            this.IconCompatParcelizer = directDebitDeepLinkActivity;
            this.write = directDebitDeepLinkActivity2;
            this.MediaBrowserCompat$CustomActionResultReceiver = callable;
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
            try {
                this.read.onNext((DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.IconCompatParcelizer.write(t), "The onNext ObservableSource returned is null"));
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.read.onError(th);
            }
        }

        public final void onError(Throwable th) {
            try {
                this.read.onNext((DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.write.write(th), "The onError ObservableSource returned is null"));
                this.read.onComplete();
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                this.read.onError(new CompositeException(th, th2));
            }
        }

        public final void onComplete() {
            try {
                this.read.onNext((DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver.call(), "The onComplete ObservableSource returned is null"));
                this.read.onComplete();
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.read.onError(th);
            }
        }
    }
}
