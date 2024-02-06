package p040o;

/* renamed from: o.helpDestroy */
public final class helpDestroy extends createCubemapFromCubeFaces<syncAll> {
    public helpDestroy(syncAll syncall) {
        super(syncall);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        switch (i) {
            case 3:
                return write(3, 1, "VGA Basic", "VGA Normal", "VGA Fine", "SXGA Basic", "SXGA Normal", "SXGA Fine");
            case 4:
                return write(4, 1, "Color", "Monochrome");
            case 5:
                return MediaBrowserCompat$CustomActionResultReceiver(5, "Normal", "Bright +", "Bright -", "Contrast +", "Contrast -");
            case 6:
                return MediaBrowserCompat$CustomActionResultReceiver(6, "ISO80", null, "ISO160", null, "ISO320", "ISO100");
            case 7:
                return MediaBrowserCompat$CustomActionResultReceiver(7, "Auto", "Preset", "Daylight", "Incandescence", "Florescence", "Cloudy", "SpeedLight");
            case 8:
                copy3DRangeFromUnchecked RatingCompat = ((syncAll) this.write).RatingCompat(8);
                if (RatingCompat == null) {
                    return null;
                }
                return (RatingCompat.IconCompatParcelizer == 1 && RatingCompat.MediaBrowserCompat$ItemReceiver == 0) ? "Infinite" : RatingCompat.IconCompatParcelizer(true);
            case 10:
                copy3DRangeFromUnchecked RatingCompat2 = ((syncAll) this.write).RatingCompat(10);
                if (RatingCompat2 == null) {
                    return null;
                }
                if (RatingCompat2.IconCompatParcelizer == 0) {
                    return "No digital zoom";
                }
                StringBuilder sb = new StringBuilder();
                sb.append(RatingCompat2.IconCompatParcelizer(true));
                sb.append("x digital zoom");
                return sb.toString();
            case 11:
                return MediaBrowserCompat$CustomActionResultReceiver(11, "None", "Fisheye converter");
            default:
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }
}
