package p040o;

/* renamed from: o.NTBEasycashLandingActivity */
public final class NTBEasycashLandingActivity<T> extends DebitCardSaleSheetActivity<T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> MediaBrowserCompat$CustomActionResultReceiver;

    public NTBEasycashLandingActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final void MediaBrowserCompat$ItemReceiver(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(new IconCompatParcelizer(baseChangePinWithMaxActivity_ViewBinding));
    }

    /* renamed from: o.NTBEasycashLandingActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BaseChangePinWithMaxActivity_ViewBinding<? super T> IconCompatParcelizer;
        private T MediaBrowserCompat$ItemReceiver;
        private BulkTransferDeepLinkActivity read;

        IconCompatParcelizer(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding) {
            this.IconCompatParcelizer = baseChangePinWithMaxActivity_ViewBinding;
        }

        public final void dispose() {
            this.read.dispose();
            this.read = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        }

        public final boolean isDisposed() {
            return this.read == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
                this.read = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$ItemReceiver = t;
        }

        public final void onError(Throwable th) {
            this.read = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            this.read = HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
            T t = this.MediaBrowserCompat$ItemReceiver;
            if (t != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(t);
                return;
            }
            this.IconCompatParcelizer.onComplete();
        }
    }
}
