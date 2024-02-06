package p040o;

/* renamed from: o.GCoreWakefulBroadcastReceiver */
public final /* synthetic */ class GCoreWakefulBroadcastReceiver implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ previewIntent MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ GCoreWakefulBroadcastReceiver(previewIntent previewintent, String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = previewintent;
        this.read = str;
        this.write = str2;
    }

    public final Object write(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.read(this.read, this.write, (putIfAbsent) obj);
    }
}
