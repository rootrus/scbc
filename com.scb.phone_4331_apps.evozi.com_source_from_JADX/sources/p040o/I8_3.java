package p040o;

import java.util.HashMap;

/* renamed from: o.I8_3 */
public class I8_3 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Sony Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1299, "Makernote Thumb Offset");
        read.put(1300, "Makernote Thumb Length");
        read.put(8192, "Makernote Thumb Version");
    }

    public I8_3() {
        read((createCubemapFromCubeFaces) new I64_2(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
