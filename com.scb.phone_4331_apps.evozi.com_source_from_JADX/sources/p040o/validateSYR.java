package p040o;

/* renamed from: o.validateSYR */
public abstract class validateSYR<T> extends DebitCardResetOtpActivity<T> {
    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity);

    /* access modifiers changed from: protected */
    public abstract T write();

    public final void subscribeActual(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity) {
        MediaBrowserCompat$ItemReceiver(bankingAgentTransactionsDeepLinkActivity);
        bankingAgentTransactionsDeepLinkActivity.onNext(write());
    }
}
