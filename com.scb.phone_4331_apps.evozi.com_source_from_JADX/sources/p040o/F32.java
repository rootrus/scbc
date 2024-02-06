package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.F32 */
public final class F32 extends createCubemapFromCubeFaces<F32_3> {
    public F32(F32_3 f32_3) {
        super(f32_3);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 1) {
            return MediaBrowserCompat$CustomActionResultReceiver(1, "Auto", "Night-scene", "Manual", null, "Multiple");
        }
        if (i == 2) {
            return MediaBrowserCompat$CustomActionResultReceiver(2, "Good", "Better", "Best");
        }
        if (i == 3) {
            return write(3, 2, "Custom", "Auto");
        }
        if (i == 4) {
            return write(4, 1, "Auto", "Flash On", null, "Flash Off", null, "Red-eye Reduction");
        }
        if (i == 7) {
            return MediaBrowserCompat$CustomActionResultReceiver(7, "Auto", "Daylight", "Shade", "Tungsten", "Fluorescent", "Manual");
        }
        if (i == 20) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((F32_3) this.write).MediaBrowserCompat$CustomActionResultReceiver(20);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
            if (intValue == 10) {
                return "ISO 100";
            }
            if (intValue == 16) {
                return "ISO 200";
            }
            if (intValue == 100) {
                return "ISO 100";
            }
            if (intValue == 200) {
                return "ISO 200";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown (");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        } else if (i == 23) {
            return write(23, 1, "Normal", "Black & White", "Sepia");
        } else {
            switch (i) {
                case 10:
                    Float write = ((F32_3) this.write).write(10);
                    if (write == null) {
                        return null;
                    }
                    if (write.floatValue() == BitmapDescriptorFactory.HUE_RED) {
                        return "Off";
                    }
                    return Float.toString(write.floatValue());
                case 11:
                    return MediaBrowserCompat$CustomActionResultReceiver(11, "Normal", "Soft", "Hard");
                case 12:
                    return MediaBrowserCompat$CustomActionResultReceiver(12, "Normal", "Low", "High");
                case 13:
                    return MediaBrowserCompat$CustomActionResultReceiver(13, "Normal", "Low", "High");
                default:
                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
            }
        }
    }
}
