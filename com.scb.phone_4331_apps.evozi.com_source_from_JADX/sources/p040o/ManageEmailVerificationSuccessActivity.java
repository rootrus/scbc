package p040o;

/* renamed from: o.ManageEmailVerificationSuccessActivity */
public final class ManageEmailVerificationSuccessActivity<T> extends BScanCNotificationDeepLinkActivity<Boolean> implements HmlLatestLoanOfferStatusDeepLinkActivity<Boolean> {
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> IconCompatParcelizer;
    private CreditCardServiceTabDeepLinkActivity<? super T, ? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<? extends T> MediaBrowserCompat$ItemReceiver;
    private int write;

    public ManageEmailVerificationSuccessActivity(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding2, CreditCardServiceTabDeepLinkActivity<? super T, ? super T> creditCardServiceTabDeepLinkActivity, int i) {
        this.MediaBrowserCompat$ItemReceiver = debitCardResetPinSuccessActivity_ViewBinding;
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding2;
        this.MediaBrowserCompat$CustomActionResultReceiver = creditCardServiceTabDeepLinkActivity;
        this.write = i;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super Boolean> activateChequeDeepLinkActivity) {
        C9781x4ab0d18d manageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver = new C9781x4ab0d18d(activateChequeDeepLinkActivity, this.write, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver);
        activateChequeDeepLinkActivity.onSubscribe(manageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver);
        write<T>[] writeArr = manageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.read;
        manageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.subscribe(writeArr[0]);
        manageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.write.subscribe(writeArr[1]);
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver() {
        return new ManageEmailVerificationActivity(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
    }

    /* renamed from: o.ManageEmailVerificationSuccessActivity$write */
    static final class write<T> implements BankingAgentTransactionsDeepLinkActivity<T> {
        Throwable IconCompatParcelizer;
        private C9781x4ab0d18d<T> MediaBrowserCompat$CustomActionResultReceiver;
        volatile boolean MediaBrowserCompat$ItemReceiver;
        final HmlBaseEmailAboutActivity<T> read;
        private int write;

        write(C9781x4ab0d18d<T> manageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver, int i, int i2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = manageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.write = i;
            this.read = new HmlBaseEmailAboutActivity<>(i2);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            C9781x4ab0d18d<T> manageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            manageEmailVerificationSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write(this.write, bulkTransferDeepLinkActivity);
        }

        public final void onNext(T t) {
            this.read.IconCompatParcelizer(t);
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onError(Throwable th) {
            this.IconCompatParcelizer = th;
            this.MediaBrowserCompat$ItemReceiver = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onComplete() {
            this.MediaBrowserCompat$ItemReceiver = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
