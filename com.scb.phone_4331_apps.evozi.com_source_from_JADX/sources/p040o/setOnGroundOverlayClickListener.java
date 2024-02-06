package p040o;

/* renamed from: o.setOnGroundOverlayClickListener */
public final class setOnGroundOverlayClickListener extends zzuk {
    public final setOnCameraMoveStartedListener MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final double MediaMetadataCompat;
    public final String read;
    public final double write;

    public setOnGroundOverlayClickListener(double d, double d2, String str, String str2, String str3, String str4, String str5, setOnCameraMoveStartedListener setoncameramovestartedlistener) {
        onGetStartedClick.write((Object) str, "feeType");
        onGetStartedClick.write((Object) str2, "accountFromName");
        onGetStartedClick.write((Object) str3, "accountTo");
        onGetStartedClick.write((Object) str4, "accountToName");
        onGetStartedClick.write((Object) str5, "transactionToken");
        onGetStartedClick.write((Object) setoncameramovestartedlistener, "additionalMetaData");
        this.MediaMetadataCompat = d;
        this.write = d2;
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$MediaItem = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = setoncameramovestartedlistener;
    }
}
