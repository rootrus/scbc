package p040o;

import java.util.HashMap;

/* renamed from: o.U64_3 */
public final class U64_3 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "JpegComment";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(0, "JPEG Comment");
    }

    public U64_3() {
        read((createCubemapFromCubeFaces) new U8_3(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
