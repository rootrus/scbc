package p040o;

import java.util.concurrent.Callable;

/* renamed from: o.setSeparatorBreadcrumbs */
public final class setSeparatorBreadcrumbs extends HmlBaseAddressActivity implements Callable<Void> {
    public setSeparatorBreadcrumbs(Runnable runnable) {
        super(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
    public Void call() throws Exception {
        this.MediaBrowserCompat$ItemReceiver = Thread.currentThread();
        try {
            this.MediaBrowserCompat$CustomActionResultReceiver.run();
            return null;
        } finally {
            lazySet(read);
            this.MediaBrowserCompat$ItemReceiver = null;
        }
    }
}
