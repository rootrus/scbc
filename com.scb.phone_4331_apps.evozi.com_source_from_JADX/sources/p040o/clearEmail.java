package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.clearEmail */
public final class clearEmail<T> extends NtbUserInfoActivity<T, T> {
    private CreditCardServiceTabDeepLinkActivity<? super Integer, ? super Throwable> MediaBrowserCompat$ItemReceiver;

    public clearEmail(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, CreditCardServiceTabDeepLinkActivity<? super Integer, ? super Throwable> creditCardServiceTabDeepLinkActivity) {
        super(debitCardResetOtpActivity);
        this.MediaBrowserCompat$ItemReceiver = creditCardServiceTabDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(hmlBusinessOwnerSuccessfulDeepLinkActivity);
        new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, hmlBusinessOwnerSuccessfulDeepLinkActivity, this.IconCompatParcelizer).write();
    }

    /* renamed from: o.clearEmail$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T> {
        private int IconCompatParcelizer;
        private HmlBusinessOwnerSuccessfulDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
        private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> read;
        private CreditCardServiceTabDeepLinkActivity<? super Integer, ? super Throwable> write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, CreditCardServiceTabDeepLinkActivity<? super Integer, ? super Throwable> creditCardServiceTabDeepLinkActivity, HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
            this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOwnerSuccessfulDeepLinkActivity;
            this.read = debitCardResetPinSuccessActivity_ViewBinding;
            this.write = creditCardServiceTabDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$ItemReceiver.onNext(t);
        }

        public final void onError(Throwable th) {
            try {
                CreditCardServiceTabDeepLinkActivity<? super Integer, ? super Throwable> creditCardServiceTabDeepLinkActivity = this.write;
                int i = this.IconCompatParcelizer + 1;
                this.IconCompatParcelizer = i;
                if (!creditCardServiceTabDeepLinkActivity.IconCompatParcelizer(Integer.valueOf(i), th)) {
                    this.MediaBrowserCompat$ItemReceiver.onError(th);
                } else {
                    write();
                }
            } catch (Throwable th2) {
                AlertController$RecycleListView.read.write(th2);
                this.MediaBrowserCompat$ItemReceiver.onError(new CompositeException(th, th2));
            }
        }

        public final void onComplete() {
            this.MediaBrowserCompat$ItemReceiver.onComplete();
        }

        /* access modifiers changed from: package-private */
        public final void write() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.MediaBrowserCompat$CustomActionResultReceiver.isDisposed()) {
                    this.read.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }
}
