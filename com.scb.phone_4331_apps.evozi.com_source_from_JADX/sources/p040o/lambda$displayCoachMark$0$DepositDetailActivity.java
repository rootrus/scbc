package p040o;

import java.util.concurrent.Callable;

/* renamed from: o.lambda$displayCoachMark$0$DepositDetailActivity */
public final class lambda$displayCoachMark$0$DepositDetailActivity<T, U> extends NtbUserInfoActivity<T, U> {
    private CreditCardDeepLinkActivity<? super U, ? super T> read;
    private Callable<? extends U> write;

    public lambda$displayCoachMark$0$DepositDetailActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, Callable<? extends U> callable, CreditCardDeepLinkActivity<? super U, ? super T> creditCardDeepLinkActivity) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.write = callable;
        this.read = creditCardDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity) {
        try {
            this.IconCompatParcelizer.subscribe(new C10035x211ca9c4(bankingAgentTransactionsDeepLinkActivity, HmlLatestPersonalInformationDeepLinkActivity.write(this.write.call(), "The initialSupplier returned a null value"), this.read));
        } catch (Throwable th) {
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }
}
