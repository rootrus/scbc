package p040o;

import java.util.HashMap;

/* renamed from: o.typeFromBitmap */
public class typeFromBitmap extends elementFromBitmap {
    private static HashMap<Integer, String> write;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Exif IFD0";
    }

    public typeFromBitmap() {
        read((createCubemapFromCubeFaces) new updateCacheInfo(this));
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        write = hashMap;
        write(hashMap);
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return write;
    }
}
