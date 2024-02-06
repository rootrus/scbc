package p040o;

/* renamed from: o.U8_4 */
public final class U8_4 extends createCubemapFromCubeFaces<getSubElementArraySize> {
    public U8_4(getSubElementArraySize getsubelementarraysize) {
        super(getsubelementarraysize);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        String str = "";
        if (i == 1) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((getSubElementArraySize) this.write).MediaBrowserCompat$CustomActionResultReceiver(1);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(" channel");
            if (MediaBrowserCompat$CustomActionResultReceiver.intValue() != 1) {
                str = "s";
            }
            sb.append(str);
            return sb.toString();
        } else if (i == 2) {
            Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((getSubElementArraySize) this.write).MediaBrowserCompat$CustomActionResultReceiver(2);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
            sb2.append(" pixel");
            if (MediaBrowserCompat$CustomActionResultReceiver2.intValue() != 1) {
                str = "s";
            }
            sb2.append(str);
            return sb2.toString();
        } else if (i == 3) {
            return MediaBrowserCompat$MediaItem();
        } else {
            if (i == 4) {
                Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((getSubElementArraySize) this.write).MediaBrowserCompat$CustomActionResultReceiver(4);
                if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                    return null;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(MediaBrowserCompat$CustomActionResultReceiver3);
                sb3.append(" bit");
                if (MediaBrowserCompat$CustomActionResultReceiver3.intValue() != 1) {
                    str = "s";
                }
                sb3.append(str);
                sb3.append(" per channel");
                return sb3.toString();
            } else if (i != 5) {
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
            } else {
                return MediaBrowserCompat$CustomActionResultReceiver(5, "Bitmap", "Grayscale", "Indexed", "RGB", "CMYK", null, null, "Multichannel", "Duotone", "Lab");
            }
        }
    }

    private String MediaBrowserCompat$MediaItem() {
        try {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((getSubElementArraySize) this.write).MediaBrowserCompat$CustomActionResultReceiver(3);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(" pixel");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver.intValue() == 1 ? "" : "s");
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
