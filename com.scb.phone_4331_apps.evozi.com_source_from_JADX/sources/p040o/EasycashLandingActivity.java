package p040o;

import java.util.concurrent.Callable;
import p040o.AlertController$RecycleListView;

/* renamed from: o.EasycashLandingActivity */
public final class EasycashLandingActivity<T> extends DebitCardResetOtpActivity<T> implements Callable<T> {
    private Callable<? extends T> read;

    public EasycashLandingActivity(Callable<? extends T> callable) {
        this.read = callable;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        NotificationDeepLinkActivity notificationDeepLinkActivity = new NotificationDeepLinkActivity(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(notificationDeepLinkActivity);
        if (!notificationDeepLinkActivity.isDisposed()) {
            try {
                notificationDeepLinkActivity.MediaBrowserCompat$ItemReceiver(HmlLatestPersonalInformationDeepLinkActivity.write(this.read.call(), "Callable returned null"));
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                if (!notificationDeepLinkActivity.isDisposed()) {
                    bankingAgentTransactionsDeepLinkActivity.onError(th);
                } else {
                    AlertController$RecycleListView.read.read(th);
                }
            }
        }
    }

    public final T call() throws Exception {
        return HmlLatestPersonalInformationDeepLinkActivity.write(this.read.call(), "The callable returned a null value");
    }
}
