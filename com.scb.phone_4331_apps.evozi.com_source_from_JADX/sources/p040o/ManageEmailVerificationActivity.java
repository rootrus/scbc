package p040o;

/* renamed from: o.ManageEmailVerificationActivity */
public final class ManageEmailVerificationActivity<T> extends DebitCardResetOtpActivity<Boolean> {
    private CreditCardServiceTabDeepLinkActivity<? super T, ? super T> IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> read;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> write;

    public ManageEmailVerificationActivity(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, CreditCardServiceTabDeepLinkActivity<? super T, ? super T> creditCardServiceTabDeepLinkActivity, int i) {
        this.read = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = debitCardResetPinSuccessActivity_ViewBinding2;
        this.IconCompatParcelizer = creditCardServiceTabDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Boolean> bankingAgentTransactionsDeepLinkActivity) {
        C9780xb9b4f8ce manageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9780xb9b4f8ce(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, this.read, this.write, this.IconCompatParcelizer);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(manageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver);
        write<T>[] writeArr = manageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        manageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.subscribe(writeArr[0]);
        manageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver.read.subscribe(writeArr[1]);
    }

    /* renamed from: o.ManageEmailVerificationActivity$write */
    static final class write<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
        private C9780xb9b4f8ce<T> IconCompatParcelizer;
        final HmlBaseEmailAboutActivity<T> MediaBrowserCompat$CustomActionResultReceiver;
        Throwable MediaBrowserCompat$ItemReceiver;
        private int read;
        volatile boolean write;

        write(C9780xb9b4f8ce<T> manageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver, int i, int i2) {
            this.IconCompatParcelizer = manageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.read = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = new HmlBaseEmailAboutActivity<>(i2);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            C9780xb9b4f8ce<T> manageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
            manageEmailVerificationActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write(this.read, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(t);
            this.IconCompatParcelizer.read();
        }

        public final void onError(Throwable th) {
            this.MediaBrowserCompat$ItemReceiver = th;
            this.write = true;
            this.IconCompatParcelizer.read();
        }

        public final void onComplete() {
            this.write = true;
            this.IconCompatParcelizer.read();
        }
    }
}
