package p040o;

/* renamed from: o.EasycashReferralSendProductActivity */
public final class EasycashReferralSendProductActivity<T> extends DebitCardCoachMarkActivity implements HmlLatestLoanOfferStatusDeepLinkActivity<T> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> read;

    public EasycashReferralSendProductActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding) {
        this.read = debitCardResetPinSuccessActivity_ViewBinding;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        this.read.subscribe(new C6454x2fb70391(debitCardRequestInputActivity));
    }

    public final DebitCardResetOtpActivity<T> MediaBrowserCompat$CustomActionResultReceiver() {
        return new LoanRequestorActivity(this.read);
    }
}
