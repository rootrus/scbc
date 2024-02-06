package p040o;

import java.util.concurrent.Callable;
import p039io.reactivex.exceptions.CompositeException;
import p040o.AlertController$RecycleListView;

/* renamed from: o.FastPaySuccessActivity */
public final class FastPaySuccessActivity<T, D> extends DebitCardResetOtpActivity<T> {
    private Callable<? extends D> IconCompatParcelizer;
    private DirectDebitDeepLinkActivity<? super D, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> MediaBrowserCompat$CustomActionResultReceiver;
    private DebitCardMarketConductDeepLinkActivity<? super D> read;
    private boolean write;

    public FastPaySuccessActivity(Callable<? extends D> callable, DirectDebitDeepLinkActivity<? super D, ? extends DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> directDebitDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super D> debitCardMarketConductDeepLinkActivity, boolean z) {
        this.IconCompatParcelizer = callable;
        this.MediaBrowserCompat$CustomActionResultReceiver = directDebitDeepLinkActivity;
        this.read = debitCardMarketConductDeepLinkActivity;
        this.write = z;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        try {
            Object call = this.IconCompatParcelizer.call();
            try {
                ((DebitCardResetPinSuccessActivity_ViewBinding) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver.write(call), "The sourceSupplier returned a null ObservableSource")).subscribe(new FastPaySuccessActivity$MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity, call, this.read, this.write));
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver((Throwable) new CompositeException(th, th), (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
            }
        } catch (Throwable th2) {
            AlertController$RecycleListView.read.write(th2);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(th2, (BankingAgentTransactionsDeepLinkActivity<?>) bankingAgentTransactionsDeepLinkActivity);
        }
    }
}
