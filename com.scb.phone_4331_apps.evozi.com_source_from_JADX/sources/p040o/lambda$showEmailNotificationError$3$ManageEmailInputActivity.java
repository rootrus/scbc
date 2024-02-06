package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.lambda$showEmailNotificationError$3$ManageEmailInputActivity */
public final class lambda$showEmailNotificationError$3$ManageEmailInputActivity<T> extends NtbUserInfoActivity<T, T> {
    private DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<Object>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> MediaBrowserCompat$CustomActionResultReceiver;

    public lambda$showEmailNotificationError$3$ManageEmailInputActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<Object>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlETBOperatingAccountActivity hmlETBOperatingAccountActivity = new HmlETBOperatingAccountActivity(HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver());
        try {
            DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver.write(hmlETBOperatingAccountActivity), "The handler returned a null ObservableSource");
            read read2 = new read(bankingAgentTransactionsDeepLinkActivity, hmlETBOperatingAccountActivity, this.IconCompatParcelizer);
            bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
            debitCardResetPinSuccessActivity_ViewBinding.subscribe(read2.MediaBrowserCompat$CustomActionResultReceiver);
            read2.MediaBrowserCompat$CustomActionResultReceiver();
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }

    /* renamed from: o.lambda$showEmailNotificationError$3$ManageEmailInputActivity$read */
    static final class read<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        final AtomicReference<BulkTransferDeepLinkActivity> IconCompatParcelizer = new AtomicReference<>();
        final read<T>.CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = new C10040x630f648b(this);
        private volatile boolean MediaBrowserCompat$ItemReceiver;
        private DebitCardResetPinSuccessActivity_ViewBinding<T> MediaBrowserCompat$MediaItem;
        private HmlETBManageEmailVerificationActivity<Object> MediaDescriptionCompat;
        private AtomicInteger RatingCompat = new AtomicInteger();
        final HmlBusinessETBPersonalInfoActivity read = new HmlBusinessETBPersonalInfoActivity();
        final BankingAgentTransactionsDeepLinkActivity<? super T> write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, HmlETBManageEmailVerificationActivity<Object> hmlETBManageEmailVerificationActivity, DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.MediaDescriptionCompat = hmlETBManageEmailVerificationActivity;
            this.MediaBrowserCompat$MediaItem = debitCardResetPinSuccessActivity_ViewBinding;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(this.write, t, (AtomicInteger) this, this.read);
        }

        public final void onError(Throwable th) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((BankingAgentTransactionsDeepLinkActivity<?>) this.write, th, (AtomicInteger) this, this.read);
        }

        public final void onComplete() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, (BulkTransferDeepLinkActivity) null);
            this.MediaBrowserCompat$ItemReceiver = false;
            this.MediaDescriptionCompat.onNext(0);
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.IconCompatParcelizer);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (this.RatingCompat.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.MediaBrowserCompat$ItemReceiver) {
                        this.MediaBrowserCompat$ItemReceiver = true;
                        this.MediaBrowserCompat$MediaItem.subscribe(this);
                    }
                    if (this.RatingCompat.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }
}
