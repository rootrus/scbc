package p040o;

import java.util.Collection;
import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.DonationsLandingActivity */
public final class DonationsLandingActivity<T, K> extends NtbUserInfoActivity<T, T> {
    private DirectDebitDeepLinkActivity<? super T, K> MediaBrowserCompat$ItemReceiver;
    private Callable<? extends Collection<? super K>> read;

    public DonationsLandingActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, DirectDebitDeepLinkActivity<? super T, K> directDebitDeepLinkActivity, Callable<? extends Collection<? super K>> callable) {
        super(debitCardResetPinSuccessActivity_ViewBinding);
        this.MediaBrowserCompat$ItemReceiver = directDebitDeepLinkActivity;
        this.read = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        try {
            this.IconCompatParcelizer.subscribe(new C9717x656de4d2(bankingAgentTransactionsDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, (Collection) HmlLatestPersonalInformationDeepLinkActivity.write(this.read.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }
}
