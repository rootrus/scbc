package p040o;

import java.util.HashMap;

/* renamed from: o.U16_3 */
public final class U16_3 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "ICO";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1, "Image Type");
        read.put(2, "Image Width");
        read.put(3, "Image Height");
        read.put(4, "Colour Palette Size");
        read.put(5, "Colour Planes");
        read.put(6, "Hotspot X");
        read.put(7, "Bits Per Pixel");
        read.put(8, "Hotspot Y");
        read.put(9, "Image Size Bytes");
        read.put(10, "Image Offset Bytes");
    }

    public U16_3() {
        read((createCubemapFromCubeFaces) new U16_2(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
