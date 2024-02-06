package p040o;

/* renamed from: o.DebitCardRequestInputActivity */
public interface DebitCardRequestInputActivity {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity);
}
