package p040o;

import java.util.HashMap;

/* renamed from: o.setSurface */
public class setSurface extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Leica Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(768, "Quality");
        read.put(770, "User Profile");
        read.put(771, "Serial Number");
        read.put(772, "White Balance");
        read.put(784, "Lens Type");
        read.put(785, "External Sensor Brightness Value");
        read.put(786, "Measured LV");
        read.put(787, "Approximate F Number");
        read.put(800, "Camera Temperature");
        read.put(801, "Color Temperature");
        read.put(802, "WB Red Level");
        read.put(803, "WB Green Level");
        read.put(804, "WB Blue Level");
        read.put(816, "CCD Version");
        read.put(817, "CCD Board Version");
        read.put(818, "Controller Board Version");
        read.put(819, "M16 C Version");
        read.put(832, "Image ID Number");
    }

    public setSurface() {
        read((createCubemapFromCubeFaces) new setFromFieldPacker(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
