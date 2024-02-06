package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.SetupNewPinActivity */
public final class SetupNewPinActivity<T> extends BScanCNotificationDeepLinkActivity<T> {
    private Callable<? extends T> MediaBrowserCompat$CustomActionResultReceiver;

    public SetupNewPinActivity(Callable<? extends T> callable) {
        this.MediaBrowserCompat$CustomActionResultReceiver = callable;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        Runnable runnable = HmlCalculatorDeepLinkActivity.MediaBrowserCompat$ItemReceiver;
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        CreditCardServiceDefaultCardDeepLinkActivity creditCardServiceDefaultCardDeepLinkActivity = new CreditCardServiceDefaultCardDeepLinkActivity(runnable);
        activateChequeDeepLinkActivity.onSubscribe(creditCardServiceDefaultCardDeepLinkActivity);
        if (!creditCardServiceDefaultCardDeepLinkActivity.isDisposed()) {
            try {
                Object write = HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver.call(), "The callable returned a null value");
                if (!creditCardServiceDefaultCardDeepLinkActivity.isDisposed()) {
                    activateChequeDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(write);
                }
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                if (!creditCardServiceDefaultCardDeepLinkActivity.isDisposed()) {
                    activateChequeDeepLinkActivity.onError(th);
                } else {
                    AlertController$RecycleListView.read.read(th);
                }
            }
        }
    }
}
