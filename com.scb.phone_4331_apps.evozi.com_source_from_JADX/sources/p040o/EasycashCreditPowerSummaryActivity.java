package p040o;

/* renamed from: o.EasycashCreditPowerSummaryActivity */
public final class EasycashCreditPowerSummaryActivity<T> extends BScanCNotificationDeepLinkActivity<T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> IconCompatParcelizer;
    private T read;

    public EasycashCreditPowerSummaryActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, T t) {
        this.IconCompatParcelizer = debitCardResetPinSuccessActivity_ViewBinding;
        this.read = t;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        this.IconCompatParcelizer.subscribe(new C9720x27aae5fa(activateChequeDeepLinkActivity, this.read));
    }
}
