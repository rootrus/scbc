package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;
import p040o.ManageEmailInputActivity;

/* renamed from: o.EBillSubscriptionSuccessActivity */
public final class EBillSubscriptionSuccessActivity<T, R> extends BScanCNotificationDeepLinkActivity<R> {
    private DebitCardResetPinSuccessActivity_ViewBinding<T> MediaBrowserCompat$CustomActionResultReceiver;
    private ChequeManagementDeepLinkActivity<R, ? super T, R> MediaBrowserCompat$ItemReceiver;
    private Callable<R> write;

    public EBillSubscriptionSuccessActivity(DebitCardResetPinSuccessActivity_ViewBinding<T> debitCardResetPinSuccessActivity_ViewBinding, Callable<R> callable, ChequeManagementDeepLinkActivity<R, ? super T, R> chequeManagementDeepLinkActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = debitCardResetPinSuccessActivity_ViewBinding;
        this.write = callable;
        this.MediaBrowserCompat$ItemReceiver = chequeManagementDeepLinkActivity;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super R> activateChequeDeepLinkActivity) {
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.subscribe(new ManageEmailInputActivity.write(activateChequeDeepLinkActivity, this.MediaBrowserCompat$ItemReceiver, HmlLatestPersonalInformationDeepLinkActivity.write(this.write.call(), "The seedSupplier returned a null value")));
        } catch (Throwable th) {
            AlertController$RecycleListView.read.write(th);
            HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write(th, activateChequeDeepLinkActivity);
        }
    }
}
