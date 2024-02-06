package p040o;

import java.util.HashMap;

/* renamed from: o.I16_3 */
public class I16_3 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Samsung Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1, "Maker Note Version");
        read.put(2, "Device Type");
        read.put(3, "Model Id");
        read.put(67, "Camera Temperature");
        read.put(256, "Face Detect");
        read.put(288, "Face Recognition");
        read.put(291, "Face Name");
        read.put(40961, "Firmware Name");
    }

    public I16_3() {
        read((createCubemapFromCubeFaces) new I32(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
