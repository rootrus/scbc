package p040o;

import java.util.HashMap;

/* renamed from: o.createPixel */
public final class createPixel extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "PCX";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1, "Version");
        read.put(2, "Bits Per Pixel");
        read.put(3, "X Min");
        read.put(4, "Y Min");
        read.put(5, "X Max");
        read.put(6, "Y Max");
        read.put(7, "Horizontal DPI");
        read.put(8, "Vertical DPI");
        read.put(9, "Palette");
        read.put(10, "Color Planes");
        read.put(11, "Bytes Per Line");
        read.put(12, "Palette Type");
        read.put(13, "H Scr Size");
        read.put(14, "V Scr Size");
    }

    public createPixel() {
        read((createCubemapFromCubeFaces) new U64_4(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
