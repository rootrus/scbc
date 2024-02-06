package p040o;

/* renamed from: o.Float3 */
public final class Float3 extends subalign$MediaBrowserCompat$ItemReceiver {
    private static subalign<Float3> MediaBrowserCompat$ItemReceiver;
    public double IconCompatParcelizer = 0.0d;
    public double MediaBrowserCompat$CustomActionResultReceiver = 0.0d;

    static {
        subalign<Float3> read = subalign.read(64, new Float3());
        MediaBrowserCompat$ItemReceiver = read;
        read.read = 0.5f;
    }

    public static Float3 IconCompatParcelizer(double d, double d2) {
        Float3 IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = d;
        IconCompatParcelizer2.IconCompatParcelizer = d2;
        return IconCompatParcelizer2;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Float3 float3) {
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(float3);
    }

    /* access modifiers changed from: protected */
    public final subalign$MediaBrowserCompat$ItemReceiver read() {
        return new Float3();
    }

    private Float3() {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MPPointD, x: ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", y: ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}
