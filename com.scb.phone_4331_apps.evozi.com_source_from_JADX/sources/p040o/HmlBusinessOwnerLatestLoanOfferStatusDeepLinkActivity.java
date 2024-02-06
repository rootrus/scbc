package p040o;

/* renamed from: o.HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity */
public enum HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity implements HmlLoanOfferStatusDeepLinkActivity<Object> {
    INSTANCE,
    NEVER;

    public final void MediaBrowserCompat$ItemReceiver() {
    }

    public final void dispose() {
    }

    public final Object read() throws Exception {
        return null;
    }

    public final int write(int i) {
        return i & 2;
    }

    public final boolean write() {
        return true;
    }

    public final boolean isDisposed() {
        return this == INSTANCE;
    }

    public static void write(BankingAgentTransactionsDeepLinkActivity<?> bankingAgentTransactionsDeepLinkActivity) {
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(INSTANCE);
        bankingAgentTransactionsDeepLinkActivity.onComplete();
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Throwable th, BankingAgentTransactionsDeepLinkActivity<?> bankingAgentTransactionsDeepLinkActivity) {
        bankingAgentTransactionsDeepLinkActivity.onSubscribe(INSTANCE);
        bankingAgentTransactionsDeepLinkActivity.onError(th);
    }

    public static void read(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        debitCardRequestInputActivity.onSubscribe(INSTANCE);
        debitCardRequestInputActivity.onComplete();
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Throwable th, DebitCardRequestInputActivity debitCardRequestInputActivity) {
        debitCardRequestInputActivity.onSubscribe(INSTANCE);
        debitCardRequestInputActivity.onError(th);
    }

    public static void write(Throwable th, ActivateChequeDeepLinkActivity<?> activateChequeDeepLinkActivity) {
        activateChequeDeepLinkActivity.onSubscribe(INSTANCE);
        activateChequeDeepLinkActivity.onError(th);
    }

    public final boolean IconCompatParcelizer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
