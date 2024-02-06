package p040o;

/* renamed from: o.setCrashed */
public final class setCrashed extends setGenerator {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final setIdentifier read;
    public final boolean write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setCrashed(PlacePhotoMetadataResult placePhotoMetadataResult, String str, String str2, String str3, boolean z, setIdentifier setidentifier, int i) {
        super(placePhotoMetadataResult, i);
        onGetStartedClick.write((Object) placePhotoMetadataResult, "tile");
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) str3, "desc");
        onGetStartedClick.write((Object) setidentifier, "userType");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.write = z;
        this.read = setidentifier;
    }
}
