package p040o;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;

/* renamed from: o.setViewNoLoan */
public final class setViewNoLoan<T> extends DebitCardResetOtpActivity<T> {
    private long IconCompatParcelizer;
    private TimeUnit MediaBrowserCompat$CustomActionResultReceiver;
    private Future<? extends T> MediaBrowserCompat$ItemReceiver;

    public setViewNoLoan(Future<? extends T> future, long j, TimeUnit timeUnit) {
        this.MediaBrowserCompat$ItemReceiver = future;
        this.IconCompatParcelizer = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = timeUnit;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        NotificationDeepLinkActivity notificationDeepLinkActivity = new NotificationDeepLinkActivity(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(notificationDeepLinkActivity);
        if (!notificationDeepLinkActivity.isDisposed()) {
            try {
                notificationDeepLinkActivity.MediaBrowserCompat$ItemReceiver(HmlLatestPersonalInformationDeepLinkActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver != null ? this.MediaBrowserCompat$ItemReceiver.get(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver) : this.MediaBrowserCompat$ItemReceiver.get(), "Future returned null"));
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                if (!notificationDeepLinkActivity.isDisposed()) {
                    bankingAgentTransactionsDeepLinkActivity.onError(th);
                }
            }
        }
    }
}
