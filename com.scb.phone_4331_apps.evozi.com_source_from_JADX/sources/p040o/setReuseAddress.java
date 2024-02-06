package p040o;

/* renamed from: o.setReuseAddress */
public final /* synthetic */ class setReuseAddress implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ setReuseAddress(String str, String str2, String str3) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
        this.write = str3;
    }

    public final Object write(Object obj) {
        return new evictsBySize(this.MediaBrowserCompat$ItemReceiver, this.read, this.write, ((zzvo) obj).MediaSessionCompat$ResultReceiverWrapper);
    }
}
