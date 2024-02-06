package p040o;

/* renamed from: o.I64_3 */
public final class I64_3 extends createCubemapFromCubeFaces<I64_4> {
    public I64_3(I64_4 i64_4) {
        super(i64_4);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 8) {
            String MediaBrowserCompat$SearchResultReceiver = ((I64_4) this.write).MediaBrowserCompat$SearchResultReceiver(8);
            if (MediaBrowserCompat$SearchResultReceiver == null || MediaBrowserCompat$SearchResultReceiver.length() == 0) {
                return null;
            }
            char charAt = MediaBrowserCompat$SearchResultReceiver.charAt(0);
            if (charAt == 'A') {
                return "Aperture Priority AE";
            }
            if (charAt == 'M') {
                return "Manual";
            }
            if (charAt != 'P') {
                return charAt != 'S' ? MediaBrowserCompat$SearchResultReceiver : "Shutter Speed Priority AE";
            }
            return "Program AE";
        } else if (i != 9) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        } else {
            String MediaBrowserCompat$SearchResultReceiver2 = ((I64_4) this.write).MediaBrowserCompat$SearchResultReceiver(9);
            if (MediaBrowserCompat$SearchResultReceiver2 == null || MediaBrowserCompat$SearchResultReceiver2.length() == 0) {
                return null;
            }
            char charAt2 = MediaBrowserCompat$SearchResultReceiver2.charAt(0);
            if (charAt2 == '8') {
                return "Multi Segment";
            }
            if (charAt2 != 'A') {
                return charAt2 != 'C' ? MediaBrowserCompat$SearchResultReceiver2 : "Center Weighted Average";
            }
            return "Average";
        }
    }
}
