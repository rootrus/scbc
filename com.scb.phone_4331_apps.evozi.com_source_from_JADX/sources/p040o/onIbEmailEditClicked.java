package p040o;

/* renamed from: o.onIbEmailEditClicked */
public final class onIbEmailEditClicked<T> extends NtbUserInfoActivity<T, T> {
    private boolean MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<?> read;

    public onIbEmailEditClicked(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<?> debitCardResetPinSuccessActivity_ViewBinding2, boolean z) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.read = debitCardResetPinSuccessActivity_ViewBinding2;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlDocumentUploadGuidelineActivity hmlDocumentUploadGuidelineActivity = new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity);
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer.subscribe(new C10096xf0f91c6(hmlDocumentUploadGuidelineActivity, this.read));
        } else {
            this.IconCompatParcelizer.subscribe(new read(hmlDocumentUploadGuidelineActivity, this.read));
        }
    }

    /* renamed from: o.onIbEmailEditClicked$write */
    static final class write<T> implements BankingAgentTransactionsDeepLinkActivity<Object> {
        private onIbEmailEditClicked$MediaBrowserCompat$ItemReceiver<T> write;

        write(onIbEmailEditClicked$MediaBrowserCompat$ItemReceiver<T> onibemaileditclicked_mediabrowsercompat_itemreceiver) {
            this.write = onibemaileditclicked_mediabrowsercompat_itemreceiver;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write.MediaBrowserCompat$ItemReceiver, bulkTransferDeepLinkActivity);
        }

        public final void onNext(Object obj) {
            this.write.read();
        }

        public final void onError(Throwable th) {
            onIbEmailEditClicked$MediaBrowserCompat$ItemReceiver<T> onibemaileditclicked_mediabrowsercompat_itemreceiver = this.write;
            onibemaileditclicked_mediabrowsercompat_itemreceiver.IconCompatParcelizer.dispose();
            onibemaileditclicked_mediabrowsercompat_itemreceiver.read.onError(th);
        }

        public final void onComplete() {
            onIbEmailEditClicked$MediaBrowserCompat$ItemReceiver<T> onibemaileditclicked_mediabrowsercompat_itemreceiver = this.write;
            onibemaileditclicked_mediabrowsercompat_itemreceiver.IconCompatParcelizer.dispose();
            onibemaileditclicked_mediabrowsercompat_itemreceiver.IconCompatParcelizer();
        }
    }

    /* renamed from: o.onIbEmailEditClicked$read */
    static final class read<T> extends onIbEmailEditClicked$MediaBrowserCompat$ItemReceiver<T> {
        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, DebitCardResetPinSuccessActivity_ViewBinding<?> debitCardResetPinSuccessActivity_ViewBinding) {
            super(bankingAgentTransactionsDeepLinkActivity, debitCardResetPinSuccessActivity_ViewBinding);
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer() {
            this.read.onComplete();
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            Object andSet = getAndSet((Object) null);
            if (andSet != null) {
                this.read.onNext(andSet);
            }
        }
    }
}
