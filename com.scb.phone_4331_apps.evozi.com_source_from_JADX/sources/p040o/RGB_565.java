package p040o;

import java.util.HashMap;

/* renamed from: o.RGB_565 */
public final class RGB_565 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "GIF Header";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(1, "GIF Format Version");
        write.put(3, "Image Height");
        write.put(2, "Image Width");
        write.put(4, "Color Table Size");
        write.put(5, "Is Color Table Sorted");
        write.put(6, "Bits per Pixel");
        write.put(7, "Has Global Color Table");
        write.put(8, "Background Color Index");
        write.put(9, "Pixel Aspect Ratio");
    }

    public RGB_565() {
        read((createCubemapFromCubeFaces) new RGBA_4444(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
