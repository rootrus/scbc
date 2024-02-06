package p040o;

import java.util.HashMap;

/* renamed from: o.validate3DRange */
public class validate3DRange extends elementFromBitmap {
    private static HashMap<Integer, String> read;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "Exif Image";
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        write(hashMap);
    }

    public validate3DRange() {
        read((createCubemapFromCubeFaces) new validate2DRange(this));
    }

    public final HashMap<Integer, String> MediaBrowserCompat$CustomActionResultReceiver() {
        return read;
    }
}
