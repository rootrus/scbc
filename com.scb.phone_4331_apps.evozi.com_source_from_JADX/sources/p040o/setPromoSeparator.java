package p040o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.setPromoSeparator */
public final class setPromoSeparator {
    static final Map<ScheduledThreadPoolExecutor, Object> IconCompatParcelizer = new ConcurrentHashMap();
    private static AtomicReference<ScheduledExecutorService> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
    private static int read;
    private static boolean write;

    static {
        write write2 = new write();
        boolean write3 = write("rx2.purge-enabled", write2);
        write = write3;
        read = write(write3, "rx2.purge-period-seconds", write2);
        read(write);
    }

    private static void read(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = MediaBrowserCompat$CustomActionResultReceiver.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new onCheckboxChanged("RxSchedulerPurge"));
                    if (MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                        setPromoSeparator$MediaBrowserCompat$ItemReceiver setpromoseparator_mediabrowsercompat_itemreceiver = new setPromoSeparator$MediaBrowserCompat$ItemReceiver();
                        long j = (long) read;
                        newScheduledThreadPool.scheduleAtFixedRate(setpromoseparator_mediabrowsercompat_itemreceiver, j, j, TimeUnit.SECONDS);
                        return;
                    }
                    newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    private static int write(boolean z, String str, DirectDebitDeepLinkActivity<String, String> directDebitDeepLinkActivity) {
        if (z) {
            try {
                String write2 = directDebitDeepLinkActivity.write(str);
                if (write2 == null) {
                    return 1;
                }
                return Integer.parseInt(write2);
            } catch (Throwable unused) {
            }
        }
        return 1;
    }

    private static boolean write(String str, DirectDebitDeepLinkActivity<String, String> directDebitDeepLinkActivity) {
        try {
            String write2 = directDebitDeepLinkActivity.write(str);
            if (write2 == null) {
                return true;
            }
            return "true".equals(write2);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: o.setPromoSeparator$write */
    static final class write implements DirectDebitDeepLinkActivity<String, String> {
        write() {
        }

        public final /* synthetic */ Object write(Object obj) throws Exception {
            return System.getProperty((String) obj);
        }
    }

    public static ScheduledExecutorService read(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (write && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            IconCompatParcelizer.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        return newScheduledThreadPool;
    }
}
