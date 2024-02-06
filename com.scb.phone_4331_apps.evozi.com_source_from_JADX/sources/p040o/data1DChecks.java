package p040o;

import java.util.HashMap;

/* renamed from: o.data1DChecks */
public final class data1DChecks extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "BMP Header";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(-1, "Header Size");
        write.put(1, "Image Height");
        write.put(2, "Image Width");
        write.put(3, "Planes");
        write.put(4, "Bits Per Pixel");
        write.put(5, "Compression");
        write.put(6, "X Pixels per Meter");
        write.put(7, "Y Pixels per Meter");
        write.put(8, "Palette Colour Count");
        write.put(9, "Important Colour Count");
    }

    public data1DChecks() {
        read((createCubemapFromCubeFaces) new createSized(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
