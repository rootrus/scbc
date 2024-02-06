package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.ManageEmailInputActivity_ViewBinding */
public final class ManageEmailInputActivity_ViewBinding<T> extends NtbUserInfoActivity<T, T> {
    private DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<Throwable>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> MediaBrowserCompat$ItemReceiver;

    public ManageEmailInputActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super DebitCardResetOtpActivity<Throwable>, ? extends DebitCardResetPinSuccessActivity_ViewBinding<?>> directDebitDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlETBOperatingAccountActivity hmlETBOperatingAccountActivity = new HmlETBOperatingAccountActivity(HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver());
        try {
            DebitCardResetPinSuccessActivity_ViewBinding debitCardResetPinSuccessActivity_ViewBinding = (DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$ItemReceiver.write(hmlETBOperatingAccountActivity), "The handler returned a null ObservableSource");
            read read2 = new read(bankingAgentTransactionsDeepLinkActivity, hmlETBOperatingAccountActivity, this.IconCompatParcelizer);
            bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
            debitCardResetPinSuccessActivity_ViewBinding.subscribe(read2.MediaBrowserCompat$ItemReceiver);
            read2.read();
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }

    /* renamed from: o.ManageEmailInputActivity_ViewBinding$read */
    static final class read<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        final AtomicReference<BulkTransferDeepLinkActivity> IconCompatParcelizer = new AtomicReference<>();
        final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        final read<T>.read MediaBrowserCompat$ItemReceiver = new C10811read();
        private AtomicInteger MediaBrowserCompat$MediaItem = new AtomicInteger();
        private HmlETBManageEmailVerificationActivity<Throwable> MediaBrowserCompat$SearchResultReceiver;
        private DebitCardResetPinSuccessActivity_ViewBinding<T> RatingCompat;
        final HmlBusinessETBPersonalInfoActivity read = new HmlBusinessETBPersonalInfoActivity();
        private volatile boolean write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, HmlETBManageEmailVerificationActivity<Throwable> hmlETBManageEmailVerificationActivity, DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$SearchResultReceiver = hmlETBManageEmailVerificationActivity;
            this.RatingCompat = debitCardResetPinSuccessActivity_ViewBinding;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, t, (AtomicInteger) this, this.read);
        }

        public final void onError(Throwable th) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, (BulkTransferDeepLinkActivity) null);
            this.write = false;
            this.MediaBrowserCompat$SearchResultReceiver.onNext(th);
        }

        public final void onComplete() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
            BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.read;
            if (getAndIncrement() == 0) {
                Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                if (read2 != null) {
                    bankingAgentTransactionsDeepLinkActivity.onError(read2);
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                }
            }
        }

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.IconCompatParcelizer);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            if (this.MediaBrowserCompat$MediaItem.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.write) {
                        this.write = true;
                        this.RatingCompat.subscribe(this);
                    }
                    if (this.MediaBrowserCompat$MediaItem.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        /* renamed from: o.ManageEmailInputActivity_ViewBinding$read$read  reason: collision with other inner class name */
        final class C10811read extends AtomicReference<BulkTransferDeepLinkActivity> implements BankingAgentTransactionsDeepLinkActivity<Object> {
            C10811read() {
            }

            public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
            }

            public final void onNext(Object obj) {
                read.this.read();
            }

            public final void onError(Throwable th) {
                read read = read.this;
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read.IconCompatParcelizer);
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((BankingAgentTransactionsDeepLinkActivity<?>) read.MediaBrowserCompat$CustomActionResultReceiver, th, (AtomicInteger) read, read.read);
            }

            public final void onComplete() {
                read read = read.this;
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(read.IconCompatParcelizer);
                BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = read.MediaBrowserCompat$CustomActionResultReceiver;
                HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = read.read;
                if (read.getAndIncrement() == 0) {
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
}
