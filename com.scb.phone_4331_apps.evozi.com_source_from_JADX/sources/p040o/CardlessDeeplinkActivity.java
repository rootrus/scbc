package p040o;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.CardlessDeeplinkActivity */
final class CardlessDeeplinkActivity extends BankingAgentDeepLinkActivity {
    private final boolean read = false;
    private final Handler write;

    CardlessDeeplinkActivity(Handler handler) {
        this.write = handler;
    }

    public final BankingAgentDeepLinkActivity.read write() {
        return new IconCompatParcelizer(this.write, false);
    }

    /* renamed from: o.CardlessDeeplinkActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends BankingAgentDeepLinkActivity.read {
        private final Handler MediaBrowserCompat$CustomActionResultReceiver;
        private final boolean MediaBrowserCompat$ItemReceiver;
        private volatile boolean write;

        IconCompatParcelizer(Handler handler, boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = handler;
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final BulkTransferDeepLinkActivity MediaBrowserCompat$ItemReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.write) {
                return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
            } else {
                HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
                write write2 = new write(this.MediaBrowserCompat$CustomActionResultReceiver, runnable);
                Message obtain = Message.obtain(this.MediaBrowserCompat$CustomActionResultReceiver, write2);
                obtain.obj = this;
                if (this.MediaBrowserCompat$ItemReceiver) {
                    obtain.setAsynchronous(true);
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.write) {
                    return write2;
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(write2);
                return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
            }
        }

        public final void dispose() {
            this.write = true;
            this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacksAndMessages(this);
        }

        public final boolean isDisposed() {
            return this.write;
        }
    }

    /* renamed from: o.CardlessDeeplinkActivity$write */
    static final class write implements Runnable, BulkTransferDeepLinkActivity {
        private final Runnable MediaBrowserCompat$CustomActionResultReceiver;
        private final Handler read;
        private volatile boolean write;

        write(Handler handler, Runnable runnable) {
            this.read = handler;
            this.MediaBrowserCompat$CustomActionResultReceiver = runnable;
        }

        public final void run() {
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.run();
            } catch (Throwable th) {
                AlertController$RecycleListView.read.read(th);
            }
        }

        public final void dispose() {
            this.read.removeCallbacks(this);
            this.write = true;
        }

        public final boolean isDisposed() {
            return this.write;
        }
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
            write write2 = new write(this.write, runnable);
            this.write.sendMessageDelayed(Message.obtain(this.write, write2), timeUnit.toMillis(j));
            return write2;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
