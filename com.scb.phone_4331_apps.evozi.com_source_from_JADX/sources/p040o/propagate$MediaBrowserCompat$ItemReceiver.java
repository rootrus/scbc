package p040o;

/* renamed from: o.propagate$MediaBrowserCompat$ItemReceiver */
public final class propagate$MediaBrowserCompat$ItemReceiver implements C4602xca7af99c {
    final int IconCompatParcelizer;
    final String MediaBrowserCompat$CustomActionResultReceiver;
    final String MediaBrowserCompat$ItemReceiver;
    final int read;
    final String write;

    public propagate$MediaBrowserCompat$ItemReceiver(String str, int i, int i2, String str2, String str3) {
        onGetStartedClick.write((Object) str, "imagePath");
        onGetStartedClick.write((Object) str2, "imageHash");
        onGetStartedClick.write((Object) str3, "timestamp");
        this.write = str;
        this.IconCompatParcelizer = i;
        this.read = i2;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }
}
