package p040o;

/* renamed from: o.zact */
public final /* synthetic */ class zact implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zact read = new zact();

    private /* synthetic */ zact() {
    }

    public final Object write(Object obj) {
        KeyframeParser keyframeParser = (KeyframeParser) obj;
        KeyframeParser MediaBrowserCompat$ItemReceiver = KeyframeParser.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = keyframeParser.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = keyframeParser.IconCompatParcelizer;
        MediaBrowserCompat$ItemReceiver.write = keyframeParser.write;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = keyframeParser.MediaBrowserCompat$CustomActionResultReceiver;
        return MediaBrowserCompat$ItemReceiver;
    }
}
