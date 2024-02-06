package p040o;

import p040o.AlertController$RecycleListView;

/* renamed from: o.HmlBaseReviewActivity */
public final class HmlBaseReviewActivity extends HmlBaseAddressActivity implements Runnable {
    public HmlBaseReviewActivity(Runnable runnable) {
        super(runnable);
    }

    public final void run() {
        this.MediaBrowserCompat$ItemReceiver = Thread.currentThread();
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.run();
            this.MediaBrowserCompat$ItemReceiver = null;
        } catch (Throwable th) {
            this.MediaBrowserCompat$ItemReceiver = null;
            lazySet(read);
            AlertController$RecycleListView.read.read(th);
        }
    }
}
