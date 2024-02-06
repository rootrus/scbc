package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.lambda$setListener$1$EasycashCollateralInformationActivity */
public final class lambda$setListener$1$EasycashCollateralInformationActivity<T> extends DebitCardResetOtpActivity<T> {
    private Callable<? extends Throwable> read;

    public lambda$setListener$1$EasycashCollateralInformationActivity(Callable<? extends Throwable> callable) {
        this.read = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        try {
            th = (Throwable) HmlLatestPersonalInformationDeepLinkActivity.write(this.read.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            AlertController$RecycleListView.read.write(th);
        }
        HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
    }
}
