package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.BaseHmlLandingActivity;

/* renamed from: o.BaseHmlLandingActivity$MediaBrowserCompat$ItemReceiver */
final class BaseHmlLandingActivity$MediaBrowserCompat$ItemReceiver<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements ActivateChequeDeepLinkActivity<T> {
    private BaseHmlLandingActivity.IconCompatParcelizer<T, ?> MediaBrowserCompat$ItemReceiver;
    private int write;

    BaseHmlLandingActivity$MediaBrowserCompat$ItemReceiver(BaseHmlLandingActivity.IconCompatParcelizer<T, ?> iconCompatParcelizer, int i) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.write = i;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this, bulkTransferDeepLinkActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
        BaseHmlLandingActivity.IconCompatParcelizer<T, ?> iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        iconCompatParcelizer.read[this.write] = t;
        if (iconCompatParcelizer.decrementAndGet() == 0) {
            try {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer.write.write(iconCompatParcelizer.read), "The zipper returned a null value"));
            } catch (Throwable th) {
                AlertController$RecycleListView.read.write(th);
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
            }
        }
    }

    public final void onError(Throwable th) {
        BaseHmlLandingActivity.IconCompatParcelizer<T, ?> iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        int i = this.write;
        if (iconCompatParcelizer.getAndSet(0) > 0) {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i);
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.onError(th);
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }
}
