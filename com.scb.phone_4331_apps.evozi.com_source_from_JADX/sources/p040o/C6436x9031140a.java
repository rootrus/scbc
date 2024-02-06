package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p040o.DonationsFoundationDetailsActivity;

/* renamed from: o.DonationsFoundationDetailsActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6436x9031140a<T> extends AtomicReference<BulkTransferDeepLinkActivity> implements Runnable, BulkTransferDeepLinkActivity {
    private T IconCompatParcelizer;
    private AtomicBoolean MediaBrowserCompat$CustomActionResultReceiver = new AtomicBoolean();
    private long read;
    private DonationsFoundationDetailsActivity.IconCompatParcelizer<T> write;

    C6436x9031140a(T t, long j, DonationsFoundationDetailsActivity.IconCompatParcelizer<T> iconCompatParcelizer) {
        this.IconCompatParcelizer = t;
        this.read = j;
        this.write = iconCompatParcelizer;
    }

    public final void run() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(false, true)) {
            DonationsFoundationDetailsActivity.IconCompatParcelizer<T> iconCompatParcelizer = this.write;
            long j = this.read;
            T t = this.IconCompatParcelizer;
            if (j == iconCompatParcelizer.write) {
                iconCompatParcelizer.IconCompatParcelizer.onNext(t);
                dispose();
            }
        }
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
    }

    public final boolean isDisposed() {
        return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
    }
}
