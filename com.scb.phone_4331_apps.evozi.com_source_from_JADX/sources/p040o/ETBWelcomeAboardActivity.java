package p040o;

/* renamed from: o.ETBWelcomeAboardActivity */
public final class ETBWelcomeAboardActivity<T, U> extends NtbUserInfoActivity<T, T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<U> MediaBrowserCompat$CustomActionResultReceiver;

    public ETBWelcomeAboardActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<U> debitCardResetPinSuccessActivity_ViewBinding2) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        HmlDocumentUploadGuidelineActivity hmlDocumentUploadGuidelineActivity = new HmlDocumentUploadGuidelineActivity(bankingAgentTransactionsDeepLinkActivity);
        ExternalDeepLinkActivity externalDeepLinkActivity = new ExternalDeepLinkActivity();
        hmlDocumentUploadGuidelineActivity.onSubscribe(externalDeepLinkActivity);
        read read2 = new read(hmlDocumentUploadGuidelineActivity, externalDeepLinkActivity);
        this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(new write(externalDeepLinkActivity, read2, hmlDocumentUploadGuidelineActivity));
        this.IconCompatParcelizer.subscribe(read2);
    }

    /* renamed from: o.ETBWelcomeAboardActivity$read */
    static final class read<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
        private BulkTransferDeepLinkActivity IconCompatParcelizer;
        private BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
        volatile boolean MediaBrowserCompat$ItemReceiver;
        private boolean read;
        private ExternalDeepLinkActivity write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, ExternalDeepLinkActivity externalDeepLinkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.write = externalDeepLinkActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.IconCompatParcelizer, bulkTransferDeepLinkActivity)) {
                this.IconCompatParcelizer = bulkTransferDeepLinkActivity;
                this.write.write(0, bulkTransferDeepLinkActivity);
            }
        }

        public final void onNext(T t) {
            if (this.read) {
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
            } else if (this.MediaBrowserCompat$ItemReceiver) {
                this.read = true;
                this.MediaBrowserCompat$CustomActionResultReceiver.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            this.write.dispose();
            this.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
        }

        public final void onComplete() {
            this.write.dispose();
            this.MediaBrowserCompat$CustomActionResultReceiver.onComplete();
        }
    }

    /* renamed from: o.ETBWelcomeAboardActivity$write */
    final class write implements BankingAgentTransactionsDeepLinkActivity<U> {
        private read<T> IconCompatParcelizer;
        private ExternalDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
        private BulkTransferDeepLinkActivity read;
        private HmlDocumentUploadGuidelineActivity<T> write;

        write(ExternalDeepLinkActivity externalDeepLinkActivity, read<T> read2, HmlDocumentUploadGuidelineActivity<T> hmlDocumentUploadGuidelineActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = externalDeepLinkActivity;
            this.IconCompatParcelizer = read2;
            this.write = hmlDocumentUploadGuidelineActivity;
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.read, bulkTransferDeepLinkActivity)) {
                this.read = bulkTransferDeepLinkActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver.write(1, bulkTransferDeepLinkActivity);
            }
        }

        public final void onNext(U u) {
            this.read.dispose();
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = true;
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
            this.write.onError(th);
        }

        public final void onComplete() {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = true;
        }
    }
}
