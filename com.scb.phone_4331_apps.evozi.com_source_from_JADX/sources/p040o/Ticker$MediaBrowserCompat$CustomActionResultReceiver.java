package p040o;

/* renamed from: o.Ticker$MediaBrowserCompat$CustomActionResultReceiver */
public final class Ticker$MediaBrowserCompat$CustomActionResultReceiver implements C4602xca7af99c {
    final PlaceBuffer MediaBrowserCompat$CustomActionResultReceiver;
    final String MediaBrowserCompat$ItemReceiver;
    final String write;

    public Ticker$MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, PlaceBuffer placeBuffer) {
        onGetStartedClick.write((Object) str, "cardNumber");
        onGetStartedClick.write((Object) str2, "pin");
        onGetStartedClick.write((Object) placeBuffer, "preAuthenticate");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = placeBuffer;
    }
}
