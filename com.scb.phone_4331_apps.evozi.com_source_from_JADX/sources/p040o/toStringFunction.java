package p040o;

/* renamed from: o.toStringFunction */
public final /* synthetic */ class toStringFunction implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ PlaceBuffer IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ compose write;

    public /* synthetic */ toStringFunction(compose compose, String str, String str2, PlaceBuffer placeBuffer) {
        this.write = compose;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.IconCompatParcelizer = placeBuffer;
    }

    public final Object write(Object obj) {
        compose compose = this.write;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        PlaceBuffer placeBuffer = this.IconCompatParcelizer;
        standardEquals standardequals = new standardEquals();
        standardequals.MediaBrowserCompat$CustomActionResultReceiver = str;
        standardequals.MediaBrowserCompat$MediaItem = str2;
        standardequals.MediaBrowserCompat$ItemReceiver = compose.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        standardequals.read = (String) obj;
        standardequals.IconCompatParcelizer = placeBuffer.read;
        return compose.write.read(standardequals);
    }
}
