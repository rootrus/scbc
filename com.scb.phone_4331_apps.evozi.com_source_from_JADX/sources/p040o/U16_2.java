package p040o;

/* renamed from: o.U16_2 */
public final class U16_2 extends createCubemapFromCubeFaces<U16_3> {
    public U16_2(U16_3 u16_3) {
        super(u16_3);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 1) {
            return write(1, 1, "Icon", "Cursor");
        }
        int i2 = 256;
        if (i == 2) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((U16_3) this.write).MediaBrowserCompat$CustomActionResultReceiver(2);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            if (MediaBrowserCompat$CustomActionResultReceiver.intValue() != 0) {
                i2 = MediaBrowserCompat$CustomActionResultReceiver.intValue();
            }
            sb.append(i2);
            sb.append(" pixels");
            return sb.toString();
        } else if (i == 3) {
            Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((U16_3) this.write).MediaBrowserCompat$CustomActionResultReceiver(3);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            if (MediaBrowserCompat$CustomActionResultReceiver2.intValue() != 0) {
                i2 = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
            }
            sb2.append(i2);
            sb2.append(" pixels");
            return sb2.toString();
        } else if (i != 4) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        } else {
            Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((U16_3) this.write).MediaBrowserCompat$CustomActionResultReceiver(4);
            if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                return null;
            }
            if (MediaBrowserCompat$CustomActionResultReceiver3.intValue() == 0) {
                return "No palette";
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(MediaBrowserCompat$CustomActionResultReceiver3);
            sb3.append(" colour");
            sb3.append(MediaBrowserCompat$CustomActionResultReceiver3.intValue() == 1 ? "" : "s");
            return sb3.toString();
        }
    }
}
