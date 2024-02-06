package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.PinLockActivity_ViewBinding */
public final class PinLockActivity_ViewBinding<T> extends BScanCNotificationDeepLinkActivity<T> {
    private Callable<? extends Throwable> MediaBrowserCompat$ItemReceiver;

    public PinLockActivity_ViewBinding(Callable<? extends Throwable> callable) {
        this.MediaBrowserCompat$ItemReceiver = callable;
    }

    public final void read(ActivateChequeDeepLinkActivity<? super T> activateChequeDeepLinkActivity) {
        try {
            th = (Throwable) HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$ItemReceiver.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            AlertController$RecycleListView.read.write(th);
        }
        HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write(th, activateChequeDeepLinkActivity);
    }
}
