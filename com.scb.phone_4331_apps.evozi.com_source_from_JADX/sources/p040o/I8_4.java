package p040o;

import java.util.HashMap;

/* renamed from: o.I8_4 */
public final class I8_4 extends createFromBitmapResource {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "File";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(1, "File Name");
        read.put(2, "File Size");
        read.put(3, "File Modified Date");
    }

    public I8_4() {
        read((createCubemapFromCubeFaces) new C1218I8(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
