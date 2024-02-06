package p040o;

/* renamed from: o.createSized */
public final class createSized extends createCubemapFromCubeFaces<data1DChecks> {
    public createSized(data1DChecks data1dchecks) {
        super(data1dchecks);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 5) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        return MediaMetadataCompat();
    }

    private String MediaMetadataCompat() {
        Integer MediaBrowserCompat$CustomActionResultReceiver;
        try {
            Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((data1DChecks) this.write).MediaBrowserCompat$CustomActionResultReceiver(5);
            if (MediaBrowserCompat$CustomActionResultReceiver2 == null || (MediaBrowserCompat$CustomActionResultReceiver = ((data1DChecks) this.write).MediaBrowserCompat$CustomActionResultReceiver(-1)) == null) {
                return null;
            }
            switch (MediaBrowserCompat$CustomActionResultReceiver2.intValue()) {
                case 0:
                    return "None";
                case 1:
                    return "RLE 8-bit/pixel";
                case 2:
                    return "RLE 4-bit/pixel";
                case 3:
                    if (MediaBrowserCompat$CustomActionResultReceiver.intValue() == 64) {
                        return "Bit field";
                    }
                    return "Huffman 1D";
                case 4:
                    return MediaBrowserCompat$CustomActionResultReceiver.intValue() == 64 ? "JPEG" : "RLE-24";
                case 5:
                    return "PNG";
                case 6:
                    return "Bit field";
                default:
                    return super.MediaBrowserCompat$CustomActionResultReceiver(5);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
