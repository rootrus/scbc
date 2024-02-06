package p040o;

/* renamed from: o.clickSwitchToThai */
public final class clickSwitchToThai<T> extends BScanCNotificationDeepLinkActivity<Boolean> implements HmlLatestLoanOfferStatusDeepLinkActivity<Boolean> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> IconCompatParcelizer;
    private HmlBaseDeepLinkActivity<? super T> write;

    public clickSwitchToThai(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, HmlBaseDeepLinkActivity<? super T> hmlBaseDeepLinkActivity) {
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = hmlBaseDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super Boolean> activateChequeDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new clickSwitchToThai$MediaBrowserCompat$CustomActionResultReceiver(activateChequeDeepLinkActivity, this.write));
    }

    public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver() {
        return new RegistrationActivity_ViewBinding(this.IconCompatParcelizer, this.write);
    }
}
