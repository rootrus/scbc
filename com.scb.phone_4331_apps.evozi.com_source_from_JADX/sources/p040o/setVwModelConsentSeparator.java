package p040o;

import java.util.concurrent.TimeUnit;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.setVwModelConsentSeparator */
public final class setVwModelConsentSeparator extends BankingAgentDeepLinkActivity {
    private static final setVwModelConsentSeparator write = new setVwModelConsentSeparator();

    public static setVwModelConsentSeparator read() {
        return write;
    }

    public final BankingAgentDeepLinkActivity.read write() {
        return new setVwModelConsentSeparator$MediaBrowserCompat$ItemReceiver();
    }

    setVwModelConsentSeparator() {
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            AlertController$RecycleListView.read.read((Throwable) e);
        }
        return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
    }

    /* renamed from: o.setVwModelConsentSeparator$write */
    static final class write implements Comparable<write> {
        final Runnable MediaBrowserCompat$CustomActionResultReceiver;
        volatile boolean MediaBrowserCompat$ItemReceiver;
        private int read;
        private long write;

        public final /* synthetic */ int compareTo(Object obj) {
            write write2 = (write) obj;
            int IconCompatParcelizer = HmlLatestPersonalInformationDeepLinkActivity.IconCompatParcelizer(this.write, write2.write);
            return IconCompatParcelizer == 0 ? HmlLatestPersonalInformationDeepLinkActivity.read(this.read, write2.read) : IconCompatParcelizer;
        }

        write(Runnable runnable, Long l, int i) {
            this.MediaBrowserCompat$CustomActionResultReceiver = runnable;
            this.write = l.longValue();
            this.read = i;
        }
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable) {
        HmlLatestPersonalInformationDeepLinkActivity.write(runnable, "run is null");
        runnable.run();
        return HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE;
    }
}
