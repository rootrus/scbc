package p040o;

import java.util.HashMap;

/* renamed from: o.U64 */
public final class U64 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "JFIF";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(5, "Version");
        write.put(7, "Resolution Units");
        write.put(10, "Y Resolution");
        write.put(8, "X Resolution");
        write.put(12, "Thumbnail Width Pixels");
        write.put(13, "Thumbnail Height Pixels");
    }

    public U64() {
        read((createCubemapFromCubeFaces) new U32(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
