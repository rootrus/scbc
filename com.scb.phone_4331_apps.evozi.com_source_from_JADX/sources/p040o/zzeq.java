package p040o;

/* renamed from: o.zzeq */
public final /* synthetic */ class zzeq implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ AccountTransferClient read;

    public /* synthetic */ zzeq(AccountTransferClient accountTransferClient) {
        this.read = accountTransferClient;
    }

    public final Object write(Object obj) {
        return this.read.MediaBrowserCompat$ItemReceiver((setCurrentItemInternal) obj);
    }
}
