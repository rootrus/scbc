package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.DirectDebitReviewActivity */
public final class DirectDebitReviewActivity<T> extends DebitCardResetOtpActivity<T> {
    private Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> IconCompatParcelizer;

    public DirectDebitReviewActivity(Callable<? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> callable) {
        this.IconCompatParcelizer = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        try {
            ((DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.IconCompatParcelizer.call(), "null ObservableSource supplied")).subscribe(bankingAgentTransactionsDeepLinkActivity);
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }
}
