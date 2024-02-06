package p040o;

/* renamed from: o.ECouponSuccessfulActivity */
public final class ECouponSuccessfulActivity {
    public String IconCompatParcelizer = "";
    public boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    public boolean MediaBrowserCompat$ItemReceiver = false;
    public String MediaMetadataCompat = "";
    public boolean read = false;
    public boolean write = false;

    public ECouponSuccessfulActivity(String str, boolean z, boolean z2, boolean z3) {
        this.MediaMetadataCompat = str;
        this.write = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        this.MediaBrowserCompat$ItemReceiver = z2;
        this.read = z3;
    }

    ECouponSuccessfulActivity(String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        this.MediaMetadataCompat = str;
        this.write = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = z2;
        this.MediaBrowserCompat$ItemReceiver = z3;
        this.read = z4;
        this.IconCompatParcelizer = str2;
    }
}
