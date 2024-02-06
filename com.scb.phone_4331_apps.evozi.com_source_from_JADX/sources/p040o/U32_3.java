package p040o;

/* renamed from: o.U32_3 */
public final class U32_3 extends createCubemapFromCubeFaces<U32_2> {
    public U32_3(U32_2 u32_2) {
        super(u32_2);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 5) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        Integer MediaBrowserCompat$CustomActionResultReceiver = ((U32_2) this.write).MediaBrowserCompat$CustomActionResultReceiver(5);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
        if (intValue == 16) {
            return "Thumbnail coded using JPEG";
        }
        if (intValue == 17) {
            return "Thumbnail stored using 1 byte/pixel";
        }
        if (intValue == 19) {
            return "Thumbnail stored using 3 bytes/pixel";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown extension code ");
        sb.append(MediaBrowserCompat$CustomActionResultReceiver);
        return sb.toString();
    }
}
