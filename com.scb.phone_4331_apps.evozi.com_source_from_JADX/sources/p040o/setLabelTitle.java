package p040o;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.setLabelTitle */
public final class setLabelTitle implements CustomInformationList_ViewBinding {
    private static final ScheduledExecutorService[] IconCompatParcelizer = new ScheduledExecutorService[0];
    private static int MediaBrowserCompat$CustomActionResultReceiver;
    private static final setDrawableBitmap MediaBrowserCompat$ItemReceiver = new setDrawableBitmap("RxScheduledExecutorPool-");
    private static final ScheduledExecutorService read;
    private static setLabelTitle write = new setLabelTitle();
    private final AtomicReference<ScheduledExecutorService[]> MediaBrowserCompat$MediaItem = new AtomicReference<>(IconCompatParcelizer);

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        read = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    private setLabelTitle() {
        read();
    }

    private void read() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i = 0;
        for (int i2 = 0; i2 < availableProcessors; i2++) {
            scheduledExecutorServiceArr[i2] = Executors.newScheduledThreadPool(1, MediaBrowserCompat$ItemReceiver);
        }
        if (this.MediaBrowserCompat$MediaItem.compareAndSet(IconCompatParcelizer, scheduledExecutorServiceArr)) {
            while (i < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i];
                if (!setSelectedTextView.IconCompatParcelizer(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    setSelectedTextView.write((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i++;
            }
            return;
        }
        while (i < availableProcessors) {
            scheduledExecutorServiceArr[i].shutdownNow();
            i++;
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.MediaBrowserCompat$MediaItem.get();
            scheduledExecutorServiceArr2 = IconCompatParcelizer;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!this.MediaBrowserCompat$MediaItem.compareAndSet(scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            setSelectedTextView.read(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    public static ScheduledExecutorService write() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = write.MediaBrowserCompat$MediaItem.get();
        if (scheduledExecutorServiceArr == IconCompatParcelizer) {
            return read;
        }
        int i = MediaBrowserCompat$CustomActionResultReceiver + 1;
        if (i >= scheduledExecutorServiceArr.length) {
            i = 0;
        }
        MediaBrowserCompat$CustomActionResultReceiver = i;
        return scheduledExecutorServiceArr[i];
    }
}
