package p040o;

/* renamed from: o.setReceiveBufferSize */
public final /* synthetic */ class setReceiveBufferSize implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Phenotype read;

    public /* synthetic */ setReceiveBufferSize(Phenotype phenotype, String str, String str2) {
        this.read = phenotype;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public final Object write(Object obj) {
        return this.read.write.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, (nullifyExpirable) obj);
    }
}
