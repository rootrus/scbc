package p040o;

/* renamed from: o.I8 */
public final class C1218I8 extends createCubemapFromCubeFaces<I8_4> {
    public C1218I8(I8_4 i8_4) {
        super(i8_4);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 2) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        Long MediaDescriptionCompat = ((I8_4) this.write).MediaDescriptionCompat(2);
        if (MediaDescriptionCompat == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(MediaDescriptionCompat.longValue()));
        sb.append(" bytes");
        return sb.toString();
    }
}
