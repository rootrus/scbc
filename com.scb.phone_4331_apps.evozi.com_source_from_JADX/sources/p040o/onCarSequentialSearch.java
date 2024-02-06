package p040o;

/* renamed from: o.onCarSequentialSearch */
public final class onCarSequentialSearch<T> extends BScanCNotificationDeepLinkActivity<T> implements HmlLatestLoanOfferStatusDeepLinkActivity<T> {
    private T IconCompatParcelizer;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> read;
    private long write;

    public onCarSequentialSearch(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, long j, T t) {
        this.read = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = j;
        this.IconCompatParcelizer = t;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.read.subscribe(new C7304x40964aa9(activateChequeDeepLinkActivity, this.write, this.IconCompatParcelizer));
    }

    public final DebitCardResetOtpActivity<T> MediaBrowserCompat$CustomActionResultReceiver() {
        return new EasycashAdditionalDocumentTypeActivity_ViewBinding(this.read, this.write, this.IconCompatParcelizer, true);
    }
}
