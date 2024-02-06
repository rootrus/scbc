package p040o;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: o.HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver */
final class HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver implements Runnable {
    private final ScheduledExecutorService IconCompatParcelizer;
    final ConcurrentLinkedQueue<C6883x9390b35c> MediaBrowserCompat$CustomActionResultReceiver;
    final long MediaBrowserCompat$ItemReceiver;
    private final ThreadFactory MediaDescriptionCompat;
    private ChequeInquiryDeepLinkActivity read;
    private final Future<?> write;

    HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        ScheduledFuture<?> scheduledFuture;
        this.MediaBrowserCompat$ItemReceiver = timeUnit != null ? timeUnit.toNanos(j) : 0;
        this.MediaBrowserCompat$CustomActionResultReceiver = new ConcurrentLinkedQueue<>();
        this.read = new ChequeInquiryDeepLinkActivity();
        this.MediaDescriptionCompat = threadFactory;
        ScheduledExecutorService scheduledExecutorService = null;
        if (timeUnit != null) {
            scheduledExecutorService = Executors.newScheduledThreadPool(1, HmlBaseLoanReviewActivity.MediaBrowserCompat$ItemReceiver);
            long j2 = this.MediaBrowserCompat$ItemReceiver;
            scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
        } else {
            scheduledFuture = null;
        }
        this.IconCompatParcelizer = scheduledExecutorService;
        this.write = scheduledFuture;
    }

    /* access modifiers changed from: package-private */
    public final C6883x9390b35c IconCompatParcelizer() {
        if (this.read.isDisposed()) {
            return HmlBaseLoanReviewActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
        while (!this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            C6883x9390b35c poll = this.MediaBrowserCompat$CustomActionResultReceiver.poll();
            if (poll != null) {
                return poll;
            }
        }
        C6883x9390b35c hmlBaseLoanReviewActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6883x9390b35c(this.MediaDescriptionCompat);
        this.read.MediaBrowserCompat$CustomActionResultReceiver(hmlBaseLoanReviewActivity$MediaBrowserCompat$CustomActionResultReceiver);
        return hmlBaseLoanReviewActivity$MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        this.read.dispose();
        Future<?> future = this.write;
        if (future != null) {
            future.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = this.IconCompatParcelizer;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public final void run() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            long nanoTime = System.nanoTime();
            Iterator<C6883x9390b35c> it = this.MediaBrowserCompat$CustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                C6883x9390b35c next = it.next();
                if (next.write > nanoTime) {
                    return;
                }
                if (this.MediaBrowserCompat$CustomActionResultReceiver.remove(next) && this.read.read(next)) {
                    next.dispose();
                }
            }
        }
    }
}
