package p040o;

import java.util.HashMap;

/* renamed from: o.RGB_888 */
public final class RGB_888 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "GIF Image";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1, "Left");
        read.put(2, "Top");
        read.put(3, "Width");
        read.put(4, "Height");
        read.put(5, "Has Local Colour Table");
        read.put(6, "Is Interlaced");
        read.put(7, "Is Local Colour Table Sorted");
        read.put(8, "Local Colour Table Bits Per Pixel");
    }

    public RGB_888() {
        read((createCubemapFromCubeFaces) new SAMPLER(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
