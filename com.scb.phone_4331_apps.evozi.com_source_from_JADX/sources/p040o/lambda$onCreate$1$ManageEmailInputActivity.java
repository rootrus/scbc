package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;

/* renamed from: o.lambda$onCreate$1$ManageEmailInputActivity */
public final class lambda$onCreate$1$ManageEmailInputActivity<T> extends NtbUserInfoActivity<T, T> {
    private ECouponRedemptionDeeplinkActivity write;

    public lambda$onCreate$1$ManageEmailInputActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, ECouponRedemptionDeeplinkActivity eCouponRedemptionDeeplinkActivity) {
        super(debitCardResetOtpActivity);
        this.write = eCouponRedemptionDeeplinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(hmlBusinessOwnerSuccessfulDeepLinkActivity);
        new read(bankingAgentTransactionsDeepLinkActivity, this.write, hmlBusinessOwnerSuccessfulDeepLinkActivity, this.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver();
    }

    /* renamed from: o.lambda$onCreate$1$ManageEmailInputActivity$read */
    static final class read<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T> {
        private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> MediaBrowserCompat$CustomActionResultReceiver;
        private HmlBusinessOwnerSuccessfulDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super T> read;
        private ECouponRedemptionDeeplinkActivity write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, ECouponRedemptionDeeplinkActivity eCouponRedemptionDeeplinkActivity, HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$ItemReceiver = hmlBusinessOwnerSuccessfulDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding;
            this.write = eCouponRedemptionDeeplinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            this.read.onNext(t);
        }

        public final void onError(Throwable th) {
            this.read.onError(th);
        }

        public final void onComplete() {
            try {
                if (this.write.MediaBrowserCompat$ItemReceiver()) {
                    this.read.onComplete();
                } else {
                    MediaBrowserCompat$ItemReceiver();
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.read.onError(th);
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver() {
            if (getAndIncrement() == 0) {
                int i = 1;
                do {
                    this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(this);
                    i = addAndGet(-i);
                } while (i != 0);
            }
        }
    }
}
