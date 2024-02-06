package p040o;

import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashSpeedyLoanIntroductionActivity */
public final class EasycashSpeedyLoanIntroductionActivity<T> extends NtbUserInfoActivity<T, T> {
    private DirectDebitDeepLinkActivity<? super Throwable, ? extends T> MediaBrowserCompat$CustomActionResultReceiver;

    public EasycashSpeedyLoanIntroductionActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super Throwable, ? extends T> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* renamed from: o.EasycashSpeedyLoanIntroductionActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BankingAgentTransactionsDeepLinkActivity<? super T> IconCompatParcelizer;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private DirectDebitDeepLinkActivity<? super Throwable, ? extends T> MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super Throwable, ? extends T> directDebitDeepLinkActivity) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed();
        }

        public final void onNext(T t) {
            this.IconCompatParcelizer.onNext(t);
        }

        public final void onError(Throwable th) {
            try {
                Object write = this.MediaBrowserCompat$ItemReceiver.write(th);
                if (write == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.IconCompatParcelizer.onError(nullPointerException);
                    return;
                }
                this.IconCompatParcelizer.onNext(write);
                this.IconCompatParcelizer.onComplete();
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                this.IconCompatParcelizer.onError(new CompositeException(th, th2));
            }
        }

        public final void onComplete() {
            this.IconCompatParcelizer.onComplete();
        }
    }
}
