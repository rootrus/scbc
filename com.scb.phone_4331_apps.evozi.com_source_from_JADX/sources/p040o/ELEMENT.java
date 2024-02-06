package p040o;

/* renamed from: o.ELEMENT */
public final class ELEMENT extends createCubemapFromCubeFaces<F64> {
    public ELEMENT(F64 f64) {
        super(f64);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return IconCompatParcelizer(0, 4);
        }
        if (i == 512) {
            return RatingCompat();
        }
        if (i == 1537) {
            return MediaBrowserCompat$SearchResultReceiver();
        }
        if (i != 4096) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        Integer MediaBrowserCompat$CustomActionResultReceiver = ((F64) this.write).MediaBrowserCompat$CustomActionResultReceiver(4096);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        short shortValue = MediaBrowserCompat$CustomActionResultReceiver.shortValue();
        if (shortValue == 0) {
            return "Unknown";
        }
        if (shortValue == 20) {
            return "Tungsten (Incandescent)";
        }
        if (shortValue == 22) {
            return "Evening Sunlight";
        }
        if (shortValue == 256) {
            return "One Touch White Balance";
        }
        if (shortValue == 512) {
            return "Custom 1-4";
        }
        switch (shortValue) {
            case 16:
                return "Shade";
            case 17:
                return "Cloudy";
            case 18:
                return "Fine Weather";
            default:
                switch (shortValue) {
                    case 33:
                        return "Daylight Fluorescent";
                    case 34:
                        return "Day White Fluorescent";
                    case 35:
                        return "Cool White Fluorescent";
                    case 36:
                        return "White Fluorescent";
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown (");
                        sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    private String RatingCompat() {
        int[] MediaBrowserCompat$ItemReceiver = ((F64) this.write).MediaBrowserCompat$ItemReceiver(512);
        if (MediaBrowserCompat$ItemReceiver == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver.length; i++) {
            sb.append((short) MediaBrowserCompat$ItemReceiver[i]);
            if (i < MediaBrowserCompat$ItemReceiver.length - 1) {
                sb.append(" ");
            }
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        return null;
    }

    private String MediaBrowserCompat$SearchResultReceiver() {
        int[] MediaBrowserCompat$ItemReceiver = ((F64) this.write).MediaBrowserCompat$ItemReceiver(1537);
        if (MediaBrowserCompat$ItemReceiver == null) {
            return null;
        }
        int length = MediaBrowserCompat$ItemReceiver.length / 2;
        copy3DRangeFromUnchecked[] copy3drangefromuncheckedArr = new copy3DRangeFromUnchecked[length];
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver.length / 2; i++) {
            int i2 = i << 1;
            copy3drangefromuncheckedArr[i] = new copy3DRangeFromUnchecked((long) ((short) MediaBrowserCompat$ItemReceiver[i2]), (long) ((short) MediaBrowserCompat$ItemReceiver[i2 + 1]));
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            sb.append(copy3drangefromuncheckedArr[i3].doubleValue());
            if (i3 < length - 1) {
                sb.append(" ");
            }
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        return null;
    }
}
