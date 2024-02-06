package p040o;

import java.util.concurrent.TimeUnit;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver */
final class DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver<T> implements BankingAgentTransactionsDeepLinkActivity<T>, BulkTransferDeepLinkActivity {
    private boolean IconCompatParcelizer;
    final BankingAgentTransactionsDeepLinkActivity<? super T> MediaBrowserCompat$CustomActionResultReceiver;
    private TimeUnit MediaBrowserCompat$ItemReceiver;
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    private long read;
    final BankingAgentDeepLinkActivity.read write;

    DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity.read read2, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        this.read = j;
        this.MediaBrowserCompat$ItemReceiver = timeUnit;
        this.write = read2;
        this.IconCompatParcelizer = z;
    }

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        if (HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.IconCompatParcelizer(this.MediaMetadataCompat, bulkTransferDeepLinkActivity)) {
            this.MediaMetadataCompat = bulkTransferDeepLinkActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver.onSubscribe(this);
        }
    }

    public final void onNext(T t) {
        this.write.MediaBrowserCompat$ItemReceiver(new write(t), this.read, this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(new C6432x376cb260(this, th), this.IconCompatParcelizer ? this.read : 0, this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onComplete() {
        this.write.MediaBrowserCompat$ItemReceiver(new C6433x8c3192f(this), this.read, this.MediaBrowserCompat$ItemReceiver);
    }

    public final void dispose() {
        this.MediaMetadataCompat.dispose();
        this.write.dispose();
    }

    public final boolean isDisposed() {
        return this.write.isDisposed();
    }

    /* renamed from: o.DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver$write */
    final class write implements Runnable {
        private final T IconCompatParcelizer;

        write(T t) {
            this.IconCompatParcelizer = t;
        }

        public final void run() {
            DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver.this.MediaBrowserCompat$CustomActionResultReceiver.onNext(this.IconCompatParcelizer);
        }
    }
}
