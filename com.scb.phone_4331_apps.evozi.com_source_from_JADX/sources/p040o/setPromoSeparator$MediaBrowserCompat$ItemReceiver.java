package p040o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: o.setPromoSeparator$MediaBrowserCompat$ItemReceiver */
final class setPromoSeparator$MediaBrowserCompat$ItemReceiver implements Runnable {
    setPromoSeparator$MediaBrowserCompat$ItemReceiver() {
    }

    public final void run() {
        Iterator it = new ArrayList(setPromoSeparator.IconCompatParcelizer.keySet()).iterator();
        while (it.hasNext()) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
            if (scheduledThreadPoolExecutor.isShutdown()) {
                setPromoSeparator.IconCompatParcelizer.remove(scheduledThreadPoolExecutor);
            } else {
                scheduledThreadPoolExecutor.purge();
            }
        }
    }
}
