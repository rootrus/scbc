package p040o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.HmlBaseLoanReviewActivity */
public final class HmlBaseLoanReviewActivity extends BankingAgentDeepLinkActivity {
    static final C6883x9390b35c MediaBrowserCompat$CustomActionResultReceiver;
    static final onCheckboxChanged MediaBrowserCompat$ItemReceiver;
    private static onCheckboxChanged MediaBrowserCompat$MediaItem;
    private static HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver RatingCompat;
    private static final TimeUnit read = TimeUnit.SECONDS;
    private static final long write = Long.getLong("rx2.io-keep-alive-time", 60).longValue();
    private ThreadFactory MediaDescriptionCompat;
    private AtomicReference<HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver> MediaMetadataCompat;

    static {
        C6883x9390b35c hmlBaseLoanReviewActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6883x9390b35c(new onCheckboxChanged("RxCachedThreadSchedulerShutdown"));
        MediaBrowserCompat$CustomActionResultReceiver = hmlBaseLoanReviewActivity$MediaBrowserCompat$CustomActionResultReceiver;
        hmlBaseLoanReviewActivity$MediaBrowserCompat$CustomActionResultReceiver.dispose();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        MediaBrowserCompat$MediaItem = new onCheckboxChanged("RxCachedThreadScheduler", max);
        MediaBrowserCompat$ItemReceiver = new onCheckboxChanged("RxCachedWorkerPoolEvictor", max);
        HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver = new HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver(0, (TimeUnit) null, MediaBrowserCompat$MediaItem);
        RatingCompat = hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver;
        hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver.read();
    }

    public HmlBaseLoanReviewActivity() {
        this(MediaBrowserCompat$MediaItem);
    }

    private HmlBaseLoanReviewActivity(ThreadFactory threadFactory) {
        this.MediaDescriptionCompat = threadFactory;
        this.MediaMetadataCompat = new AtomicReference<>(RatingCompat);
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver = new HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver(write, read, this.MediaDescriptionCompat);
        if (!this.MediaMetadataCompat.compareAndSet(RatingCompat, hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver)) {
            hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver.read();
        }
    }

    public final BankingAgentDeepLinkActivity.read write() {
        return new IconCompatParcelizer(this.MediaMetadataCompat.get());
    }

    /* renamed from: o.HmlBaseLoanReviewActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends BankingAgentDeepLinkActivity.read {
        private final C6883x9390b35c MediaBrowserCompat$CustomActionResultReceiver;
        private final ChequeInquiryDeepLinkActivity MediaBrowserCompat$ItemReceiver;
        private AtomicBoolean read = new AtomicBoolean();
        private final HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver write;

        IconCompatParcelizer(HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver) {
            this.write = hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = new ChequeInquiryDeepLinkActivity();
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        }

        public final void dispose() {
            if (this.read.compareAndSet(false, true)) {
                this.MediaBrowserCompat$ItemReceiver.dispose();
                HmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver = this.write;
                C6883x9390b35c hmlBaseLoanReviewActivity$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
                hmlBaseLoanReviewActivity$MediaBrowserCompat$CustomActionResultReceiver.write = System.nanoTime() + hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                hmlBaseLoanReviewActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.offer(hmlBaseLoanReviewActivity$MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        public final boolean isDisposed() {
            return this.read.get();
        }

        public final BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.MediaBrowserCompat$ItemReceiver.isDisposed()) {
                return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
            }
            return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(runnable, j, timeUnit, this.MediaBrowserCompat$ItemReceiver);
        }
    }
}
