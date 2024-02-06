package p040o;

/* renamed from: o.validateIsFloat64 */
public final class validateIsFloat64 extends createTyped<validateBitmapSize> {
    public validateIsFloat64(validateBitmapSize validatebitmapsize) {
        super(validatebitmapsize);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 513) {
            String MediaBrowserCompat$SearchResultReceiver = ((validateBitmapSize) this.write).MediaBrowserCompat$SearchResultReceiver(513);
            if (MediaBrowserCompat$SearchResultReceiver == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(MediaBrowserCompat$SearchResultReceiver);
            sb.append(" bytes");
            return sb.toString();
        } else if (i != 514) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        } else {
            String MediaBrowserCompat$SearchResultReceiver2 = ((validateBitmapSize) this.write).MediaBrowserCompat$SearchResultReceiver(514);
            if (MediaBrowserCompat$SearchResultReceiver2 == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(MediaBrowserCompat$SearchResultReceiver2);
            sb2.append(" bytes");
            return sb2.toString();
        }
    }
}
