package p040o;

import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;

/* renamed from: o.GiftBoxDeepLinkActivity */
public final class GiftBoxDeepLinkActivity extends AtomicReference<DeepLinkActivity> implements BulkTransferDeepLinkActivity {
    public GiftBoxDeepLinkActivity(DeepLinkActivity deepLinkActivity) {
        super(deepLinkActivity);
    }

    public final boolean isDisposed() {
        return get() == null;
    }

    public final void dispose() {
        DeepLinkActivity deepLinkActivity;
        if (get() != null && (deepLinkActivity = (DeepLinkActivity) getAndSet((Object) null)) != null) {
            try {
                deepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
            } catch (Exception e) {
                AlertController$RecycleListView.read.write((Throwable) e);
                AlertController$RecycleListView.read.read((Throwable) e);
            }
        }
    }
}
