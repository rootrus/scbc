package p040o;

import java.util.HashMap;

/* renamed from: o.U8 */
public class C1293U8 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "JPEG";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(-3, "Compression Type");
        write.put(0, "Data Precision");
        write.put(3, "Image Width");
        write.put(1, "Image Height");
        write.put(5, "Number of Components");
        write.put(6, "Component 1");
        write.put(7, "Component 2");
        write.put(8, "Component 3");
        write.put(9, "Component 4");
    }

    public C1293U8() {
        read((createCubemapFromCubeFaces) new U8_2(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
