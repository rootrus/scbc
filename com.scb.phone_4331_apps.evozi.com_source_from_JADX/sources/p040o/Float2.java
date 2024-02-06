package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.Float2 */
public final class Float2 extends subalign$MediaBrowserCompat$ItemReceiver {
    private static subalign<Float2> IconCompatParcelizer;
    public float MediaBrowserCompat$CustomActionResultReceiver;
    public float write;

    static {
        subalign<Float2> read = subalign.read(256, new Float2((byte) 0));
        IconCompatParcelizer = read;
        read.read = 0.5f;
    }

    /* access modifiers changed from: protected */
    public final subalign$MediaBrowserCompat$ItemReceiver read() {
        return new Float2((byte) 0);
    }

    public static Float2 MediaBrowserCompat$CustomActionResultReceiver(float f, float f2) {
        Float2 IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer();
        IconCompatParcelizer2.write = f;
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = f2;
        return IconCompatParcelizer2;
    }

    public static void MediaBrowserCompat$ItemReceiver(Float2 float2) {
        IconCompatParcelizer.IconCompatParcelizer(float2);
    }

    public Float2() {
    }

    private Float2(byte b) {
        this.write = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Float2)) {
            return false;
        }
        Float2 float2 = (Float2) obj;
        if (this.write == float2.write && this.MediaBrowserCompat$CustomActionResultReceiver == float2.MediaBrowserCompat$CustomActionResultReceiver) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append("x");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        return sb.toString();
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.write) ^ Float.floatToIntBits(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
