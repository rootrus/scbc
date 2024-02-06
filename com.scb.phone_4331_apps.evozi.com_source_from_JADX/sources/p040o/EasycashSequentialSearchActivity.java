package p040o;

/* renamed from: o.EasycashSequentialSearchActivity */
public final class EasycashSequentialSearchActivity extends DebitCardResetOtpActivity<Integer> {
    private final long IconCompatParcelizer;
    private final int MediaBrowserCompat$ItemReceiver;

    public EasycashSequentialSearchActivity(int i, int i2) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.IconCompatParcelizer = ((long) i) + ((long) i2);
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super Integer> bankingAgentTransactionsDeepLinkActivity) {
        read read2 = new read(bankingAgentTransactionsDeepLinkActivity, (long) this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
        if (!read2.IconCompatParcelizer) {
            BankingAgentTransactionsDeepLinkActivity<? super Integer> bankingAgentTransactionsDeepLinkActivity2 = read2.MediaBrowserCompat$CustomActionResultReceiver;
            long j = read2.MediaBrowserCompat$ItemReceiver;
            for (long j2 = read2.read; j2 != j && read2.get() == 0; j2++) {
                bankingAgentTransactionsDeepLinkActivity2.onNext(Integer.valueOf((int) j2));
            }
            if (read2.get() == 0) {
                read2.lazySet(1);
                bankingAgentTransactionsDeepLinkActivity2.onComplete();
            }
        }
    }

    /* renamed from: o.EasycashSequentialSearchActivity$read */
    static final class read extends LifestyleDeepLinkActivity<Integer> {
        boolean IconCompatParcelizer;
        final BankingAgentTransactionsDeepLinkActivity<? super Integer> MediaBrowserCompat$CustomActionResultReceiver;
        final long MediaBrowserCompat$ItemReceiver;
        long read;

        read(BankingAgentTransactionsDeepLinkActivity<? super Integer> bankingAgentTransactionsDeepLinkActivity, long j, long j2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingAgentTransactionsDeepLinkActivity;
            this.read = j;
            this.MediaBrowserCompat$ItemReceiver = j2;
        }

        public final boolean write() {
            return this.read == this.MediaBrowserCompat$ItemReceiver;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            this.read = this.MediaBrowserCompat$ItemReceiver;
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
            this.IconCompatParcelizer = true;
            return 1;
        }

        public final /* synthetic */ Object read() throws Exception {
            long j = this.read;
            if (j != this.MediaBrowserCompat$ItemReceiver) {
                this.read = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }
    }
}
