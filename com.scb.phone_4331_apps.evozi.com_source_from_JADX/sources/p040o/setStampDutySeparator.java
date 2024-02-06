package p040o;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.setStampDutySeparator */
public final class setStampDutySeparator extends BankingAgentDeepLinkActivity {
    private static ScheduledExecutorService MediaBrowserCompat$ItemReceiver;
    private static onCheckboxChanged write = new onCheckboxChanged("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    private ThreadFactory MediaBrowserCompat$CustomActionResultReceiver;
    private AtomicReference<ScheduledExecutorService> read;

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        MediaBrowserCompat$ItemReceiver = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
    }

    public setStampDutySeparator() {
        this(write);
    }

    private setStampDutySeparator(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.read = atomicReference;
        this.MediaBrowserCompat$CustomActionResultReceiver = threadFactory;
        atomicReference.lazySet(setPromoSeparator.read(threadFactory));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ScheduledExecutorService scheduledExecutorService;
        ScheduledExecutorService scheduledExecutorService2 = null;
        do {
            scheduledExecutorService = this.read.get();
            if (scheduledExecutorService != MediaBrowserCompat$ItemReceiver) {
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdown();
                    return;
                }
                return;
            } else if (scheduledExecutorService2 == null) {
                scheduledExecutorService2 = setPromoSeparator.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        } while (!this.read.compareAndSet(scheduledExecutorService, scheduledExecutorService2));
    }

    public final BankingAgentDeepLinkActivity.read write() {
        return new write(this.read.get());
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
        Future future;
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        setSeparatorBreadcrumbs setseparatorbreadcrumbs = new setSeparatorBreadcrumbs(runnable);
        if (j <= 0) {
            try {
                future = this.read.get().submit(setseparatorbreadcrumbs);
            } catch (RejectedExecutionException e) {
                AlertController$RecycleListView.read.read((Throwable) e);
                return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
            }
        } else {
            future = this.read.get().schedule(setseparatorbreadcrumbs, j, timeUnit);
        }
        setseparatorbreadcrumbs.read(future);
        return setseparatorbreadcrumbs;
    }

    /* renamed from: o.setStampDutySeparator$write */
    static final class write extends BankingAgentDeepLinkActivity.read {
        private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
        private ScheduledExecutorService MediaBrowserCompat$ItemReceiver;
        private ChequeInquiryDeepLinkActivity write = new ChequeInquiryDeepLinkActivity();

        write(ScheduledExecutorService scheduledExecutorService) {
            this.MediaBrowserCompat$ItemReceiver = scheduledExecutorService;
        }

        public final BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
            Future future;
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
            }
            HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
            setGrRequiredDocuments setgrrequireddocuments = new setGrRequiredDocuments(runnable, this.write);
            this.write.MediaBrowserCompat$CustomActionResultReceiver(setgrrequireddocuments);
            if (j <= 0) {
                try {
                    future = this.MediaBrowserCompat$ItemReceiver.submit(setgrrequireddocuments);
                } catch (RejectedExecutionException e) {
                    dispose();
                    AlertController$RecycleListView.read.read((Throwable) e);
                    return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
                }
            } else {
                future = this.MediaBrowserCompat$ItemReceiver.schedule(setgrrequireddocuments, j, timeUnit);
            }
            setgrrequireddocuments.write(future);
            return setgrrequireddocuments;
        }

        public final void dispose() {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                this.MediaBrowserCompat$CustomActionResultReceiver = true;
                this.write.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    public final BulkTransferDeepLinkActivity write(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future future;
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.read.get();
            HmlBaseEmailAboutActivity_ViewBinding hmlBaseEmailAboutActivity_ViewBinding = new HmlBaseEmailAboutActivity_ViewBinding(runnable, scheduledExecutorService);
            if (j <= 0) {
                try {
                    future = scheduledExecutorService.submit(hmlBaseEmailAboutActivity_ViewBinding);
                } catch (RejectedExecutionException e) {
                    AlertController$RecycleListView.read.read((Throwable) e);
                    return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
                }
            } else {
                future = scheduledExecutorService.schedule(hmlBaseEmailAboutActivity_ViewBinding, j, timeUnit);
            }
            hmlBaseEmailAboutActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(future);
            return hmlBaseEmailAboutActivity_ViewBinding;
        }
        HmlBaseReviewActivity hmlBaseReviewActivity = new HmlBaseReviewActivity(runnable);
        try {
            hmlBaseReviewActivity.read(this.read.get().scheduleAtFixedRate(hmlBaseReviewActivity, j, j2, timeUnit));
            return hmlBaseReviewActivity;
        } catch (RejectedExecutionException e2) {
            AlertController$RecycleListView.read.read((Throwable) e2);
            return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
        }
    }
}
