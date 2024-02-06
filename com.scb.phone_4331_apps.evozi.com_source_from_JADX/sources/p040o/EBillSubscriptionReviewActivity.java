package p040o;

/* renamed from: o.EBillSubscriptionReviewActivity */
public final class EBillSubscriptionReviewActivity extends DebitCardResetOtpActivity<Long> {
    private final long MediaBrowserCompat$CustomActionResultReceiver;
    private final long MediaBrowserCompat$ItemReceiver;

    public EBillSubscriptionReviewActivity(long j, long j2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.MediaBrowserCompat$ItemReceiver = j2;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity) {
        long j = this.MediaBrowserCompat$CustomActionResultReceiver;
        read read2 = new read(bankingAgentTransactionsDeepLinkActivity, j, j + this.MediaBrowserCompat$ItemReceiver);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
        if (!read2.read) {
            BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity2 = read2.MediaBrowserCompat$CustomActionResultReceiver;
            long j2 = read2.IconCompatParcelizer;
            for (long j3 = read2.write; j3 != j2 && read2.get() == 0; j3++) {
                bankingAgentTransactionsDeepLinkActivity2.onNext(Long.valueOf(j3));
            }
            if (read2.get() == 0) {
                read2.lazySet(1);
                bankingAgentTransactionsDeepLinkActivity2.onComplete();
            }
        }
    }

    /* renamed from: o.EBillSubscriptionReviewActivity$read */
    static final class read extends LifestyleDeepLinkActivity<Long> {
        final long IconCompatParcelizer;
        final BankingAgentTransactionsDeepLinkActivity<? super Long> MediaBrowserCompat$CustomActionResultReceiver;
        boolean read;
        long write;

        read(BankingAgentTransactionsDeepLinkActivity<? super Long> bankingAgentTransactionsDeepLinkActivity, long j, long j2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.write = j;
            this.IconCompatParcelizer = j2;
        }

        public final boolean write() {
            return this.write == this.IconCompatParcelizer;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            this.write = this.IconCompatParcelizer;
            lazySet(1);
        }

        public final void dispose() {
            set(1);
        }

        public final boolean isDisposed() {
            return get() != 0;
        }

        public final int write(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.read = true;
            return 1;
        }

        public final /* synthetic */ Object read() throws Exception {
            long j = this.write;
            if (j != this.IconCompatParcelizer) {
                this.write = 1 + j;
                return Long.valueOf(j);
            }
            lazySet(1);
            return null;
        }
    }
}
