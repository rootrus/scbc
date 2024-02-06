package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.PdfViewerActivity */
public final class PdfViewerActivity extends DebitCardResetOtpActivity<Long> {
    private long MediaBrowserCompat$ItemReceiver;
    private TimeUnit read;
    private BankingAgentDeepLinkActivity write;

    public PdfViewerActivity(long j, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = j;
        this.read = timeUnit;
        this.write = bankingAgentDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(iconCompatParcelizer);
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(iconCompatParcelizer, this.write.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.read));
    }

    /* renamed from: o.PdfViewerActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer extends AtomicReference<BulkTransferDeepLinkActivity> implements BulkTransferDeepLinkActivity, Runnable {
        private BankingAgentTransactionsDeepLinkActivity<? super Long> IconCompatParcelizer;

        IconCompatParcelizer(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity) {
            this.IconCompatParcelizer = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        }

        public final void run() {
            if (!isDisposed()) {
                this.IconCompatParcelizer.onNext(0L);
                lazySet(HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.INSTANCE);
                this.IconCompatParcelizer.onComplete();
            }
        }
    }
}
