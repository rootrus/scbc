package p040o;

/* renamed from: o.EasycashLoanTrackActivity */
public final class EasycashLoanTrackActivity<T> extends DebitCardResetOtpActivity<T> {
    private T[] IconCompatParcelizer;

    public EasycashLoanTrackActivity(T[] tArr) {
        this.IconCompatParcelizer = tArr;
    }

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        read read2 = new read(bankingAgentTransactionsDeepLinkActivity, this.IconCompatParcelizer);
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(read2);
        if (!read2.read) {
            T[] tArr = read2.IconCompatParcelizer;
            int length = tArr.length;
            for (int i = 0; i < length && !read2.isDisposed(); i++) {
                T t = tArr[i];
                if (t == null) {
                    BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity2 = read2.write;
                    StringBuilder sb = new StringBuilder();
                    sb.append("The element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    bankingAgentTransactionsDeepLinkActivity2.onError(new NullPointerException(sb.toString()));
                    return;
                }
                read2.write.onNext(t);
            }
            if (!read2.isDisposed()) {
                read2.write.onComplete();
            }
        }
    }

    /* renamed from: o.EasycashLoanTrackActivity$read */
    static final class read<T> extends InvestmentDeepLinkActivity<T> {
        final T[] IconCompatParcelizer;
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private volatile boolean MediaBrowserCompat$ItemReceiver;
        boolean read;
        final BankingAgentTransactionsDeepLinkActivity<? super T> write;

        read(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, T[] tArr) {
            this.write = bankingAgentTransactionsDeepLinkActivity;
            this.IconCompatParcelizer = tArr;
        }

        public final int write(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.read = true;
            return 1;
        }

        public final T read() {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            T[] tArr = this.IconCompatParcelizer;
            if (i == tArr.length) {
                return null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = i + 1;
            return HmlLatestPersonalInformationDeepLinkActivity.write(tArr[i], "The array element is null");
        }

        public final boolean write() {
            return this.MediaBrowserCompat$CustomActionResultReceiver == this.IconCompatParcelizer.length;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            this.MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.length;
        }

        public final void dispose() {
            this.MediaBrowserCompat$ItemReceiver = true;
        }

        public final boolean isDisposed() {
            return this.MediaBrowserCompat$ItemReceiver;
        }
    }
}
