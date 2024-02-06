package p040o;

import java.util.concurrent.atomic.AtomicInteger;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashCreditPowerInputActivity */
public final class EasycashCreditPowerInputActivity<T> extends DebitCardCoachMarkActivity implements HmlLatestLoanOfferStatusDeepLinkActivity<T> {
    private boolean IconCompatParcelizer;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> read;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> write;

    public EasycashCreditPowerInputActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, boolean z) {
        this.read = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = directDebitDeepLinkActivity;
        this.IconCompatParcelizer = z;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        this.read.subscribe(new IconCompatParcelizer(debitCardRequestInputActivity, this.write, this.IconCompatParcelizer));
    }

    public final DebitCardResetOtpActivity<T> MediaBrowserCompat$CustomActionResultReceiver() {
        return new EasycashCommonNCBConsentActivity(this.read, this.write, this.IconCompatParcelizer);
    }

    /* renamed from: o.EasycashCreditPowerInputActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> extends AtomicInteger implements BulkTransferDeepLinkActivity, BankingAgentTransactionsDeepLinkActivity<T> {
        private volatile boolean IconCompatParcelizer;
        private HmlBusinessETBPersonalInfoActivity MediaBrowserCompat$CustomActionResultReceiver = new HmlBusinessETBPersonalInfoActivity();
        final ChequeInquiryDeepLinkActivity MediaBrowserCompat$ItemReceiver = new ChequeInquiryDeepLinkActivity();
        private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> RatingCompat;
        private DebitCardRequestInputActivity read;
        private boolean write;

        IconCompatParcelizer(DebitCardRequestInputActivity debitCardRequestInputActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, boolean z) {
            this.read = debitCardRequestInputActivity;
            this.RatingCompat = directDebitDeepLinkActivity;
            this.write = z;
            lazySet(1);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$SearchResultReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$SearchResultReceiver = bulkTransferDeepLinkActivity;
                this.read.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            try {
                DebitCardProductCatalogActivity debitCardProductCatalogActivity = (DebitCardProductCatalogActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.RatingCompat.write(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C6450xfedc0c40 easycashCreditPowerInputActivity$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver = new C6450xfedc0c40(this);
                if (!this.IconCompatParcelizer && this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(easycashCreditPowerInputActivity$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver)) {
                    debitCardProductCatalogActivity.IconCompatParcelizer(easycashCreditPowerInputActivity$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver);
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.MediaBrowserCompat$SearchResultReceiver.dispose();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (!HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, th)) {
                AlertController$RecycleListView.read.read(th);
            } else if (!this.write) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.read.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver));
                }
            } else if (decrementAndGet() == 0) {
                this.read.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver));
            }
        }

        public final void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$CustomActionResultReceiver);
                if (read2 != null) {
                    this.read.onError(read2);
                } else {
                    this.read.onComplete();
                }
            }
        }

        public final void dispose() {
            this.IconCompatParcelizer = true;
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$SearchResultReceiver.isDisposed();
        }
    }
}
