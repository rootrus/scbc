package p040o;

import java.util.HashMap;

/* renamed from: o.I64_4 */
public class I64_4 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Sigma Makernote";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(2, "Serial Number");
        write.put(3, "Drive Mode");
        write.put(4, "Resolution Mode");
        write.put(5, "Auto Focus Mode");
        write.put(6, "Focus Setting");
        write.put(7, "White Balance");
        write.put(8, "Exposure Mode");
        write.put(9, "Metering Mode");
        write.put(10, "Lens Range");
        write.put(11, "Color Space");
        write.put(12, "Exposure");
        write.put(13, "Contrast");
        write.put(14, "Shadow");
        write.put(15, "Highlight");
        write.put(16, "Saturation");
        write.put(17, "Sharpness");
        write.put(18, "Fill Light");
        write.put(20, "Color Adjustment");
        write.put(21, "Adjustment Mode");
        write.put(22, "Quality");
        write.put(23, "Firmware");
        write.put(24, "Software");
        write.put(25, "Auto Bracket");
    }

    public I64_4() {
        read((createCubemapFromCubeFaces) new I64_3(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
