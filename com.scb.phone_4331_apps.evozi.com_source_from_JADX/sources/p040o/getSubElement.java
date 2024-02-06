package p040o;

import java.io.IOException;
import java.util.List;

/* renamed from: o.getSubElement */
public final class getSubElement extends createCubemapFromCubeFaces<getDataType> {
    public getSubElement(getDataType getdatatype) {
        super(getdatatype);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        setRecycledViewPool MediaBrowserCompat$ItemReceiver;
        if (i == 4) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((getDataType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4);
            if (MediaBrowserCompat$CustomActionResultReceiver == null || (MediaBrowserCompat$ItemReceiver = setRecycledViewPool.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver.intValue())) == null) {
                return null;
            }
            return MediaBrowserCompat$ItemReceiver._description;
        } else if (i == 5) {
            return MediaBrowserCompat$CustomActionResultReceiver(5, "Deflate");
        } else {
            if (i == 6) {
                return MediaBrowserCompat$CustomActionResultReceiver(6, "Adaptive");
            }
            if (i == 7) {
                return MediaBrowserCompat$CustomActionResultReceiver(7, "No Interlace", "Adam7 Interlace");
            }
            if (i == 9) {
                return MediaBrowserCompat$CustomActionResultReceiver(9, null, "Yes");
            }
            if (i == 10) {
                return MediaBrowserCompat$CustomActionResultReceiver(10, "Perceptual", "Relative Colorimetric", "Saturation", "Absolute Colorimetric");
            }
            if (i == 13) {
                Object obj = ((getDataType) this.write).MediaBrowserCompat$ItemReceiver.get(13);
                if (obj == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder();
                for (C1390x230a8146 nallocationsetsurface_mediabrowsercompat_customactionresultreceiver : (List) obj) {
                    if (sb.length() != 0) {
                        sb.append(10);
                    }
                    sb.append(String.format("%s: %s", new Object[]{nallocationsetsurface_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver, nallocationsetsurface_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer}));
                }
                return sb.toString();
            } else if (i == 15) {
                return RatingCompat();
            } else {
                if (i != 18) {
                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                return MediaBrowserCompat$CustomActionResultReceiver(18, "Unspecified", "Metres");
            }
        }
    }

    private String RatingCompat() {
        byte[] IconCompatParcelizer = ((getDataType) this.write).IconCompatParcelizer(15);
        Integer MediaBrowserCompat$CustomActionResultReceiver = ((getDataType) this.write).MediaBrowserCompat$CustomActionResultReceiver(4);
        if (!(IconCompatParcelizer == null || MediaBrowserCompat$CustomActionResultReceiver == null)) {
            copyTo copyto = new copyTo(IconCompatParcelizer);
            try {
                int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                if (intValue != 0) {
                    if (intValue == 6 || intValue == 2) {
                        return String.format("R %d, G %d, B %d", new Object[]{Integer.valueOf(copyto.RatingCompat()), Integer.valueOf(copyto.RatingCompat()), Integer.valueOf(copyto.RatingCompat())});
                    } else if (intValue == 3) {
                        return String.format("Palette Index %d", new Object[]{Short.valueOf((short) (copyto.MediaBrowserCompat$ItemReceiver() & 255))});
                    } else if (intValue != 4) {
                        return null;
                    }
                }
                return String.format("Greyscale Level %d", new Object[]{Integer.valueOf(copyto.RatingCompat())});
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
