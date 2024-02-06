package p040o;

import java.util.HashMap;

/* renamed from: o.U32_2 */
public final class U32_2 extends createFromBitmapResource {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "JFXX";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        hashMap.put(5, "Extension Code");
    }

    public U32_2() {
        read((createCubemapFromCubeFaces) new U32_3(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
