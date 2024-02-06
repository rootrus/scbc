package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentDeepLinkActivity;
import p040o.FastPayInputActivity;

/* renamed from: o.FastPayInputActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C9732x2f84bf9a<T> extends AtomicLong implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity, FastPayInputActivity.read {
    private TimeUnit IconCompatParcelizer;
    private AtomicReference<BulkTransferDeepLinkActivity> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>();
    private long MediaBrowserCompat$ItemReceiver;
    private BankingAgentDeepLinkActivity.read RatingCompat;
    private BankingAgentTransactionsDeepLinkActivity<? super T> read;
    private HmlBusinessOwnerSuccessfulDeepLinkActivity write = new HmlBusinessOwnerSuccessfulDeepLinkActivity();

    C9732x2f84bf9a(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity.read read2) {
        this.read = bankingAgentTransactionsDeepLinkActivity;
        this.MediaBrowserCompat$ItemReceiver = j;
        this.IconCompatParcelizer = timeUnit;
        this.RatingCompat = read2;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, bulkTransferDeepLinkActivity);
    }

    public final void onNext(T t) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                ((BulkTransferDeepLinkActivity) this.write.get()).dispose();
                this.read.onNext(t);
                MediaBrowserCompat$CustomActionResultReceiver(j2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(long j) {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.write, this.RatingCompat.MediaBrowserCompat$ItemReceiver(new FastPayInputActivity.IconCompatParcelizer(j, this), this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer));
    }

    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.write.dispose();
            this.read.onError(th);
            this.RatingCompat.dispose();
            return;
        }
        AlertController$RecycleListView.read.read(th);
    }

    public final void onComplete() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            this.write.dispose();
            this.read.onComplete();
            this.RatingCompat.dispose();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.read.onError(new TimeoutException(HmlBusinessOccupationInfoActivity_ViewBinding.read(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer)));
            this.RatingCompat.dispose();
        }
    }

    public final void dispose() {
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.RatingCompat.dispose();
    }

    public final boolean isDisposed() {
        return HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }
}
