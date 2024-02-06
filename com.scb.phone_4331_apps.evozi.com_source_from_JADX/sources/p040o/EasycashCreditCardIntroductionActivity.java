package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.EasycashCreditCardIntroductionActivity */
public final class EasycashCreditCardIntroductionActivity<T> extends NtbUserInfoActivity<T, T> {
    private DebitCardProductCatalogActivity read;

    public EasycashCreditCardIntroductionActivity(DebitCardResetOtpActivity<T> debitCardResetOtpActivity, DebitCardProductCatalogActivity debitCardProductCatalogActivity) {
        super(debitCardResetOtpActivity);
        this.read = debitCardProductCatalogActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(iconCompatParcelizer);
        this.IconCompatParcelizer.subscribe(iconCompatParcelizer);
        this.read.IconCompatParcelizer(iconCompatParcelizer.RatingCompat);
    }

    /* renamed from: o.EasycashCreditCardIntroductionActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicInteger implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        volatile boolean IconCompatParcelizer;
        final HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessETBPersonalInfoActivity();
        final AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$ItemReceiver = new AtomicReference<>();
        final write RatingCompat = new write(this);
        final BankingAgentTransactionsDeepLinkActivity<? super T> read;
        volatile boolean write;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
            this.read = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(this.read, t, (AtomicInteger) this, this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final void onError(Throwable th) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.RatingCompat);
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((BankingAgentTransactionsDeepLinkActivity<?>) this.read, th, (AtomicInteger) this, this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final void onComplete() {
            this.write = true;
            if (this.IconCompatParcelizer) {
                BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = this.read;
                HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
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

        public final boolean isDisposed() {
            return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.get());
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$ItemReceiver);
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.RatingCompat);
        }

        /* renamed from: o.EasycashCreditCardIntroductionActivity$IconCompatParcelizer$write */
        static final class write extends AtomicReference<BulkTransferDeepLinkActivity> implements DebitCardRequestInputActivity {
            private IconCompatParcelizer<?> MediaBrowserCompat$CustomActionResultReceiver;

            write(IconCompatParcelizer<?> iconCompatParcelizer) {
                this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
            }

            public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
            }

            public final void onError(Throwable th) {
                IconCompatParcelizer<?> iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
                HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((BankingAgentTransactionsDeepLinkActivity<?>) iconCompatParcelizer.read, th, (AtomicInteger) iconCompatParcelizer, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
            }

            public final void onComplete() {
                IconCompatParcelizer<?> iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
                iconCompatParcelizer.IconCompatParcelizer = true;
                if (iconCompatParcelizer.write) {
                    BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity = iconCompatParcelizer.read;
                    HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                    if (iconCompatParcelizer.getAndIncrement() == 0) {
                        Throwable read = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                        if (read != null) {
                            bankingAgentTransactionsDeepLinkActivity.onError(read);
                        } else {
                            bankingAgentTransactionsDeepLinkActivity.onComplete();
                        }
                    }
                }
            }
        }
    }
}
