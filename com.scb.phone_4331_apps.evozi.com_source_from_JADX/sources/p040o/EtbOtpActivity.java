package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.EtbOtpActivity */
public final class EtbOtpActivity<T, U> extends NtbUserInfoActivity<T, T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends U> MediaBrowserCompat$CustomActionResultReceiver;

    public EtbOtpActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends U> debitCardResetPinSuccessActivity_ViewBinding2) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(iconCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(iconCompatParcelizer.write);
        this.IconCompatParcelizer.subscribe(iconCompatParcelizer);
    }

    /* renamed from: o.EtbOtpActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, U> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        final HmlBusinessETBPersonalInfoActivity IconCompatParcelizer = new HmlBusinessETBPersonalInfoActivity();
        final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
        final AtomicReference<BulkTransferDeepLinkActivity> read = new AtomicReference<>();
        final IconCompatParcelizer<T, U>.ItemReceiver write = new C6473xf9987bbb(this);

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.read);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.write);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.read.get());
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.read, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, t, (AtomicInteger) this, this.IconCompatParcelizer);
        }

        public final void onError(Throwable th) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.write);
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((BankingAgentTransactionsDeepLinkActivity<?>) this.MediaBrowserCompat$ItemReceiver, th, (AtomicInteger) this, this.IconCompatParcelizer);
        }

        public final void onComplete() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.write);
            BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$ItemReceiver;
            HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.IconCompatParcelizer;
            if (getAndIncrement() == 0) {
                Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                if (read2 != null) {
                    bankingAgentTransactionsDeepLinkActivity.onError(read2);
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                }
            }
        }
    }
}
