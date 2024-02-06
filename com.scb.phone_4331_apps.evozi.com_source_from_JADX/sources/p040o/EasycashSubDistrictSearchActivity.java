package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.EasycashSubDistrictSearchActivity */
public final class EasycashSubDistrictSearchActivity extends DebitCardResetOtpActivity<Long> {
    private long IconCompatParcelizer;
    private long MediaBrowserCompat$ItemReceiver;
    private TimeUnit read;
    private BankingAgentDeepLinkActivity write;

    public EasycashSubDistrictSearchActivity(long j, long j2, TimeUnit timeUnit, BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = j;
        this.IconCompatParcelizer = j2;
        this.read = timeUnit;
        this.write = bankingAgentDeepLinkActivity;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity) {
        read read2 = new read(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
        BankingAgentDeepLinkActivity bankingAgentDeepLinkActivity = this.write;
        if (bankingAgentDeepLinkActivity instanceof setVwModelConsentSeparator) {
            BankingAgentDeepLinkActivity.read write2 = bankingAgentDeepLinkActivity.write();
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(read2, write2);
            write2.MediaBrowserCompat$ItemReceiver(read2, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.read);
            return;
        }
        HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver(read2, bankingAgentDeepLinkActivity.write(read2, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, this.read));
    }

    /* renamed from: o.EasycashSubDistrictSearchActivity$read */
    static final class read extends AtomicReference<BulkTransferDeepLinkActivity> implements BulkTransferDeepLinkActivity, Runnable {
        private BankingAgentTransactionsDeepLinkActivity<? super Long> MediaBrowserCompat$CustomActionResultReceiver;
        private long write;

        read(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
        }

        public final void dispose() {
            HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.read(this);
        }

        public final boolean isDisposed() {
            return get() == HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED;
        }

        public final void run() {
            if (get() != HmlBusinessOwnerLoanOfferStatusDeepLinkActivity.DISPOSED) {
                BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
                long j = this.write;
                this.write = 1 + j;
                bankingAgentTransactionsDeepLinkActivity.onNext(Long.valueOf(j));
            }
        }
    }
}
