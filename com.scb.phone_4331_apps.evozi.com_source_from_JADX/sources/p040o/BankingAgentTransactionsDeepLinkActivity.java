package p040o;

/* renamed from: o.BankingAgentTransactionsDeepLinkActivity */
public interface BankingAgentTransactionsDeepLinkActivity<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity);
}
