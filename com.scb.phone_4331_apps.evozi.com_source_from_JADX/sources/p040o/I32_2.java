package p040o;

import java.util.HashMap;

/* renamed from: o.I32_2 */
public class I32_2 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Ricoh Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1, "Makernote Data Type");
        read.put(2, "Version");
        read.put(3584, "Print Image Matching (PIM) Info");
        read.put(8193, "Ricoh Camera Info Makernote Sub-IFD");
    }

    public I32_2() {
        read((createCubemapFromCubeFaces) new F64_3(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
