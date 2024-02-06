package p040o;

/* renamed from: o.createFromString */
public final class createFromString extends createCubemapFromCubeFaces<getIDSafe> {
    public createFromString(getIDSafe getidsafe) {
        super(getidsafe);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((getIDSafe) this.write).MediaBrowserCompat$CustomActionResultReceiver(0);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            return MediaBrowserCompat$CustomActionResultReceiver.intValue() == 100 ? "100" : Integer.toString(MediaBrowserCompat$CustomActionResultReceiver.intValue());
        } else if (i != 3) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        } else {
            return MediaBrowserCompat$CustomActionResultReceiver(3, "Unknown (RGB or CMYK)", "YCbCr", "YCCK");
        }
    }
}
