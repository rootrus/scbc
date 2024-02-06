package p040o;

import java.util.concurrent.Callable;

/* renamed from: o.DepositProductCatalogActivity */
public final class DepositProductCatalogActivity<T, U> extends BScanCNotificationDeepLinkActivity<U> implements HmlLatestLoanOfferStatusDeepLinkActivity<U> {
    private Callable<? extends U> MediaBrowserCompat$CustomActionResultReceiver;
    private CreditCardDeepLinkActivity<? super U, ? super T> MediaBrowserCompat$ItemReceiver;
    private DebitCardResetPinSuccessActivity_ViewBinding<T> write;

    public DepositProductCatalogActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, Callable<? extends U> callable, CreditCardDeepLinkActivity<? super U, ? super T> creditCardDeepLinkActivity) {
        this.write = debitCardResetPinSuccessActivity_ViewBinding;
        this.MediaBrowserCompat$CustomActionResultReceiver = callable;
        this.MediaBrowserCompat$ItemReceiver = creditCardDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super U> activateChequeDeepLinkActivity) {
        try {
            this.write.subscribe(new C9711x7d741dc4(activateChequeDeepLinkActivity, HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver.call(), "The initialSupplier returned a null value"), this.MediaBrowserCompat$ItemReceiver));
        } catch (Throwable th) {
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write(th, activateChequeDeepLinkActivity);
        }
    }

    public final DebitCardResetOtpActivity<U> MediaBrowserCompat$CustomActionResultReceiver() {
        return new lambda$displayCoachMark$0$DepositDetailActivity(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}
