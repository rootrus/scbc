package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashAdditionalDocumentTypeActivity */
public final class EasycashAdditionalDocumentTypeActivity<T> extends DebitCardSaleSheetActivity<T> implements HmlLatestLoanOfferStatusDeepLinkActivity<T> {
    private long MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> read;

    public EasycashAdditionalDocumentTypeActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j) {
        this.read = debitCardResetPinSuccessActivity_ViewBinding;
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
    }

    public final void MediaBrowserCompat$ItemReceiver(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding) {
        this.read.subscribe(new IconCompatParcelizer(baseChangePinWithMaxActivity_ViewBinding, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final DebitCardResetOtpActivity<T> MediaBrowserCompat$CustomActionResultReceiver() {
        return new EasycashAdditionalDocumentTypeActivity_ViewBinding(this.read, this.MediaBrowserCompat$CustomActionResultReceiver, null, false);
    }

    /* renamed from: o.EasycashAdditionalDocumentTypeActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private long IconCompatParcelizer;
        private BaseChangePinWithMaxActivity_ViewBinding<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$ItemReceiver;
        private long read;
        private BulkTransferDeepLinkActivity write;

        IconCompatParcelizer(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding, long j) {
            this.MediaBrowserCompat$CustomActionResultReceiver = baseChangePinWithMaxActivity_ViewBinding;
            this.read = j;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.write, bulkTransferDeepLinkActivity)) {
                this.write = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.write.dispose();
        }

        public final boolean isDisposed() {
            return this.write.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                long j = this.IconCompatParcelizer;
                if (j == this.read) {
                    this.MediaBrowserCompat$ItemReceiver = true;
                    this.write.dispose();
                    this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(t);
                    return;
                }
                this.IconCompatParcelizer = j + 1;
            }
        }

        public final void onError(Throwable th) {
            if (this.MediaBrowserCompat$ItemReceiver) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.MediaBrowserCompat$ItemReceiver = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }

        public final void onComplete() {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = true;
                this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
            }
        }
    }
}
