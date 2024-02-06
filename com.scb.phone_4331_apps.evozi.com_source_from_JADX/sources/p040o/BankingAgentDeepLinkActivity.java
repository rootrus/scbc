package p040o;

import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;

/* renamed from: o.BankingAgentDeepLinkActivity */
public abstract class BankingAgentDeepLinkActivity {
    static final long IconCompatParcelizer = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public abstract read write();

    public static long IconCompatParcelizer(TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable) {
        return MediaBrowserCompat$CustomActionResultReceiver(runnable, 0, TimeUnit.NANOSECONDS);
    }

    public BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
        read write2 = write();
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        C6329x5b85be81 bankingAgentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver = new C6329x5b85be81(runnable, write2);
        write2.MediaBrowserCompat$ItemReceiver(bankingAgentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, j, timeUnit);
        return bankingAgentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public BulkTransferDeepLinkActivity write(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        read write2 = write();
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        write write3 = new write(runnable, write2);
        BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver = write2.MediaBrowserCompat$ItemReceiver(write3, j, j2, timeUnit);
        return MediaBrowserCompat$ItemReceiver == HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE ? MediaBrowserCompat$ItemReceiver : write3;
    }

    /* renamed from: o.BankingAgentDeepLinkActivity$read */
    public static abstract class read implements BulkTransferDeepLinkActivity {
        public abstract BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver(Runnable runnable, long j, TimeUnit timeUnit);

        public BulkTransferDeepLinkActivity IconCompatParcelizer(Runnable runnable) {
            return MediaBrowserCompat$ItemReceiver(runnable, 0, TimeUnit.NANOSECONDS);
        }

        public final BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            long j3 = j;
            TimeUnit timeUnit2 = timeUnit;
            HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity = new HmlBusinessOwnerSuccessfulDeepLinkActivity();
            HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity2 = new HmlBusinessOwnerSuccessfulDeepLinkActivity(hmlBusinessOwnerSuccessfulDeepLinkActivity);
            Runnable runnable2 = runnable;
            HmlLatestPersonalInformationDeepLinkActivity.write(runnable2, "run is null");
            long nanos = timeUnit2.toNanos(j2);
            long convert = TimeUnit.NANOSECONDS.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(new write(convert + timeUnit2.toNanos(j3), runnable2, convert, hmlBusinessOwnerSuccessfulDeepLinkActivity2, nanos), j3, timeUnit2);
            if (MediaBrowserCompat$ItemReceiver == HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE) {
                return MediaBrowserCompat$ItemReceiver;
            }
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(hmlBusinessOwnerSuccessfulDeepLinkActivity, MediaBrowserCompat$ItemReceiver);
            return hmlBusinessOwnerSuccessfulDeepLinkActivity2;
        }

        public static long MediaBrowserCompat$ItemReceiver(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        /* renamed from: o.BankingAgentDeepLinkActivity$read$write */
        final class write implements Runnable {
            private Runnable IconCompatParcelizer;
            private long MediaBrowserCompat$CustomActionResultReceiver;
            private long MediaBrowserCompat$ItemReceiver;
            private long MediaDescriptionCompat;
            private HmlBusinessOwnerSuccessfulDeepLinkActivity read;
            private long write;

            write(long j, Runnable runnable, long j2, HmlBusinessOwnerSuccessfulDeepLinkActivity hmlBusinessOwnerSuccessfulDeepLinkActivity, long j3) {
                this.IconCompatParcelizer = runnable;
                this.read = hmlBusinessOwnerSuccessfulDeepLinkActivity;
                this.MediaBrowserCompat$ItemReceiver = j3;
                this.MediaBrowserCompat$CustomActionResultReceiver = j2;
                this.MediaDescriptionCompat = j;
            }

            public final void run() {
                long j;
                this.IconCompatParcelizer.run();
                if (!this.read.isDisposed()) {
                    long MediaBrowserCompat$ItemReceiver2 = read.MediaBrowserCompat$ItemReceiver(TimeUnit.NANOSECONDS);
                    long j2 = BankingAgentDeepLinkActivity.IconCompatParcelizer;
                    long j3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    if (j2 + MediaBrowserCompat$ItemReceiver2 < j3 || MediaBrowserCompat$ItemReceiver2 >= j3 + this.MediaBrowserCompat$ItemReceiver + BankingAgentDeepLinkActivity.IconCompatParcelizer) {
                        long j4 = this.MediaBrowserCompat$ItemReceiver;
                        long j5 = MediaBrowserCompat$ItemReceiver2 + j4;
                        long j6 = this.write + 1;
                        this.write = j6;
                        this.MediaDescriptionCompat = j5 - (j4 * j6);
                        j = j5;
                    } else {
                        long j7 = this.MediaDescriptionCompat;
                        long j8 = this.write + 1;
                        this.write = j8;
                        j = j7 + (j8 * this.MediaBrowserCompat$ItemReceiver);
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver2;
                    HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.read, read.this.MediaBrowserCompat$ItemReceiver(this, j - MediaBrowserCompat$ItemReceiver2, TimeUnit.NANOSECONDS));
                }
            }
        }
    }

    /* renamed from: o.BankingAgentDeepLinkActivity$write */
    static final class write implements BulkTransferDeepLinkActivity, Runnable {
        private Runnable IconCompatParcelizer;
        private volatile boolean MediaBrowserCompat$CustomActionResultReceiver;
        private read read;

        write(Runnable runnable, read read2) {
            this.IconCompatParcelizer = runnable;
            this.read = read2;
        }

        public final void run() {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                try {
                    this.IconCompatParcelizer.run();
                } catch (Throwable th) {
                    AlertController$RecycleListView.read.write(th);
                    this.read.dispose();
                    throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
                }
            }
        }

        public final void dispose() {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            this.read.dispose();
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }
}
