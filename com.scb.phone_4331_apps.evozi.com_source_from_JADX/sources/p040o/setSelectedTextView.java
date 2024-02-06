package p040o;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040o.CameraApi2$CameraHardwareNotSupportException;
import p040o.CustomInformationList;

/* renamed from: o.setSelectedTextView */
public class setSelectedTextView extends CameraApi2$CameraHardwareNotSupportException.write {
    private static int IconCompatParcelizer = Integer.getInteger("rx.scheduler.jdk6.purge-frequency-millis", 1000).intValue();
    static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> MediaBrowserCompat$CustomActionResultReceiver = new ConcurrentHashMap<>();
    private static final Object MediaBrowserCompat$SearchResultReceiver = new Object();
    private static volatile Object MediaMetadataCompat;
    private static final boolean RatingCompat;
    private static final AtomicReference<ScheduledExecutorService> read = new AtomicReference<>();
    final ScheduledExecutorService MediaBrowserCompat$ItemReceiver;
    volatile boolean write;

    static {
        boolean z = Boolean.getBoolean("rx.scheduler.jdk6.purge-force");
        int MediaBrowserCompat$ItemReceiver2 = setVBorder.MediaBrowserCompat$ItemReceiver();
        RatingCompat = !z && (MediaBrowserCompat$ItemReceiver2 == 0 || MediaBrowserCompat$ItemReceiver2 >= 21);
    }

    public static void write(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            if (read.get() != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new setDrawableBitmap("RxSchedulerPurge-"));
            if (read.compareAndSet((Object) null, newScheduledThreadPool)) {
                C74671 r4 = new Runnable() {
                    public final void run() {
                        setSelectedTextView.read();
                    }
                };
                long j = (long) IconCompatParcelizer;
                newScheduledThreadPool.scheduleAtFixedRate(r4, j, j, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        MediaBrowserCompat$CustomActionResultReceiver.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static void read(ScheduledExecutorService scheduledExecutorService) {
        MediaBrowserCompat$CustomActionResultReceiver.remove(scheduledExecutorService);
    }

    static void read() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = MediaBrowserCompat$CustomActionResultReceiver.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (!next.isShutdown()) {
                    next.purge();
                } else {
                    it.remove();
                }
            }
        } catch (Throwable th) {
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(th);
            DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public static boolean IconCompatParcelizer(ScheduledExecutorService scheduledExecutorService) {
        Method method;
        Object obj;
        if (RatingCompat) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj2 = MediaMetadataCompat;
                if (obj2 == MediaBrowserCompat$SearchResultReceiver) {
                    return false;
                }
                if (obj2 == null) {
                    method = MediaBrowserCompat$ItemReceiver(scheduledExecutorService);
                    if (method != null) {
                        obj = method;
                    } else {
                        obj = MediaBrowserCompat$SearchResultReceiver;
                    }
                    MediaMetadataCompat = obj;
                } else {
                    method = (Method) obj2;
                }
            } else {
                method = MediaBrowserCompat$ItemReceiver(scheduledExecutorService);
            }
            if (method != null) {
                try {
                    method.invoke(scheduledExecutorService, new Object[]{Boolean.TRUE});
                    return true;
                } catch (Exception unused) {
                    DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        }
        return false;
    }

    private static Method MediaBrowserCompat$ItemReceiver(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public setSelectedTextView(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!IconCompatParcelizer(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            write((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        DocumentInstructionsDetailCustomView.MediaBrowserCompat$ItemReceiver().write();
        this.MediaBrowserCompat$ItemReceiver = newScheduledThreadPool;
    }

    public final CustomDoubleCircleBorderView MediaBrowserCompat$ItemReceiver(setImageWidth setimagewidth) {
        return IconCompatParcelizer(setimagewidth, 0, (TimeUnit) null);
    }

    public final CustomDoubleCircleBorderView IconCompatParcelizer(setImageWidth setimagewidth, long j, TimeUnit timeUnit) {
        if (this.write) {
            return setAddButton.MediaBrowserCompat$ItemReceiver();
        }
        return read(setimagewidth, j, timeUnit);
    }

    public final CustomInformationList read(setImageWidth setimagewidth, long j, TimeUnit timeUnit) {
        Future future;
        CustomInformationList customInformationList = new CustomInformationList(ImageAndTextAdBannerView_ViewBinding.write(setimagewidth));
        if (j <= 0) {
            future = this.MediaBrowserCompat$ItemReceiver.submit(customInformationList);
        } else {
            future = this.MediaBrowserCompat$ItemReceiver.schedule(customInformationList, j, timeUnit);
        }
        customInformationList.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new CustomInformationList.read(future));
        return customInformationList;
    }

    public final void write() {
        this.write = true;
        this.MediaBrowserCompat$ItemReceiver.shutdownNow();
        MediaBrowserCompat$CustomActionResultReceiver.remove(this.MediaBrowserCompat$ItemReceiver);
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.write;
    }
}
