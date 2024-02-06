package p040o;

/* renamed from: o.I8_2 */
public final class I8_2 extends createCubemapFromCubeFaces<MATRIX_2X2> {
    public I8_2(MATRIX_2X2 matrix_2x2) {
        super(matrix_2x2);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 1) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        Integer MediaBrowserCompat$CustomActionResultReceiver = ((MATRIX_2X2) this.write).MediaBrowserCompat$CustomActionResultReceiver(1);
        if (MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver.intValue() == 0) {
            return "Infinite";
        }
        if (MediaBrowserCompat$CustomActionResultReceiver.intValue() == 1) {
            return "Once";
        }
        if (MediaBrowserCompat$CustomActionResultReceiver.intValue() == 2) {
            return "Twice";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompat$CustomActionResultReceiver.toString());
        sb.append(" times");
        return sb.toString();
    }
}
