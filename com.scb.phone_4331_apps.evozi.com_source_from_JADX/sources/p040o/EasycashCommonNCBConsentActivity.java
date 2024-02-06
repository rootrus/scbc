package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashCommonNCBConsentActivity */
public final class EasycashCommonNCBConsentActivity<T> extends NtbUserInfoActivity<T, T> {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> write;

    public EasycashCommonNCBConsentActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = directDebitDeepLinkActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new read(bankingAgentTransactionsDeepLinkActivity, this.write, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    /* renamed from: o.EasycashCommonNCBConsentActivity$read */
    static final class read<T> extends LifestyleDeepLinkActivity<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
        private HmlBusinessETBPersonalInfoActivity IconCompatParcelizer = new HmlBusinessETBPersonalInfoActivity();
        private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$ItemReceiver;
        private DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> MediaBrowserCompat$MediaItem;
        private BulkTransferDeepLinkActivity RatingCompat;
        final ChequeInquiryDeepLinkActivity read = new ChequeInquiryDeepLinkActivity();
        private boolean write;

        public final void MediaBrowserCompat$ItemReceiver() {
        }

        public final T read() throws Exception {
            return null;
        }

        public final int write(int i) {
            return i & 2;
        }

        public final boolean write() {
            return true;
        }

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DirectDebitDeepLinkActivity<? super T, ? extends DebitCardProductCatalogActivity> directDebitDeepLinkActivity, boolean z) {
            this.MediaBrowserCompat$ItemReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.MediaBrowserCompat$MediaItem = directDebitDeepLinkActivity;
            this.write = z;
            lazySet(1);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.RatingCompat, bulkTransferDeepLinkActivity)) {
                this.RatingCompat = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$ItemReceiver.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            try {
                DebitCardProductCatalogActivity debitCardProductCatalogActivity = (DebitCardProductCatalogActivity) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$MediaItem.write(t), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C6449xd659925a easycashCommonNCBConsentActivity$read$MediaBrowserCompat$ItemReceiver = new C6449xd659925a(this);
                if (!this.MediaBrowserCompat$CustomActionResultReceiver && this.read.MediaBrowserCompat$CustomActionResultReceiver(easycashCommonNCBConsentActivity$read$MediaBrowserCompat$ItemReceiver)) {
                    debitCardProductCatalogActivity.IconCompatParcelizer(easycashCommonNCBConsentActivity$read$MediaBrowserCompat$ItemReceiver);
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                this.RatingCompat.dispose();
                onError(th);
            }
        }

        public final void onError(Throwable th) {
            if (!HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(this.IconCompatParcelizer, th)) {
                AlertController$RecycleListView.read.read(th);
            } else if (!this.write) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.MediaBrowserCompat$ItemReceiver.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.IconCompatParcelizer));
                }
            } else if (decrementAndGet() == 0) {
                this.MediaBrowserCompat$ItemReceiver.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.IconCompatParcelizer));
            }
        }

        public final void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(this.IconCompatParcelizer);
                if (read2 != null) {
                    this.MediaBrowserCompat$ItemReceiver.onError(read2);
                } else {
                    this.MediaBrowserCompat$ItemReceiver.onComplete();
                }
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            this.RatingCompat.dispose();
            this.read.dispose();
        }

        public final boolean isDisposed() {
            return this.RatingCompat.isDisposed();
        }
    }
}
