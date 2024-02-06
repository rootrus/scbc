package p040o;

import java.util.HashMap;

/* renamed from: o.F32_3 */
public class F32_3 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Pentax Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "Capture Mode");
        write.put(2, "Quality Level");
        write.put(3, "Focus Mode");
        write.put(4, "Flash Mode");
        write.put(7, "White Balance");
        write.put(10, "Digital Zoom");
        write.put(11, "Sharpness");
        write.put(12, "Contrast");
        write.put(13, "Saturation");
        write.put(20, "ISO Speed");
        write.put(23, "Colour");
        write.put(3584, "Print Image Matching (PIM) Info");
        write.put(4096, "Time Zone");
        write.put(4097, "Daylight Savings");
    }

    public F32_3() {
        read((createCubemapFromCubeFaces) new F32(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
