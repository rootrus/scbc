package p040o;

/* renamed from: o.RemittanceTransactionsDeepLinkActivity */
public final class RemittanceTransactionsDeepLinkActivity<T> extends DebitCardCoachMarkActivity {
    private BillerDeepLinkActivity<T> MediaBrowserCompat$ItemReceiver;

    public RemittanceTransactionsDeepLinkActivity(BillerDeepLinkActivity<T> billerDeepLinkActivity) {
        this.MediaBrowserCompat$ItemReceiver = billerDeepLinkActivity;
    }

    public final void write(DebitCardRequestInputActivity debitCardRequestInputActivity) {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IconCompatParcelizer(debitCardRequestInputActivity));
    }

    /* renamed from: o.RemittanceTransactionsDeepLinkActivity$IconCompatParcelizer */
    static final class IconCompatParcelizer<T> implements ActivateChequeDeepLinkActivity<T> {
        private DebitCardRequestInputActivity read;

        IconCompatParcelizer(DebitCardRequestInputActivity debitCardRequestInputActivity) {
            this.read = debitCardRequestInputActivity;
        }

        public final void onError(Throwable th) {
            this.read.onError(th);
        }

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            this.read.onSubscribe(bulkTransferDeepLinkActivity);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(T t) {
            this.read.onComplete();
        }
    }
}
