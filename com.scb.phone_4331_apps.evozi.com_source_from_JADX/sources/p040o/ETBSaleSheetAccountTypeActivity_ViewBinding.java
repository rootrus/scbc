package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.ETBSaleSheetAccountTypeActivity_ViewBinding */
public final class ETBSaleSheetAccountTypeActivity_ViewBinding<T> extends DebitCardSaleSheetActivity<T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> IconCompatParcelizer;

    public ETBSaleSheetAccountTypeActivity_ViewBinding(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final void MediaBrowserCompat$ItemReceiver(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding) {
        this.IconCompatParcelizer.subscribe(new read(baseChangePinWithMaxActivity_ViewBinding));
    }

    /* renamed from: o.ETBSaleSheetAccountTypeActivity_ViewBinding$read */
    static final class read<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
        private BaseChangePinWithMaxActivity_ViewBinding<? super T> IconCompatParcelizer;
        private T MediaBrowserCompat$CustomActionResultReceiver;
        private BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private boolean write;

        read(BaseChangePinWithMaxActivity_ViewBinding<? super T> baseChangePinWithMaxActivity_ViewBinding) {
            this.IconCompatParcelizer = baseChangePinWithMaxActivity_ViewBinding;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity)) {
                this.MediaBrowserCompat$ItemReceiver = bulkTransferDeepLinkActivity;
                this.IconCompatParcelizer.onSubscribe(this);
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$ItemReceiver.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$ItemReceiver.isDisposed();
        }

        public final void onNext(T t) {
            if (!this.write) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    this.write = true;
                    this.MediaBrowserCompat$ItemReceiver.dispose();
                    this.IconCompatParcelizer.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.MediaBrowserCompat$CustomActionResultReceiver = t;
            }
        }

        public final void onError(Throwable th) {
            if (this.write) {
                AlertController$RecycleListView.read.read(th);
                return;
            }
            this.write = true;
            this.IconCompatParcelizer.onError(th);
        }

        public final void onComplete() {
            if (!this.write) {
                this.write = true;
                T t = this.MediaBrowserCompat$CustomActionResultReceiver;
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                if (t == null) {
                    this.IconCompatParcelizer.onComplete();
                } else {
                    this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(t);
                }
            }
        }
    }
}
