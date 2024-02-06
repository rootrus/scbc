package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.subShort4 */
public class subShort4 extends subalign$MediaBrowserCompat$ItemReceiver {
    private static subalign<subShort4> IconCompatParcelizer;
    public float MediaBrowserCompat$CustomActionResultReceiver;
    public float MediaBrowserCompat$ItemReceiver;

    static {
        subalign<subShort4> read = subalign.read(32, new subShort4(BitmapDescriptorFactory.HUE_RED));
        IconCompatParcelizer = read;
        read.read = 0.5f;
    }

    public subShort4() {
    }

    public subShort4(float f) {
        this.MediaBrowserCompat$ItemReceiver = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompat$CustomActionResultReceiver = f;
    }

    public static subShort4 read(float f, float f2) {
        subShort4 IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer();
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = f;
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = f2;
        return IconCompatParcelizer2;
    }

    public static subShort4 read(subShort4 subshort4) {
        subShort4 IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer();
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = subshort4.MediaBrowserCompat$ItemReceiver;
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = subshort4.MediaBrowserCompat$CustomActionResultReceiver;
        return IconCompatParcelizer2;
    }

    public static void IconCompatParcelizer(subShort4 subshort4) {
        IconCompatParcelizer.IconCompatParcelizer(subshort4);
    }

    /* access modifiers changed from: protected */
    public final subalign$MediaBrowserCompat$ItemReceiver read() {
        return new subShort4(BitmapDescriptorFactory.HUE_RED);
    }
}
